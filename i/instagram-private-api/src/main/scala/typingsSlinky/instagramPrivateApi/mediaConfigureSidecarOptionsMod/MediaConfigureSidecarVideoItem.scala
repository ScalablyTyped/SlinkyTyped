package typingsSlinky.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConfigureSidecarVideoItem extends MediaConfigureSidecarItem {
  var audio_muted: js.UndefOr[String] = js.native
  var clips: js.UndefOr[js.Array[Length] | String] = js.native
  var date_time_original: js.UndefOr[String] = js.native
  var filter_type: js.UndefOr[String] = js.native
  var length: String = js.native
  var poster_frame_index: js.UndefOr[String] = js.native
  var video_result: js.UndefOr[String] = js.native
}

object MediaConfigureSidecarVideoItem {
  @scala.inline
  def apply(height: Double, length: String, upload_id: String, width: Double): MediaConfigureSidecarVideoItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarVideoItem]
  }
  @scala.inline
  implicit class MediaConfigureSidecarVideoItemOps[Self <: MediaConfigureSidecarVideoItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio_muted(value: String): Self = {
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
    def withClips(value: js.Array[Length] | String): Self = {
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
    def withPoster_frame_index(value: String): Self = {
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
    def withVideo_result(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_result: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_result")(js.undefined)
        ret
    }
  }
  
}

