package typingsSlinky.pulumiAws.gatewayAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayAssociationState extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for single account Direct Connect gateway associations.
    */
  val associatedGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for cross-account Direct Connect gateway associations.
    */
  val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  val dxGatewayAssociationId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect gateway association proposal.
    * Used for cross-account Direct Connect gateway associations.
    */
  val proposalId: js.UndefOr[Input[String]] = js.native
  /**
    * *Deprecated:* Use `associatedGatewayId` instead. The ID of the VGW with which to associate the gateway.
    * Used for single account Direct Connect gateway associations.
    *
    * @deprecated use 'associated_gateway_id' argument instead
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object GatewayAssociationState {
  @scala.inline
  def apply(): GatewayAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayAssociationState]
  }
  @scala.inline
  implicit class GatewayAssociationStateOps[Self <: GatewayAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedPrefixes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociatedGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociatedGatewayOwnerAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayOwnerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedGatewayOwnerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayOwnerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociatedGatewayType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedGatewayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayType")(js.undefined)
        ret
    }
    @scala.inline
    def withDxGatewayAssociationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDxGatewayAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayAssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withDxGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDxGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withDxGatewayOwnerAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayOwnerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDxGatewayOwnerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayOwnerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalId(value: Input[String]): Self = {
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
    def withVpnGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(js.undefined)
        ret
    }
  }
  
}

