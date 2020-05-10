package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipeline extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the pipeline.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline. If you use either s3 or s3-aws-kms as your Encryption:Mode, you don't need to provide a key with your job because a default key, known as an AWS-KMS key, is created for you automatically. You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key, or if you are using an Encryption:Mode of aes-cbc-pkcs7, aes-ctr, or aes-gcm.
    */
  var AwsKmsKeyArn: js.UndefOr[KeyArn] = js.native
  /**
    * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. Either you specify both ContentConfig and ThumbnailConfig, or you specify OutputBucket.    Bucket: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.    Permissions: A list of the users and/or predefined Amazon S3 groups you want to have access to transcoded files and playlists, and the type of access that you want them to have.    GranteeType: The type of value that appears in the Grantee object:     Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.    Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.      Grantee: The AWS user or group that you want to have access to transcoded files and playlists.    Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:    READ: The grantee can read the objects and metadata for objects that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for objects that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the objects that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.        StorageClass: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.   
    */
  var ContentConfig: js.UndefOr[PipelineOutputConfig] = js.native
  /**
    * The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform a variety of operations, such as creating a job or a preset.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Id] = js.native
  /**
    * The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics files, if any, that you want to use for watermarks.
    */
  var InputBucket: js.UndefOr[BucketName] = js.native
  /**
    * The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is not enforced. Constraints: Maximum 40 characters
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Name] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.  To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.     Progressing (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process the job.    Complete (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.    Warning (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.    Error (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.  
    */
  var Notifications: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Notifications] = js.native
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and playlists. Either you specify this value, or you specify both ContentConfig and ThumbnailConfig.
    */
  var OutputBucket: js.UndefOr[BucketName] = js.native
  /**
    * The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this pipeline.
    */
  var Role: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Role] = js.native
  /**
    * The current status of the pipeline:    Active: The pipeline is processing jobs.    Paused: The pipeline is not currently processing jobs.  
    */
  var Status: js.UndefOr[PipelineStatus] = js.native
  /**
    * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. Either you specify both ContentConfig and ThumbnailConfig, or you specify OutputBucket.    Bucket: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.     Permissions: A list of the users and/or predefined Amazon S3 groups you want to have access to thumbnail files, and the type of access that you want them to have.    GranteeType: The type of value that appears in the Grantee object:    Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.  A canonical user ID is not the same as an AWS account number.     Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.      Grantee: The AWS user or group that you want to have access to thumbnail files.   Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:     READ: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.        StorageClass: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.  
    */
  var ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.native
}

object Pipeline {
  @scala.inline
  def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  @scala.inline
  implicit class PipelineOps[Self <: Pipeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsKmsKeyArn(value: KeyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsKmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsKmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withContentConfig(value: PipelineOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifications(value: Notifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: PipelineStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailConfig(value: PipelineOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbnailConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbnailConfig")(js.undefined)
        ret
    }
  }
  
}

