package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends Message {
  
  /**
    * Name of the application receiving the event.
    */
  var application: String = js.native
  
  /**
    * Time at which this event was created.
    */
  var timestamp: js.Date = js.native
}
object Event {
  
  @scala.inline
  def apply(application: String, timestamp: js.Date, `type`: String): Event = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
