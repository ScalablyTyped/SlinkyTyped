package typingsSlinky.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledWriteApplicationSettingsRequest extends WriteApplicationSettingsRequest {
  /**
    * Default campaign hook information.
    */
  @JSName("CampaignHook")
  var CampaignHook_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignHook] = js.native
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  @JSName("Limits")
  var Limits_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  @JSName("QuietTime")
  var QuietTime_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledQuietTime] = js.native
}

object UnmarshalledWriteApplicationSettingsRequest {
  @scala.inline
  def apply(): UnmarshalledWriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteApplicationSettingsRequest]
  }
  @scala.inline
  implicit class UnmarshalledWriteApplicationSettingsRequestOps[Self <: UnmarshalledWriteApplicationSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignHook(value: UnmarshalledCampaignHook): Self = {
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
    def withLimits(value: UnmarshalledCampaignLimits): Self = {
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
    def withQuietTime(value: UnmarshalledQuietTime): Self = {
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

