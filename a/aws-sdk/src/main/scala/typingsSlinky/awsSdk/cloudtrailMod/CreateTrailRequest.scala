package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrailRequest extends js.Object {
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.native
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies whether log file integrity validation is enabled. The default is false.  When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail will not create digest files for log files that were delivered during a period in which log file integrity validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete a trail. 
    */
  var EnableLogFileValidation: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail is publishing events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail is created in the current region or in all regions. The default is false, which creates a trail only in the region where you are signed in. As a best practice, consider creating trails that log events in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account that is the master account for an organization in AWS Organizations.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique identifier. Examples:   alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012   12345678-1234-1234-1234-123456789012  
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the trail. The name must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)  
    */
  var Name: String = js.native
  /**
    * Specifies the name of the Amazon S3 bucket designated for publishing log files. See Amazon S3 Bucket Naming Requirements.
    */
  var S3BucketName: String = js.native
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files. The maximum length is 200 characters.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is 256 characters.
    */
  var SnsTopicName: js.UndefOr[String] = js.native
  var TagsList: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.TagsList] = js.native
}

object CreateTrailRequest {
  @scala.inline
  def apply(Name: String, S3BucketName: String): CreateTrailRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrailRequest]
  }
  @scala.inline
  implicit class CreateTrailRequestOps[Self <: CreateTrailRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3BucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudWatchLogsLogGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsLogGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsLogGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsLogGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLogsRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLogFileValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableLogFileValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogFileValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableLogFileValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeGlobalServiceEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeGlobalServiceEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGlobalServiceEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeGlobalServiceEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultiRegionTrail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMultiRegionTrail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMultiRegionTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMultiRegionTrail")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOrganizationTrail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOrganizationTrail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOrganizationTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOrganizationTrail")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicName")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsList(value: TagsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagsList")(js.undefined)
        ret
    }
  }
  
}

