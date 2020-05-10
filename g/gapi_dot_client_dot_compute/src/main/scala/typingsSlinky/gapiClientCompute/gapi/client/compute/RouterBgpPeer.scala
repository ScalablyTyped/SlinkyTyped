package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterBgpPeer extends js.Object {
  /**
    * The priority of routes advertised to this BGP peer. In the case where there is more than one matching route of maximum length, the routes with lowest
    * priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[Double] = js.native
  /** Name of the interface the BGP peer is associated with. */
  var interfaceName: js.UndefOr[String] = js.native
  /** IP address of the interface inside Google Cloud Platform. Only IPv4 is supported. */
  var ipAddress: js.UndefOr[String] = js.native
  /** Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[String] = js.native
  /** Peer BGP Autonomous System Number (ASN). For VPN use case, this value can be different for every tunnel. */
  var peerAsn: js.UndefOr[Double] = js.native
  /** IP address of the BGP interface outside Google cloud. Only IPv4 is supported. */
  var peerIpAddress: js.UndefOr[String] = js.native
}

object RouterBgpPeer {
  @scala.inline
  def apply(): RouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterBgpPeer]
  }
  @scala.inline
  implicit class RouterBgpPeerOps[Self <: RouterBgpPeer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisedRoutePriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedRoutePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedRoutePriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedRoutePriority")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerAsn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIpAddress")(js.undefined)
        ret
    }
  }
  
}

