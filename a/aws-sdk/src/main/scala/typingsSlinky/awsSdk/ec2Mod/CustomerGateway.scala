package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGateway extends js.Object {
  /**
    * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  var BgpAsn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the customer gateway certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.native
  /**
    * The name of customer gateway device.
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * The Internet-routable IP address of the customer gateway's outside interface.
    */
  var IpAddress: js.UndefOr[String] = js.native
  /**
    * The current state of the customer gateway (pending | available | deleting | deleted).
    */
  var State: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the customer gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of VPN connection the customer gateway supports (ipsec.1).
    */
  var Type: js.UndefOr[String] = js.native
}

object CustomerGateway {
  @scala.inline
  def apply(): CustomerGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerGateway]
  }
  @scala.inline
  implicit class CustomerGatewayOps[Self <: CustomerGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgpAsn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BgpAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
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
    def withType(value: String): Self = {
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
  }
  
}

