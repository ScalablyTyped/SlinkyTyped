package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object glacierMod {
  type AccessControlPolicyList = js.Array[typingsSlinky.awsSdk.glacierMod.Grant]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.glacierMod.ClientApiVersions
  type DataRetrievalRulesList = js.Array[typingsSlinky.awsSdk.glacierMod.DataRetrievalRule]
  type DateTime = java.lang.String
  type JobList = js.Array[typingsSlinky.awsSdk.glacierMod.GlacierJobDescription]
  type NotificationEventList = js.Array[java.lang.String]
  type NullableLong = scala.Double
  type PartList = js.Array[typingsSlinky.awsSdk.glacierMod.PartListElement]
  type ProvisionedCapacityList = js.Array[typingsSlinky.awsSdk.glacierMod.ProvisionedCapacityDescription]
  type Size = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glacierMod.TagValue]
  type TagValue = java.lang.String
  type UploadsList = js.Array[typingsSlinky.awsSdk.glacierMod.UploadListElement]
  type VaultList = js.Array[typingsSlinky.awsSdk.glacierMod.DescribeVaultOutput]
  type hashmap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type httpstatus = scala.Double
  type long = scala.Double
}
