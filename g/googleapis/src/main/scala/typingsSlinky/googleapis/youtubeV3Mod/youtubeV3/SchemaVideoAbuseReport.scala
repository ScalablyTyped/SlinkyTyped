package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVideoAbuseReport extends js.Object {
  /**
    * Additional comments regarding the abuse report.
    */
  var comments: js.UndefOr[String] = js.native
  /**
    * The language that the content was viewed in.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The high-level, or primary, reason that the content is abusive. The value
    * is an abuse report reason ID.
    */
  var reasonId: js.UndefOr[String] = js.native
  /**
    * The specific, or secondary, reason that this content is abusive (if
    * available). The value is an abuse report reason ID that is a valid
    * secondary reason for the primary reason.
    */
  var secondaryReasonId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: js.UndefOr[String] = js.native
}

object SchemaVideoAbuseReport {
  @scala.inline
  def apply(): SchemaVideoAbuseReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAbuseReport]
  }
  @scala.inline
  implicit class SchemaVideoAbuseReportOps[Self <: SchemaVideoAbuseReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryReasonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryReasonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryReasonId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryReasonId")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

