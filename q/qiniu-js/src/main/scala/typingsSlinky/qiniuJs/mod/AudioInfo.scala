package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioInfo extends js.Object {
  var bit_rate: String = js.native
  var channels: Double = js.native
  var codec_name: String = js.native
  var codec_type: String = js.native
  var duration: String = js.native
  var index: Double = js.native
  var nb_frames: String = js.native
  var r_frame_rate: String = js.native
  var sample_fmt: String = js.native
  var sample_rate: String = js.native
  var start_time: String = js.native
  var tags: AnonDictkey = js.native
}

object AudioInfo {
  @scala.inline
  def apply(
    bit_rate: String,
    channels: Double,
    codec_name: String,
    codec_type: String,
    duration: String,
    index: Double,
    nb_frames: String,
    r_frame_rate: String,
    sample_fmt: String,
    sample_rate: String,
    start_time: String,
    tags: AnonDictkey
  ): AudioInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_fmt = sample_fmt.asInstanceOf[js.Any], sample_rate = sample_rate.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioInfo]
  }
  @scala.inline
  implicit class AudioInfoOps[Self <: AudioInfo] (val x: Self) extends AnyVal {
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
    def withChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
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
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
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
    def withR_frame_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r_frame_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSample_fmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_fmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSample_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_rate")(value.asInstanceOf[js.Any])
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
  }
  
}

