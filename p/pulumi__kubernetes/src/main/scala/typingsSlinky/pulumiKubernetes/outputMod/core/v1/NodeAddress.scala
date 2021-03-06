package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeAddress contains information for the node's address.
  */
@js.native
trait NodeAddress extends StObject {
  
  /**
    * The node address.
    */
  var address: String = js.native
  
  /**
    * Node address type, one of Hostname, ExternalIP or InternalIP.
    */
  var `type`: String = js.native
}
object NodeAddress {
  
  @scala.inline
  def apply(address: String, `type`: String): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddress]
  }
  
  @scala.inline
  implicit class NodeAddressMutableBuilder[Self <: NodeAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
