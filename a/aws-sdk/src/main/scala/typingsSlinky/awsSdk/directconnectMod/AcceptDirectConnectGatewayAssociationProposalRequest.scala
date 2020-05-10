package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The ID of the AWS account that owns the virtual private gateway or transit gateway.
    */
  var associatedGatewayOwnerAccount: OwnerAccount = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  /**
    * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the request proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId = js.native
}

object AcceptDirectConnectGatewayAssociationProposalRequest {
  @scala.inline
  def apply(
    associatedGatewayOwnerAccount: OwnerAccount,
    directConnectGatewayId: DirectConnectGatewayId,
    proposalId: DirectConnectGatewayAssociationProposalId
  ): AcceptDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(associatedGatewayOwnerAccount = associatedGatewayOwnerAccount.asInstanceOf[js.Any], directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], proposalId = proposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalRequest]
  }
  @scala.inline
  implicit class AcceptDirectConnectGatewayAssociationProposalRequestOps[Self <: AcceptDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedGatewayOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayOwnerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectConnectGatewayId(value: DirectConnectGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProposalId(value: DirectConnectGatewayAssociationProposalId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideAllowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideAllowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
  }
  
}

