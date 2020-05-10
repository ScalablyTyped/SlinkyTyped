package typingsSlinky.gapiClientAdexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdsAppearOn extends js.Object {
  /** The name used to describe this channel externally. */
  var adsAppearOn: js.UndefOr[String] = js.native
  /** The external description of the channel. */
  var description: js.UndefOr[String] = js.native
  /**
    * The locations in which ads appear. (Only valid for content and mobile content ads). Acceptable values for content ads are: TOP_LEFT, TOP_CENTER,
    * TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, MULTIPLE_LOCATIONS. Acceptable values for mobile content
    * ads are: TOP, MIDDLE, BOTTOM, MULTIPLE_LOCATIONS.
    */
  var location: js.UndefOr[String] = js.native
  /** The language of the sites ads will be displayed on. */
  var siteLanguage: js.UndefOr[String] = js.native
}

object AnonAdsAppearOn {
  @scala.inline
  def apply(): AnonAdsAppearOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdsAppearOn]
  }
  @scala.inline
  implicit class AnonAdsAppearOnOps[Self <: AnonAdsAppearOn] (val x: Self) extends AnyVal {
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

