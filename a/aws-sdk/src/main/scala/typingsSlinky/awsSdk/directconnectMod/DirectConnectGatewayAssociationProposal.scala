package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnectGatewayAssociationProposal extends js.Object {
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
    */
  var existingAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the association proposal.
    */
  var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId] = js.native
  /**
    * The state of the proposal. The following are possible values:    accepted: The proposal has been accepted. The Direct Connect gateway association is available to use in this state.    deleted: The proposal has been deleted by the owner that made the proposal. The Direct Connect gateway association cannot be used in this state.    requested: The proposal has been requested. The Direct Connect gateway association cannot be used in this state.  
    */
  var proposalState: js.UndefOr[DirectConnectGatewayAssociationProposalState] = js.native
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var requestedAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
}

object DirectConnectGatewayAssociationProposal {
  @scala.inline
  def apply(): DirectConnectGatewayAssociationProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAssociationProposal]
  }
  @scala.inline
  implicit class DirectConnectGatewayAssociationProposalOps[Self <: DirectConnectGatewayAssociationProposal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedGateway(value: AssociatedGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGateway")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnectGatewayId(value: DirectConnectGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayOwnerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayOwnerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withExistingAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingAllowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExistingAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingAllowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalId(value: DirectConnectGatewayAssociationProposalId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalState(value: DirectConnectGatewayAssociationProposalState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalState")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedAllowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedAllowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
  }
  
}

