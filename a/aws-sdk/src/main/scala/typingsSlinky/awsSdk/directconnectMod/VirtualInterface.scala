package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualInterface extends js.Object {
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.native
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.native
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration. The valid values are 1-2147483647.
    */
  var asn: js.UndefOr[ASN] = js.native
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.native
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  /**
    * The BGP peers configured on this virtual interface.
    */
  var bgpPeers: js.UndefOr[BGPPeerList] = js.native
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
  /**
    * The customer router configuration.
    */
  var customerRouterConfig: js.UndefOr[RouterConfig] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.native
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.native
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.native
  /**
    * The ID of the AWS account that owns the virtual interface.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The AWS Region where the virtual interface is located.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
    */
  var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The tags associated with the virtual interface.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the virtual private gateway. Applies only to private virtual interfaces.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
  /**
    * The name of the virtual interface assigned by the customer network.
    */
  var virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.native
  /**
    * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.    unknown: The state of the virtual interface is not available.  
    */
  var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.native
  /**
    * The type of virtual interface. The possible values are private and public.
    */
  var virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.native
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.native
}

object VirtualInterface {
  @scala.inline
  def apply(): VirtualInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterface]
  }
  @scala.inline
  implicit class VirtualInterfaceOps[Self <: VirtualInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressFamily(value: AddressFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withAmazonAddress(value: AmazonAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withAmazonSideAsn(value: LongAsn): Self = {
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
    def withAsn(value: ASN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asn")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthKey(value: BGPAuthKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsDeviceV2(value: AwsDeviceV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDeviceV2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsDeviceV2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsDeviceV2")(js.undefined)
        ret
    }
    @scala.inline
    def withBgpPeers(value: BGPPeerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpPeers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeers")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: ConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerAddress(value: CustomerAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerRouterConfig(value: RouterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerRouterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerRouterConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerRouterConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnectGatewayId(value: DirectConnectGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withJumboFrameCapable(value: JumboFrameCapable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumboFrameCapable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJumboFrameCapable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumboFrameCapable")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: LocationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMtu(value: MTU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtu")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteFilterPrefixes(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeFilterPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteFilterPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeFilterPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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
    def withVirtualGatewayId(value: VirtualGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceId(value: VirtualInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceName(value: VirtualInterfaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceName")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceState(value: VirtualInterfaceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceState")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceType(value: VirtualInterfaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceType")(js.undefined)
        ret
    }
    @scala.inline
    def withVlan(value: VLAN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vlan")(js.undefined)
        ret
    }
  }
  
}

