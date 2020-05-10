package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkConfig reports the relative names of network &amp; subnetwork.
  */
@js.native
trait SchemaNetworkConfig extends js.Object {
  /**
    * Whether Intra-node visibility is enabled for this cluster. This makes
    * same node pod to pod traffic visible for VPC network.
    */
  var enableIntraNodeVisibility: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The relative name of the Google Compute Engine
    * network(/compute/docs/networks-and-firewalls#networks) to which the
    * cluster is connected. Example:
    * projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Output only. The relative name of the Google Compute Engine
    * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
    * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.native
}

object SchemaNetworkConfig {
  @scala.inline
  def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  @scala.inline
  implicit class SchemaNetworkConfigOps[Self <: SchemaNetworkConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableIntraNodeVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIntraNodeVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableIntraNodeVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIntraNodeVisibility")(js.undefined)
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
  }
  
}

