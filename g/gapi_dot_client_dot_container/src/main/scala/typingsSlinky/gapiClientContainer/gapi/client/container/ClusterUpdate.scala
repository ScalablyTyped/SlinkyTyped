package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterUpdate extends js.Object {
  /** Configurations for the various addons available to run in the cluster. */
  var desiredAddonsConfig: js.UndefOr[AddonsConfig] = js.native
  /**
    * The desired image type for the node pool.
    * NOTE: Set the "desired_node_pool" field as well.
    */
  var desiredImageType: js.UndefOr[String] = js.native
  /**
    * The desired list of Google Compute Engine
    * [locations](/compute/docs/zones#available) in which the cluster's nodes
    * should be located. Changing the locations a cluster is in will result
    * in nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.
    *
    * This list must always include the cluster's primary zone.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Master authorized networks is a Beta feature.
    * The desired configuration options for master authorized networks feature.
    */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.native
  /**
    * The Kubernetes version to change the master to. The only valid value is the
    * latest supported version. Use "-" to have the server automatically select
    * the latest version.
    */
  var desiredMasterVersion: js.UndefOr[String] = js.native
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; "monitoring.googleapis.com" - the Google Cloud Monitoring service
    * &#42; "none" - no metrics will be exported from the cluster
    */
  var desiredMonitoringService: js.UndefOr[String] = js.native
  /**
    * Autoscaler configuration for the node pool specified in
    * desired_node_pool_id. If there is only one pool in the
    * cluster and desired_node_pool_id is not provided then
    * the change applies to that single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
  /**
    * The node pool to be upgraded. This field is mandatory if
    * "desired_node_version", "desired_image_family" or
    * "desired_node_pool_autoscaling" is specified and there is more than one
    * node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an
    * upgrade). Use `-` to upgrade to the latest version supported by
    * the server.
    */
  var desiredNodeVersion: js.UndefOr[String] = js.native
}

object ClusterUpdate {
  @scala.inline
  def apply(): ClusterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterUpdate]
  }
  @scala.inline
  implicit class ClusterUpdateOps[Self <: ClusterUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredAddonsConfig(value: AddonsConfig): Self = {
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
    def withDesiredMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = {
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
    def withDesiredNodePoolAutoscaling(value: NodePoolAutoscaling): Self = {
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
  }
  
}

