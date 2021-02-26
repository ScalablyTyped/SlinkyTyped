package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedOriginalEvent extends StObject {
  
  var checked: Boolean = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var target: Checked = js.native
  
  var value: js.Any = js.native
}
object CheckedOriginalEvent {
  
  @scala.inline
  def apply(checked: Boolean, originalEvent: org.scalajs.dom.raw.Event, target: Checked, value: js.Any): CheckedOriginalEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedOriginalEvent]
  }
  
  @scala.inline
  implicit class CheckedOriginalEventMutableBuilder[Self <: CheckedOriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Checked): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
