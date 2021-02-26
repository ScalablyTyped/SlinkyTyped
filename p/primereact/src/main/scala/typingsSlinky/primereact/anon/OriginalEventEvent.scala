package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEventEvent extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var value: String = js.native
}
object OriginalEventEvent {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, value: String): OriginalEventEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventEvent]
  }
  
  @scala.inline
  implicit class OriginalEventEventMutableBuilder[Self <: OriginalEventEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
