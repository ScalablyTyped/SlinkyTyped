package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/OutputTypesUnion", JSImport.Namespace)
@js.native
object outputTypesUnionMod extends js.Object {
  trait _OutputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
    - typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
    - typingsSlinky.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput
    - typingsSlinky.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput
    - typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput[typingsSlinky.node.streamMod.Readable]
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput[typingsSlinky.node.streamMod.Readable]
    - typingsSlinky.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput
    - typingsSlinky.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
    - typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput
    - typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
    - typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
    - typingsSlinky.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput
    - typingsSlinky.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output
    - typingsSlinky.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput
    - typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
    - typingsSlinky.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput
    - typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput
    - typingsSlinky.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput
    - typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput
  */
  type OutputTypesUnion = _OutputTypesUnion | GetObjectOutput[Readable] | GetObjectTorrentOutput[Readable]
}

