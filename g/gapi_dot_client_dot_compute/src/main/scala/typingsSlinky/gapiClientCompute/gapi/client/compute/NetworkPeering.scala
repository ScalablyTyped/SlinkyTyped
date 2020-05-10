package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkPeering extends js.Object {
  /**
    * Whether full mesh connectivity is created and managed automatically. When it is set to true, Google Compute Engine will automatically create and manage
    * the routes between two networks when the state is ACTIVE. Otherwise, user needs to create routes manually to route packets to peer network.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be a lowercase letter, and all the
    * following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not
    * contain project, it is assumed that the peer network is in the same project as the current network.
    */
  var network: js.UndefOr[String] = js.native
  /** [Output Only] State for the peering. */
  var state: js.UndefOr[String] = js.native
  /** [Output Only] Details about the current state of the peering. */
  var stateDetails: js.UndefOr[String] = js.native
}

object NetworkPeering {
  @scala.inline
  def apply(): NetworkPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPeering]
  }
  @scala.inline
  implicit class NetworkPeeringOps[Self <: NetworkPeering] (val x: Self) extends AnyVal {
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
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
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
    def withStateDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDetails")(js.undefined)
        ret
    }
  }
  
}

