package typingsSlinky.instagramPrivateApi.liveCreateBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveCreateBroadcastResponseRootObject extends js.Object {
  var allow_resolution_change: Double = js.native
  var avc_rtmp_payload: Double = js.native
  var broadcast_id: String = js.native
  var broadcaster_update_frequency: Double = js.native
  var connect_with_1rtt: Double = js.native
  var disable_speed_test: Double = js.native
  var fbvp_quic_upload_url: String = js.native
  var fbvp_tcp_upload_url: String = js.native
  var heartbeat_interval: Double = js.native
  var live_trace_enabled: Double = js.native
  var live_trace_sample_interval_in_seconds: Double = js.native
  var live_trace_sampling_source: Double = js.native
  var max_time_in_seconds: Double = js.native
  var pass_thru_enabled: Double = js.native
  var speed_test_minimum_bandwidth_threshold: Double = js.native
  var speed_test_retry_max_count: Double = js.native
  var speed_test_retry_time_delay: Double = js.native
  var speed_test_ui_timeout: Double = js.native
  var status: String = js.native
  var stream_audio_bit_rate: Double = js.native
  var stream_audio_channels: Double = js.native
  var stream_audio_sample_rate: Double = js.native
  var stream_network_connection_retry_count: Double = js.native
  var stream_network_connection_retry_delay_in_seconds: Double = js.native
  var stream_network_speed_test_payload_chunk_size_in_bytes: Double = js.native
  var stream_network_speed_test_payload_size_in_bytes: Double = js.native
  var stream_network_speed_test_payload_timeout_in_seconds: Double = js.native
  var stream_video_adaptive_bitrate_config: String = js.native
  var stream_video_allow_b_frames: Double = js.native
  var stream_video_bit_rate: Double = js.native
  var stream_video_fps: Double = js.native
  var stream_video_width: Double = js.native
  var upload_url: String = js.native
}

object LiveCreateBroadcastResponseRootObject {
  @scala.inline
  def apply(
    allow_resolution_change: Double,
    avc_rtmp_payload: Double,
    broadcast_id: String,
    broadcaster_update_frequency: Double,
    connect_with_1rtt: Double,
    disable_speed_test: Double,
    fbvp_quic_upload_url: String,
    fbvp_tcp_upload_url: String,
    heartbeat_interval: Double,
    live_trace_enabled: Double,
    live_trace_sample_interval_in_seconds: Double,
    live_trace_sampling_source: Double,
    max_time_in_seconds: Double,
    pass_thru_enabled: Double,
    speed_test_minimum_bandwidth_threshold: Double,
    speed_test_retry_max_count: Double,
    speed_test_retry_time_delay: Double,
    speed_test_ui_timeout: Double,
    status: String,
    stream_audio_bit_rate: Double,
    stream_audio_channels: Double,
    stream_audio_sample_rate: Double,
    stream_network_connection_retry_count: Double,
    stream_network_connection_retry_delay_in_seconds: Double,
    stream_network_speed_test_payload_chunk_size_in_bytes: Double,
    stream_network_speed_test_payload_size_in_bytes: Double,
    stream_network_speed_test_payload_timeout_in_seconds: Double,
    stream_video_adaptive_bitrate_config: String,
    stream_video_allow_b_frames: Double,
    stream_video_bit_rate: Double,
    stream_video_fps: Double,
    stream_video_width: Double,
    upload_url: String
  ): LiveCreateBroadcastResponseRootObject = {
    val __obj = js.Dynamic.literal(allow_resolution_change = allow_resolution_change.asInstanceOf[js.Any], avc_rtmp_payload = avc_rtmp_payload.asInstanceOf[js.Any], broadcast_id = broadcast_id.asInstanceOf[js.Any], broadcaster_update_frequency = broadcaster_update_frequency.asInstanceOf[js.Any], connect_with_1rtt = connect_with_1rtt.asInstanceOf[js.Any], disable_speed_test = disable_speed_test.asInstanceOf[js.Any], fbvp_quic_upload_url = fbvp_quic_upload_url.asInstanceOf[js.Any], fbvp_tcp_upload_url = fbvp_tcp_upload_url.asInstanceOf[js.Any], heartbeat_interval = heartbeat_interval.asInstanceOf[js.Any], live_trace_enabled = live_trace_enabled.asInstanceOf[js.Any], live_trace_sample_interval_in_seconds = live_trace_sample_interval_in_seconds.asInstanceOf[js.Any], live_trace_sampling_source = live_trace_sampling_source.asInstanceOf[js.Any], max_time_in_seconds = max_time_in_seconds.asInstanceOf[js.Any], pass_thru_enabled = pass_thru_enabled.asInstanceOf[js.Any], speed_test_minimum_bandwidth_threshold = speed_test_minimum_bandwidth_threshold.asInstanceOf[js.Any], speed_test_retry_max_count = speed_test_retry_max_count.asInstanceOf[js.Any], speed_test_retry_time_delay = speed_test_retry_time_delay.asInstanceOf[js.Any], speed_test_ui_timeout = speed_test_ui_timeout.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stream_audio_bit_rate = stream_audio_bit_rate.asInstanceOf[js.Any], stream_audio_channels = stream_audio_channels.asInstanceOf[js.Any], stream_audio_sample_rate = stream_audio_sample_rate.asInstanceOf[js.Any], stream_network_connection_retry_count = stream_network_connection_retry_count.asInstanceOf[js.Any], stream_network_connection_retry_delay_in_seconds = stream_network_connection_retry_delay_in_seconds.asInstanceOf[js.Any], stream_network_speed_test_payload_chunk_size_in_bytes = stream_network_speed_test_payload_chunk_size_in_bytes.asInstanceOf[js.Any], stream_network_speed_test_payload_size_in_bytes = stream_network_speed_test_payload_size_in_bytes.asInstanceOf[js.Any], stream_network_speed_test_payload_timeout_in_seconds = stream_network_speed_test_payload_timeout_in_seconds.asInstanceOf[js.Any], stream_video_adaptive_bitrate_config = stream_video_adaptive_bitrate_config.asInstanceOf[js.Any], stream_video_allow_b_frames = stream_video_allow_b_frames.asInstanceOf[js.Any], stream_video_bit_rate = stream_video_bit_rate.asInstanceOf[js.Any], stream_video_fps = stream_video_fps.asInstanceOf[js.Any], stream_video_width = stream_video_width.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveCreateBroadcastResponseRootObject]
  }
  @scala.inline
  implicit class LiveCreateBroadcastResponseRootObjectOps[Self <: LiveCreateBroadcastResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_resolution_change(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_resolution_change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvc_rtmp_payload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avc_rtmp_payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcast_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcaster_update_frequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcaster_update_frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect_with_1rtt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect_with_1rtt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable_speed_test(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_speed_test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFbvp_quic_upload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fbvp_quic_upload_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFbvp_tcp_upload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fbvp_tcp_upload_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeartbeat_interval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLive_trace_enabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_trace_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLive_trace_sample_interval_in_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_trace_sample_interval_in_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLive_trace_sampling_source(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live_trace_sampling_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_time_in_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_time_in_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass_thru_enabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass_thru_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed_test_minimum_bandwidth_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed_test_minimum_bandwidth_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed_test_retry_max_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed_test_retry_max_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed_test_retry_time_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed_test_retry_time_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed_test_ui_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed_test_ui_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_audio_bit_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_audio_bit_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_audio_channels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_audio_channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_audio_sample_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_audio_sample_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_network_connection_retry_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_network_connection_retry_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_network_connection_retry_delay_in_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_network_connection_retry_delay_in_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_network_speed_test_payload_chunk_size_in_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_network_speed_test_payload_chunk_size_in_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_network_speed_test_payload_size_in_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_network_speed_test_payload_size_in_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_network_speed_test_payload_timeout_in_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_network_speed_test_payload_timeout_in_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_video_adaptive_bitrate_config(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_video_adaptive_bitrate_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_video_allow_b_frames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_video_allow_b_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_video_bit_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_video_bit_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_video_fps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_video_fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_video_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_video_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

