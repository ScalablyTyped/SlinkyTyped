package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteSettings extends js.Object {
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  var disableNewCookie: js.UndefOr[Boolean] = js.native
  var tagSetting: js.UndefOr[TagSetting] = js.native
  var videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.native
  var vpaidAdapterChoiceTemplate: js.UndefOr[String] = js.native
}

object SiteSettings {
  @scala.inline
  def apply(): SiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteSettings]
  }
  @scala.inline
  implicit class SiteSettingsOps[Self <: SiteSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveViewOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveViewOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAdBlockingOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdBlockingOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNewCookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNewCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNewCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNewCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSetting(value: TagSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoActiveViewOptOutTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOutTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoActiveViewOptOutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOutTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withVpaidAdapterChoiceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpaidAdapterChoiceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpaidAdapterChoiceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpaidAdapterChoiceTemplate")(js.undefined)
        ret
    }
  }
  
}

