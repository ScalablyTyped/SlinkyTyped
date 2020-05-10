package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentNewMessageEvent extends js.Object {
  var message: Message = js.native
  var originator: String = js.native
  var request: IncomingRequest | OutgoingRequest = js.native
}

object UserAgentNewMessageEvent {
  @scala.inline
  def apply(message: Message, originator: String, request: IncomingRequest | OutgoingRequest): UserAgentNewMessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentNewMessageEvent]
  }
  @scala.inline
  implicit class UserAgentNewMessageEventOps[Self <: UserAgentNewMessageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
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

