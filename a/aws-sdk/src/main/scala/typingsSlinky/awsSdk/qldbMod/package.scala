package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qldbMod {
  type Arn = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.qldbMod.ClientApiVersions
  type DeletionProtection = scala.Boolean
  type IonText = java.lang.String
  type JournalS3ExportList = js.Array[typingsSlinky.awsSdk.qldbMod.JournalS3ExportDescription]
  type LedgerList = js.Array[typingsSlinky.awsSdk.qldbMod.LedgerSummary]
  type LedgerName = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type S3Bucket = java.lang.String
  type S3Prefix = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.qldbMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.qldbMod.TagValue]
  type Timestamp = js.Date
  type UniqueId = java.lang.String
}
