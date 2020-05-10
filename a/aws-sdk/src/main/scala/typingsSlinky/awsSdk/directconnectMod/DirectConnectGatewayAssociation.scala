package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnectGatewayAssociation extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var allowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The state of the association. The following are the possible values:    associating: The initial state after calling CreateDirectConnectGatewayAssociation.    associated: The Direct Connect gateway and virtual private gateway or transit gateway are successfully associated and ready to pass traffic.    disassociating: The initial state after calling DeleteDirectConnectGatewayAssociation.    disassociated: The virtual private gateway or transit gateway is disassociated from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual private gateway or transit gateway is stopped.  
    */
  var associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The ID of the AWS account that owns the associated gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
  /**
    * The ID of the virtual private gateway. Applies only to private virtual interfaces.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
  /**
    * The ID of the AWS account that owns the virtual private gateway.
    */
  var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The AWS Region where the virtual private gateway is located.
    */
  var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.native
}

object DirectConnectGatewayAssociation {
  @scala.inline
  def apply(): DirectConnectGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAssociation]
  }
  @scala.inline
  implicit class DirectConnectGatewayAssociationOps[Self <: DirectConnectGatewayAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
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
    def withAssociationId(value: DirectConnectGatewayAssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationState(value: DirectConnectGatewayAssociationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationState")(js.undefined)
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
    def withStateChangeError(value: StateChangeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeError")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualGatewayId(value: VirtualGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualGatewayOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayOwnerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualGatewayOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayOwnerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualGatewayRegion(value: VirtualGatewayRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualGatewayRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayRegion")(js.undefined)
        ret
    }
  }
  
}

