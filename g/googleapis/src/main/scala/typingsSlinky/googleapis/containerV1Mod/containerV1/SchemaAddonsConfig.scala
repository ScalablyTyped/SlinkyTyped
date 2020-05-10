package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the addons that can be automatically spun up in the
  * cluster, enabling additional functionality.
  */
@js.native
trait SchemaAddonsConfig extends js.Object {
  /**
    * Configuration for the horizontal pod autoscaling feature, which increases
    * or decreases the number of replica pods a replication controller has
    * based on the resource usage of the existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[SchemaHorizontalPodAutoscaling] = js.native
  /**
    * Configuration for the HTTP (L7) load balancing controller addon, which
    * makes it easy to set up HTTP load balancers for services in a cluster.
    */
  var httpLoadBalancing: js.UndefOr[SchemaHttpLoadBalancing] = js.native
  /**
    * Configuration for the Kubernetes Dashboard.
    */
  var kubernetesDashboard: js.UndefOr[SchemaKubernetesDashboard] = js.native
  /**
    * Configuration for NetworkPolicy. This only tracks whether the addon is
    * enabled or not on the Master, it does not track whether network policy is
    * enabled for the nodes.
    */
  var networkPolicyConfig: js.UndefOr[SchemaNetworkPolicyConfig] = js.native
}

object SchemaAddonsConfig {
  @scala.inline
  def apply(): SchemaAddonsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddonsConfig]
  }
  @scala.inline
  implicit class SchemaAddonsConfigOps[Self <: SchemaAddonsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalPodAutoscaling(value: SchemaHorizontalPodAutoscaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPodAutoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalPodAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPodAutoscaling")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpLoadBalancing(value: SchemaHttpLoadBalancing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpLoadBalancing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpLoadBalancing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpLoadBalancing")(js.undefined)
        ret
    }
    @scala.inline
    def withKubernetesDashboard(value: SchemaKubernetesDashboard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesDashboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKubernetesDashboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesDashboard")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkPolicyConfig(value: SchemaNetworkPolicyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPolicyConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPolicyConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPolicyConfig")(js.undefined)
        ret
    }
  }
  
}

