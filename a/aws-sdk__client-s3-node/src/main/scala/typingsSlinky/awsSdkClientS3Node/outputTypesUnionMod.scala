package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsSlinky.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
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
  
  trait _OutputTypesUnion extends StObject
  object _OutputTypesUnion {
    
    @scala.inline
    def AbortMultipartUploadOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput]
    }
    
    @scala.inline
    def CompleteMultipartUploadOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput]
    }
    
    @scala.inline
    def CopyObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput]
    }
    
    @scala.inline
    def CreateBucketOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput]
    }
    
    @scala.inline
    def CreateMultipartUploadOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput]
    }
    
    @scala.inline
    def DeleteBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketCorsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput]
    }
    
    @scala.inline
    def DeleteBucketEncryptionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput]
    }
    
    @scala.inline
    def DeleteBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketLifecycleOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput]
    }
    
    @scala.inline
    def DeleteBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def DeleteBucketOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput]
    }
    
    @scala.inline
    def DeleteBucketPolicyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput]
    }
    
    @scala.inline
    def DeleteBucketReplicationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput]
    }
    
    @scala.inline
    def DeleteBucketTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput]
    }
    
    @scala.inline
    def DeleteBucketWebsiteOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput]
    }
    
    @scala.inline
    def DeleteObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput]
    }
    
    @scala.inline
    def DeleteObjectTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput]
    }
    
    @scala.inline
    def DeleteObjectsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput]
    }
    
    @scala.inline
    def GetBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput]
    }
    
    @scala.inline
    def GetBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketCorsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput]
    }
    
    @scala.inline
    def GetBucketEncryptionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput]
    }
    
    @scala.inline
    def GetBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketLifecycleOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput]
    }
    
    @scala.inline
    def GetBucketLocationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput]
    }
    
    @scala.inline
    def GetBucketLoggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput]
    }
    
    @scala.inline
    def GetBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput]
    }
    
    @scala.inline
    def GetBucketNotificationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput]
    }
    
    @scala.inline
    def GetBucketPolicyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput]
    }
    
    @scala.inline
    def GetBucketReplicationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput]
    }
    
    @scala.inline
    def GetBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput]
    }
    
    @scala.inline
    def GetBucketTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput]
    }
    
    @scala.inline
    def GetBucketVersioningOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput]
    }
    
    @scala.inline
    def GetBucketWebsiteOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput]
    }
    
    @scala.inline
    def GetObjectAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput]
    }
    
    @scala.inline
    def GetObjectTaggingOutput($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput]
    }
    
    @scala.inline
    def HeadBucketOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput]
    }
    
    @scala.inline
    def HeadObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput]
    }
    
    @scala.inline
    def ListBucketAnalyticsConfigurationsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketInventoryConfigurationsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketMetricsConfigurationsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput]
    }
    
    @scala.inline
    def ListBucketsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput]
    }
    
    @scala.inline
    def ListMultipartUploadsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput]
    }
    
    @scala.inline
    def ListObjectVersionsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput]
    }
    
    @scala.inline
    def ListObjectsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput]
    }
    
    @scala.inline
    def ListObjectsV2Output($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output]
    }
    
    @scala.inline
    def ListPartsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput]
    }
    
    @scala.inline
    def PutBucketAccelerateConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput]
    }
    
    @scala.inline
    def PutBucketAnalyticsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketCorsOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput]
    }
    
    @scala.inline
    def PutBucketEncryptionOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput]
    }
    
    @scala.inline
    def PutBucketInventoryConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketLifecycleConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketLifecycleOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput]
    }
    
    @scala.inline
    def PutBucketLoggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput]
    }
    
    @scala.inline
    def PutBucketMetricsConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketNotificationConfigurationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput]
    }
    
    @scala.inline
    def PutBucketNotificationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput]
    }
    
    @scala.inline
    def PutBucketPolicyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput]
    }
    
    @scala.inline
    def PutBucketReplicationOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput]
    }
    
    @scala.inline
    def PutBucketRequestPaymentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput]
    }
    
    @scala.inline
    def PutBucketTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput]
    }
    
    @scala.inline
    def PutBucketVersioningOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput]
    }
    
    @scala.inline
    def PutBucketWebsiteOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput]
    }
    
    @scala.inline
    def PutObjectAclOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput]
    }
    
    @scala.inline
    def PutObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput]
    }
    
    @scala.inline
    def PutObjectTaggingOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput]
    }
    
    @scala.inline
    def RestoreObjectOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput]
    }
    
    @scala.inline
    def SelectObjectContentOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput]
    }
    
    @scala.inline
    def UploadPartCopyOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput]
    }
    
    @scala.inline
    def UploadPartOutput($metadata: ResponseMetadata): typingsSlinky.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput]
    }
  }
}
