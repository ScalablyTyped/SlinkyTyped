package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterStatusBgpPeerStatus extends js.Object {
  /**
    * Routes that were advertised to the remote BGP peer
    */
  var advertisedRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.native
  /**
    * IP address of the local BGP interface.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * URL of the VPN tunnel that this BGP peer controls.
    */
  var linkedVpnTunnel: js.UndefOr[String] = js.native
  /**
    * Name of this BGP peer. Unique within the Routers resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of routes learned from the remote BGP Peer.
    */
  var numLearnedRoutes: js.UndefOr[Double] = js.native
  /**
    * IP address of the remote BGP interface.
    */
  var peerIpAddress: js.UndefOr[String] = js.native
  /**
    * BGP state as specified in RFC1771.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Status of the BGP peer: {UP, DOWN}
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23
    * hours, 59 minutes, 59 seconds
    */
  var uptime: js.UndefOr[String] = js.native
  /**
    * Time this session has been up, in seconds. Format: 145
    */
  var uptimeSeconds: js.UndefOr[String] = js.native
}

object SchemaRouterStatusBgpPeerStatus {
  @scala.inline
  def apply(): SchemaRouterStatusBgpPeerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusBgpPeerStatus]
  }
  @scala.inline
  implicit class SchemaRouterStatusBgpPeerStatusOps[Self <: SchemaRouterStatusBgpPeerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisedRoutes(value: js.Array[SchemaRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedRoutes")(js.undefined)
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
    def withLinkedVpnTunnel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedVpnTunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedVpnTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedVpnTunnel")(js.undefined)
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
    def withNumLearnedRoutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numLearnedRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumLearnedRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numLearnedRoutes")(js.undefined)
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
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUptime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUptime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptime")(js.undefined)
        ret
    }
    @scala.inline
    def withUptimeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUptimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptimeSeconds")(js.undefined)
        ret
    }
  }
  
}

