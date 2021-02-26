package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.audio
import typingsSlinky.dashjs.dashjsStrings.bufferLoaded
import typingsSlinky.dashjs.dashjsStrings.bufferStalled
import typingsSlinky.dashjs.dashjsStrings.fragmentedText
import typingsSlinky.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  @JSName("type")
  var type_BufferEvent: bufferStalled | bufferLoaded = js.native
}
object BufferEvent {
  
  @scala.inline
  def apply(mediaType: video | audio | fragmentedText, `type`: bufferStalled | bufferLoaded): BufferEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferEvent]
  }
  
  @scala.inline
  implicit class BufferEventMutableBuilder[Self <: BufferEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bufferStalled | bufferLoaded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
