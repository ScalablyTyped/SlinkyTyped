package typingsSlinky.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeParamDisconnectedEvent extends StObject {
  
  var contextId: GraphObjectId = js.native
  
  var destinationId: GraphObjectId = js.native
  
  var sourceId: GraphObjectId = js.native
  
  var sourceOutputIndex: js.UndefOr[Double] = js.native
}
object NodeParamDisconnectedEvent {
  
  @scala.inline
  def apply(contextId: GraphObjectId, destinationId: GraphObjectId, sourceId: GraphObjectId): NodeParamDisconnectedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParamDisconnectedEvent]
  }
  
  @scala.inline
  implicit class NodeParamDisconnectedEventMutableBuilder[Self <: NodeParamDisconnectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationId(value: GraphObjectId): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: GraphObjectId): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOutputIndex(value: Double): Self = StObject.set(x, "sourceOutputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOutputIndexUndefined: Self = StObject.set(x, "sourceOutputIndex", js.undefined)
  }
}
