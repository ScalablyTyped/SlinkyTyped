package typingsSlinky.pulumiAws.trailMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.cloudtrail.TrailEventSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailState extends js.Object {
  /**
    * The Amazon Resource Name of the trail.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN),
    * that represents the log group to which CloudTrail logs will be delivered.
    */
  val cloudWatchLogsGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the role for the CloudWatch Logs
    * endpoint to assume to write to a user’s log group.
    */
  val cloudWatchLogsRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether log file integrity validation is enabled.
    * Defaults to `false`.
    */
  val enableLogFileValidation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables logging for the trail. Defaults to `true`.
    * Setting this to `false` will pause logging.
    */
  val enableLogging: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these.
    */
  val eventSelectors: js.UndefOr[Input[js.Array[Input[TrailEventSelector]]]] = js.native
  /**
    * The region in which the trail was created.
    */
  val homeRegion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the trail is publishing events
    * from global services such as IAM to the log files. Defaults to `true`.
    */
  val includeGlobalServiceEvents: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the trail is created in the current
    * region or in all regions. Defaults to `false`.
    */
  val isMultiRegionTrail: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
    */
  val isOrganizationTrail: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the KMS key ARN to use to encrypt the logs delivered by CloudTrail.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the name of the trail.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the name of the S3 bucket designated for publishing log files.
    */
  val s3BucketName: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the S3 key prefix that follows
    * the name of the bucket you have designated for log file delivery.
    */
  val s3KeyPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the name of the Amazon SNS topic
    * defined for notification of log file delivery.
    */
  val snsTopicName: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the trail
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object TrailState {
  @scala.inline
  def apply(): TrailState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailState]
  }
  @scala.inline
  implicit class TrailStateOps[Self <: TrailState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLogsGroupArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogsGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogsGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLogsRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogsRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogsRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLogFileValidation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogFileValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogFileValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogFileValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLogging(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSelectors(value: Input[js.Array[Input[TrailEventSelector]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeGlobalServiceEvents(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGlobalServiceEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGlobalServiceEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGlobalServiceEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultiRegionTrail(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiRegionTrail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMultiRegionTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiRegionTrail")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOrganizationTrail(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOrganizationTrail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOrganizationTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOrganizationTrail")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

