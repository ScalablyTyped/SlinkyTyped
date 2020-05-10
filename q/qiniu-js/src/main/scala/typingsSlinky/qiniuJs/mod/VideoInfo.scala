package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoInfo extends js.Object {
  var bit_rate: String = js.native
  var codec_name: String = js.native
  var codec_type: String = js.native
  var display_aspect_ratio: String = js.native
  var duration: String = js.native
  var height: Double = js.native
  var index: Double = js.native
  var nb_frames: String = js.native
  var pix_fmt: String = js.native
  var r_frame_rate: String = js.native
  var sample_aspect_ratio: String = js.native
  var start_time: String = js.native
  var tags: AnonDictkey = js.native
  var width: Double = js.native
}

object VideoInfo {
  @scala.inline
  def apply(
    bit_rate: String,
    codec_name: String,
    codec_type: String,
    display_aspect_ratio: String,
    duration: String,
    height: Double,
    index: Double,
    nb_frames: String,
    pix_fmt: String,
    r_frame_rate: String,
    sample_aspect_ratio: String,
    start_time: String,
    tags: AnonDictkey,
    width: Double
  ): VideoInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], display_aspect_ratio = display_aspect_ratio.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], pix_fmt = pix_fmt.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_aspect_ratio = sample_aspect_ratio.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoInfo]
  }
  @scala.inline
  implicit class VideoInfoOps[Self <: VideoInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBit_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodec_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodec_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_aspect_ratio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_aspect_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNb_frames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPix_fmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pix_fmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR_frame_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r_frame_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSample_aspect_ratio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_aspect_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

