package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfo extends js.Object {
  /**
    * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `targetGroupInfo` and `targetGroupPairInfo`.
    */
  var elbInfos: js.UndefOr[js.Array[DeploymentGroupLoadBalancerInfoElbInfo]] = js.native
  /**
    * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elbInfo` and `targetGroupPairInfo`.
    */
  var targetGroupInfos: js.UndefOr[js.Array[DeploymentGroupLoadBalancerInfoTargetGroupInfo]] = js.native
  /**
    * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elbInfo` and `targetGroupInfo`.
    */
  var targetGroupPairInfo: js.UndefOr[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo] = js.native
}

object DeploymentGroupLoadBalancerInfo {
  @scala.inline
  def apply(): DeploymentGroupLoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfo]
  }
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoOps[Self <: DeploymentGroupLoadBalancerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElbInfos(value: js.Array[DeploymentGroupLoadBalancerInfoElbInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElbInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupInfos(value: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupPairInfo(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupPairInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupPairInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupPairInfo")(js.undefined)
        ret
    }
  }
  
}

