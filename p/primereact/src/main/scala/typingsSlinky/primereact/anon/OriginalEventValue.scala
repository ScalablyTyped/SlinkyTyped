package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEventValue extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var value: js.Date = js.native
}
object OriginalEventValue {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, value: js.Date): OriginalEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventValue]
  }
  
  @scala.inline
  implicit class OriginalEventValueMutableBuilder[Self <: OriginalEventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
