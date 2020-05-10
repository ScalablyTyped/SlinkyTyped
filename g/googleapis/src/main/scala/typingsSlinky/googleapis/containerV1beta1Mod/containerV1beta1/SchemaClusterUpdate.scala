package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterUpdate describes an update to the cluster. Exactly one update can be
  * applied to a cluster with each request, so at most one field can be
  * provided.
  */
@js.native
trait SchemaClusterUpdate extends js.Object {
  /**
    * Configurations for the various addons available to run in the cluster.
    */
  var desiredAddonsConfig: js.UndefOr[SchemaAddonsConfig] = js.native
  /**
    * The desired configuration options for the Binary Authorization feature.
    */
  var desiredBinaryAuthorization: js.UndefOr[SchemaBinaryAuthorization] = js.native
  /**
    * Cluster-level autoscaling configuration.
    */
  var desiredClusterAutoscaling: js.UndefOr[SchemaClusterAutoscaling] = js.native
  /**
    * Configuration of etcd encryption.
    */
  var desiredDatabaseEncryption: js.UndefOr[SchemaDatabaseEncryption] = js.native
  /**
    * The desired image type for the node pool. NOTE: Set the
    * &quot;desired_node_pool&quot; field as well.
    */
  var desiredImageType: js.UndefOr[String] = js.native
  /**
    * The desired config of Intra-node visibility.
    */
  var desiredIntraNodeVisibilityConfig: js.UndefOr[SchemaIntraNodeVisibilityConfig] = js.native
  /**
    * The desired list of Google Compute Engine
    * [zones](/compute/docs/zones#available) in which the cluster&#39;s nodes
    * should be located. Changing the locations a cluster is in will result in
    * nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.  This list must always
    * include the cluster&#39;s primary zone.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The logging service the cluster should use to write metrics. Currently
    * available options:  * &quot;logging.googleapis.com/kubernetes&quot; - the
    * Google Cloud Logging service with Kubernetes-native resource model in
    * Stackdriver * &quot;logging.googleapis.com&quot; - the Google Cloud
    * Logging service * &quot;none&quot; - no logs will be exported from the
    * cluster
    */
  var desiredLoggingService: js.UndefOr[String] = js.native
  /**
    * The desired configuration options for master authorized networks feature.
    */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[SchemaMasterAuthorizedNetworksConfig] = js.native
  /**
    * The Kubernetes version to change the master to. The only valid value is
    * the latest supported version.  Users may specify either explicit versions
    * offered by Kubernetes Engine or version aliases, which have the following
    * behavior:  - &quot;latest&quot;: picks the highest valid Kubernetes
    * version - &quot;1.X&quot;: picks the highest valid patch+gke.N patch in
    * the 1.X version - &quot;1.X.Y&quot;: picks the highest valid gke.N patch
    * in the 1.X.Y version - &quot;1.X.Y-gke.N&quot;: picks an explicit
    * Kubernetes version - &quot;-&quot;: picks the default Kubernetes version
    */
  var desiredMasterVersion: js.UndefOr[String] = js.native
  /**
    * The monitoring service the cluster should use to write metrics. Currently
    * available options:  * &quot;monitoring.googleapis.com/kubernetes&quot; -
    * the Google Cloud Monitoring service with Kubernetes-native resource model
    * in Stackdriver * &quot;monitoring.googleapis.com&quot; - the Google Cloud
    * Monitoring service * &quot;none&quot; - no metrics will be exported from
    * the cluster
    */
  var desiredMonitoringService: js.UndefOr[String] = js.native
  /**
    * Autoscaler configuration for the node pool specified in
    * desired_node_pool_id. If there is only one pool in the cluster and
    * desired_node_pool_id is not provided then the change applies to that
    * single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.native
  /**
    * The node pool to be upgraded. This field is mandatory if
    * &quot;desired_node_version&quot;, &quot;desired_image_family&quot; or
    * &quot;desired_node_pool_autoscaling&quot; is specified and there is more
    * than one node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an upgrade).
    * Users may specify either explicit versions offered by Kubernetes Engine
    * or version aliases, which have the following behavior:  -
    * &quot;latest&quot;: picks the highest valid Kubernetes version -
    * &quot;1.X&quot;: picks the highest valid patch+gke.N patch in the 1.X
    * version - &quot;1.X.Y&quot;: picks the highest valid gke.N patch in
    * the 1.X.Y version - &quot;1.X.Y-gke.N&quot;: picks an explicit Kubernetes
    * version - &quot;-&quot;: picks the Kubernetes master version
    */
  var desiredNodeVersion: js.UndefOr[String] = js.native
  /**
    * The desired configuration options for the PodSecurityPolicy feature.
    */
  var desiredPodSecurityPolicyConfig: js.UndefOr[SchemaPodSecurityPolicyConfig] = js.native
  /**
    * The desired configuration for exporting resource usage.
    */
  var desiredResourceUsageExportConfig: js.UndefOr[SchemaResourceUsageExportConfig] = js.native
  /**
    * Cluster-level Vertical Pod Autoscaling configuration.
    */
  var desiredVerticalPodAutoscaling: js.UndefOr[SchemaVerticalPodAutoscaling] = js.native
}

object SchemaClusterUpdate {
  @scala.inline
  def apply(): SchemaClusterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterUpdate]
  }
  @scala.inline
  implicit class SchemaClusterUpdateOps[Self <: SchemaClusterUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredAddonsConfig(value: SchemaAddonsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredAddonsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredAddonsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredAddonsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredBinaryAuthorization(value: SchemaBinaryAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredBinaryAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredBinaryAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredBinaryAuthorization")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredClusterAutoscaling(value: SchemaClusterAutoscaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredClusterAutoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredClusterAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredClusterAutoscaling")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredDatabaseEncryption(value: SchemaDatabaseEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredDatabaseEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredDatabaseEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredDatabaseEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredImageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredImageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredImageType")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredIntraNodeVisibilityConfig(value: SchemaIntraNodeVisibilityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredIntraNodeVisibilityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredIntraNodeVisibilityConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredIntraNodeVisibilityConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredLocations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredLoggingService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredLoggingService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredLoggingService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredLoggingService")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredMasterAuthorizedNetworksConfig(value: SchemaMasterAuthorizedNetworksConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredMasterAuthorizedNetworksConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredMasterAuthorizedNetworksConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredMasterAuthorizedNetworksConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredMasterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredMasterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredMasterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredMasterVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredMonitoringService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredMonitoringService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredMonitoringService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredMonitoringService")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredNodePoolAutoscaling(value: SchemaNodePoolAutoscaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNodePoolAutoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredNodePoolAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNodePoolAutoscaling")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredNodePoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNodePoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredNodePoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNodePoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredNodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredNodeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNodeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredPodSecurityPolicyConfig(value: SchemaPodSecurityPolicyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredPodSecurityPolicyConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredPodSecurityPolicyConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredPodSecurityPolicyConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredResourceUsageExportConfig(value: SchemaResourceUsageExportConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredResourceUsageExportConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredResourceUsageExportConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredResourceUsageExportConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredVerticalPodAutoscaling(value: SchemaVerticalPodAutoscaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredVerticalPodAutoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredVerticalPodAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredVerticalPodAutoscaling")(js.undefined)
        ret
    }
  }
  
}

