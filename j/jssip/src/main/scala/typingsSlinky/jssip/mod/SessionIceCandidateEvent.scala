package typingsSlinky.jssip.mod

import org.scalajs.dom.experimental.webrtc.RTCIceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionIceCandidateEvent extends js.Object {
  var candidate: RTCIceCandidate = js.native
  def ready(): Unit = js.native
}

object SessionIceCandidateEvent {
  @scala.inline
  def apply(candidate: RTCIceCandidate, ready: () => Unit): SessionIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[SessionIceCandidateEvent]
  }
  @scala.inline
  implicit class SessionIceCandidateEventOps[Self <: SessionIceCandidateEvent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

