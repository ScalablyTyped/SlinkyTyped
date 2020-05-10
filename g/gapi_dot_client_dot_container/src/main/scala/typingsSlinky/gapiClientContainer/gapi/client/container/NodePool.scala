package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePool extends js.Object {
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled
    * only if a valid configuration is present.
    */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
  /** The node configuration of the pool. */
  var config: js.UndefOr[NodeConfig] = js.native
  /**
    * The initial node count for the pool. You must ensure that your
    * Compute Engine <a href="/compute/docs/resource-quotas">resource quota</a>
    * is sufficient for this number of instances. You must also have available
    * firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The resource URLs of [instance
    * groups](/compute/docs/instance-groups/) associated with this
    * node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  /** NodeManagement configuration for this NodePool. */
  var management: js.UndefOr[NodeManagement] = js.native
  /** The name of the node pool. */
  var name: js.UndefOr[String] = js.native
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** [Output only] The status of the nodes in this pool instance. */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output only] Additional information about the current status of this
    * node pool instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /** [Output only] The version of the Kubernetes of this node. */
  var version: js.UndefOr[String] = js.native
}

object NodePool {
  @scala.inline
  def apply(): NodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePool]
  }
  @scala.inline
  implicit class NodePoolOps[Self <: NodePool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscaling(value: NodePoolAutoscaling): Self = {
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
    def withConfig(value: NodeConfig): Self = {
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
    def withManagement(value: NodeManagement): Self = {
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

