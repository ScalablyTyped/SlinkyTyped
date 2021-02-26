package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderState extends StObject {
  
  /**
    * The user-visible string for the state. Required.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * State can be one of the following values:
    *
    * `CREATED`: Order was created at integrator's system.
    * `REJECTED`: Order was rejected by integrator.
    * `CONFIRMED`: Order was confirmed by the integrator and is active.
    * `CANCELLED`: User cancelled the order.
    * `IN_TRANSIT`: Order is being delivered.
    * `RETURNED`: User did a return.
    * `FULFILLED`: User received what was ordered.
    * 'CHANGE_REQUESTED': User has requested a change to the order, and
    *           the integrator is processing this change. The
    *           order should be moved to another state after the
    *           request is handled.
    *
    * Required.
    */
  var state: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersOrderState {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderState]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderStateMutableBuilder[Self <: GoogleActionsV2OrdersOrderState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
