package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromotedItemId extends js.Object {
  /**
    * If type is recentUpload, this field identifies the channel from which to take the recent upload. If missing, the channel is assumed to be the same
    * channel for which the invideoPromotion is set.
    */
  var recentlyUploadedBy: js.UndefOr[String] = js.native
  /** Describes the type of the promoted item. */
  var `type`: js.UndefOr[String] = js.native
  /**
    * If the promoted item represents a video, this field represents the unique YouTube ID identifying it. This field will be present only if type has the
    * value video.
    */
  var videoId: js.UndefOr[String] = js.native
  /**
    * If the promoted item represents a website, this field represents the url pointing to the website. This field will be present only if type has the value
    * website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object PromotedItemId {
  @scala.inline
  def apply(): PromotedItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromotedItemId]
  }
  @scala.inline
  implicit class PromotedItemIdOps[Self <: PromotedItemId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecentlyUploadedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentlyUploadedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentlyUploadedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentlyUploadedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
  }
  
}

