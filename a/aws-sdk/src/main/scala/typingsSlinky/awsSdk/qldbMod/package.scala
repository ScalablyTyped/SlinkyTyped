package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object qldbMod {
  
  type Arn = java.lang.String
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.qldbMod.ClientApiVersions
  
  type DeletionProtection = scala.Boolean
  
  type Digest = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.qldbMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.KINESIS_STREAM_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.IAM_PERMISSION_REVOKED
    - java.lang.String
  */
  type ErrorCause = typingsSlinky.awsSdk.qldbMod._ErrorCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type ExportStatus = typingsSlinky.awsSdk.qldbMod._ExportStatus | java.lang.String
  
  type IonText = java.lang.String
  
  type JournalKinesisStreamDescriptionList = js.Array[typingsSlinky.awsSdk.qldbMod.JournalKinesisStreamDescription]
  
  type JournalS3ExportList = js.Array[typingsSlinky.awsSdk.qldbMod.JournalS3ExportDescription]
  
  type LedgerList = js.Array[typingsSlinky.awsSdk.qldbMod.LedgerSummary]
  
  type LedgerName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type LedgerState = typingsSlinky.awsSdk.qldbMod._LedgerState | java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type PermissionsMode = typingsSlinky.awsSdk.awsSdkStrings.ALLOW_ALL | java.lang.String
  
  type S3Bucket = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS
    - typingsSlinky.awsSdk.awsSdkStrings.SSE_S3
    - typingsSlinky.awsSdk.awsSdkStrings.NO_ENCRYPTION
    - java.lang.String
  */
  type S3ObjectEncryptionType = typingsSlinky.awsSdk.qldbMod._S3ObjectEncryptionType | java.lang.String
  
  type S3Prefix = java.lang.String
  
  type StreamName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED
    - java.lang.String
  */
  type StreamStatus = typingsSlinky.awsSdk.qldbMod._StreamStatus | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.qldbMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.qldbMod.TagValue]
  
  type Timestamp = js.Date
  
  type UniqueId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-01-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.qldbMod._apiVersion | java.lang.String
}
