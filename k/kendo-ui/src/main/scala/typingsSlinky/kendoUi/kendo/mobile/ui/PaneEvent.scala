package typingsSlinky.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneEvent extends StObject {
  
  def isDefaultPrevented(): Boolean = js.native
  
  var preventDefault: js.Function = js.native
  
  var sender: Pane = js.native
}
object PaneEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Pane): PaneEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneEvent]
  }
  
  @scala.inline
  implicit class PaneEventMutableBuilder[Self <: PaneEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Pane): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
