package typingsSlinky.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManyPayload extends js.Object {
  val tickets: js.Array[UpdateModel] = js.native
}

object UpdateManyPayload {
  @scala.inline
  def apply(tickets: js.Array[UpdateModel]): UpdateManyPayload = {
    val __obj = js.Dynamic.literal(tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManyPayload]
  }
  @scala.inline
  implicit class UpdateManyPayloadOps[Self <: UpdateManyPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTickets(value: js.Array[UpdateModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

