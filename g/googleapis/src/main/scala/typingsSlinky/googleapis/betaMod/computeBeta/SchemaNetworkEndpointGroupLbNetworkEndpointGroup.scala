package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Load balancing specific fields for network endpoint group.
  */
@js.native
trait SchemaNetworkEndpointGroupLbNetworkEndpointGroup extends js.Object {
  /**
    * The default port used if the port number is not specified in the network
    * endpoint. [Deprecated] This field is deprecated.
    */
  var defaultPort: js.UndefOr[Double] = js.native
  /**
    * The URL of the network to which all network endpoints in the NEG belong.
    * Uses &quot;default&quot; project network if unspecified. [Deprecated]
    * This field is deprecated.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Optional URL of the subnetwork to which all network endpoints in the NEG
    * belong. [Deprecated] This field is deprecated.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL of the zone where the network endpoint group is
    * located. [Deprecated] This field is deprecated.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaNetworkEndpointGroupLbNetworkEndpointGroup {
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupLbNetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupLbNetworkEndpointGroup]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointGroupLbNetworkEndpointGroupOps[Self <: SchemaNetworkEndpointGroupLbNetworkEndpointGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPort")(js.undefined)
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
    def withSubnetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

