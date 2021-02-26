package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListBeforeEditEvent extends TreeListEvent {
  
  var model: js.UndefOr[Model] = js.native
}
object TreeListBeforeEditEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListBeforeEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListBeforeEditEvent]
  }
  
  @scala.inline
  implicit class TreeListBeforeEditEventMutableBuilder[Self <: TreeListBeforeEditEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
