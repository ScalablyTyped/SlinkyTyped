package typingsSlinky.gapiClientContainer.gapi.client.container

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /** Configurations for the various addons available to run in the cluster. */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.native
  /**
    * The IP address range of the container pods in this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`). Leave blank to have
    * one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
    */
  var clusterIpv4Cidr: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the cluster was created, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var createTime: js.UndefOr[String] = js.native
  /** [Output only] The current software version of the master endpoint. */
  var currentMasterVersion: js.UndefOr[String] = js.native
  /** [Output only] The number of nodes currently in the cluster. */
  var currentNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The current version of the node software components.
    * If they are currently at multiple versions because they're in the process
    * of being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[String] = js.native
  /** An optional description of this cluster. */
  var description: js.UndefOr[String] = js.native
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes alpha
    * API groups (e.g. v1alpha1) and features that may not be production ready in
    * the kubernetes version of the master and nodes.
    * The cluster has no SLA for uptime and master/node upgrades are disabled.
    * Alpha enabled clusters are automatically deleted thirty days after
    * creation.
    */
  var enableKubernetesAlpha: js.UndefOr[Boolean] = js.native
  /**
    * [Output only] The IP address of this cluster's master endpoint.
    * The endpoint can be accessed from the internet at
    * `https://username:password@endpoint/`.
    *
    * See the `masterAuth` property of this resource for username and
    * password information.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the cluster will be automatically
    * deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * The initial Kubernetes version for this cluster.  Valid versions are those
    * found in validMasterVersions returned by getServerConfig.  The version can
    * be upgraded over time; such upgrades are reflected in
    * currentMasterVersion and currentNodeVersion.
    */
  var initialClusterVersion: js.UndefOr[String] = js.native
  /**
    * The number of nodes to create in this cluster. You must ensure that your
    * Compute Engine <a href="/compute/docs/resource-quotas">resource quota</a>
    * is sufficient for this number of instances. You must also have available
    * firewall and routes quota.
    * For requests, this field should only be used in lieu of a
    * "node_pool" object, since this configuration (along with the
    * "node_config") will be used to create a "NodePool" object with an
    * auto-generated name. Do not use this and a node_pool at the same time.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The resource URLs of [instance
    * groups](/compute/docs/instance-groups/) associated with this
    * cluster.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  /** Configuration for cluster IP allocation. */
  var ipAllocationPolicy: js.UndefOr[IPAllocationPolicy] = js.native
  /** The fingerprint of the set of labels for this cluster. */
  var labelFingerprint: js.UndefOr[String] = js.native
  /** Configuration for the legacy ABAC authorization mode. */
  var legacyAbac: js.UndefOr[LegacyAbac] = js.native
  /**
    * The list of Google Compute Engine
    * [locations](/compute/docs/zones#available) in which the cluster's nodes
    * should be located.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The logging service the cluster should use to write logs.
    * Currently available options:
    *
    * &#42; `logging.googleapis.com` - the Google Cloud Logging service.
    * &#42; `none` - no logs will be exported from the cluster.
    * &#42; if left as an empty string,`logging.googleapis.com` will be used.
    */
  var loggingService: js.UndefOr[String] = js.native
  /** Configure the maintenance policy for this cluster. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.native
  /** The authentication information for accessing the master endpoint. */
  var masterAuth: js.UndefOr[MasterAuth] = js.native
  /**
    * Master authorized networks is a Beta feature.
    * The configuration options for master authorized networks feature.
    */
  var masterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.native
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; `monitoring.googleapis.com` - the Google Cloud Monitoring service.
    * &#42; `none` - no metrics will be exported from the cluster.
    * &#42; if left as an empty string, `monitoring.googleapis.com` will be used.
    */
  var monitoringService: js.UndefOr[String] = js.native
  /**
    * The name of this cluster. The name must be unique within this project
    * and zone, and can be up to 40 characters with the following restrictions:
    *
    * &#42; Lowercase letters, numbers, and hyphens only.
    * &#42; Must start with a letter.
    * &#42; Must end with a number or a letter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [network](/compute/docs/networks-and-firewalls#networks) to which the
    * cluster is connected. If left unspecified, the `default` network
    * will be used.
    */
  var network: js.UndefOr[String] = js.native
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.native
  /**
    * Parameters used in creating the cluster's nodes.
    * See `nodeConfig` for the description of its properties.
    * For requests, this field should only be used in lieu of a
    * "node_pool" object, since this configuration (along with the
    * "initial_node_count") will be used to create a "NodePool" object with an
    * auto-generated name. Do not use this and a node_pool at the same time.
    * For responses, this field will be populated with the node configuration of
    * the first node pool.
    *
    * If unspecified, the defaults are used.
    */
  var nodeConfig: js.UndefOr[NodeConfig] = js.native
  /**
    * [Output only] The size of the address space on each node for hosting
    * containers. This is provisioned from within the `container_ipv4_cidr`
    * range.
    */
  var nodeIpv4CidrSize: js.UndefOr[Double] = js.native
  /**
    * The node pools associated with this cluster.
    * This field should not be set if "node_config" or "initial_node_count" are
    * specified.
    */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.native
  /**
    * The resource labels for the cluster to use to annotate any related
    * Google Compute Engine resources.
    */
  var resourceLabels: js.UndefOr[Record[String, String]] = js.native
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output only] The IP address range of the Kubernetes services in
    * this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `1.2.3.4/29`). Service addresses are
    * typically put in the last `/16` from the container CIDR.
    */
  var servicesIpv4Cidr: js.UndefOr[String] = js.native
  /** [Output only] The current status of this cluster. */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output only] Additional information about the current status of this
    * cluster, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [subnetwork](/compute/docs/subnetworks) to which the
    * cluster is connected.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster
    * resides.
    */
  var zone: js.UndefOr[String] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddonsConfig(value: AddonsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddonsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonsConfig")(js.undefined)
        ret
    }
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
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentMasterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMasterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMasterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMasterVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNodeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentNodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentNodeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNodeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKubernetesAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKubernetesAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKubernetesAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKubernetesAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withExpireTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialClusterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialClusterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialClusterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialClusterVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNodeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroupUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroupUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroupUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroupUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAllocationPolicy(value: IPAllocationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAllocationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAllocationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAllocationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyAbac(value: LegacyAbac): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyAbac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyAbac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyAbac")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingService")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenancePolicy(value: MaintenancePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenancePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenancePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenancePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterAuth(value: MasterAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAuthorizedNetworksConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterAuthorizedNetworksConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAuthorizedNetworksConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringService")(js.undefined)
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
    def withNetworkPolicy(value: NetworkPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeConfig(value: NodeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIpv4CidrSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIpv4CidrSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIpv4CidrSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIpv4CidrSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePools(value: js.Array[NodePool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePools")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
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

