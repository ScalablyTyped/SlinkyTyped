package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEventTarget extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var target: Name = js.native
  
  var value: js.Date | js.Array[js.Date] = js.native
}
object OriginalEventTarget {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, target: Name, value: js.Date | js.Array[js.Date]): OriginalEventTarget = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventTarget]
  }
  
  @scala.inline
  implicit class OriginalEventTargetMutableBuilder[Self <: OriginalEventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Name): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Date*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
