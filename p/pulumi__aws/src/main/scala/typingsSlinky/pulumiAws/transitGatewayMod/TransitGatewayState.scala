package typingsSlinky.pulumiAws.transitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayState extends js.Object {
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
    */
  val amazonSideAsn: js.UndefOr[Input[Double]] = js.native
  /**
    * EC2 Transit Gateway Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Identifier of the default association route table
    */
  val associationDefaultRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val autoAcceptSharedAttachments: js.UndefOr[Input[String]] = js.native
  /**
    * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTableAssociation: js.UndefOr[Input[String]] = js.native
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTablePropagation: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the EC2 Transit Gateway.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 Transit Gateway
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the default propagation route table
    */
  val propagationDefaultRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val vpnEcmpSupport: js.UndefOr[Input[String]] = js.native
}

object TransitGatewayState {
  @scala.inline
  def apply(): TransitGatewayState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayState]
  }
  @scala.inline
  implicit class TransitGatewayStateOps[Self <: TransitGatewayState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazonSideAsn(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonSideAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationDefaultRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationDefaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationDefaultRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationDefaultRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAcceptSharedAttachments(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptSharedAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAcceptSharedAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptSharedAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRouteTableAssociation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTableAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRouteTableAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTableAssociation")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRouteTablePropagation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTablePropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRouteTablePropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTablePropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagationDefaultRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationDefaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagationDefaultRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationDefaultRouteTableId")(js.undefined)
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
    def withVpnEcmpSupport(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnEcmpSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnEcmpSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnEcmpSupport")(js.undefined)
        ret
    }
  }
  
}

