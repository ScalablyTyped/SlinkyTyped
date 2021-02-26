package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeModifiedEvent extends StObject {
  
  /**
    * Attribute name.
    */
  var name: String = js.native
  
  /**
    * Id of the node that has changed.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Attribute value.
    */
  var value: String = js.native
}
object AttributeModifiedEvent {
  
  @scala.inline
  def apply(name: String, nodeId: NodeId, value: String): AttributeModifiedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeModifiedEvent]
  }
  
  @scala.inline
  implicit class AttributeModifiedEventMutableBuilder[Self <: AttributeModifiedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
