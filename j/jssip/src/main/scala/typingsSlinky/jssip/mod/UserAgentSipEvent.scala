package typingsSlinky.jssip.mod

import typingsSlinky.jssip.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentSipEvent extends js.Object {
  var event: Event = js.native
  var request: IncomingRequest = js.native
}

object UserAgentSipEvent {
  @scala.inline
  def apply(event: Event, request: IncomingRequest): UserAgentSipEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentSipEvent]
  }
  @scala.inline
  implicit class UserAgentSipEventOps[Self <: UserAgentSipEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
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

