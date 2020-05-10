package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGateway extends js.Object {
  /**
    * The private Autonomous System Number (ASN) for the Amazon side of a BGP session.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  /**
    * The Availability Zone where the virtual private gateway was created, if applicable. This field may be empty or not returned.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The current state of the virtual private gateway.
    */
  var State: js.UndefOr[VpnState] = js.native
  /**
    * Any tags assigned to the virtual private gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of VPN connection the virtual private gateway supports.
    */
  var Type: js.UndefOr[GatewayType] = js.native
  /**
    * Any VPCs attached to the virtual private gateway.
    */
  var VpcAttachments: js.UndefOr[VpcAttachmentList] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: js.UndefOr[String] = js.native
}

object VpnGateway {
  @scala.inline
  def apply(): VpnGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGateway]
  }
  @scala.inline
  implicit class VpnGatewayOps[Self <: VpnGateway] (val x: Self) extends AnyVal {
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
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: VpnState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GatewayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcAttachments(value: VpcAttachmentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGatewayId")(js.undefined)
        ret
    }
  }
  
}

