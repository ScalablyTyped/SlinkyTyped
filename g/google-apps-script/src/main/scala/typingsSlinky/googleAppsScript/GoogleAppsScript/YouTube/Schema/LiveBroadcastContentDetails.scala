package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastContentDetails extends js.Object {
  var boundStreamId: js.UndefOr[String] = js.native
  var boundStreamLastUpdateTimeMs: js.UndefOr[String] = js.native
  var closedCaptionsType: js.UndefOr[String] = js.native
  var enableAutoStart: js.UndefOr[Boolean] = js.native
  var enableClosedCaptions: js.UndefOr[Boolean] = js.native
  var enableContentEncryption: js.UndefOr[Boolean] = js.native
  var enableDvr: js.UndefOr[Boolean] = js.native
  var enableEmbed: js.UndefOr[Boolean] = js.native
  var enableLowLatency: js.UndefOr[Boolean] = js.native
  var latencyPreference: js.UndefOr[String] = js.native
  var mesh: js.UndefOr[String] = js.native
  var monitorStream: js.UndefOr[MonitorStreamInfo] = js.native
  var projection: js.UndefOr[String] = js.native
  var recordFromStart: js.UndefOr[Boolean] = js.native
  var startWithSlate: js.UndefOr[Boolean] = js.native
  var stereoLayout: js.UndefOr[String] = js.native
}

object LiveBroadcastContentDetails {
  @scala.inline
  def apply(): LiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastContentDetails]
  }
  @scala.inline
  implicit class LiveBroadcastContentDetailsOps[Self <: LiveBroadcastContentDetails] (val x: Self) extends AnyVal {
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
    def withMonitorStream(value: MonitorStreamInfo): Self = {
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

