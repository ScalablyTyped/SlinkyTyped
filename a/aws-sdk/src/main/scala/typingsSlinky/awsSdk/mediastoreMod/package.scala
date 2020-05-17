package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediastoreMod {
  type AllowedHeaders = js.Array[typingsSlinky.awsSdk.mediastoreMod.Header]
  type AllowedMethods = js.Array[typingsSlinky.awsSdk.mediastoreMod.MethodName]
  type AllowedOrigins = js.Array[typingsSlinky.awsSdk.mediastoreMod.Origin]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mediastoreMod.ClientApiVersions
  type ContainerARN = java.lang.String
  type ContainerAccessLoggingEnabled = scala.Boolean
  type ContainerList = js.Array[typingsSlinky.awsSdk.mediastoreMod.Container]
  type ContainerListLimit = scala.Double
  type ContainerName = java.lang.String
  type ContainerPolicy = java.lang.String
  type CorsPolicy = js.Array[typingsSlinky.awsSdk.mediastoreMod.CorsRule]
  type Endpoint = java.lang.String
  type ExposeHeaders = js.Array[typingsSlinky.awsSdk.mediastoreMod.Header]
  type Header = java.lang.String
  type LifecyclePolicy = java.lang.String
  type MaxAgeSeconds = scala.Double
  type Origin = java.lang.String
  type PaginationToken = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.mediastoreMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.mediastoreMod.Tag]
  type TagValue = java.lang.String
  type TimeStamp = js.Date
}
