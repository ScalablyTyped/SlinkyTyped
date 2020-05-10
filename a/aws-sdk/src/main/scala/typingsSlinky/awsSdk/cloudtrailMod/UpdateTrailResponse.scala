package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrailResponse extends js.Object {
  /**
    * Specifies the Amazon Resource Name (ARN) of the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.native
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies whether the trail is publishing events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail exists in one region or in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail is an organization trail.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the format:  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies whether log file integrity validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the name of the trail.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the Amazon S3 bucket designated for publishing log files.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
  /**
    * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
    */
  var SnsTopicARN: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use. Use SnsTopicARN.
    */
  var SnsTopicName: js.UndefOr[String] = js.native
  /**
    * Specifies the ARN of the trail that was updated. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object UpdateTrailResponse {
  @scala.inline
  def apply(): UpdateTrailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTrailResponse]
  }
  @scala.inline
  implicit class UpdateTrailResponseOps[Self <: UpdateTrailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLogFileValidationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFileValidationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFileValidationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFileValidationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withS3BucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(js.undefined)
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
    def withSnsTopicARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicARN")(js.undefined)
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
    def withTrailARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(js.undefined)
        ret
    }
  }
  
}

