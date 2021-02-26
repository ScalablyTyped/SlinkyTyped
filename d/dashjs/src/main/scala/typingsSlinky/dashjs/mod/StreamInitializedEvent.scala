package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.streamInitialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamInitializedEvent extends Event {
  
  var error: js.Error | Null = js.native
  
  var streamInfo: StreamInfo = js.native
  
  @JSName("type")
  var type_StreamInitializedEvent: streamInitialized = js.native
}
object StreamInitializedEvent {
  
  @scala.inline
  def apply(streamInfo: StreamInfo, `type`: streamInitialized): StreamInitializedEvent = {
    val __obj = js.Dynamic.literal(streamInfo = streamInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInitializedEvent]
  }
  
  @scala.inline
  implicit class StreamInitializedEventMutableBuilder[Self <: StreamInitializedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: streamInitialized): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
