package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraDidChangeTrackingStateEvent extends js.Object {
  var trackingState: TrackingState
  var trackingStateReason: TrackingStateReason
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrackingState(value: TrackingState): Self = this.set("trackingState", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackingStateReason(value: TrackingStateReason): Self = this.set("trackingStateReason", value.asInstanceOf[js.Any])
  }
  
}

