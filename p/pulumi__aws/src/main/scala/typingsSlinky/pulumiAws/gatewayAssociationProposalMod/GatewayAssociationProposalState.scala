package typingsSlinky.pulumiAws.gatewayAssociationProposalMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayAssociationProposalState extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: js.UndefOr[Input[String]] = js.native
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * AWS Account identifier of the Direct Connect Gateway's owner.
    */
  val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * *Deprecated:* Use `associatedGatewayId` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
    *
    * @deprecated use 'associated_gateway_id' argument instead
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object GatewayAssociationProposalState {
  @scala.inline
  def apply(): GatewayAssociationProposalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayAssociationProposalState]
  }
  @scala.inline
  implicit class GatewayAssociationProposalStateOps[Self <: GatewayAssociationProposalState] (val x: Self) extends AnyVal {
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

