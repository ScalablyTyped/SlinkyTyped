package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typingsSlinky.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
  trait _InputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typingsSlinky.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typingsSlinky.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput
    - typingsSlinky.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput
    - typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput
    - typingsSlinky.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput
    - typingsSlinky.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput
    - typingsSlinky.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput
    - typingsSlinky.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput
    - typingsSlinky.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input
    - typingsSlinky.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput[typingsSlinky.std.Blob]
    - typingsSlinky.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput
    - typingsSlinky.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput
    - typingsSlinky.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput
    - typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput
    - typingsSlinky.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput[typingsSlinky.std.Blob]
    - typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput
  */
  type InputTypesUnion = _InputTypesUnion | PutObjectInput[Blob] | UploadPartInput[Blob]
}

