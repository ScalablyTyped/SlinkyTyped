package typingsSlinky.instagramPrivateApi.liveHeartbeatViewerCountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveHeartbeatViewerCountResponseRootObject extends js.Object {
  var broadcast_status: String = js.native
  var cobroadcaster_ids: js.Array[_] = js.native
  var is_top_live_eligible: Double = js.native
  var offset_to_video_start: Double = js.native
  var status: String = js.native
  var total_unique_viewer_count: Double = js.native
  var viewer_count: Double = js.native
}

object LiveHeartbeatViewerCountResponseRootObject {
  @scala.inline
  def apply(
    broadcast_status: String,
    cobroadcaster_ids: js.Array[_],
    is_top_live_eligible: Double,
    offset_to_video_start: Double,
    status: String,
    total_unique_viewer_count: Double,
    viewer_count: Double
  ): LiveHeartbeatViewerCountResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcast_status = broadcast_status.asInstanceOf[js.Any], cobroadcaster_ids = cobroadcaster_ids.asInstanceOf[js.Any], is_top_live_eligible = is_top_live_eligible.asInstanceOf[js.Any], offset_to_video_start = offset_to_video_start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_unique_viewer_count = total_unique_viewer_count.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveHeartbeatViewerCountResponseRootObject]
  }
  @scala.inline
  implicit class LiveHeartbeatViewerCountResponseRootObjectOps[Self <: LiveHeartbeatViewerCountResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcast_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCobroadcaster_ids(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cobroadcaster_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_top_live_eligible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_top_live_eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset_to_video_start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset_to_video_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_unique_viewer_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_unique_viewer_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

