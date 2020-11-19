package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput
import typingsSlinky.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/types/OutputTypesUnion", JSImport.Namespace)
@js.native
object outputTypesUnionMod extends js.Object {
  
  trait _OutputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
    - typingsSlinky.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
    - typingsSlinky.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput
    - typingsSlinky.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput
    - typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput[typingsSlinky.std.Blob]
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput[typingsSlinky.std.Blob]
    - typingsSlinky.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput
    - typingsSlinky.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output
    - typingsSlinky.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput
    - typingsSlinky.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
    - typingsSlinky.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput
    - typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput
    - typingsSlinky.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput
    - typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput
  */
  type OutputTypesUnion = _OutputTypesUnion | GetObjectOutput[Blob] | GetObjectTorrentOutput[Blob]
}
