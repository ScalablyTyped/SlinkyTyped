package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A network peering attached to a network resource. The message includes the
  * peering name, peer network, peering state, and a flag indicating whether
  * Google Compute Engine should automatically create routes for the peering.
  */
@js.native
trait SchemaNetworkPeering extends js.Object {
  /**
    * Whether Cloud Routers in this network can automatically advertise subnets
    * from the peer network.
    */
  var advertisePeerSubnetsViaRouters: js.UndefOr[Boolean] = js.native
  /**
    * This field will be deprecated soon. Prefer using exchange_subnet_routes
    * instead. Indicates whether full mesh connectivity is created and managed
    * automatically. When it is set to true, Google Compute Engine will
    * automatically create and manage the routes between two networks when the
    * state is ACTIVE. Otherwise, user needs to create routes manually to route
    * packets to peer network.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Whether full mesh connectivity is created and managed automatically. When
    * it is set to true, Google Compute Engine will automatically create and
    * manage the routes between two networks when the peering state is ACTIVE.
    * Otherwise, user needs to create routes manually to route packets to peer
    * network.
    */
  var exchangeSubnetRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Whether to export the custom routes to peer network.
    */
  var exportCustomRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Whether subnet routes with public IP range are exported. The default
    * value is true, all subnet routes are exported. The IPv4 special-use
    * ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always
    * exported to peers and are not controlled by this field.
    */
  var exportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  /**
    * Whether to import the custom routes from peer network.
    */
  var importCustomRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Whether subnet routes with public IP range are imported. The default
    * value is false. The IPv4 special-use ranges
    * (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always
    * imported from peers and are not controlled by this field.
    */
  var importSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  /**
    * Name of this peering. Provided by the client when the peering is created.
    * The name must comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
    * which means the first character must be a lowercase letter, and all the
    * following characters must be a dash, lowercase letter, or digit, except
    * the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the peer network. It can be either full URL or partial URL.
    * The peer network may belong to a different project. If the partial URL
    * does not contain project, it is assumed that the peer network is in the
    * same project as the current network.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * [Output Only] State for the peering.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * [Output Only] Details about the current state of the peering.
    */
  var stateDetails: js.UndefOr[String] = js.native
}

object SchemaNetworkPeering {
  @scala.inline
  def apply(): SchemaNetworkPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPeering]
  }
  @scala.inline
  implicit class SchemaNetworkPeeringOps[Self <: SchemaNetworkPeering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisePeerSubnetsViaRouters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisePeerSubnetsViaRouters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisePeerSubnetsViaRouters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisePeerSubnetsViaRouters")(js.undefined)
        ret
    }
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
    def withExchangeSubnetRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeSubnetRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeSubnetRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeSubnetRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withExportCustomRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCustomRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportCustomRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCustomRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSubnetRoutesWithPublicIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSubnetRoutesWithPublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSubnetRoutesWithPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSubnetRoutesWithPublicIp")(js.undefined)
        ret
    }
    @scala.inline
    def withImportCustomRoutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importCustomRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportCustomRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importCustomRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withImportSubnetRoutesWithPublicIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSubnetRoutesWithPublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportSubnetRoutesWithPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSubnetRoutesWithPublicIp")(js.undefined)
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

