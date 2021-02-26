package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput
import typingsSlinky.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsSlinky.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
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
  
  trait _OutputTypesUnion extends StObject
  object _OutputTypesUnion {
    
    @scala.inline
    def AbortMultipartUploadOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput]
    }
    
    @scala.inline
    def CompleteMultipartUploadOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput]
    }
    
    @scala.inline
    def CopyObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput]
    }
    
    @scala.inline
    def CreateBucketOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCreateBucketOutputMod.CreateBucketOutput]
    }
    
    @scala.inline
    def CreateMultipartUploadOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput]
    }
    
    @scala.inline
    def DeleteBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketCorsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput]
    }
    
    @scala.inline
    def DeleteBucketEncryptionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput]
    }
    
    @scala.inline
    def DeleteBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketLifecycleOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput]
    }
    
    @scala.inline
    def DeleteBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketOutputMod.DeleteBucketOutput]
    }
    
    @scala.inline
    def DeleteBucketPolicyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput]
    }
    
    @scala.inline
    def DeleteBucketReplicationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput]
    }
    
    @scala.inline
    def DeleteBucketTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput]
    }
    
    @scala.inline
    def DeleteBucketWebsiteOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput]
    }
    
    @scala.inline
    def DeleteObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectOutputMod.DeleteObjectOutput]
    }
    
    @scala.inline
    def DeleteObjectTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput]
    }
    
    @scala.inline
    def DeleteObjectsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsOutputMod.DeleteObjectsOutput]
    }
    
    @scala.inline
    def GetBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketAclOutputMod.GetBucketAclOutput]
    }
    
    @scala.inline
    def GetBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketCorsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsOutputMod.GetBucketCorsOutput]
    }
    
    @scala.inline
    def GetBucketEncryptionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput]
    }
    
    @scala.inline
    def GetBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketLifecycleOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput]
    }
    
    @scala.inline
    def GetBucketLocationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput]
    }
    
    @scala.inline
    def GetBucketLoggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput]
    }
    
    @scala.inline
    def GetBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketNotificationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput]
    }
    
    @scala.inline
    def GetBucketPolicyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput]
    }
    
    @scala.inline
    def GetBucketReplicationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput]
    }
    
    @scala.inline
    def GetBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput]
    }
    
    @scala.inline
    def GetBucketTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsSlinky.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput]
    }
    
    @scala.inline
    def GetBucketVersioningOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput]
    }
    
    @scala.inline
    def GetBucketWebsiteOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput]
    }
    
    @scala.inline
    def GetObjectAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclOutputMod.GetObjectAclOutput]
    }
    
    @scala.inline
    def GetObjectTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsSlinky.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput]
    }
    
    @scala.inline
    def HeadBucketOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput]
    }
    
    @scala.inline
    def HeadObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput]
    }
    
    @scala.inline
    def ListBucketAnalyticsConfigurationsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketInventoryConfigurationsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketMetricsConfigurationsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketsOutputMod.ListBucketsOutput]
    }
    
    @scala.inline
    def ListMultipartUploadsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput]
    }
    
    @scala.inline
    def ListObjectVersionsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsOutputMod.ListObjectVersionsOutput]
    }
    
    @scala.inline
    def ListObjectsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput]
    }
    
    @scala.inline
    def ListObjectsV2Output($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListObjectsV2OutputMod.ListObjectsV2Output]
    }
    
    @scala.inline
    def ListPartsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput]
    }
    
    @scala.inline
    def PutBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput]
    }
    
    @scala.inline
    def PutBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketCorsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsOutputMod.PutBucketCorsOutput]
    }
    
    @scala.inline
    def PutBucketEncryptionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput]
    }
    
    @scala.inline
    def PutBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketLifecycleOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput]
    }
    
    @scala.inline
    def PutBucketLoggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput]
    }
    
    @scala.inline
    def PutBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketNotificationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput]
    }
    
    @scala.inline
    def PutBucketPolicyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput]
    }
    
    @scala.inline
    def PutBucketReplicationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput]
    }
    
    @scala.inline
    def PutBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput]
    }
    
    @scala.inline
    def PutBucketTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput]
    }
    
    @scala.inline
    def PutBucketVersioningOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput]
    }
    
    @scala.inline
    def PutBucketWebsiteOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput]
    }
    
    @scala.inline
    def PutObjectAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput]
    }
    
    @scala.inline
    def PutObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput]
    }
    
    @scala.inline
    def PutObjectTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput]
    }
    
    @scala.inline
    def RestoreObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput]
    }
    
    @scala.inline
    def SelectObjectContentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput]
    }
    
    @scala.inline
    def UploadPartCopyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput]
    }
    
    @scala.inline
    def UploadPartOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput]
    }
  }
}
