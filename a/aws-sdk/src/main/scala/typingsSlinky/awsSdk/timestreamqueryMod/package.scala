package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object timestreamqueryMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.timestreamqueryMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type ColumnInfoList = js.Array[typingsSlinky.awsSdk.timestreamqueryMod.ColumnInfo]
  
  type DatumList = js.Array[typingsSlinky.awsSdk.timestreamqueryMod.Datum]
  
  type Endpoints = js.Array[typingsSlinky.awsSdk.timestreamqueryMod.Endpoint]
  
  type Long = scala.Double
  
  type MaxQueryResults = scala.Double
  
  type NullableBoolean = scala.Boolean
  
  type QueryId = java.lang.String
  
  type QueryString = java.lang.String
  
  type RowList = js.Array[typingsSlinky.awsSdk.timestreamqueryMod.Row]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VARCHAR
    - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
    - typingsSlinky.awsSdk.awsSdkStrings.BIGINT
    - typingsSlinky.awsSdk.awsSdkStrings.DOUBLE
    - typingsSlinky.awsSdk.awsSdkStrings.TIMESTAMP
    - typingsSlinky.awsSdk.awsSdkStrings.DATE
    - typingsSlinky.awsSdk.awsSdkStrings.TIME
    - typingsSlinky.awsSdk.awsSdkStrings.INTERVAL_DAY_TO_SECOND
    - typingsSlinky.awsSdk.awsSdkStrings.INTERVAL_YEAR_TO_MONTH
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGER
    - java.lang.String
  */
  type ScalarType = typingsSlinky.awsSdk.timestreamqueryMod._ScalarType | java.lang.String
  
  type ScalarValue = java.lang.String
  
  type String = java.lang.String
  
  type TimeSeriesDataPointList = js.Array[typingsSlinky.awsSdk.timestreamqueryMod.TimeSeriesDataPoint]
  
  type Timestamp = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.timestreamqueryMod._apiVersion | java.lang.String
}
