package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains some information about a VPN tunnel.
  */
@js.native
trait SchemaVpnGatewayStatusTunnel extends js.Object {
  /**
    * The VPN gateway interface this VPN tunnel is associated with.
    */
  var localGatewayInterface: js.UndefOr[Double] = js.native
  /**
    * The peer gateway interface this VPN tunnel is connected to, the peer
    * gateway could either be an external VPN gateway or GCP VPN gateway.
    */
  var peerGatewayInterface: js.UndefOr[Double] = js.native
  /**
    * URL reference to the VPN tunnel.
    */
  var tunnelUrl: js.UndefOr[String] = js.native
}

object SchemaVpnGatewayStatusTunnel {
  @scala.inline
  def apply(): SchemaVpnGatewayStatusTunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatusTunnel]
  }
  @scala.inline
  implicit class SchemaVpnGatewayStatusTunnelOps[Self <: SchemaVpnGatewayStatusTunnel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalGatewayInterface(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localGatewayInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localGatewayInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerGatewayInterface(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerGatewayInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerGatewayInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerGatewayInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnelUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnelUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelUrl")(js.undefined)
        ret
    }
  }
  
}

