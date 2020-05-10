package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/types/media.configure-to-igtv.options.MediaConfigureToIgtvOptions> */
@js.native
trait PartialMediaConfigureToIg extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.native
  var caption: js.UndefOr[String] = js.native
  var clips: js.UndefOr[js.Array[AnonLengthSourcetype]] = js.native
  var date_time_original: js.UndefOr[String] = js.native
  var device: js.UndefOr[AnonAndroidversion] = js.native
  var extra: js.UndefOr[AnonSourceheight] = js.native
  var feed_preview_crop: js.UndefOr[AnonCropbottom | String] = js.native
  var filter_type: js.UndefOr[String] = js.native
  var igtv_share_preview_to_feed: js.UndefOr[`1` | `0`] = js.native
  var length: js.UndefOr[Double] = js.native
  var media_folder: js.UndefOr[String] = js.native
  var poster_frame_index: js.UndefOr[Double] = js.native
  var retryContext: js.UndefOr[AnonNumreupload] = js.native
  var source_type: js.UndefOr[`3` | `4`] = js.native
  var timezone_offset: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var upload_id: js.UndefOr[String] = js.native
}

object PartialMediaConfigureToIg {
  @scala.inline
  def apply(): PartialMediaConfigureToIg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaConfigureToIg]
  }
  @scala.inline
  implicit class PartialMediaConfigureToIgOps[Self <: PartialMediaConfigureToIg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio_muted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio_muted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_muted")(js.undefined)
        ret
    }
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
    def withClips(value: js.Array[AnonLengthSourcetype]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clips")(js.undefined)
        ret
    }
    @scala.inline
    def withDate_time_original(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_time_original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate_time_original: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_time_original")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: AnonAndroidversion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: AnonSourceheight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withFeed_preview_crop(value: AnonCropbottom | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_preview_crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeed_preview_crop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_preview_crop")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_type")(js.undefined)
        ret
    }
    @scala.inline
    def withIgtv_share_preview_to_feed(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("igtv_share_preview_to_feed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgtv_share_preview_to_feed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("igtv_share_preview_to_feed")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_folder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_folder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_folder")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster_frame_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster_frame_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster_frame_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster_frame_index")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryContext(value: AnonNumreupload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_type(value: `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone_offset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone_offset")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(js.undefined)
        ret
    }
  }
  
}

