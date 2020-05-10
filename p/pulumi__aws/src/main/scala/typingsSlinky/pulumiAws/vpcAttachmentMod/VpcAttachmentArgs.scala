package typingsSlinky.pulumiAws.vpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcAttachmentArgs extends js.Object {
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: js.UndefOr[Input[String]] = js.native
  /**
    * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val ipv6Support: js.UndefOr[Input[String]] = js.native
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Input[String] = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: Input[String] = js.native
}

object VpcAttachmentArgs {
  @scala.inline
  def apply(subnetIds: Input[js.Array[Input[String]]], transitGatewayId: Input[String], vpcId: Input[String]): VpcAttachmentArgs = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentArgs]
  }
  @scala.inline
  implicit class VpcAttachmentArgsOps[Self <: VpcAttachmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsSupport(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Support(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Support: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Support")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTableAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayDefaultRouteTableAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTableAssociation")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTablePropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayDefaultRouteTablePropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTablePropagation")(js.undefined)
        ret
    }
  }
  
}

