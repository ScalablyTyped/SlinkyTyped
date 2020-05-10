package typingsSlinky.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateManyPayload extends js.Object {
  val tickets: js.Array[CreateModel] = js.native
}

object CreateManyPayload {
  @scala.inline
  def apply(tickets: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManyPayload]
  }
  @scala.inline
  implicit class CreateManyPayloadOps[Self <: CreateManyPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTickets(value: js.Array[CreateModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

