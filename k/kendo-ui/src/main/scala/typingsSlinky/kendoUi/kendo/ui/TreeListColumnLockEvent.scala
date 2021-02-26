package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumnLockEvent extends TreeListEvent {
  
  var column: js.UndefOr[js.Any] = js.native
}
object TreeListColumnLockEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListColumnLockEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnLockEvent]
  }
  
  @scala.inline
  implicit class TreeListColumnLockEventMutableBuilder[Self <: TreeListColumnLockEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
  }
}
