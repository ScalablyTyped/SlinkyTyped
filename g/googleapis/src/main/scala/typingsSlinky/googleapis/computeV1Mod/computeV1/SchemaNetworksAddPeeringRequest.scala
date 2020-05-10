package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworksAddPeeringRequest extends js.Object {
  /**
    * This field will be deprecated soon. Prefer using exchange_subnet_routes
    * in network_peering instead. Whether Google Compute Engine manages the
    * routes automatically.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Network peering parameters. In order to specify route policies for
    * peering using import/export custom routes, you will have to fill all
    * peering related parameters (name, peer network, exchange_subnet_routes)
    * in network_peeringfield. Corresponding fields in
    * NetworksAddPeeringRequest will be deprecated soon.
    */
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.native
  /**
    * URL of the peer network. It can be either full URL or partial URL. The
    * peer network may belong to a different project. If the partial URL does
    * not contain project, it is assumed that the peer network is in the same
    * project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.native
}

object SchemaNetworksAddPeeringRequest {
  @scala.inline
  def apply(): SchemaNetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksAddPeeringRequest]
  }
  @scala.inline
  implicit class SchemaNetworksAddPeeringRequestOps[Self <: SchemaNetworksAddPeeringRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreateRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreateRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreateRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreateRoutes")(js.undefined)
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
    def withNetworkPeering(value: SchemaNetworkPeering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPeering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPeering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPeering")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerNetwork")(js.undefined)
        ret
    }
  }
  
}

