package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event
  extends /* key */ StringDictionary[js.Any] {
  
  var event: org.scalajs.dom.raw.Event = js.native
}
object Event {
  
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
