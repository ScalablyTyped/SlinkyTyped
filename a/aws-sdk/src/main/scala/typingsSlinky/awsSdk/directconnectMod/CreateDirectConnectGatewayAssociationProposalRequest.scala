package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: OwnerAccount = js.native
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: GatewayIdToAssociate = js.native
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
}

object CreateDirectConnectGatewayAssociationProposalRequest {
  @scala.inline
  def apply(
    directConnectGatewayId: DirectConnectGatewayId,
    directConnectGatewayOwnerAccount: OwnerAccount,
    gatewayId: GatewayIdToAssociate
  ): CreateDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalRequest]
  }
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationProposalRequestOps[Self <: CreateDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectConnectGatewayId(value: DirectConnectGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayOwnerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayId(value: GatewayIdToAssociate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAllowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAllowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
  }
  
}

