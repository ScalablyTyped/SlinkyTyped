package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworksAddPeeringRequest extends js.Object {
  /** Whether Google Compute Engine manages the routes automatically. */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not
    * contain project, it is assumed that the peer network is in the same project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.native
}

object NetworksAddPeeringRequest {
  @scala.inline
  def apply(): NetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksAddPeeringRequest]
  }
  @scala.inline
  implicit class NetworksAddPeeringRequestOps[Self <: NetworksAddPeeringRequest] (val x: Self) extends AnyVal {
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

