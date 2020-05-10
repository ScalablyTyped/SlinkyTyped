package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPayload extends PaginablePayload {
  val tickets: js.Array[ResponseModel] = js.native
}

object ListPayload {
  @scala.inline
  def apply(count: Double, tickets: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  @scala.inline
  implicit class ListPayloadOps[Self <: ListPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTickets(value: js.Array[ResponseModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

