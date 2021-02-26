package typingsSlinky.ffprobe

import typingsSlinky.ffprobe.anon.Attachedpic
import typingsSlinky.ffprobe.anon.Creationtime
import typingsSlinky.ffprobe.ffprobeStrings.audio
import typingsSlinky.ffprobe.ffprobeStrings.images
import typingsSlinky.ffprobe.ffprobeStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ffprobe", JSImport.Namespace)
  @js.native
  def apply(filePath: String, options: Options): js.Promise[FFProbeResult] = js.native
  @JSImport("ffprobe", JSImport.Namespace)
  @js.native
  def apply(
    filePath: String,
    options: Options,
    cb: js.Function2[/* err */ js.Error, /* info */ FFProbeResult, Unit]
  ): Unit = js.native
  
  @js.native
  trait FFProbeResult extends StObject {
    
    var streams: js.Array[FFProbeStream] = js.native
  }
  object FFProbeResult {
    
    @scala.inline
    def apply(streams: js.Array[FFProbeStream]): FFProbeResult = {
      val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
      __obj.asInstanceOf[FFProbeResult]
    }
    
    @scala.inline
    implicit class FFProbeResultMutableBuilder[Self <: FFProbeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStreams(value: js.Array[FFProbeStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsVarargs(value: FFProbeStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FFProbeStream extends StObject {
    
    var avg_frame_rate: js.UndefOr[String] = js.native
    
    var bit_rate: Double = js.native
    
    var bits_per_raw_sample: js.UndefOr[Double] = js.native
    
    var bits_per_sample: js.UndefOr[Double] = js.native
    
    var channel_layout: js.UndefOr[String] = js.native
    
    var channels: js.UndefOr[Double] = js.native
    
    var chroma_location: js.UndefOr[String] = js.native
    
    var codec_long_name: String = js.native
    
    var codec_name: String = js.native
    
    var codec_tag: String = js.native
    
    var codec_tag_string: String = js.native
    
    var codec_time_base: String = js.native
    
    var codec_type: video | audio | images = js.native
    
    var coded_height: js.UndefOr[Double] = js.native
    
    var coded_width: js.UndefOr[Double] = js.native
    
    var display_aspect_ratio: js.UndefOr[String] = js.native
    
    var disposition: Attachedpic = js.native
    
    var duration: Double = js.native
    
    var duration_ts: String = js.native
    
    var has_b_frames: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var index: Double = js.native
    
    var is_avc: js.UndefOr[Double] = js.native
    
    var level: js.UndefOr[Double] = js.native
    
    var nal_length_size: js.UndefOr[Double] = js.native
    
    var nb_frames: Double = js.native
    
    var pix_fmt: js.UndefOr[String] = js.native
    
    var profile: String = js.native
    
    var r_frame_rate: String = js.native
    
    var refs: js.UndefOr[Double] = js.native
    
    var sample_aspect_ratio: js.UndefOr[String] = js.native
    
    var sample_fmt: js.UndefOr[String] = js.native
    
    var sample_rate: js.UndefOr[Double] = js.native
    
    var start_pts: Double = js.native
    
    var start_time: Double = js.native
    
    var tags: Creationtime = js.native
    
    var time_base: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object FFProbeStream {
    
    @scala.inline
    def apply(
      bit_rate: Double,
      codec_long_name: String,
      codec_name: String,
      codec_tag: String,
      codec_tag_string: String,
      codec_time_base: String,
      codec_type: video | audio | images,
      disposition: Attachedpic,
      duration: Double,
      duration_ts: String,
      index: Double,
      nb_frames: Double,
      profile: String,
      r_frame_rate: String,
      start_pts: Double,
      start_time: Double,
      tags: Creationtime
    ): FFProbeStream = {
      val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], codec_long_name = codec_long_name.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_tag = codec_tag.asInstanceOf[js.Any], codec_tag_string = codec_tag_string.asInstanceOf[js.Any], codec_time_base = codec_time_base.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_ts = duration_ts.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], start_pts = start_pts.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[FFProbeStream]
    }
    
    @scala.inline
    implicit class FFProbeStreamMutableBuilder[Self <: FFProbeStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvg_frame_rate(value: String): Self = StObject.set(x, "avg_frame_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvg_frame_rateUndefined: Self = StObject.set(x, "avg_frame_rate", js.undefined)
      
      @scala.inline
      def setBit_rate(value: Double): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBits_per_raw_sample(value: Double): Self = StObject.set(x, "bits_per_raw_sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBits_per_raw_sampleUndefined: Self = StObject.set(x, "bits_per_raw_sample", js.undefined)
      
      @scala.inline
      def setBits_per_sample(value: Double): Self = StObject.set(x, "bits_per_sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBits_per_sampleUndefined: Self = StObject.set(x, "bits_per_sample", js.undefined)
      
      @scala.inline
      def setChannel_layout(value: String): Self = StObject.set(x, "channel_layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel_layoutUndefined: Self = StObject.set(x, "channel_layout", js.undefined)
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setChroma_location(value: String): Self = StObject.set(x, "chroma_location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChroma_locationUndefined: Self = StObject.set(x, "chroma_location", js.undefined)
      
      @scala.inline
      def setCodec_long_name(value: String): Self = StObject.set(x, "codec_long_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_name(value: String): Self = StObject.set(x, "codec_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_tag(value: String): Self = StObject.set(x, "codec_tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_tag_string(value: String): Self = StObject.set(x, "codec_tag_string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_time_base(value: String): Self = StObject.set(x, "codec_time_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_type(value: video | audio | images): Self = StObject.set(x, "codec_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoded_height(value: Double): Self = StObject.set(x, "coded_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoded_heightUndefined: Self = StObject.set(x, "coded_height", js.undefined)
      
      @scala.inline
      def setCoded_width(value: Double): Self = StObject.set(x, "coded_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoded_widthUndefined: Self = StObject.set(x, "coded_width", js.undefined)
      
      @scala.inline
      def setDisplay_aspect_ratio(value: String): Self = StObject.set(x, "display_aspect_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_aspect_ratioUndefined: Self = StObject.set(x, "display_aspect_ratio", js.undefined)
      
      @scala.inline
      def setDisposition(value: Attachedpic): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration_ts(value: String): Self = StObject.set(x, "duration_ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_b_frames(value: Double): Self = StObject.set(x, "has_b_frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_b_framesUndefined: Self = StObject.set(x, "has_b_frames", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_avc(value: Double): Self = StObject.set(x, "is_avc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_avcUndefined: Self = StObject.set(x, "is_avc", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setNal_length_size(value: Double): Self = StObject.set(x, "nal_length_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNal_length_sizeUndefined: Self = StObject.set(x, "nal_length_size", js.undefined)
      
      @scala.inline
      def setNb_frames(value: Double): Self = StObject.set(x, "nb_frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPix_fmt(value: String): Self = StObject.set(x, "pix_fmt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPix_fmtUndefined: Self = StObject.set(x, "pix_fmt", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR_frame_rate(value: String): Self = StObject.set(x, "r_frame_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefs(value: Double): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      @scala.inline
      def setSample_aspect_ratio(value: String): Self = StObject.set(x, "sample_aspect_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample_aspect_ratioUndefined: Self = StObject.set(x, "sample_aspect_ratio", js.undefined)
      
      @scala.inline
      def setSample_fmt(value: String): Self = StObject.set(x, "sample_fmt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample_fmtUndefined: Self = StObject.set(x, "sample_fmt", js.undefined)
      
      @scala.inline
      def setSample_rate(value: Double): Self = StObject.set(x, "sample_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample_rateUndefined: Self = StObject.set(x, "sample_rate", js.undefined)
      
      @scala.inline
      def setStart_pts(value: Double): Self = StObject.set(x, "start_pts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Creationtime): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_base(value: String): Self = StObject.set(x, "time_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_baseUndefined: Self = StObject.set(x, "time_base", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var path: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(path: String): Options = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
