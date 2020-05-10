package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayVirtualInterface extends js.Object {
  /**
    * The local address.
    */
  var LocalAddress: js.UndefOr[String] = js.native
  /**
    * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
    */
  var LocalBgpAsn: js.UndefOr[Integer] = js.native
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual interface.
    */
  var LocalGatewayVirtualInterfaceId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceId] = js.native
  /**
    * The peer address.
    */
  var PeerAddress: js.UndefOr[String] = js.native
  /**
    * The peer BGP ASN.
    */
  var PeerBgpAsn: js.UndefOr[Integer] = js.native
  /**
    * The tags assigned to the virtual interface.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VLAN.
    */
  var Vlan: js.UndefOr[Integer] = js.native
}

object LocalGatewayVirtualInterface {
  @scala.inline
  def apply(): LocalGatewayVirtualInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayVirtualInterface]
  }
  @scala.inline
  implicit class LocalGatewayVirtualInterfaceOps[Self <: LocalGatewayVirtualInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalBgpAsn(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalBgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalBgpAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalBgpAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayVirtualInterfaceId(value: LocalGatewayVirtualInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayVirtualInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayVirtualInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayVirtualInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerBgpAsn(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerBgpAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerBgpAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerBgpAsn")(js.undefined)
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
    def withVlan(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vlan")(js.undefined)
        ret
    }
  }
  
}

