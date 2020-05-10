package typingsSlinky.jssip.mod

import typingsSlinky.jssip.mod.RTCSession.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionNewInfoEvent extends js.Object {
  var info: Info = js.native
  var originator: String = js.native
  var request: IncomingRequest | OutgoingRequest = js.native
}

object SessionNewInfoEvent {
  @scala.inline
  def apply(info: Info, originator: String, request: IncomingRequest | OutgoingRequest): SessionNewInfoEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionNewInfoEvent]
  }
  @scala.inline
  implicit class SessionNewInfoEventOps[Self <: SessionNewInfoEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: Info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: IncomingRequest | OutgoingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

