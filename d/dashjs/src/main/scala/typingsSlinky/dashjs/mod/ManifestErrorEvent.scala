package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.error
import typingsSlinky.dashjs.dashjsStrings.manifestError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestErrorEvent
  extends Event
     with ErrorEvent {
  
  var error: manifestError = js.native
  
  var event: typingsSlinky.dashjs.anon.Event = js.native
  
  @JSName("type")
  var type_ManifestErrorEvent: error = js.native
}
object ManifestErrorEvent {
  
  @scala.inline
  def apply(error: manifestError, event: typingsSlinky.dashjs.anon.Event, `type`: error): ManifestErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestErrorEvent]
  }
  
  @scala.inline
  implicit class ManifestErrorEventMutableBuilder[Self <: ManifestErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: manifestError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: typingsSlinky.dashjs.anon.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
