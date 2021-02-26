package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarOpenEvent extends ToolBarEvent {
  
  var SplitButton: js.UndefOr[JQuery] = js.native
}
object ToolBarOpenEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ToolBar): ToolBarOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarOpenEvent]
  }
  
  @scala.inline
  implicit class ToolBarOpenEventMutableBuilder[Self <: ToolBarOpenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSplitButton(value: JQuery): Self = StObject.set(x, "SplitButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitButtonUndefined: Self = StObject.set(x, "SplitButton", js.undefined)
  }
}
