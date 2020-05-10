package typingsSlinky.instagramPrivateApi.mediaConfigureVideoOptionsMod

import typingsSlinky.instagramPrivateApi.AnonLength
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConfigureVideoOptions extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.native
  var clips: js.UndefOr[js.Array[AnonLength]] = js.native
  var geotag_enabled: js.UndefOr[`1` | `0`] = js.native
  var height: Double = js.native
  var length: Double = js.native
  var media_latitude: js.UndefOr[String] = js.native
  var media_longitude: js.UndefOr[String] = js.native
  var poster_frame_index: js.UndefOr[Double] = js.native
  var posting_latitude: js.UndefOr[String] = js.native
  var posting_longitude: js.UndefOr[String] = js.native
  var upload_id: String = js.native
  var width: Double = js.native
}

object MediaConfigureVideoOptions {
  @scala.inline
  def apply(height: Double, length: Double, upload_id: String, width: Double): MediaConfigureVideoOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureVideoOptions]
  }
  @scala.inline
  implicit class MediaConfigureVideoOptionsOps[Self <: MediaConfigureVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withClips(value: js.Array[AnonLength]): Self = {
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
    def withGeotag_enabled(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geotag_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeotag_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geotag_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_latitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_latitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia_longitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia_longitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_longitude")(js.undefined)
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
    def withPosting_latitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosting_latitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withPosting_longitude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosting_longitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posting_longitude")(js.undefined)
        ret
    }
  }
  
}

