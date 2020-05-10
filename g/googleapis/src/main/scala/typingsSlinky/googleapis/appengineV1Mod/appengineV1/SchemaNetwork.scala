package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extra network settings. Only applicable in the App Engine flexible
  * environment.
  */
@js.native
trait SchemaNetwork extends js.Object {
  /**
    * List of ports, or port pairs, to forward from the virtual machine to the
    * application container. Only applicable in the App Engine flexible
    * environment.
    */
  var forwardedPorts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tag to apply to the instance during creation. Only applicable in the App
    * Engine flexible environment.
    */
  var instanceTag: js.UndefOr[String] = js.native
  /**
    * Google Compute Engine network where the virtual machines are created.
    * Specify the short name, not the resource path.Defaults to default.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Enable session affinity. Only applicable in the App Engine flexible
    * environment.
    */
  var sessionAffinity: js.UndefOr[Boolean] = js.native
  /**
    * Google Cloud Platform sub-network where the virtual machines are created.
    * Specify the short name, not the resource path.If a subnetwork name is
    * specified, a network name will also be required unless it is for the
    * default network. If the network that the instance is being created in is
    * a Legacy network, then the IP address is allocated from the IPv4Range. If
    * the network that the instance is being created in is an auto Subnet Mode
    * Network, then only network name should be specified (not the
    * subnetwork_name) and the IP address is created from the IPCidrRange of
    * the subnetwork that exists in that zone for that network. If the network
    * that the instance is being created in is a custom Subnet Mode Network,
    * then the subnetwork_name must be specified and the IP address is created
    * from the IPCidrRange of the subnetwork.If specified, the subnetwork must
    * exist in the same region as the App Engine flexible environment
    * application.
    */
  var subnetworkName: js.UndefOr[String] = js.native
}

object SchemaNetwork {
  @scala.inline
  def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  @scala.inline
  implicit class SchemaNetworkOps[Self <: SchemaNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardedPorts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTag")(js.undefined)
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
    def withSessionAffinity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAffinity")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetworkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetworkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkName")(js.undefined)
        ret
    }
  }
  
}

