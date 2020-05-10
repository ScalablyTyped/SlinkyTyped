package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodeAssociationStatusRequest extends js.Object {
  /**
    * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. 
    */
  var NodeAssociationStatusToken: typingsSlinky.awsSdk.opsworkscmMod.NodeAssociationStatusToken = js.native
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}

object DescribeNodeAssociationStatusRequest {
  @scala.inline
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken, ServerName: ServerName): DescribeNodeAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(NodeAssociationStatusToken = NodeAssociationStatusToken.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeAssociationStatusRequest]
  }
  @scala.inline
  implicit class DescribeNodeAssociationStatusRequestOps[Self <: DescribeNodeAssociationStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeAssociationStatusToken(value: NodeAssociationStatusToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeAssociationStatusToken")(value.asInstanceOf[js.Any])
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

