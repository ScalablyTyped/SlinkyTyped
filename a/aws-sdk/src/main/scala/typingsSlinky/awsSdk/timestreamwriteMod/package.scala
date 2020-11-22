package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object timestreamwriteMod {
  
  type AmazonResourceName = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.timestreamwriteMod.ClientApiVersions
  
  type DatabaseList = js.Array[typingsSlinky.awsSdk.timestreamwriteMod.Database]
  
  type Date = js.Date
  
  type DimensionValueType = typingsSlinky.awsSdk.awsSdkStrings.VARCHAR | java.lang.String
  
  type Dimensions = js.Array[typingsSlinky.awsSdk.timestreamwriteMod.Dimension]
  
  type Endpoints = js.Array[typingsSlinky.awsSdk.timestreamwriteMod.Endpoint]
  
  type Long = scala.Double
  
  type MagneticStoreRetentionPeriodInDays = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOUBLE
    - typingsSlinky.awsSdk.awsSdkStrings.BIGINT
    - typingsSlinky.awsSdk.awsSdkStrings.VARCHAR
    - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
    - java.lang.String
  */
  type MeasureValueType = typingsSlinky.awsSdk.timestreamwriteMod._MeasureValueType | java.lang.String
  
  type MemoryStoreRetentionPeriodInHours = scala.Double
  
  type PaginationLimit = scala.Double
  
  type Records = js.Array[typingsSlinky.awsSdk.timestreamwriteMod.Record]
  
  type ResourceName = java.lang.String
  
  type String = java.lang.String
  
  type StringValue2048 = java.lang.String
  
  type StringValue256 = java.lang.String
  
  type TableList = js.Array[typingsSlinky.awsSdk.timestreamwriteMod.Table]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type TableStatus = typingsSlinky.awsSdk.timestreamwriteMod._TableStatus | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.timestreamwriteMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.timestreamwriteMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MILLISECONDS
    - typingsSlinky.awsSdk.awsSdkStrings.SECONDS
    - typingsSlinky.awsSdk.awsSdkStrings.MICROSECONDS
    - typingsSlinky.awsSdk.awsSdkStrings.NANOSECONDS
    - java.lang.String
  */
  type TimeUnit = typingsSlinky.awsSdk.timestreamwriteMod._TimeUnit | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.timestreamwriteMod._apiVersion | java.lang.String
}
