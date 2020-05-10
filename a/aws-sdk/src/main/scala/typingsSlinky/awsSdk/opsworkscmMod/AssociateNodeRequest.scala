package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateNodeRequest extends js.Object {
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
  implicit class AssociateNodeRequestOps[Self <: AssociateNodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineAttributes(value: EngineAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: NodeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

