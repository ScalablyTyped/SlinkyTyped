package typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettingsResource extends js.Object {
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * Default campaign hook.
    */
  var CampaignHook: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.native
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.native
}

object ApplicationSettingsResource {
  @scala.inline
  def apply(): ApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSettingsResource]
  }
  @scala.inline
  implicit class ApplicationSettingsResourceOps[Self <: ApplicationSettingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
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
    def withLastModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
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

