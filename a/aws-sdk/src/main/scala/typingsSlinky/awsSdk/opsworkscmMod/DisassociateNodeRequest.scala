package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateNodeRequest extends js.Object {
  /**
    * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.   Attributes required in a DisassociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node was associated. By default only one organization named default can exist.   
    */
  var EngineAttributes: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  /**
    * The name of the client node. 
    */
  var NodeName: typingsSlinky.awsSdk.opsworkscmMod.NodeName = js.native
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}

object DisassociateNodeRequest {
  @scala.inline
  def apply(NodeName: NodeName, ServerName: ServerName): DisassociateNodeRequest = {
    val __obj = js.Dynamic.literal(NodeName = NodeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateNodeRequest]
  }
  @scala.inline
  implicit class DisassociateNodeRequestOps[Self <: DisassociateNodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withEngineAttributes(value: EngineAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttributes")(js.undefined)
        ret
    }
  }
  
}

