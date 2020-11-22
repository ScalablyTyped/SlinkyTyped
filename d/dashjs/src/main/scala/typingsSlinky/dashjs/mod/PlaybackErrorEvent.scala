package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.playbackError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackErrorEvent extends Event {
  
  var error: String = js.native
  
  @JSName("type")
  var type_PlaybackErrorEvent: playbackError = js.native
}
object PlaybackErrorEvent {
  
  @scala.inline
  def apply(error: String, `type`: playbackError): PlaybackErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackErrorEvent]
  }
  
  @scala.inline
  implicit class PlaybackErrorEventOps[Self <: PlaybackErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: playbackError): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
