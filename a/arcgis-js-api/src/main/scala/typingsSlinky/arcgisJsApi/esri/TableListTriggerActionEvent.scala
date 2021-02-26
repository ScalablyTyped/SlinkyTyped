package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableListTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle = js.native
  
  var item: TableListListItem = js.native
}
object TableListTriggerActionEvent {
  
  @scala.inline
  def apply(action: ActionButton | ActionToggle, item: TableListListItem): TableListTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableListTriggerActionEvent]
  }
  
  @scala.inline
  implicit class TableListTriggerActionEventMutableBuilder[Self <: TableListTriggerActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: TableListListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
