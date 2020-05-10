package typingsSlinky.nodeZendesk.mod.Macros

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def applyTicket(ticketId: ZendeskID, macroId: Double, cb: ZendeskCallback[_, _]): ApplyTicketResponsePayload = js.native
}

object Methods {
  @scala.inline
  def apply(applyTicket: (ZendeskID, Double, ZendeskCallback[_, _]) => ApplyTicketResponsePayload): Methods = {
    val __obj = js.Dynamic.literal(applyTicket = js.Any.fromFunction3(applyTicket))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyTicket(value: (ZendeskID, Double, ZendeskCallback[_, _]) => ApplyTicketResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTicket")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

