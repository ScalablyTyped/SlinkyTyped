package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderUpdateAction extends StObject {
  
  /**
    * Button label and link.
    */
  var button: js.UndefOr[GoogleActionsV2UiElementsButton] = js.native
  
  /**
    * Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderUpdateActionType] = js.native
}
object GoogleActionsV2OrdersOrderUpdateAction {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateAction]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderUpdateActionMutableBuilder[Self <: GoogleActionsV2OrdersOrderUpdateAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: GoogleActionsV2UiElementsButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsV2OrdersOrderUpdateActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
