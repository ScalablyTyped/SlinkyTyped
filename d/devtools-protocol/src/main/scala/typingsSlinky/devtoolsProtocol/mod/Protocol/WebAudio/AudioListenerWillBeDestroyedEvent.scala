package typingsSlinky.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioListenerWillBeDestroyedEvent extends StObject {
  
  var contextId: GraphObjectId = js.native
  
  var listenerId: GraphObjectId = js.native
}
object AudioListenerWillBeDestroyedEvent {
  
  @scala.inline
  def apply(contextId: GraphObjectId, listenerId: GraphObjectId): AudioListenerWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], listenerId = listenerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListenerWillBeDestroyedEvent]
  }
  
  @scala.inline
  implicit class AudioListenerWillBeDestroyedEventMutableBuilder[Self <: AudioListenerWillBeDestroyedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerId(value: GraphObjectId): Self = StObject.set(x, "listenerId", value.asInstanceOf[js.Any])
  }
}
