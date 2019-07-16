package com.yeming.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yeming.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
