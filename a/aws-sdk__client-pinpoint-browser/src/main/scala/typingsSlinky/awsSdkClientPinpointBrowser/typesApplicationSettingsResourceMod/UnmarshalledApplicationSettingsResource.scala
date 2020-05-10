package typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledApplicationSettingsResource extends ApplicationSettingsResource {
  /**
    * Default campaign hook.
    */
  @JSName("CampaignHook")
  var CampaignHook_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignHook] = js.native
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  @JSName("Limits")
  var Limits_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  @JSName("QuietTime")
  var QuietTime_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledQuietTime] = js.native
}

object UnmarshalledApplicationSettingsResource {
  @scala.inline
  def apply(): UnmarshalledApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledApplicationSettingsResource]
  }
  @scala.inline
  implicit class UnmarshalledApplicationSettingsResourceOps[Self <: UnmarshalledApplicationSettingsResource] (val x: Self) extends AnyVal {
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

