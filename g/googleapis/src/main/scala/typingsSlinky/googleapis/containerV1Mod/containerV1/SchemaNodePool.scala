package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodePool contains the name and configuration for a cluster&#39;s node pool.
  * Node pools are a set of nodes (i.e. VM&#39;s), with a common configuration
  * and specification, under the control of the cluster master. They may have a
  * set of Kubernetes labels applied to them, which may be used to reference
  * them during pod scheduling. They may also be resized up or down, to
  * accommodate the workload.
  */
@js.native
trait SchemaNodePool extends js.Object {
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled only if
    * a valid configuration is present.
    */
  var autoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.native
  /**
    * Which conditions caused the current node pool state.
    */
  var conditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  /**
    * The node configuration of the pool.
    */
  var config: js.UndefOr[SchemaNodeConfig] = js.native
  /**
    * The initial node count for the pool. You must ensure that your Compute
    * Engine &lt;a href=&quot;/compute/docs/resource-quotas&quot;&gt;resource
    * quota&lt;/a&gt; is sufficient for this number of instances. You must also
    * have available firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The resource URLs of the [managed instance
    * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
    * associated with this node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * NodeManagement configuration for this NodePool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.native
  /**
    * The name of the node pool.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output only] The status of the nodes in this pool instance.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output only] Additional information about the current status of this
    * node pool instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The version of the Kubernetes of this node.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaNodePool {
  @scala.inline
  def apply(): SchemaNodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePool]
  }
  @scala.inline
  implicit class SchemaNodePoolOps[Self <: SchemaNodePool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscaling(value: SchemaNodePoolAutoscaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[SchemaStatusCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: SchemaNodeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
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
    def withManagement(value: SchemaNodeManagement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(js.undefined)
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
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

