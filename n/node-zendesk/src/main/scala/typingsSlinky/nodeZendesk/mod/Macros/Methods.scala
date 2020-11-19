package typingsSlinky.nodeZendesk.mod.Macros

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends js.Object {
  
  def applyTicket(ticketId: ZendeskID, macroId: Double): js.Promise[ApplyTicketResponsePayload] = js.native
  def applyTicket(ticketId: ZendeskID, macroId: Double, cb: ZendeskCallback[_, _]): ApplyTicketResponsePayload = js.native
}
