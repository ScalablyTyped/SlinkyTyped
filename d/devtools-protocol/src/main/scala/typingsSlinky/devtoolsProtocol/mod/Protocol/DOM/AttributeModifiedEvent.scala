package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeModifiedEvent extends js.Object {
  
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
  implicit class AttributeModifiedEventOps[Self <: AttributeModifiedEvent] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
