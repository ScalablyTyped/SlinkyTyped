package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataOriginalEvent extends StObject {
  
  var data: js.Any = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object DataOriginalEvent {
  
  @scala.inline
  def apply(data: js.Any, originalEvent: org.scalajs.dom.raw.Event): DataOriginalEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOriginalEvent]
  }
  
  @scala.inline
  implicit class DataOriginalEventMutableBuilder[Self <: DataOriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
