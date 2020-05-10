package typingsSlinky.pulumiAws.vpnConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.VpnConnectionRoute
import typingsSlinky.pulumiAws.inputMod.ec2.VpnConnectionVgwTelemetry
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionState extends js.Object {
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format).
    */
  val customerGatewayConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: js.UndefOr[Input[String]] = js.native
  val routes: js.UndefOr[Input[js.Array[Input[VpnConnectionRoute]]]] = js.native
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * When associated with an EC2 Transit Gateway (`transitGatewayId` argument), the attachment ID.
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address of the first VPN tunnel.
    */
  val tunnel1Address: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp asn number of the first VPN tunnel.
    */
  val tunnel1BgpAsn: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp holdtime of the first VPN tunnel.
    */
  val tunnel1BgpHoldtime: js.UndefOr[Input[Double]] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
    */
  val tunnel1CgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
    */
  val tunnel1VgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address of the second VPN tunnel.
    */
  val tunnel2Address: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp asn number of the second VPN tunnel.
    */
  val tunnel2BgpAsn: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp holdtime of the second VPN tunnel.
    */
  val tunnel2BgpHoldtime: js.UndefOr[Input[Double]] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
    */
  val tunnel2CgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the second VPN tunnel.
    */
  val tunnel2InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
    */
  val tunnel2VgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: js.UndefOr[Input[String]] = js.native
  val vgwTelemetries: js.UndefOr[Input[js.Array[Input[VpnConnectionVgwTelemetry]]]] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionState {
  @scala.inline
  def apply(): VpnConnectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionState]
  }
  @scala.inline
  implicit class VpnConnectionStateOps[Self <: VpnConnectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerGatewayConfiguration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerGatewayConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGatewayConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerGatewayConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: Input[js.Array[Input[VpnConnectionRoute]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticRoutesOnly(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticRoutesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticRoutesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticRoutesOnly")(js.undefined)
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
    def withTransitGatewayAttachmentId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayAttachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayAttachmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel1Address(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel1Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1Address")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel1BgpAsn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1BgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel1BgpAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1BgpAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel1BgpHoldtime(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1BgpHoldtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel1BgpHoldtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1BgpHoldtime")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel1CgwInsideAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1CgwInsideAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel1CgwInsideAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1CgwInsideAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel1InsideCidr(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1InsideCidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel1InsideCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1InsideCidr")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel1PresharedKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1PresharedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel1PresharedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1PresharedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel1VgwInsideAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1VgwInsideAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel1VgwInsideAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel1VgwInsideAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel2Address(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel2Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2Address")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel2BgpAsn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2BgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel2BgpAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2BgpAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel2BgpHoldtime(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2BgpHoldtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel2BgpHoldtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2BgpHoldtime")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel2CgwInsideAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2CgwInsideAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel2CgwInsideAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2CgwInsideAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel2InsideCidr(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2InsideCidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel2InsideCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2InsideCidr")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel2PresharedKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2PresharedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel2PresharedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2PresharedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel2VgwInsideAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2VgwInsideAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel2VgwInsideAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel2VgwInsideAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVgwTelemetries(value: Input[js.Array[Input[VpnConnectionVgwTelemetry]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vgwTelemetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVgwTelemetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vgwTelemetries")(js.undefined)
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

