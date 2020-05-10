package typingsSlinky.pulumiAws.smsPreferencesMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmsPreferencesArgs extends js.Object {
  /**
    * A string, such as your business brand, that is displayed as the sender on the receiving device.
    */
  val defaultSenderId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
    */
  val defaultSmsType: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
    */
  val deliveryStatusIamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
    */
  val deliveryStatusSuccessSamplingRate: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum amount in USD that you are willing to spend each month to send SMS messages.
    */
  val monthlySpendLimit: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
    */
  val usageReportS3Bucket: js.UndefOr[Input[String]] = js.native
}

object SmsPreferencesArgs {
  @scala.inline
  def apply(): SmsPreferencesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsPreferencesArgs]
  }
  @scala.inline
  implicit class SmsPreferencesArgsOps[Self <: SmsPreferencesArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSenderId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSenderId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSmsType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSmsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSmsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSmsType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryStatusIamRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryStatusIamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStatusIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryStatusIamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryStatusSuccessSamplingRate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryStatusSuccessSamplingRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStatusSuccessSamplingRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryStatusSuccessSamplingRate")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthlySpendLimit(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthlySpendLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthlySpendLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthlySpendLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageReportS3Bucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageReportS3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageReportS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageReportS3Bucket")(js.undefined)
        ret
    }
  }
  
}

