package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPAllocationPolicy extends js.Object {
  /** This field is deprecated, use cluster_ipv4_cidr_block. */
  var clusterIpv4Cidr: js.UndefOr[String] = js.native
  /**
    * The IP address range for the cluster pod IPs. If this field is set, then
    * `cluster.cluster_ipv4_cidr` must be left blank.
    *
    * This field is only applicable when `use_ip_aliases` is true.
    *
    * Set to blank to have a range chosen with the default size.
    *
    * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
    * netmask.
    *
    * Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use.
    */
  var clusterIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * The name of the secondary range to be used for the cluster CIDR
    * block.  The secondary range will be used for pod IP
    * addresses. This must be an existing secondary range associated
    * with the cluster subnetwork.
    *
    * This field is only applicable with use_ip_aliases is true and
    * create_subnetwork is false.
    */
  var clusterSecondaryRangeName: js.UndefOr[String] = js.native
  /**
    * Whether a new subnetwork will be created automatically for the cluster.
    *
    * This field is only applicable when `use_ip_aliases` is true.
    */
  var createSubnetwork: js.UndefOr[Boolean] = js.native
  /** This field is deprecated, use node_ipv4_cidr_block. */
  var nodeIpv4Cidr: js.UndefOr[String] = js.native
  /**
    * The IP address range of the instance IPs in this cluster.
    *
    * This is applicable only if `create_subnetwork` is true.
    *
    * Set to blank to have a range chosen with the default size.
    *
    * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
    * netmask.
    *
    * Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use.
    */
  var nodeIpv4CidrBlock: js.UndefOr[String] = js.native
  /** This field is deprecated, use services_ipv4_cidr_block. */
  var servicesIpv4Cidr: js.UndefOr[String] = js.native
  /**
    * The IP address range of the services IPs in this cluster. If blank, a range
    * will be automatically chosen with the default size.
    *
    * This field is only applicable when `use_ip_aliases` is true.
    *
    * Set to blank to have a range chosen with the default size.
    *
    * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
    * netmask.
    *
    * Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
    * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
    * to use.
    */
  var servicesIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * The name of the secondary range to be used as for the services
    * CIDR block.  The secondary range will be used for service
    * ClusterIPs. This must be an existing secondary range associated
    * with the cluster subnetwork.
    *
    * This field is only applicable with use_ip_aliases is true and
    * create_subnetwork is false.
    */
  var servicesSecondaryRangeName: js.UndefOr[String] = js.native
  /**
    * A custom subnetwork name to be used if `create_subnetwork` is true.  If
    * this field is empty, then an automatic name will be chosen for the new
    * subnetwork.
    */
  var subnetworkName: js.UndefOr[String] = js.native
  /** Whether alias IPs will be used for pod IPs in the cluster. */
  var useIpAliases: js.UndefOr[Boolean] = js.native
}

object IPAllocationPolicy {
  @scala.inline
  def apply(): IPAllocationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPAllocationPolicy]
  }
  @scala.inline
  implicit class IPAllocationPolicyOps[Self <: IPAllocationPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIpv4Cidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIpv4Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterIpv4Cidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIpv4Cidr")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterIpv4CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIpv4CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterIpv4CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIpv4CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSecondaryRangeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSecondaryRangeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSecondaryRangeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSecondaryRangeName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSubnetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSubnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSubnetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIpv4Cidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIpv4Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIpv4Cidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIpv4Cidr")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIpv4CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIpv4CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIpv4CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIpv4CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withServicesIpv4Cidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicesIpv4Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicesIpv4Cidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicesIpv4Cidr")(js.undefined)
        ret
    }
    @scala.inline
    def withServicesIpv4CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicesIpv4CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicesIpv4CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicesIpv4CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withServicesSecondaryRangeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicesSecondaryRangeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicesSecondaryRangeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicesSecondaryRangeName")(js.undefined)
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
    @scala.inline
    def withUseIpAliases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIpAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIpAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIpAliases")(js.undefined)
        ret
    }
  }
  
}

