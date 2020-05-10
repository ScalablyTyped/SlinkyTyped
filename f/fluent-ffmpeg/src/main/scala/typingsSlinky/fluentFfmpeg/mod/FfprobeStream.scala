package typingsSlinky.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FfprobeStream
  extends /* key */ StringDictionary[js.Any] {
  var avg_frame_rate: js.UndefOr[String] = js.native
  var bit_rate: js.UndefOr[String] = js.native
  var bits_per_raw_sample: js.UndefOr[String] = js.native
  var bits_per_sample: js.UndefOr[Double] = js.native
  var channel_layout: js.UndefOr[String] = js.native
  var channels: js.UndefOr[Double] = js.native
  var chroma_location: js.UndefOr[String] = js.native
  var codec_long_name: js.UndefOr[String] = js.native
  var codec_name: js.UndefOr[String] = js.native
  var codec_tag: js.UndefOr[String] = js.native
  var codec_tag_string: js.UndefOr[String] = js.native
  var codec_time_base: js.UndefOr[String] = js.native
  var codec_type: js.UndefOr[String] = js.native
  var coded_height: js.UndefOr[Double] = js.native
  var coded_width: js.UndefOr[Double] = js.native
  var color_primaries: js.UndefOr[String] = js.native
  var color_range: js.UndefOr[String] = js.native
  var color_space: js.UndefOr[String] = js.native
  var color_transfer: js.UndefOr[String] = js.native
  var display_aspect_ratio: js.UndefOr[String] = js.native
  var disposition: js.UndefOr[FfprobeStreamDisposition] = js.native
  var duration: js.UndefOr[String] = js.native
  var duration_ts: js.UndefOr[String] = js.native
  var field_order: js.UndefOr[String] = js.native
  var has_b_frames: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var index: Double = js.native
  var level: js.UndefOr[String] = js.native
  var max_bit_rate: js.UndefOr[String] = js.native
  var nb_frames: js.UndefOr[String] = js.native
  var nb_read_frames: js.UndefOr[String] = js.native
  var nb_read_packets: js.UndefOr[String] = js.native
  var pix_fmt: js.UndefOr[String] = js.native
  var profile: js.UndefOr[Double] = js.native
  var r_frame_rate: js.UndefOr[String] = js.native
  var refs: js.UndefOr[Double] = js.native
  var sample_aspect_ratio: js.UndefOr[String] = js.native
  var sample_fmt: js.UndefOr[String] = js.native
  var sample_rate: js.UndefOr[Double] = js.native
  var start_pts: js.UndefOr[Double] = js.native
  var start_time: js.UndefOr[Double] = js.native
  var time_base: js.UndefOr[String] = js.native
  var timecode: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object FfprobeStream {
  @scala.inline
  def apply(index: Double): FfprobeStream = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeStream]
  }
  @scala.inline
  implicit class FfprobeStreamOps[Self <: FfprobeStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvg_frame_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg_frame_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvg_frame_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg_frame_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withBit_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBit_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bit_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withBits_per_raw_sample(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits_per_raw_sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBits_per_raw_sample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits_per_raw_sample")(js.undefined)
        ret
    }
    @scala.inline
    def withBits_per_sample(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits_per_sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBits_per_sample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits_per_sample")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_layout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_layout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_layout")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withChroma_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chroma_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChroma_location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chroma_location")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec_long_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_long_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec_long_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_long_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec_tag_string(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_tag_string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec_tag_string: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_tag_string")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec_time_base(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_time_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec_time_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_time_base")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCoded_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coded_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoded_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coded_height")(js.undefined)
        ret
    }
    @scala.inline
    def withCoded_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coded_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoded_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coded_width")(js.undefined)
        ret
    }
    @scala.inline
    def withColor_primaries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_primaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor_primaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_primaries")(js.undefined)
        ret
    }
    @scala.inline
    def withColor_range(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor_range: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_range")(js.undefined)
        ret
    }
    @scala.inline
    def withColor_space(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor_space: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_space")(js.undefined)
        ret
    }
    @scala.inline
    def withColor_transfer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor_transfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_transfer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_aspect_ratio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_aspect_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_aspect_ratio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_aspect_ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposition(value: FfprobeStreamDisposition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(js.undefined)
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
    def withDuration_ts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration_ts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_ts")(js.undefined)
        ret
    }
    @scala.inline
    def withField_order(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField_order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_order")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_b_frames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_b_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_b_frames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_b_frames")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_bit_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_bit_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_bit_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_bit_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withNb_frames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNb_frames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_frames")(js.undefined)
        ret
    }
    @scala.inline
    def withNb_read_frames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_read_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNb_read_frames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_read_frames")(js.undefined)
        ret
    }
    @scala.inline
    def withNb_read_packets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_read_packets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNb_read_packets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nb_read_packets")(js.undefined)
        ret
    }
    @scala.inline
    def withPix_fmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pix_fmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPix_fmt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pix_fmt")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withR_frame_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r_frame_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR_frame_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r_frame_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withRefs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(js.undefined)
        ret
    }
    @scala.inline
    def withSample_aspect_ratio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_aspect_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSample_aspect_ratio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_aspect_ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withSample_fmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_fmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSample_fmt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_fmt")(js.undefined)
        ret
    }
    @scala.inline
    def withSample_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSample_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_pts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_pts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_pts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_pts")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(js.undefined)
        ret
    }
    @scala.inline
    def withTime_base(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_base: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_base")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timecode")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

