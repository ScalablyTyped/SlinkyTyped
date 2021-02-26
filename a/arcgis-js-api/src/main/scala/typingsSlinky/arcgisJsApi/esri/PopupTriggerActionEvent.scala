package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle = js.native
}
object PopupTriggerActionEvent {
  
  @scala.inline
  def apply(action: ActionButton | ActionToggle): PopupTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupTriggerActionEvent]
  }
  
  @scala.inline
  implicit class PopupTriggerActionEventMutableBuilder[Self <: PopupTriggerActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
