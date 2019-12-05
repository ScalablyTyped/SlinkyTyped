package typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Macros

import typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def applyTicket(ticketId: ZendeskID, macroId: Double, cb: ZendeskCallback[_, _]): ApplyTicketResponsePayload
}

object Methods {
  @scala.inline
  def apply(applyTicket: (ZendeskID, Double, ZendeskCallback[_, _]) => ApplyTicketResponsePayload): Methods = {
    val __obj = js.Dynamic.literal(applyTicket = js.Any.fromFunction3(applyTicket))
  
    __obj.asInstanceOf[Methods]
  }
}

