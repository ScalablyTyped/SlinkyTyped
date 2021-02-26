package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventStreamResponse extends StObject {
  
  var EventStream: typingsSlinky.awsSdk.pinpointMod.EventStream = js.native
}
object PutEventStreamResponse {
  
  @scala.inline
  def apply(EventStream: EventStream): PutEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventStreamResponse]
  }
  
  @scala.inline
  implicit class PutEventStreamResponseMutableBuilder[Self <: PutEventStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventStream(value: EventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
  }
}
