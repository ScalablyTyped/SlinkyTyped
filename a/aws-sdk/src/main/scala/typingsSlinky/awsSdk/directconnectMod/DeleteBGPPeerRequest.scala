package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBGPPeerRequest extends js.Object {
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: js.UndefOr[ASN] = js.native
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.native
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
}

object DeleteBGPPeerRequest {
  @scala.inline
  def apply(): DeleteBGPPeerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBGPPeerRequest]
  }
  @scala.inline
  implicit class DeleteBGPPeerRequestOps[Self <: DeleteBGPPeerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBgpPeerId(value: BGPPeerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpPeerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerId")(js.undefined)
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
  }
  
}

