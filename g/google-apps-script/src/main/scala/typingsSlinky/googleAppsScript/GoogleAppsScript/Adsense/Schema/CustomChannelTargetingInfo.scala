package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomChannelTargetingInfo extends js.Object {
  var adsAppearOn: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var siteLanguage: js.UndefOr[String] = js.native
}

object CustomChannelTargetingInfo {
  @scala.inline
  def apply(): CustomChannelTargetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomChannelTargetingInfo]
  }
  @scala.inline
  implicit class CustomChannelTargetingInfoOps[Self <: CustomChannelTargetingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdsAppearOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsAppearOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsAppearOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsAppearOn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteLanguage")(js.undefined)
        ret
    }
  }
  
}

