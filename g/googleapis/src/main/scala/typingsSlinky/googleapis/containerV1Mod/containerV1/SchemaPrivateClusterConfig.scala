package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for private clusters.
  */
@js.native
trait SchemaPrivateClusterConfig extends js.Object {
  /**
    * Whether the master&#39;s internal IP address is used as the cluster
    * endpoint.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes have internal IP addresses only. If enabled, all nodes are
    * given only RFC 1918 private addresses and communicate with the master via
    * private networking.
    */
  var enablePrivateNodes: js.UndefOr[Boolean] = js.native
  /**
    * The IP range in CIDR notation to use for the hosted master network. This
    * range will be used for assigning internal IP addresses to the master or
    * set of masters, as well as the ILB VIP. This range must not overlap with
    * any other ranges in use within the cluster&#39;s network.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * Output only. The internal IP address of this cluster&#39;s master
    * endpoint.
    */
  var privateEndpoint: js.UndefOr[String] = js.native
  /**
    * Output only. The external IP address of this cluster&#39;s master
    * endpoint.
    */
  var publicEndpoint: js.UndefOr[String] = js.native
}

object SchemaPrivateClusterConfig {
  @scala.inline
  def apply(): SchemaPrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateClusterConfig]
  }
  @scala.inline
  implicit class SchemaPrivateClusterConfigOps[Self <: SchemaPrivateClusterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnablePrivateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePrivateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePrivateNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePrivateNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterIpv4CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterIpv4CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterIpv4CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterIpv4CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicEndpoint")(js.undefined)
        ret
    }
  }
  
}

