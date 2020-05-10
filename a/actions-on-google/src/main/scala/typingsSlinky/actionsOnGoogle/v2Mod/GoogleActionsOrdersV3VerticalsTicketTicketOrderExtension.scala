package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withTicketEvent(value: GoogleActionsOrdersV3VerticalsTicketTicketEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticketEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicketEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticketEvent")(js.undefined)
        ret
    }
  }
  
}

