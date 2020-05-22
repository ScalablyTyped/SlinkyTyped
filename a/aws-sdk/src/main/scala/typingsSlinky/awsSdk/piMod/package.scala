package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object piMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.piMod.ClientApiVersions
  type DataPointsList = js.Array[typingsSlinky.awsSdk.piMod.DataPoint]
  type DimensionKeyDescriptionList = js.Array[typingsSlinky.awsSdk.piMod.DimensionKeyDescription]
  type DimensionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.piMod.String]
  type Double = scala.Double
  type ISOTimestamp = js.Date
  type Integer = scala.Double
  type Limit = scala.Double
  type MaxResults = scala.Double
  type MetricKeyDataPointsList = js.Array[typingsSlinky.awsSdk.piMod.MetricKeyDataPoints]
  type MetricQueryFilterMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.piMod.String]
  type MetricQueryList = js.Array[typingsSlinky.awsSdk.piMod.MetricQuery]
  type MetricValuesList = js.Array[typingsSlinky.awsSdk.piMod.Double]
  type ResponsePartitionKeyList = js.Array[typingsSlinky.awsSdk.piMod.ResponsePartitionKey]
  type ServiceType = typingsSlinky.awsSdk.awsSdkStrings.RDS | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsSlinky.awsSdk.piMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-02-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.piMod._apiVersion | java.lang.String
}
