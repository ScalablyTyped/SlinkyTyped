package typingsSlinky.pulumiAws.gatewayAssociationProposalMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayAssociationProposalArgs extends js.Object {
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: Input[String] = js.native
  /**
    * AWS Account identifier of the Direct Connect Gateway's owner.
    */
  val dxGatewayOwnerAccountId: Input[String] = js.native
  /**
    * *Deprecated:* Use `associatedGatewayId` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
    *
    * @deprecated use 'associated_gateway_id' argument instead
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object GatewayAssociationProposalArgs {
  @scala.inline
  def apply(dxGatewayId: Input[String], dxGatewayOwnerAccountId: Input[String]): GatewayAssociationProposalArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], dxGatewayOwnerAccountId = dxGatewayOwnerAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayAssociationProposalArgs]
  }
  @scala.inline
  implicit class GatewayAssociationProposalArgsOps[Self <: GatewayAssociationProposalArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDxGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDxGatewayOwnerAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayOwnerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
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

