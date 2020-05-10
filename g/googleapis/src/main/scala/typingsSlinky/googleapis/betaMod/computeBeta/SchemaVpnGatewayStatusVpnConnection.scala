package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VPN connection contains all VPN tunnels connected from this VpnGateway to
  * the same peer gateway. The peer gateway could either be a external VPN
  * gateway or GCP VPN gateway.
  */
@js.native
trait SchemaVpnGatewayStatusVpnConnection extends js.Object {
  /**
    * URL reference to the peer external VPN gateways to which the VPN tunnels
    * in this VPN connection are connected. This field is mutually exclusive
    * with peer_gcp_gateway.
    */
  var peerExternalGateway: js.UndefOr[String] = js.native
  /**
    * URL reference to the peer side VPN gateways to which the VPN tunnels in
    * this VPN connection are connected. This field is mutually exclusive with
    * peer_gcp_gateway.
    */
  var peerGcpGateway: js.UndefOr[String] = js.native
  /**
    * HighAvailabilityRequirementState for the VPN connection.
    */
  var state: js.UndefOr[SchemaVpnGatewayStatusHighAvailabilityRequirementState] = js.native
  /**
    * List of VPN tunnels that are in this VPN connection.
    */
  var tunnels: js.UndefOr[js.Array[SchemaVpnGatewayStatusTunnel]] = js.native
}

object SchemaVpnGatewayStatusVpnConnection {
  @scala.inline
  def apply(): SchemaVpnGatewayStatusVpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatusVpnConnection]
  }
  @scala.inline
  implicit class SchemaVpnGatewayStatusVpnConnectionOps[Self <: SchemaVpnGatewayStatusVpnConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeerExternalGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerExternalGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerExternalGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerExternalGateway")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerGcpGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerGcpGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerGcpGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerGcpGateway")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: SchemaVpnGatewayStatusHighAvailabilityRequirementState): Self = {
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
    def withTunnels(value: js.Array[SchemaVpnGatewayStatusTunnel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnels")(js.undefined)
        ret
    }
  }
  
}

