package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typingsSlinky.awsSdkClientS3Browser.typesAccelerateConfigurationMod.AccelerateConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesBucketLoggingStatusMod.BucketLoggingStatus
import typingsSlinky.awsSdkClientS3Browser.typesCorsconfigurationMod.CORSConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesDeleteMod.Delete
import typingsSlinky.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
import typingsSlinky.awsSdkClientS3Browser.typesInventoryConfigurationMod.InventoryConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesMetricsConfigurationMod.MetricsConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesNotificationConfigurationDeprecatedMod.NotificationConfigurationDeprecated
import typingsSlinky.awsSdkClientS3Browser.typesNotificationConfigurationMod.NotificationConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
import typingsSlinky.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typingsSlinky.awsSdkClientS3Browser.typesReplicationConfigurationMod.ReplicationConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesRequestPaymentConfigurationMod.RequestPaymentConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.ServerSideEncryptionConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesTaggingMod.Tagging
import typingsSlinky.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typingsSlinky.awsSdkClientS3Browser.typesVersioningConfigurationMod.VersioningConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesWebsiteConfigurationMod.WebsiteConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
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
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    @scala.inline
    def AbortMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsSlinky.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    @scala.inline
    def CompleteMultipartUploadInput(Bucket: String, Key: String, UploadId: String): typingsSlinky.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    @scala.inline
    def CopyObjectInput(Bucket: String, CopySource: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput]
    }
    
    @scala.inline
    def CreateBucketInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCreateBucketInputMod.CreateBucketInput]
    }
    
    @scala.inline
    def CreateMultipartUploadInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput]
    }
    
    @scala.inline
    def DeleteBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketCorsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput]
    }
    
    @scala.inline
    def DeleteBucketEncryptionInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput]
    }
    
    @scala.inline
    def DeleteBucketInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInputMod.DeleteBucketInput]
    }
    
    @scala.inline
    def DeleteBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketLifecycleInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput]
    }
    
    @scala.inline
    def DeleteBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def DeleteBucketPolicyInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput]
    }
    
    @scala.inline
    def DeleteBucketReplicationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput]
    }
    
    @scala.inline
    def DeleteBucketTaggingInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput]
    }
    
    @scala.inline
    def DeleteBucketWebsiteInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput]
    }
    
    @scala.inline
    def DeleteObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectInputMod.DeleteObjectInput]
    }
    
    @scala.inline
    def DeleteObjectTaggingInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput]
    }
    
    @scala.inline
    def DeleteObjectsInput(Bucket: String, Delete: Delete): typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesDeleteObjectsInputMod.DeleteObjectsInput]
    }
    
    @scala.inline
    def GetBucketAccelerateConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput]
    }
    
    @scala.inline
    def GetBucketAclInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketAclInputMod.GetBucketAclInput]
    }
    
    @scala.inline
    def GetBucketAnalyticsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def GetBucketCorsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsInputMod.GetBucketCorsInput]
    }
    
    @scala.inline
    def GetBucketEncryptionInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput]
    }
    
    @scala.inline
    def GetBucketInventoryConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def GetBucketLifecycleConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput]
    }
    
    @scala.inline
    def GetBucketLifecycleInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput]
    }
    
    @scala.inline
    def GetBucketLocationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput]
    }
    
    @scala.inline
    def GetBucketLoggingInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketLoggingInputMod.GetBucketLoggingInput]
    }
    
    @scala.inline
    def GetBucketMetricsConfigurationInput(Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def GetBucketNotificationConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput]
    }
    
    @scala.inline
    def GetBucketNotificationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketNotificationInputMod.GetBucketNotificationInput]
    }
    
    @scala.inline
    def GetBucketPolicyInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketPolicyInputMod.GetBucketPolicyInput]
    }
    
    @scala.inline
    def GetBucketReplicationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketReplicationInputMod.GetBucketReplicationInput]
    }
    
    @scala.inline
    def GetBucketRequestPaymentInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput]
    }
    
    @scala.inline
    def GetBucketTaggingInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketTaggingInputMod.GetBucketTaggingInput]
    }
    
    @scala.inline
    def GetBucketVersioningInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput]
    }
    
    @scala.inline
    def GetBucketWebsiteInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput]
    }
    
    @scala.inline
    def GetObjectAclInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetObjectAclInputMod.GetObjectAclInput]
    }
    
    @scala.inline
    def GetObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput]
    }
    
    @scala.inline
    def GetObjectTaggingInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetObjectTaggingInputMod.GetObjectTaggingInput]
    }
    
    @scala.inline
    def GetObjectTorrentInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput]
    }
    
    @scala.inline
    def HeadBucketInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput]
    }
    
    @scala.inline
    def HeadObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput]
    }
    
    @scala.inline
    def ListBucketAnalyticsConfigurationsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketInventoryConfigurationsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketMetricsConfigurationsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput]
    }
    
    @scala.inline
    def ListBucketsInput(): typingsSlinky.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListBucketsInputMod.ListBucketsInput]
    }
    
    @scala.inline
    def ListMultipartUploadsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    @scala.inline
    def ListObjectVersionsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput]
    }
    
    @scala.inline
    def ListObjectsInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput]
    }
    
    @scala.inline
    def ListObjectsV2Input(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input]
    }
    
    @scala.inline
    def ListPartsInput(Bucket: String, Key: String, UploadId: String): typingsSlinky.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesListPartsInputMod.ListPartsInput]
    }
    
    @scala.inline
    def PutBucketAccelerateConfigurationInput(AccelerateConfiguration: AccelerateConfiguration, Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput = {
      val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput]
    }
    
    @scala.inline
    def PutBucketAclInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput]
    }
    
    @scala.inline
    def PutBucketAnalyticsConfigurationInput(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput = {
      val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput]
    }
    
    @scala.inline
    def PutBucketCorsInput(Bucket: String, CORSConfiguration: CORSConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketCorsInputMod.PutBucketCorsInput]
    }
    
    @scala.inline
    def PutBucketEncryptionInput(Bucket: String, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput]
    }
    
    @scala.inline
    def PutBucketInventoryConfigurationInput(Bucket: String, Id: String, InventoryConfiguration: InventoryConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InventoryConfiguration = InventoryConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput]
    }
    
    @scala.inline
    def PutBucketLifecycleConfigurationInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput]
    }
    
    @scala.inline
    def PutBucketLifecycleInput(Bucket: String): typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput]
    }
    
    @scala.inline
    def PutBucketLoggingInput(Bucket: String, BucketLoggingStatus: BucketLoggingStatus): typingsSlinky.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], BucketLoggingStatus = BucketLoggingStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketLoggingInputMod.PutBucketLoggingInput]
    }
    
    @scala.inline
    def PutBucketMetricsConfigurationInput(Bucket: String, Id: String, MetricsConfiguration: MetricsConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput]
    }
    
    @scala.inline
    def PutBucketNotificationConfigurationInput(Bucket: String, NotificationConfiguration: NotificationConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput]
    }
    
    @scala.inline
    def PutBucketNotificationInput(Bucket: String, NotificationConfiguration: NotificationConfigurationDeprecated): typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput]
    }
    
    @scala.inline
    def PutBucketPolicyInput(Bucket: String, Policy: String): typingsSlinky.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput]
    }
    
    @scala.inline
    def PutBucketReplicationInput(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput]
    }
    
    @scala.inline
    def PutBucketRequestPaymentInput(Bucket: String, RequestPaymentConfiguration: RequestPaymentConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RequestPaymentConfiguration = RequestPaymentConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput]
    }
    
    @scala.inline
    def PutBucketTaggingInput(Bucket: String, Tagging: Tagging): typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput]
    }
    
    @scala.inline
    def PutBucketVersioningInput(Bucket: String, VersioningConfiguration: VersioningConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput]
    }
    
    @scala.inline
    def PutBucketWebsiteInput(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): typingsSlinky.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput]
    }
    
    @scala.inline
    def PutObjectAclInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput]
    }
    
    @scala.inline
    def PutObjectTaggingInput(Bucket: String, Key: String, Tagging: Tagging): typingsSlinky.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesPutObjectTaggingInputMod.PutObjectTaggingInput]
    }
    
    @scala.inline
    def RestoreObjectInput(Bucket: String, Key: String): typingsSlinky.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput]
    }
    
    @scala.inline
    def SelectObjectContentInput(
      Bucket: String,
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      Key: String,
      OutputSerialization: OutputSerialization
    ): typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput]
    }
    
    @scala.inline
    def UploadPartCopyInput(Bucket: String, CopySource: String, Key: String, PartNumber: Double, UploadId: String): typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput]
    }
  }
}
