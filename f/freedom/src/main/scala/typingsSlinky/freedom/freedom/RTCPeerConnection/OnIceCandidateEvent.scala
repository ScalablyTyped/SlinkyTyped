package typingsSlinky.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnIceCandidateEvent extends js.Object {
  var candidate: RTCIceCandidate = js.native
}

object OnIceCandidateEvent {
  @scala.inline
  def apply(candidate: RTCIceCandidate): OnIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnIceCandidateEvent]
  }
  @scala.inline
  implicit class OnIceCandidateEventOps[Self <: OnIceCandidateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidate(value: RTCIceCandidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

