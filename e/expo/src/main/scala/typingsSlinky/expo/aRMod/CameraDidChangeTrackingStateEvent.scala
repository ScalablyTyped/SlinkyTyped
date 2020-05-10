package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraDidChangeTrackingStateEvent extends js.Object {
  var trackingState: TrackingState = js.native
  var trackingStateReason: TrackingStateReason = js.native
}

object CameraDidChangeTrackingStateEvent {
  @scala.inline
  def apply(trackingState: TrackingState, trackingStateReason: TrackingStateReason): CameraDidChangeTrackingStateEvent = {
    val __obj = js.Dynamic.literal(trackingState = trackingState.asInstanceOf[js.Any], trackingStateReason = trackingStateReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraDidChangeTrackingStateEvent]
  }
  @scala.inline
  implicit class CameraDidChangeTrackingStateEventOps[Self <: CameraDidChangeTrackingStateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackingState(value: TrackingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingStateReason(value: TrackingStateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingStateReason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

