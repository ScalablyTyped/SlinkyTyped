package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEvent extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var query: String = js.native
}
object OriginalEvent {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, query: String): OriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEvent]
  }
  
  @scala.inline
  implicit class OriginalEventMutableBuilder[Self <: OriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
