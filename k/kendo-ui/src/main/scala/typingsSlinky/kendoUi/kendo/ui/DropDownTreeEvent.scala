package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownTreeEvent extends StObject {
  
  def isDefaultPrevented(): Boolean = js.native
  
  var preventDefault: js.Function = js.native
  
  var sender: DropDownTree = js.native
}
object DropDownTreeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DropDownTree): DropDownTreeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownTreeEvent]
  }
  
  @scala.inline
  implicit class DropDownTreeEventMutableBuilder[Self <: DropDownTreeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: DropDownTree): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
