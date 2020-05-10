package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayOptions extends js.Object {
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  /**
    * The ID of the default association route table.
    */
  var AssociationDefaultRouteTableId: js.UndefOr[String] = js.native
  /**
    * Indicates whether attachment requests are automatically accepted.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.native
  /**
    * Indicates whether resource attachments are automatically associated with the default association route table.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.native
  /**
    * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.native
  /**
    * Indicates whether DNS support is enabled.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  /**
    * Indicates whether multicast is enabled on the transit gateway
    */
  var MulticastSupport: js.UndefOr[MulticastSupportValue] = js.native
  /**
    * The ID of the default propagation route table.
    */
  var PropagationDefaultRouteTableId: js.UndefOr[String] = js.native
  /**
    * Indicates whether Equal Cost Multipath Protocol support is enabled.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.native
}

object TransitGatewayOptions {
  @scala.inline
  def apply(): TransitGatewayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayOptions]
  }
  @scala.inline
  implicit class TransitGatewayOptionsOps[Self <: TransitGatewayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazonSideAsn(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmazonSideAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonSideAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmazonSideAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationDefaultRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationDefaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationDefaultRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationDefaultRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAcceptSharedAttachments(value: AutoAcceptSharedAttachmentsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAcceptSharedAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAcceptSharedAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAcceptSharedAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRouteTableAssociation(value: DefaultRouteTableAssociationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRouteTableAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRouteTableAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRouteTableAssociation")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRouteTablePropagation(value: DefaultRouteTablePropagationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRouteTablePropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRouteTablePropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRouteTablePropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsSupport(value: DnsSupportValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withMulticastSupport(value: MulticastSupportValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MulticastSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticastSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MulticastSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagationDefaultRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropagationDefaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagationDefaultRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropagationDefaultRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnEcmpSupport(value: VpnEcmpSupportValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnEcmpSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnEcmpSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnEcmpSupport")(js.undefined)
        ret
    }
  }
  
}

