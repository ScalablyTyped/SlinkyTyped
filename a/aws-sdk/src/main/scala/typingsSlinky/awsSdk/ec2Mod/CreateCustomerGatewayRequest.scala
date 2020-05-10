package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomerGatewayRequest extends js.Object {
  /**
    * For devices that support BGP, the customer gateway's BGP ASN. Default: 65000
    */
  var BgpAsn: Integer = js.native
  /**
    * The Amazon Resource Name (ARN) for the customer gateway certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * A name for the customer gateway device. Length Constraints: Up to 255 characters.
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Internet-routable IP address for the customer gateway's outside interface. The address must be static.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The type of VPN connection that this customer gateway supports (ipsec.1).
    */
  var Type: GatewayType = js.native
}

object CreateCustomerGatewayRequest {
  @scala.inline
  def apply(BgpAsn: Integer, Type: GatewayType): CreateCustomerGatewayRequest = {
    val __obj = js.Dynamic.literal(BgpAsn = BgpAsn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerGatewayRequest]
  }
  @scala.inline
  implicit class CreateCustomerGatewayRequestOps[Self <: CreateCustomerGatewayRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgpAsn(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: GatewayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
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
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(js.undefined)
        ret
    }
  }
  
}

