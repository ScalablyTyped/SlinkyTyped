package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPresentationOptions extends StObject {
  
  /**
    * call_to_action can be one of the following values:
    *
    * `PLACE_ORDER`: Used for placing an order.
    * `PAY`: Used for a payment.
    * `BUY`: Used for a purchase.
    * `SEND`: Used for a money transfer.
    * `BOOK`: Used for a booking.
    * `RESERVE`: Used for reservation.
    * `SCHEDULE`: Used for scheduling an appointment.
    * `SUBSCRIBE`: Used for subscription.
    *
    * call_to_action refers to the action verb which best describes this order.
    * This will be used in various places like prompt, suggestion chip etc while
    * proposing the order to the user.
    */
  var callToAction: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersPresentationOptions {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersPresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPresentationOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersPresentationOptionsMutableBuilder[Self <: GoogleActionsV2OrdersPresentationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallToAction(value: String): Self = StObject.set(x, "callToAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallToActionUndefined: Self = StObject.set(x, "callToAction", js.undefined)
  }
}
