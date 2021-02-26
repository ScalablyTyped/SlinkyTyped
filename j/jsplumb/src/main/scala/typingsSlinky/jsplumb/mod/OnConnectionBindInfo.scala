package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnConnectionBindInfo extends StObject {
  
  var connection: Connection = js.native
  
  //- the source Endpoint in the Connection
  var newSourceEndpoint: Endpoint = js.native
  
  var newSourceId: String = js.native
  
  //- the targetEndpoint in the Connection
  var newTargetEndpoint: Endpoint = js.native
  
  var newTargetId: String = js.native
  
  // - id of the source element in the Connection
  var originalSourceId: String = js.native
  
  // - id of the target element in the Connection
  var originalTargetId: String = js.native
  
  var source: Element = js.native
  
  //- the target element in the Connection
  var sourceEndpoint: Endpoint = js.native
  
  // the new Connection.you can register listeners on this etc.
  var sourceId: String = js.native
  
  // - the source element in the Connection
  var target: Element = js.native
  
  var targetEndpoint: Endpoint = js.native
  
  var targetId: String = js.native
}
object OnConnectionBindInfo {
  
  @scala.inline
  def apply(
    connection: Connection,
    newSourceEndpoint: Endpoint,
    newSourceId: String,
    newTargetEndpoint: Endpoint,
    newTargetId: String,
    originalSourceId: String,
    originalTargetId: String,
    source: Element,
    sourceEndpoint: Endpoint,
    sourceId: String,
    target: Element,
    targetEndpoint: Endpoint,
    targetId: String
  ): OnConnectionBindInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], newSourceEndpoint = newSourceEndpoint.asInstanceOf[js.Any], newSourceId = newSourceId.asInstanceOf[js.Any], newTargetEndpoint = newTargetEndpoint.asInstanceOf[js.Any], newTargetId = newTargetId.asInstanceOf[js.Any], originalSourceId = originalSourceId.asInstanceOf[js.Any], originalTargetId = originalTargetId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceEndpoint = sourceEndpoint.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetEndpoint = targetEndpoint.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnConnectionBindInfo]
  }
  
  @scala.inline
  implicit class OnConnectionBindInfoMutableBuilder[Self <: OnConnectionBindInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSourceEndpoint(value: Endpoint): Self = StObject.set(x, "newSourceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSourceId(value: String): Self = StObject.set(x, "newSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTargetEndpoint(value: Endpoint): Self = StObject.set(x, "newTargetEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTargetId(value: String): Self = StObject.set(x, "newTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSourceId(value: String): Self = StObject.set(x, "originalSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTargetId(value: String): Self = StObject.set(x, "originalTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEndpoint(value: Endpoint): Self = StObject.set(x, "sourceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEndpoint(value: Endpoint): Self = StObject.set(x, "targetEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
