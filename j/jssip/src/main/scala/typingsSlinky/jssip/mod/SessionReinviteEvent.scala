package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionReinviteEvent extends js.Object {
  var request: IncomingRequest = js.native
  def callback(): Unit = js.native
  def reject(options: SessionRejectOptions): Unit = js.native
}

object SessionReinviteEvent {
  @scala.inline
  def apply(callback: () => Unit, reject: SessionRejectOptions => Unit, request: IncomingRequest): SessionReinviteEvent = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReinviteEvent]
  }
  @scala.inline
  implicit class SessionReinviteEventOps[Self <: SessionReinviteEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReject(value: SessionRejectOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequest(value: IncomingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

