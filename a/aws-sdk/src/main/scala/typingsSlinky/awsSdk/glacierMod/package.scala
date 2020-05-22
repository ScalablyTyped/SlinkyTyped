package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object glacierMod {
  type AccessControlPolicyList = js.Array[typingsSlinky.awsSdk.glacierMod.Grant]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ArchiveRetrieval
    - typingsSlinky.awsSdk.awsSdkStrings.InventoryRetrieval
    - typingsSlinky.awsSdk.awsSdkStrings.Select_
    - java.lang.String
  */
  type ActionCode = typingsSlinky.awsSdk.glacierMod._ActionCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.private__
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`public-read-write`
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-exec-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`authenticated-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typingsSlinky.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type CannedACL = typingsSlinky.awsSdk.glacierMod._CannedACL | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.glacierMod.ClientApiVersions
  type DataRetrievalRulesList = js.Array[typingsSlinky.awsSdk.glacierMod.DataRetrievalRule]
  type DateTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.awsColonkms
    - typingsSlinky.awsSdk.awsSdkStrings.AES256
    - java.lang.String
  */
  type EncryptionType = typingsSlinky.awsSdk.glacierMod._EncryptionType | java.lang.String
  type ExpressionType = typingsSlinky.awsSdk.awsSdkStrings.SQL | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.USE
    - typingsSlinky.awsSdk.awsSdkStrings.IGNORE
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = typingsSlinky.awsSdk.glacierMod._FileHeaderInfo | java.lang.String
  type JobList = js.Array[typingsSlinky.awsSdk.glacierMod.GlacierJobDescription]
  type NotificationEventList = js.Array[java.lang.String]
  type NullableLong = scala.Double
  type PartList = js.Array[typingsSlinky.awsSdk.glacierMod.PartListElement]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE
    - typingsSlinky.awsSdk.awsSdkStrings.WRITE_ACP
    - typingsSlinky.awsSdk.awsSdkStrings.READ
    - typingsSlinky.awsSdk.awsSdkStrings.READ_ACP
    - java.lang.String
  */
  type Permission = typingsSlinky.awsSdk.glacierMod._Permission | java.lang.String
  type ProvisionedCapacityList = js.Array[typingsSlinky.awsSdk.glacierMod.ProvisionedCapacityDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = typingsSlinky.awsSdk.glacierMod._QuoteFields | java.lang.String
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
    - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
    - typingsSlinky.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type StatusCode = typingsSlinky.awsSdk.glacierMod._StatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
    - java.lang.String
  */
  type StorageClass = typingsSlinky.awsSdk.glacierMod._StorageClass | java.lang.String
  type Stream = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.glacierMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.glacierMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AmazonCustomerByEmail
    - typingsSlinky.awsSdk.awsSdkStrings.CanonicalUser
    - typingsSlinky.awsSdk.awsSdkStrings.Group_
    - java.lang.String
  */
  type Type = typingsSlinky.awsSdk.glacierMod._Type | java.lang.String
  type UploadsList = js.Array[typingsSlinky.awsSdk.glacierMod.UploadListElement]
  type VaultList = js.Array[typingsSlinky.awsSdk.glacierMod.DescribeVaultOutput]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-06-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.glacierMod._apiVersion | java.lang.String
  type hashmap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type httpstatus = scala.Double
  type long = scala.Double
}
