package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEventTargetValue extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var target: NameValue = js.native
  
  var value: Double = js.native
}
object OriginalEventTargetValue {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, target: NameValue, value: Double): OriginalEventTargetValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventTargetValue]
  }
  
  @scala.inline
  implicit class OriginalEventTargetValueMutableBuilder[Self <: OriginalEventTargetValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: NameValue): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
