package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotdataMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.iotdataMod.ClientApiVersions
  type JsonDocument = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.iotdataMod.Blob | java.lang.String
  type NamedShadowList = js.Array[typingsSlinky.awsSdk.iotdataMod.ShadowName]
  type NextToken = java.lang.String
  type PageSize = scala.Double
  type Payload = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.iotdataMod.Blob | java.lang.String
  type Qos = scala.Double
  type ShadowName = java.lang.String
  type ThingName = java.lang.String
  type Timestamp = scala.Double
  type Topic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-05-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.iotdataMod._apiVersion | java.lang.String
}
