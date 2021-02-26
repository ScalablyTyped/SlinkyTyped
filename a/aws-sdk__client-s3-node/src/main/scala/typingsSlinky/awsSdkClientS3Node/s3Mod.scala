package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.s3ClientMod.S3Client
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3Configuration
import typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typingsSlinky.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typingsSlinky.awsSdkClientS3Node.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typingsSlinky.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput
import typingsSlinky.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput
import typingsSlinky.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput
import typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
import typingsSlinky.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationInputMod.DeleteBucketAnalyticsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod.DeleteBucketAnalyticsConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsInputMod.DeleteBucketCorsInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod.DeleteBucketCorsOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionInputMod.DeleteBucketEncryptionInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod.DeleteBucketEncryptionOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationInputMod.DeleteBucketReplicationInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod.DeleteBucketReplicationOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingInputMod.DeleteBucketTaggingInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod.DeleteBucketTaggingOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteInputMod.DeleteBucketWebsiteInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod.DeleteBucketWebsiteOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectInputMod.DeleteObjectInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectOutputMod.DeleteObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput
import typingsSlinky.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAclOutputMod.GetBucketAclOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsInputMod.GetBucketCorsInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsOutputMod.GetBucketCorsOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationInputMod.GetBucketInventoryConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod.GetBucketInventoryConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingInputMod.GetBucketLoggingInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingOutputMod.GetBucketLoggingOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyInputMod.GetBucketPolicyInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingInputMod.GetBucketTaggingInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectOutputMod.GetObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingInputMod.GetObjectTaggingInput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput
import typingsSlinky.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsSlinky.awsSdkClientS3Node.typesHeadBucketInputMod.HeadBucketInput
import typingsSlinky.awsSdkClientS3Node.typesHeadBucketOutputMod.HeadBucketOutput
import typingsSlinky.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput
import typingsSlinky.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
import typingsSlinky.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
import typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
import typingsSlinky.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
import typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
import typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
import typingsSlinky.awsSdkClientS3Node.typesListBucketsInputMod.ListBucketsInput
import typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod.ListBucketsOutput
import typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typingsSlinky.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsInputMod.ListObjectVersionsInput
import typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsOutputMod.ListObjectVersionsOutput
import typingsSlinky.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
import typingsSlinky.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput
import typingsSlinky.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input
import typingsSlinky.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output
import typingsSlinky.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput
import typingsSlinky.awsSdkClientS3Node.typesListPartsOutputMod.ListPartsOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAclInputMod.PutBucketAclInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAclOutputMod.PutBucketAclOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionInputMod.PutBucketEncryptionInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketEncryptionOutputMod.PutBucketEncryptionOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingInputMod.PutBucketLoggingInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketMetricsConfigurationOutputMod.PutBucketMetricsConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyInputMod.PutBucketPolicyInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectAclOutputMod.PutObjectAclOutput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
import typingsSlinky.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput
import typingsSlinky.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput
import typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
import typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyInputMod.UploadPartCopyInput
import typingsSlinky.awsSdkClientS3Node.typesUploadPartCopyOutputMod.UploadPartCopyOutput
import typingsSlinky.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typingsSlinky.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3Mod {
  
  @JSImport("@aws-sdk/client-s3-node/S3", "S3")
  @js.native
  class S3 protected () extends S3Client {
    def this(configuration: S3Configuration) = this()
    
    /**
      * <p>Aborts a multipart upload.</p> <p>To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchUpload} <p>The specified multipart upload does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def abortMultipartUpload(args: AbortMultipartUploadInput): js.Promise[AbortMultipartUploadOutput] = js.native
    def abortMultipartUpload(
      args: AbortMultipartUploadInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[AbortMultipartUploadOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Completes a multipart upload by assembling previously uploaded parts.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def completeMultipartUpload(args: CompleteMultipartUploadInput): js.Promise[CompleteMultipartUploadOutput] = js.native
    def completeMultipartUpload(
      args: CompleteMultipartUploadInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[CompleteMultipartUploadOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Creates a copy of an object that is already stored in Amazon S3.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {ObjectNotInActiveTierError} <p>The source object of the COPY operation is not in the active tier and is only stored in Amazon Glacier.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def copyObject(args: CopyObjectInput): js.Promise[CopyObjectOutput] = js.native
    def copyObject(
      args: CopyObjectInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[CopyObjectOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Creates a new bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {BucketAlreadyExists} <p>The requested bucket name is not available. The bucket namespace is shared by all users of the system. Please select a different name and try again.</p>
      *   - {BucketAlreadyOwnedByYou} BucketAlreadyOwnedByYou shape
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def createBucket(args: CreateBucketInput): js.Promise[CreateBucketOutput] = js.native
    def createBucket(
      args: CreateBucketInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[CreateBucketOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Initiates a multipart upload and returns an upload ID.</p> <p> <b>Note:</b> After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def createMultipartUpload(args: CreateMultipartUploadInput): js.Promise[CreateMultipartUploadOutput] = js.native
    def createMultipartUpload(
      args: CreateMultipartUploadInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[CreateMultipartUploadOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes the bucket. All objects (including all object versions and Delete Markers) in the bucket must be deleted before the bucket itself can be deleted.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucket(args: DeleteBucketInput): js.Promise[DeleteBucketOutput] = js.native
    def deleteBucket(
      args: DeleteBucketInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketAnalyticsConfiguration(args: DeleteBucketAnalyticsConfigurationInput): js.Promise[DeleteBucketAnalyticsConfigurationOutput] = js.native
    def deleteBucketAnalyticsConfiguration(
      args: DeleteBucketAnalyticsConfigurationInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[DeleteBucketAnalyticsConfigurationOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Deletes the cors configuration information set for the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketCors(args: DeleteBucketCorsInput): js.Promise[DeleteBucketCorsOutput] = js.native
    def deleteBucketCors(
      args: DeleteBucketCorsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketCorsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes the server-side encryption configuration from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketEncryption(args: DeleteBucketEncryptionInput): js.Promise[DeleteBucketEncryptionOutput] = js.native
    def deleteBucketEncryption(
      args: DeleteBucketEncryptionInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketEncryptionOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes an inventory configuration (identified by the inventory ID) from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketInventoryConfiguration(args: DeleteBucketInventoryConfigurationInput): js.Promise[DeleteBucketInventoryConfigurationOutput] = js.native
    def deleteBucketInventoryConfiguration(
      args: DeleteBucketInventoryConfigurationInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[DeleteBucketInventoryConfigurationOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Deletes the lifecycle configuration from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketLifecycle(args: DeleteBucketLifecycleInput): js.Promise[DeleteBucketLifecycleOutput] = js.native
    def deleteBucketLifecycle(
      args: DeleteBucketLifecycleInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketLifecycleOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketMetricsConfiguration(args: DeleteBucketMetricsConfigurationInput): js.Promise[DeleteBucketMetricsConfigurationOutput] = js.native
    def deleteBucketMetricsConfiguration(
      args: DeleteBucketMetricsConfigurationInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[DeleteBucketMetricsConfigurationOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Deletes the policy from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketPolicy(args: DeleteBucketPolicyInput): js.Promise[DeleteBucketPolicyOutput] = js.native
    def deleteBucketPolicy(
      args: DeleteBucketPolicyInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketPolicyOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes the replication configuration from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketReplication(args: DeleteBucketReplicationInput): js.Promise[DeleteBucketReplicationOutput] = js.native
    def deleteBucketReplication(
      args: DeleteBucketReplicationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketReplicationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deletes the tags from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketTagging(args: DeleteBucketTaggingInput): js.Promise[DeleteBucketTaggingOutput] = js.native
    def deleteBucketTagging(
      args: DeleteBucketTaggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketTaggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>This operation removes the website configuration from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteBucketWebsite(args: DeleteBucketWebsiteInput): js.Promise[DeleteBucketWebsiteOutput] = js.native
    def deleteBucketWebsite(
      args: DeleteBucketWebsiteInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteBucketWebsiteOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteObject(args: DeleteObjectInput): js.Promise[DeleteObjectOutput] = js.native
    def deleteObject(
      args: DeleteObjectInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteObjectOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Removes the tag-set from an existing object.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteObjectTagging(args: DeleteObjectTaggingInput): js.Promise[DeleteObjectTaggingOutput] = js.native
    def deleteObjectTagging(
      args: DeleteObjectTaggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteObjectTaggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def deleteObjects(args: DeleteObjectsInput): js.Promise[DeleteObjectsOutput] = js.native
    def deleteObjects(
      args: DeleteObjectsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[DeleteObjectsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the accelerate configuration of a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketAccelerateConfiguration(args: GetBucketAccelerateConfigurationInput): js.Promise[GetBucketAccelerateConfigurationOutput] = js.native
    def getBucketAccelerateConfiguration(
      args: GetBucketAccelerateConfigurationInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[GetBucketAccelerateConfigurationOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Gets the access control policy for the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketAcl(args: GetBucketAclInput): js.Promise[GetBucketAclOutput] = js.native
    def getBucketAcl(
      args: GetBucketAclInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketAclOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Gets an analytics configuration for the bucket (specified by the analytics configuration ID).</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketAnalyticsConfiguration(args: GetBucketAnalyticsConfigurationInput): js.Promise[GetBucketAnalyticsConfigurationOutput] = js.native
    def getBucketAnalyticsConfiguration(
      args: GetBucketAnalyticsConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketAnalyticsConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the cors configuration for the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketCors(args: GetBucketCorsInput): js.Promise[GetBucketCorsOutput] = js.native
    def getBucketCors(
      args: GetBucketCorsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketCorsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the server-side encryption configuration of a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketEncryption(args: GetBucketEncryptionInput): js.Promise[GetBucketEncryptionOutput] = js.native
    def getBucketEncryption(
      args: GetBucketEncryptionInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketEncryptionOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns an inventory configuration (identified by the inventory ID) from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketInventoryConfiguration(args: GetBucketInventoryConfigurationInput): js.Promise[GetBucketInventoryConfigurationOutput] = js.native
    def getBucketInventoryConfiguration(
      args: GetBucketInventoryConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketInventoryConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deprecated, see the GetBucketLifecycleConfiguration operation.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketLifecycle(args: GetBucketLifecycleInput): js.Promise[GetBucketLifecycleOutput] = js.native
    def getBucketLifecycle(
      args: GetBucketLifecycleInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketLifecycleOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the lifecycle configuration information set on the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketLifecycleConfiguration(args: GetBucketLifecycleConfigurationInput): js.Promise[GetBucketLifecycleConfigurationOutput] = js.native
    def getBucketLifecycleConfiguration(
      args: GetBucketLifecycleConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketLifecycleConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the region the bucket resides in.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketLocation(args: GetBucketLocationInput): js.Promise[GetBucketLocationOutput] = js.native
    def getBucketLocation(
      args: GetBucketLocationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketLocationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketLogging(args: GetBucketLoggingInput): js.Promise[GetBucketLoggingOutput] = js.native
    def getBucketLogging(
      args: GetBucketLoggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketLoggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketMetricsConfiguration(args: GetBucketMetricsConfigurationInput): js.Promise[GetBucketMetricsConfigurationOutput] = js.native
    def getBucketMetricsConfiguration(
      args: GetBucketMetricsConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketMetricsConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deprecated, see the GetBucketNotificationConfiguration operation.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketNotification(args: GetBucketNotificationInput): js.Promise[GetBucketNotificationOutput] = js.native
    def getBucketNotification(
      args: GetBucketNotificationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketNotificationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the notification configuration of a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketNotificationConfiguration(args: GetBucketNotificationConfigurationInput): js.Promise[GetBucketNotificationConfigurationOutput] = js.native
    def getBucketNotificationConfiguration(
      args: GetBucketNotificationConfigurationInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[GetBucketNotificationConfigurationOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Returns the policy of a specified bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketPolicy(args: GetBucketPolicyInput): js.Promise[GetBucketPolicyOutput] = js.native
    def getBucketPolicy(
      args: GetBucketPolicyInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketPolicyOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the replication configuration of a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketReplication(args: GetBucketReplicationInput): js.Promise[GetBucketReplicationOutput] = js.native
    def getBucketReplication(
      args: GetBucketReplicationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketReplicationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the request payment configuration of a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketRequestPayment(args: GetBucketRequestPaymentInput): js.Promise[GetBucketRequestPaymentOutput] = js.native
    def getBucketRequestPayment(
      args: GetBucketRequestPaymentInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketRequestPaymentOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the tag set associated with the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketTagging(args: GetBucketTaggingInput): js.Promise[GetBucketTaggingOutput] = js.native
    def getBucketTagging(
      args: GetBucketTaggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketTaggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the versioning state of a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketVersioning(args: GetBucketVersioningInput): js.Promise[GetBucketVersioningOutput] = js.native
    def getBucketVersioning(
      args: GetBucketVersioningInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketVersioningOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the website configuration for a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getBucketWebsite(args: GetBucketWebsiteInput): js.Promise[GetBucketWebsiteOutput] = js.native
    def getBucketWebsite(
      args: GetBucketWebsiteInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetBucketWebsiteOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Retrieves objects from Amazon S3.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchKey} <p>The specified key does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getObject(args: GetObjectInput): js.Promise[GetObjectOutput[Readable]] = js.native
    def getObject(
      args: GetObjectInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetObjectOutput[Readable]], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the access control list (ACL) of an object.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchKey} <p>The specified key does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getObjectAcl(args: GetObjectAclInput): js.Promise[GetObjectAclOutput] = js.native
    def getObjectAcl(
      args: GetObjectAclInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetObjectAclOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns the tag-set of an object.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getObjectTagging(args: GetObjectTaggingInput): js.Promise[GetObjectTaggingOutput] = js.native
    def getObjectTagging(
      args: GetObjectTaggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetObjectTaggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Return torrent files from a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def getObjectTorrent(args: GetObjectTorrentInput): js.Promise[GetObjectTorrentOutput[Readable]] = js.native
    def getObjectTorrent(
      args: GetObjectTorrentInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[GetObjectTorrentOutput[Readable]], Unit]
    ): Unit = js.native
    
    /**
      * <p>This operation is useful to determine if a bucket exists and you have permission to access it.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchBucket} <p>The specified bucket does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def headBucket(args: HeadBucketInput): js.Promise[HeadBucketOutput] = js.native
    def headBucket(
      args: HeadBucketInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[HeadBucketOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchKey} <p>The specified key does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def headObject(args: HeadObjectInput): js.Promise[HeadObjectOutput] = js.native
    def headObject(
      args: HeadObjectInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[HeadObjectOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Lists the analytics configurations for the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listBucketAnalyticsConfigurations(args: ListBucketAnalyticsConfigurationsInput): js.Promise[ListBucketAnalyticsConfigurationsOutput] = js.native
    def listBucketAnalyticsConfigurations(
      args: ListBucketAnalyticsConfigurationsInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[ListBucketAnalyticsConfigurationsOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Returns a list of inventory configurations for the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listBucketInventoryConfigurations(args: ListBucketInventoryConfigurationsInput): js.Promise[ListBucketInventoryConfigurationsOutput] = js.native
    def listBucketInventoryConfigurations(
      args: ListBucketInventoryConfigurationsInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[ListBucketInventoryConfigurationsOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Lists the metrics configurations for the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listBucketMetricsConfigurations(args: ListBucketMetricsConfigurationsInput): js.Promise[ListBucketMetricsConfigurationsOutput] = js.native
    def listBucketMetricsConfigurations(
      args: ListBucketMetricsConfigurationsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListBucketMetricsConfigurationsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns a list of all buckets owned by the authenticated sender of the request.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listBuckets(args: ListBucketsInput): js.Promise[ListBucketsOutput] = js.native
    def listBuckets(
      args: ListBucketsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListBucketsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>This operation lists in-progress multipart uploads.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listMultipartUploads(args: ListMultipartUploadsInput): js.Promise[ListMultipartUploadsOutput] = js.native
    def listMultipartUploads(
      args: ListMultipartUploadsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListMultipartUploadsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns metadata about all of the versions of objects in a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listObjectVersions(args: ListObjectVersionsInput): js.Promise[ListObjectVersionsOutput] = js.native
    def listObjectVersions(
      args: ListObjectVersionsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListObjectVersionsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchBucket} <p>The specified bucket does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listObjects(args: ListObjectsInput): js.Promise[ListObjectsOutput] = js.native
    def listObjects(
      args: ListObjectsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListObjectsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchBucket} <p>The specified bucket does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listObjectsV2(args: ListObjectsV2Input): js.Promise[ListObjectsV2Output] = js.native
    def listObjectsV2(
      args: ListObjectsV2Input,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListObjectsV2Output], Unit]
    ): Unit = js.native
    
    /**
      * <p>Lists the parts that have been uploaded for a specific multipart upload.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def listParts(args: ListPartsInput): js.Promise[ListPartsOutput] = js.native
    def listParts(
      args: ListPartsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[ListPartsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets the accelerate configuration of an existing bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketAccelerateConfiguration(args: PutBucketAccelerateConfigurationInput): js.Promise[PutBucketAccelerateConfigurationOutput] = js.native
    def putBucketAccelerateConfiguration(
      args: PutBucketAccelerateConfigurationInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[PutBucketAccelerateConfigurationOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Sets the permissions on a bucket using access control lists (ACL).</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketAcl(args: PutBucketAclInput): js.Promise[PutBucketAclOutput] = js.native
    def putBucketAcl(
      args: PutBucketAclInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketAclOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets an analytics configuration for the bucket (specified by the analytics configuration ID).</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketAnalyticsConfiguration(args: PutBucketAnalyticsConfigurationInput): js.Promise[PutBucketAnalyticsConfigurationOutput] = js.native
    def putBucketAnalyticsConfiguration(
      args: PutBucketAnalyticsConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketAnalyticsConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets the cors configuration for a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketCors(args: PutBucketCorsInput): js.Promise[PutBucketCorsOutput] = js.native
    def putBucketCors(
      args: PutBucketCorsInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketCorsOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Creates a new server-side encryption configuration (or replaces an existing one, if present).</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketEncryption(args: PutBucketEncryptionInput): js.Promise[PutBucketEncryptionOutput] = js.native
    def putBucketEncryption(
      args: PutBucketEncryptionInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketEncryptionOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Adds an inventory configuration (identified by the inventory ID) from the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketInventoryConfiguration(args: PutBucketInventoryConfigurationInput): js.Promise[PutBucketInventoryConfigurationOutput] = js.native
    def putBucketInventoryConfiguration(
      args: PutBucketInventoryConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketInventoryConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deprecated, see the PutBucketLifecycleConfiguration operation.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketLifecycle(args: PutBucketLifecycleInput): js.Promise[PutBucketLifecycleOutput] = js.native
    def putBucketLifecycle(
      args: PutBucketLifecycleInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketLifecycleOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets lifecycle configuration for your bucket. If a lifecycle configuration exists, it replaces it.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketLifecycleConfiguration(args: PutBucketLifecycleConfigurationInput): js.Promise[PutBucketLifecycleConfigurationOutput] = js.native
    def putBucketLifecycleConfiguration(
      args: PutBucketLifecycleConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketLifecycleConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters. To set the logging status of a bucket, you must be the bucket owner.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketLogging(args: PutBucketLoggingInput): js.Promise[PutBucketLoggingOutput] = js.native
    def putBucketLogging(
      args: PutBucketLoggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketLoggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketMetricsConfiguration(args: PutBucketMetricsConfigurationInput): js.Promise[PutBucketMetricsConfigurationOutput] = js.native
    def putBucketMetricsConfiguration(
      args: PutBucketMetricsConfigurationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketMetricsConfigurationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Deprecated, see the PutBucketNotificationConfiguraiton operation.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketNotification(args: PutBucketNotificationInput): js.Promise[PutBucketNotificationOutput] = js.native
    def putBucketNotification(
      args: PutBucketNotificationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketNotificationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Enables notifications of specified events for a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketNotificationConfiguration(args: PutBucketNotificationConfigurationInput): js.Promise[PutBucketNotificationConfigurationOutput] = js.native
    def putBucketNotificationConfiguration(
      args: PutBucketNotificationConfigurationInput,
      cb: js.Function2[
          /* err */ js.Any, 
          /* data */ js.UndefOr[PutBucketNotificationConfigurationOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * <p>Replaces a policy on a bucket. If the bucket already has a policy, the one in this request completely replaces it.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketPolicy(args: PutBucketPolicyInput): js.Promise[PutBucketPolicyOutput] = js.native
    def putBucketPolicy(
      args: PutBucketPolicyInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketPolicyOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p> Creates a new replication configuration (or replaces an existing one, if present). For more information, see <a href=" https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html">Cross-Region Replication (CRR)</a> in the Amazon S3 Developer Guide. </p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketReplication(args: PutBucketReplicationInput): js.Promise[PutBucketReplicationOutput] = js.native
    def putBucketReplication(
      args: PutBucketReplicationInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketReplicationOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the download will be charged for the download. Documentation on requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketRequestPayment(args: PutBucketRequestPaymentInput): js.Promise[PutBucketRequestPaymentOutput] = js.native
    def putBucketRequestPayment(
      args: PutBucketRequestPaymentInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketRequestPaymentOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets the tags for a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketTagging(args: PutBucketTaggingInput): js.Promise[PutBucketTaggingOutput] = js.native
    def putBucketTagging(
      args: PutBucketTaggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketTaggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets the versioning state of an existing bucket. To set the versioning state, you must be the bucket owner.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketVersioning(args: PutBucketVersioningInput): js.Promise[PutBucketVersioningOutput] = js.native
    def putBucketVersioning(
      args: PutBucketVersioningInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketVersioningOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Set the website configuration for a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putBucketWebsite(args: PutBucketWebsiteInput): js.Promise[PutBucketWebsiteOutput] = js.native
    def putBucketWebsite(
      args: PutBucketWebsiteInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutBucketWebsiteOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Adds an object to a bucket.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putObject(args: PutObjectInput[Readable]): js.Promise[PutObjectOutput] = js.native
    def putObject(
      args: PutObjectInput[Readable],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutObjectOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket</p>
      *
      * This operation may fail with one of the following errors:
      *   - {NoSuchKey} <p>The specified key does not exist.</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putObjectAcl(args: PutObjectAclInput): js.Promise[PutObjectAclOutput] = js.native
    def putObjectAcl(
      args: PutObjectAclInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutObjectAclOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Sets the supplied tag-set to an object that already exists in a bucket</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def putObjectTagging(args: PutObjectTaggingInput): js.Promise[PutObjectTaggingOutput] = js.native
    def putObjectTagging(
      args: PutObjectTaggingInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[PutObjectTaggingOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Restores an archived copy of an object back into Amazon S3</p>
      *
      * This operation may fail with one of the following errors:
      *   - {ObjectAlreadyInActiveTierError} <p>This operation is not allowed against this storage tier</p>
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def restoreObject(args: RestoreObjectInput): js.Promise[RestoreObjectOutput] = js.native
    def restoreObject(
      args: RestoreObjectInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[RestoreObjectOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def selectObjectContent(args: SelectObjectContentInput): js.Promise[SelectObjectContentOutput] = js.native
    def selectObjectContent(
      args: SelectObjectContentInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[SelectObjectContentOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Uploads a part in a multipart upload.</p> <p> <b>Note:</b> After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def uploadPart(args: UploadPartInput[Readable]): js.Promise[UploadPartOutput] = js.native
    def uploadPart(
      args: UploadPartInput[Readable],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[UploadPartOutput], Unit]
    ): Unit = js.native
    
    /**
      * <p>Uploads a part by copying data from an existing object as data source.</p>
      *
      * This operation may fail with one of the following errors:
      *   - {Error} An error originating from the SDK or customizations rather than the service
      */
    def uploadPartCopy(args: UploadPartCopyInput): js.Promise[UploadPartCopyOutput] = js.native
    def uploadPartCopy(
      args: UploadPartCopyInput,
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[UploadPartCopyOutput], Unit]
    ): Unit = js.native
  }
}
