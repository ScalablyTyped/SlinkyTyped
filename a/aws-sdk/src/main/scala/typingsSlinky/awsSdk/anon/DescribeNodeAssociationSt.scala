package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.opsworkscmMod.NodeAssociationStatusToken
import typingsSlinky.awsSdk.opsworkscmMod.ServerName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworkscm.DescribeNodeAssociationStatusRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeNodeAssociationSt extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. 
    */
  var NodeAssociationStatusToken: typingsSlinky.awsSdk.opsworkscmMod.NodeAssociationStatusToken = js.native
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}

object DescribeNodeAssociationSt {
  @scala.inline
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken, ServerName: ServerName): DescribeNodeAssociationSt = {
    val __obj = js.Dynamic.literal(NodeAssociationStatusToken = NodeAssociationStatusToken.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeAssociationSt]
  }
  @scala.inline
  implicit class DescribeNodeAssociationStOps[Self <: DescribeNodeAssociationSt] (val x: Self) extends AnyVal {
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
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
  }
  
}

