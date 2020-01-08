package typingsSlinky.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.awsDashSdk.awsDashSdkStrings.RDS
  import typingsSlinky.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DataPointsList = js.Array[DataPoint]
  type DimensionKeyDescriptionList = js.Array[DimensionKeyDescription]
  type DimensionMap = StringDictionary[String]
  type Double = scala.Double
  type ISOTimestamp = js.Date
  type Integer = scala.Double
  type Limit = scala.Double
  type MaxResults = scala.Double
  type MetricKeyDataPointsList = js.Array[MetricKeyDataPoints]
  type MetricQueryFilterMap = StringDictionary[String]
  type MetricQueryList = js.Array[MetricQuery]
  type MetricValuesList = js.Array[Double]
  type ResponsePartitionKeyList = js.Array[ResponsePartitionKey]
  type ServiceType = RDS | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-02-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
