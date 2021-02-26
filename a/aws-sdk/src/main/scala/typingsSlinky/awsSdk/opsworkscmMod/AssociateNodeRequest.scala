package typingsSlinky.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateNodeRequest extends StObject {
  
  /**
    * Engine attributes used for associating the node.   Attributes accepted in a AssociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node is associated. By default only one organization named default can exist.     CHEF_NODE_PUBLIC_KEY: A PEM-formatted public key. This key is required for the chef-client agent to access the Chef API.     Attributes accepted in a AssociateNode request for Puppet     PUPPET_NODE_CSR: A PEM-formatted certificate-signing request (CSR) that is created by the node.   
    */
  var EngineAttributes: typingsSlinky.awsSdk.opsworkscmMod.EngineAttributes = js.native
  
  /**
    * The name of the node. 
    */
  var NodeName: typingsSlinky.awsSdk.opsworkscmMod.NodeName = js.native
  
  /**
    * The name of the server with which to associate the node. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}
object AssociateNodeRequest {
  
  @scala.inline
  def apply(EngineAttributes: EngineAttributes, NodeName: NodeName, ServerName: ServerName): AssociateNodeRequest = {
    val __obj = js.Dynamic.literal(EngineAttributes = EngineAttributes.asInstanceOf[js.Any], NodeName = NodeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateNodeRequest]
  }
  
  @scala.inline
  implicit class AssociateNodeRequestMutableBuilder[Self <: AssociateNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNodeName(value: NodeName): Self = StObject.set(x, "NodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
