package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.TreeListModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListRemoveEvent extends TreeListEvent {
  
  var model: js.UndefOr[TreeListModel] = js.native
  
  var row: js.UndefOr[JQuery] = js.native
}
object TreeListRemoveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListRemoveEvent]
  }
  
  @scala.inline
  implicit class TreeListRemoveEventMutableBuilder[Self <: TreeListRemoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: TreeListModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRow(value: JQuery): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
