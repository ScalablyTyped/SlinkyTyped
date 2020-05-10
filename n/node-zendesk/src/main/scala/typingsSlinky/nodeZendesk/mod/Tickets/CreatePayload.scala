package typingsSlinky.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePayload extends js.Object {
  val ticket: CreateModel = js.native
}

object CreatePayload {
  @scala.inline
  def apply(ticket: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
  @scala.inline
  implicit class CreatePayloadOps[Self <: CreatePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTicket(value: CreateModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

