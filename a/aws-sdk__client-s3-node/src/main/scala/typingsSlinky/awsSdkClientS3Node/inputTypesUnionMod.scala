package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typingsSlinky.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
  trait _InputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typingsSlinky.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput
    - typingsSlinky.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput
    - typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput
    - typingsSlinky.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput
    - typingsSlinky.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput
    - typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput
    - typingsSlinky.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
    - typingsSlinky.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input
    - typingsSlinky.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
    - typingsSlinky.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput[typingsSlinky.node.streamMod.Readable]
    - typingsSlinky.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput
    - typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput
    - typingsSlinky.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput
    - typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
    - typingsSlinky.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput[typingsSlinky.node.streamMod.Readable]
    - typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput
  */
  type InputTypesUnion = _InputTypesUnion | PutObjectInput[Readable] | UploadPartInput[Readable]
}

