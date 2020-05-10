package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BGPPeer extends js.Object {
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.native
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  var asn: js.UndefOr[ASN] = js.native
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.native
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.native
  /**
    * The ID of the BGP peer.
    */
  var bgpPeerId: js.UndefOr[BGPPeerId] = js.native
  /**
    * The state of the BGP peer. The following are the possible values:    verifying: The BGP peering addresses or ASN require validation before the BGP peer can be created. This state applies only to public virtual interfaces.    pending: The BGP peer is created, and remains in this state until it is ready to be established.    available: The BGP peer is ready to be established.    deleting: The BGP peer is being deleted.    deleted: The BGP peer is deleted and cannot be established.  
    */
  var bgpPeerState: js.UndefOr[BGPPeerState] = js.native
  /**
    * The status of the BGP peer. The following are the possible values:    up: The BGP peer is established. This state does not indicate the state of the routing function. Ensure that you are receiving routes over the BGP session.    down: The BGP peer is down.    unknown: The BGP peer status is not available.  
    */
  var bgpStatus: js.UndefOr[BGPStatus] = js.native
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
}

object BGPPeer {
  @scala.inline
  def apply(): BGPPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BGPPeer]
  }
  @scala.inline
  implicit class BGPPeerOps[Self <: BGPPeer] (val x: Self) extends AnyVal {
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
    def withBgpPeerState(value: BGPPeerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpPeerState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpPeerState")(js.undefined)
        ret
    }
    @scala.inline
    def withBgpStatus(value: BGPStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgpStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgpStatus")(js.undefined)
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
  }
  
}

