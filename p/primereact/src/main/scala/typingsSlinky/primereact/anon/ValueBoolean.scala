package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueBoolean extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var value: Boolean = js.native
}
object ValueBoolean {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, value: Boolean): ValueBoolean = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueBoolean]
  }
  
  @scala.inline
  implicit class ValueBooleanMutableBuilder[Self <: ValueBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
