package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension extends js.Object {
  
  /**
    * The event applied to all line item tickets.
    */
  var ticketEvent: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketEvent] = js.native
}
object GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsTicketTicketOrderExtensionOps[Self <: GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTicketEvent(value: GoogleActionsOrdersV3VerticalsTicketTicketEvent): Self = this.set("ticketEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicketEvent: Self = this.set("ticketEvent", js.undefined)
  }
}
