package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteApplicationSettingsRequest extends js.Object {
  /**
    * The settings for the AWS Lambda function to use by default as a code hook for campaigns in the application. To override these settings for a specific campaign, use the Campaign resource to define custom Lambda function settings for the campaign.
    */
  var CampaignHook: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.CampaignHook] = js.native
  /**
    * Specifies whether to enable application-related alarms in Amazon CloudWatch.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[boolean] = js.native
  /**
    * The default sending limits for campaigns in the application. To override these limits for a specific campaign, use the Campaign resource to define custom limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The default quiet time for campaigns and journeys in the application. Quiet time is a specific time range when messages aren't sent to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the application (or a campaign or journey that has custom quiet time settings). The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the application (or a campaign or journey that has custom quiet time settings). If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign or journey, even if quiet time is enabled. To override the default quiet time settings for a specific campaign or journey, use the Campaign resource or the Journey resource to define a custom quiet time for the campaign or journey.
    */
  var QuietTime: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.QuietTime] = js.native
}

object WriteApplicationSettingsRequest {
  @scala.inline
  def apply(): WriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteApplicationSettingsRequest]
  }
  @scala.inline
  implicit class WriteApplicationSettingsRequestOps[Self <: WriteApplicationSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignHook(value: CampaignHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignHook")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchMetricsEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchMetricsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchMetricsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchMetricsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: CampaignLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limits")(js.undefined)
        ret
    }
    @scala.inline
    def withQuietTime(value: QuietTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuietTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuietTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuietTime")(js.undefined)
        ret
    }
  }
  
}

