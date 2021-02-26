package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typingsSlinky.awsSdkClientS3Node.typesAccelerateConfigurationMod.AccelerateConfiguration
import typingsSlinky.awsSdkClientS3Node.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import typingsSlinky.awsSdkClientS3Node.typesBucketLoggingStatusMod.BucketLoggingStatus
import typingsSlinky.awsSdkClientS3Node.typesCorsconfigurationMod.CORSConfiguration
import typingsSlinky.awsSdkClientS3Node.typesDeleteMod.Delete
import typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typingsSlinky.awsSdkClientS3Node.typesInventoryConfigurationMod.InventoryConfiguration
import typingsSlinky.awsSdkClientS3Node.typesMetricsConfigurationMod.MetricsConfiguration
import typingsSlinky.awsSdkClientS3Node.typesNotificationConfigurationDeprecatedMod.NotificationConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Node.typesNotificationConfigurationMod.NotificationConfiguration
import typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import typingsSlinky.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typingsSlinky.awsSdkClientS3Node.typesReplicationConfigurationMod.ReplicationConfiguration
import typingsSlinky.awsSdkClientS3Node.typesRequestPaymentConfigurationMod.RequestPaymentConfiguration
import typingsSlinky.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesTaggingMod.Tagging
import typingsSlinky.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typingsSlinky.awsSdkClientS3Node.typesVersioningConfigurationMod.VersioningConfiguration
import typingsSlinky.awsSdkClientS3Node.typesWebsiteConfigurationMod.WebsiteConfiguration
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
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
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    @scala.inline
    def AbortMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    @scala.inline
    def CompleteMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    @scala.inline
    def CopyObjectInput(Bucket: String, CopySource: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput]
    }
    
    @scala.inline
    def CreateBucketInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput]
    }
    
    @scala.inline
    def CreateMultipartUploadInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput]
    }
    
    @scala.inline
    def DeleteBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketCorsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput]
    }
    
    @scala.inline
    def DeleteBucketEncryptionInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput]
    }
    
    @scala.inline
    def DeleteBucketInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput]
    }
    
    @scala.inline
    def DeleteBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketLifecycleInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput]
    }
    
    @scala.inline
    def DeleteBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketPolicyInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput]
    }
    
    @scala.inline
    def DeleteBucketReplicationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput]
    }
    
    @scala.inline
    def DeleteBucketTaggingInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput]
    }
    
    @scala.inline
    def DeleteBucketWebsiteInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput]
    }
    
    @scala.inline
    def DeleteObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput]
    }
    
    @scala.inline
    def DeleteObjectTaggingInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput]
    }
    
    @scala.inline
    def DeleteObjectsInput(Bucket: String, Delete: Delete): typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput]
    }
    
    @scala.inline
    def GetBucketAccelerateConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput]
    }
    
    @scala.inline
    def GetBucketAclInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput]
    }
    
    @scala.inline
    def GetBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def GetBucketCorsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput]
    }
    
    @scala.inline
    def GetBucketEncryptionInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput]
    }
    
    @scala.inline
    def GetBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def GetBucketLifecycleConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput]
    }
    
    @scala.inline
    def GetBucketLifecycleInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput]
    }
    
    @scala.inline
    def GetBucketLocationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput]
    }
    
    @scala.inline
    def GetBucketLoggingInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput]
    }
    
    @scala.inline
    def GetBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def GetBucketNotificationConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput]
    }
    
    @scala.inline
    def GetBucketNotificationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput]
    }
    
    @scala.inline
    def GetBucketPolicyInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput]
    }
    
    @scala.inline
    def GetBucketReplicationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput]
    }
    
    @scala.inline
    def GetBucketRequestPaymentInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput]
    }
    
    @scala.inline
    def GetBucketTaggingInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput]
    }
    
    @scala.inline
    def GetBucketVersioningInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput]
    }
    
    @scala.inline
    def GetBucketWebsiteInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput]
    }
    
    @scala.inline
    def GetObjectAclInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput]
    }
    
    @scala.inline
    def GetObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput]
    }
    
    @scala.inline
    def GetObjectTaggingInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput]
    }
    
    @scala.inline
    def GetObjectTorrentInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput]
    }
    
    @scala.inline
    def HeadBucketInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput]
    }
    
    @scala.inline
    def HeadObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput]
    }
    
    @scala.inline
    def ListBucketAnalyticsConfigurationsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketInventoryConfigurationsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketMetricsConfigurationsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketsInput(): typingsSlinky.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput]
    }
    
    @scala.inline
    def ListMultipartUploadsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    @scala.inline
    def ListObjectVersionsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput]
    }
    
    @scala.inline
    def ListObjectsInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput]
    }
    
    @scala.inline
    def ListObjectsV2Input(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input]
    }
    
    @scala.inline
    def ListPartsInput(Bucket: String, Key: String, UploadId: String): typingsSlinky.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput]
    }
    
    @scala.inline
    def PutBucketAccelerateConfigurationInput(AccelerateConfiguration: AccelerateConfiguration, Bucket: String): typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput]
    }
    
    @scala.inline
    def PutBucketAclInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput]
    }
    
    @scala.inline
    def PutBucketAnalyticsConfigurationInput(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def PutBucketCorsInput(Bucket: String, CORSConfiguration: CORSConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput]
    }
    
    @scala.inline
    def PutBucketEncryptionInput(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput]
    }
    
    @scala.inline
    def PutBucketInventoryConfigurationInput(Bucket: String, Id: String, InventoryConfiguration: InventoryConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def PutBucketLifecycleConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput]
    }
    
    @scala.inline
    def PutBucketLifecycleInput(Bucket: String): typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput]
    }
    
    @scala.inline
    def PutBucketLoggingInput(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput]
    }
    
    @scala.inline
    def PutBucketMetricsConfigurationInput(Bucket: String, Id: String, MetricsConfiguration: MetricsConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def PutBucketNotificationConfigurationInput(Bucket: String, NotificationConfiguration: NotificationConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput]
    }
    
    @scala.inline
    def PutBucketNotificationInput(Bucket: String, NotificationConfiguration: NotificationConfigurationDeprecated): typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput]
    }
    
    @scala.inline
    def PutBucketPolicyInput(Bucket: String, Policy: String): typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput]
    }
    
    @scala.inline
    def PutBucketReplicationInput(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput]
    }
    
    @scala.inline
    def PutBucketRequestPaymentInput(Bucket: String, RequestPaymentConfiguration: RequestPaymentConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput]
    }
    
    @scala.inline
    def PutBucketTaggingInput(Bucket: String, Tagging: Tagging): typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput]
    }
    
    @scala.inline
    def PutBucketVersioningInput(Bucket: String, VersioningConfiguration: VersioningConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput]
    }
    
    @scala.inline
    def PutBucketWebsiteInput(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput]
    }
    
    @scala.inline
    def PutObjectAclInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput]
    }
    
    @scala.inline
    def PutObjectTaggingInput(Bucket: String, Key: String, Tagging: Tagging): typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput]
    }
    
    @scala.inline
    def RestoreObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput]
    }
    
    @scala.inline
    def SelectObjectContentInput(
      Bucket: String,
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      Key: String,
      OutputSerialization: OutputSerialization
    ): typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput]
    }
    
    @scala.inline
    def UploadPartCopyInput(Bucket: String, CopySource: String, Key: String, PartNumber: Double, UploadId: String): typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput]
    }
  }
}
