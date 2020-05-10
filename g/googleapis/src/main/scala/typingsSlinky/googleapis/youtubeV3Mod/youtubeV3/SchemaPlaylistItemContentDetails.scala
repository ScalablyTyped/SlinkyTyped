package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlaylistItemContentDetails extends js.Object {
  /**
    * The time, measured in seconds from the start of the video, when the video
    * should stop playing. (The playlist owner can specify the times when the
    * video should start and stop playing when the video is played in the
    * context of the playlist.) By default, assume that the video.endTime is
    * the end of the video.
    */
  var endAt: js.UndefOr[String] = js.native
  /**
    * A user-generated note for this item.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The time, measured in seconds from the start of the video, when the video
    * should start playing. (The playlist owner can specify the times when the
    * video should start and stop playing when the video is played in the
    * context of the playlist.) The default value is 0.
    */
  var startAt: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify a video. To retrieve the
    * video resource, set the id query parameter to this value in your API
    * request.
    */
  var videoId: js.UndefOr[String] = js.native
  /**
    * The date and time that the video was published to YouTube. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var videoPublishedAt: js.UndefOr[String] = js.native
}

object SchemaPlaylistItemContentDetails {
  @scala.inline
  def apply(): SchemaPlaylistItemContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItemContentDetails]
  }
  @scala.inline
  implicit class SchemaPlaylistItemContentDetailsOps[Self <: SchemaPlaylistItemContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAt")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(js.undefined)
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
    def withVideoPublishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoPublishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoPublishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoPublishedAt")(js.undefined)
        ret
    }
  }
  
}

