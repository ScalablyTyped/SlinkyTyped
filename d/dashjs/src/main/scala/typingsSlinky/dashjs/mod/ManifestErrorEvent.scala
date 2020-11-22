package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.error
import typingsSlinky.dashjs.dashjsStrings.manifestError
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
  implicit class ManifestErrorEventOps[Self <: ManifestErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: manifestError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: typingsSlinky.dashjs.anon.Event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
