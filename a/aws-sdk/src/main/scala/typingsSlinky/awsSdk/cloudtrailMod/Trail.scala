package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trail extends js.Object {
  /**
    * Specifies an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.native
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.native
  /**
    * Specifies if the trail has custom event selectors.
    */
  var HasCustomEventSelectors: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether a trail has insight types specified in an InsightSelector list.
    */
  var HasInsightSelectors: js.UndefOr[Boolean] = js.native
  /**
    * The region in which the trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.native
  /**
    * Set to True to include AWS API calls from AWS global services such as IAM. Otherwise, False.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the trail exists only in one region or exists in all regions.
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
    * Specifies whether log file validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Name of the trail set by calling CreateTrail. The maximum length is 128 characters.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Name of the Amazon S3 bucket into which CloudTrail delivers your trail files. See Amazon S3 Bucket Naming Requirements.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.The maximum length is 200 characters.
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
    * Specifies the ARN of the trail. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object Trail {
  @scala.inline
  def apply(): Trail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trail]
  }
  @scala.inline
  implicit class TrailOps[Self <: Trail] (val x: Self) extends AnyVal {
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
    def withHasCustomEventSelectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCustomEventSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCustomEventSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCustomEventSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withHasInsightSelectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasInsightSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasInsightSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasInsightSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(js.undefined)
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

