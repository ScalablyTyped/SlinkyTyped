package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content of a YouTube Video.
  */
@js.native
trait SchemaVideoContentDetails extends js.Object {
  /**
    * The value of captions indicates whether the video has captions or not.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * Specifies the ratings that the video received under various rating
    * schemes.
    */
  var contentRating: js.UndefOr[SchemaContentRating] = js.native
  /**
    * The countryRestriction object contains information about the countries
    * where a video is (or is not) viewable.
    */
  var countryRestriction: js.UndefOr[SchemaAccessPolicy] = js.native
  /**
    * The value of definition indicates whether the video is available in high
    * definition or only in standard definition.
    */
  var definition: js.UndefOr[String] = js.native
  /**
    * The value of dimension indicates whether the video is available in 3D or
    * in 2D.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The length of the video. The tag value is an ISO 8601 duration in the
    * format PT#M#S, in which the letters PT indicate that the value specifies
    * a period of time, and the letters M and S refer to length in minutes and
    * seconds, respectively. The # characters preceding the M and S letters are
    * both integers that specify the number of minutes (or seconds) of the
    * video. For example, a value of PT15M51S indicates that the video is 15
    * minutes and 51 seconds long.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Indicates whether the video uploader has provided a custom thumbnail
    * image for the video. This property is only visible to the video uploader.
    */
  var hasCustomThumbnail: js.UndefOr[Boolean] = js.native
  /**
    * The value of is_license_content indicates whether the video is licensed
    * content.
    */
  var licensedContent: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the projection format of the video.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * The regionRestriction object contains information about the countries
    * where a video is (or is not) viewable. The object will contain either the
    * contentDetails.regionRestriction.allowed property or the
    * contentDetails.regionRestriction.blocked property.
    */
  var regionRestriction: js.UndefOr[SchemaVideoContentDetailsRegionRestriction] = js.native
}

object SchemaVideoContentDetails {
  @scala.inline
  def apply(): SchemaVideoContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoContentDetails]
  }
  @scala.inline
  implicit class SchemaVideoContentDetailsOps[Self <: SchemaVideoContentDetails] (val x: Self) extends AnyVal {
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
    def withContentRating(value: SchemaContentRating): Self = {
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
    def withCountryRestriction(value: SchemaAccessPolicy): Self = {
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
    def withRegionRestriction(value: SchemaVideoContentDetailsRegionRestriction): Self = {
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

