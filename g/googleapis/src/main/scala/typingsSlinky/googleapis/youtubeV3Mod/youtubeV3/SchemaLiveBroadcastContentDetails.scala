package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed settings of a broadcast.
  */
@js.native
trait SchemaLiveBroadcastContentDetails extends js.Object {
  /**
    * This value uniquely identifies the live stream bound to the broadcast.
    */
  var boundStreamId: js.UndefOr[String] = js.native
  /**
    * The date and time that the live stream referenced by boundStreamId was
    * last updated.
    */
  var boundStreamLastUpdateTimeMs: js.UndefOr[String] = js.native
  var closedCaptionsType: js.UndefOr[String] = js.native
  /**
    * This setting indicates whether auto start is enabled for this broadcast.
    */
  var enableAutoStart: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether HTTP POST closed captioning is enabled for
    * this broadcast. The ingestion URL of the closed captions is returned
    * through the liveStreams API. This is mutually exclusive with using the
    * closed_captions_type property, and is equivalent to setting
    * closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
    */
  var enableClosedCaptions: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether YouTube should enable content encryption
    * for the broadcast.
    */
  var enableContentEncryption: js.UndefOr[Boolean] = js.native
  /**
    * This setting determines whether viewers can access DVR controls while
    * watching the video. DVR controls enable the viewer to control the video
    * playback experience by pausing, rewinding, or fast forwarding content.
    * The default value for this property is true.    Important: You must set
    * the value to true and also set the enableArchive property&#39;s value to
    * true if you want to make playback available immediately after the
    * broadcast ends.
    */
  var enableDvr: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether the broadcast video can be played in an
    * embedded player. If you choose to archive the video (using the
    * enableArchive property), this setting will also apply to the archived
    * video.
    */
  var enableEmbed: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether this broadcast has low latency enabled.
    */
  var enableLowLatency: js.UndefOr[Boolean] = js.native
  /**
    * If both this and enable_low_latency are set, they must match.
    * LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should
    * match enable_low_latency=true LATENCY_ULTRA_LOW should have
    * enable_low_latency omitted.
    */
  var latencyPreference: js.UndefOr[String] = js.native
  var mesh: js.UndefOr[String] = js.native
  /**
    * The monitorStream object contains information about the monitor stream,
    * which the broadcaster can use to review the event content before the
    * broadcast stream is shown publicly.
    */
  var monitorStream: js.UndefOr[SchemaMonitorStreamInfo] = js.native
  /**
    * The projection format of this broadcast. This defaults to rectangular.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Automatically start recording after the event goes live. The default
    * value for this property is true.    Important: You must also set the
    * enableDvr property&#39;s value to true if you want the playback to be
    * available immediately after the broadcast ends. If you set this
    * property&#39;s value to true but do not also set the enableDvr property
    * to true, there may be a delay of around one day before the archived video
    * will be available for playback.
    */
  var recordFromStart: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether the broadcast should automatically begin
    * with an in-stream slate when you update the broadcast&#39;s status to
    * live. After updating the status, you then need to send a
    * liveCuepoints.insert request that sets the cuepoint&#39;s eventState to
    * end to remove the in-stream slate and make your broadcast stream visible
    * to viewers.
    */
  var startWithSlate: js.UndefOr[Boolean] = js.native
  var stereoLayout: js.UndefOr[String] = js.native
}

object SchemaLiveBroadcastContentDetails {
  @scala.inline
  def apply(): SchemaLiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastContentDetails]
  }
  @scala.inline
  implicit class SchemaLiveBroadcastContentDetailsOps[Self <: SchemaLiveBroadcastContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundStreamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundStreamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundStreamId")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundStreamLastUpdateTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundStreamLastUpdateTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundStreamLastUpdateTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundStreamLastUpdateTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withClosedCaptionsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptionsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedCaptionsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedCaptionsType")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClosedCaptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClosedCaptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClosedCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClosedCaptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContentEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContentEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContentEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContentEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDvr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDvr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDvr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDvr")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableEmbed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEmbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEmbed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEmbed")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLowLatency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLowLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLowLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLowLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withLatencyPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatencyPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withMesh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitorStream(value: SchemaMonitorStreamInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorStream")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordFromStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFromStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordFromStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordFromStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStartWithSlate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWithSlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartWithSlate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWithSlate")(js.undefined)
        ret
    }
    @scala.inline
    def withStereoLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stereoLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStereoLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stereoLayout")(js.undefined)
        ret
    }
  }
  
}

