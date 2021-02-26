package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends StObject {
  
  var duration: Double = js.native
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLVideoElement] = js.native
}
object Duration {
  
  @scala.inline
  def apply(duration: Double, event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLVideoElement]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLVideoElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
