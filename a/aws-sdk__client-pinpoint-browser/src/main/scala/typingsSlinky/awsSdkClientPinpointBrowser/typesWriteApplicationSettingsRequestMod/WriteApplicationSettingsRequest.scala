package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteApplicationSettingsRequest extends js.Object {
  /**
    * Default campaign hook information.
    */
  var CampaignHook: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.native
  /**
    * The CloudWatchMetrics settings for the app.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.native
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
    def withCloudWatchMetricsEnabled(value: Boolean): Self = {
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

