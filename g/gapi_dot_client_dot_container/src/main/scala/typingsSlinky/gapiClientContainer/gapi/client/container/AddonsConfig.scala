package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddonsConfig extends js.Object {
  /**
    * Configuration for the horizontal pod autoscaling feature, which
    * increases or decreases the number of replica pods a replication controller
    * has based on the resource usage of the existing pods.
    */
  var horizontalPodAutoscaling: js.UndefOr[HorizontalPodAutoscaling] = js.native
  /**
    * Configuration for the HTTP (L7) load balancing controller addon, which
    * makes it easy to set up HTTP load balancers for services in a cluster.
    */
  var httpLoadBalancing: js.UndefOr[HttpLoadBalancing] = js.native
  /** Configuration for the Kubernetes Dashboard. */
  var kubernetesDashboard: js.UndefOr[KubernetesDashboard] = js.native
  /**
    * Configuration for NetworkPolicy. This only tracks whether the addon
    * is enabled or not on the Master, it does not track whether network policy
    * is enabled for the nodes.
    */
  var networkPolicyConfig: js.UndefOr[NetworkPolicyConfig] = js.native
}

object AddonsConfig {
  @scala.inline
  def apply(): AddonsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonsConfig]
  }
  @scala.inline
  implicit class AddonsConfigOps[Self <: AddonsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalPodAutoscaling(value: HorizontalPodAutoscaling): Self = {
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
    def withHttpLoadBalancing(value: HttpLoadBalancing): Self = {
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
    def withKubernetesDashboard(value: KubernetesDashboard): Self = {
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
    def withNetworkPolicyConfig(value: NetworkPolicyConfig): Self = {
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

