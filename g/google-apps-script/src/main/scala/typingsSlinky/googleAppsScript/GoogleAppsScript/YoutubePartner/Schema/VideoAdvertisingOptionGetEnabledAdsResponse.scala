package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAdvertisingOptionGetEnabledAdsResponse extends js.Object {
  var adBreaks: js.UndefOr[js.Array[AdBreak]] = js.native
  var adsOnEmbeds: js.UndefOr[Boolean] = js.native
  var countriesRestriction: js.UndefOr[js.Array[CountriesRestriction]] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object VideoAdvertisingOptionGetEnabledAdsResponse {
  @scala.inline
  def apply(): VideoAdvertisingOptionGetEnabledAdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAdvertisingOptionGetEnabledAdsResponse]
  }
  @scala.inline
  implicit class VideoAdvertisingOptionGetEnabledAdsResponseOps[Self <: VideoAdvertisingOptionGetEnabledAdsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdBreaks(value: js.Array[AdBreak]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withAdsOnEmbeds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsOnEmbeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsOnEmbeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsOnEmbeds")(js.undefined)
        ret
    }
    @scala.inline
    def withCountriesRestriction(value: js.Array[CountriesRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countriesRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountriesRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countriesRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

