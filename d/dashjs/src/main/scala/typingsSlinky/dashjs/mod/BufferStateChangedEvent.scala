package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.audio
import typingsSlinky.dashjs.dashjsStrings.bufferLoaded
import typingsSlinky.dashjs.dashjsStrings.bufferStalled
import typingsSlinky.dashjs.dashjsStrings.bufferStateChanged
import typingsSlinky.dashjs.dashjsStrings.fragmentedText
import typingsSlinky.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferStateChangedEvent extends Event {
  
  var mediaType: video | audio | fragmentedText = js.native
  
  var sender: js.Object = js.native
  
  var state: bufferStalled | bufferLoaded = js.native
  
  var streamInfo: StreamInfo = js.native
  
  @JSName("type")
  var type_BufferStateChangedEvent: bufferStateChanged = js.native
}
object BufferStateChangedEvent {
  
  @scala.inline
  def apply(
    mediaType: video | audio | fragmentedText,
    sender: js.Object,
    state: bufferStalled | bufferLoaded,
    streamInfo: StreamInfo,
    `type`: bufferStateChanged
  ): BufferStateChangedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamInfo = streamInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStateChangedEvent]
  }
  
  @scala.inline
  implicit class BufferStateChangedEventMutableBuilder[Self <: BufferStateChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: video | audio | fragmentedText): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: js.Object): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: bufferStalled | bufferLoaded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bufferStateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
