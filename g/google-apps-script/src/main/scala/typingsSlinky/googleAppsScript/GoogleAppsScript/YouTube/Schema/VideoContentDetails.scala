package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoContentDetails extends js.Object {
  var caption: js.UndefOr[String] = js.native
  var contentRating: js.UndefOr[ContentRating] = js.native
  var countryRestriction: js.UndefOr[AccessPolicy] = js.native
  var definition: js.UndefOr[String] = js.native
  var dimension: js.UndefOr[String] = js.native
  var duration: js.UndefOr[String] = js.native
  var hasCustomThumbnail: js.UndefOr[Boolean] = js.native
  var licensedContent: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[String] = js.native
  var regionRestriction: js.UndefOr[VideoContentDetailsRegionRestriction] = js.native
}

object VideoContentDetails {
  @scala.inline
  def apply(): VideoContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContentDetails]
  }
  @scala.inline
  implicit class VideoContentDetailsOps[Self <: VideoContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRating(value: ContentRating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryRestriction(value: AccessPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCustomThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCustomThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCustomThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCustomThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withLicensedContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionRestriction(value: VideoContentDetailsRegionRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionRestriction")(js.undefined)
        ret
    }
  }
  
}

