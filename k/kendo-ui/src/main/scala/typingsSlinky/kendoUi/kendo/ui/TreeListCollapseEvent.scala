package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.TreeListModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListCollapseEvent extends TreeListEvent {
  
  var model: js.UndefOr[TreeListModel] = js.native
}
object TreeListCollapseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListCollapseEvent]
  }
  
  @scala.inline
  implicit class TreeListCollapseEventMutableBuilder[Self <: TreeListCollapseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: TreeListModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
