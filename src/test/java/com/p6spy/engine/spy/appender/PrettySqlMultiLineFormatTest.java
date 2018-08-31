package com.p6spy.engine.spy.appender;

import org.junit.Test;

public class PrettySqlMultiLineFormatTest {
	
	@Test
    public void formatMessage() {
        String formattedMessage = new PrettySqlMultiLineFormat().formatMessage(123, "Now", 1234L, "statement", "select * from some_table a where a.property = ?", "select * from some_table a where a.property = '77'");
        System.out.println(formattedMessage);
    }

}
