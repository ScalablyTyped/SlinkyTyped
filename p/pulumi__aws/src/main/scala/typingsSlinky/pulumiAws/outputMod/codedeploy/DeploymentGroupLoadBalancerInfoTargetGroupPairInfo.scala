package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends js.Object {
  /**
    * Configuration block for the production traffic route (documented below).
    */
  var prodTrafficRoute: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute = js.native
  /**
    * Configuration blocks for a target group within a target group pair (documented below).
    */
  var targetGroups: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup] = js.native
  /**
    * Configuration block for the test traffic route (documented below).
    */
  var testTrafficRoute: js.UndefOr[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute] = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
  @scala.inline
  def apply(
    prodTrafficRoute: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute,
    targetGroups: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  ): DeploymentGroupLoadBalancerInfoTargetGroupPairInfo = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute.asInstanceOf[js.Any], targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]
  }
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoOps[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProdTrafficRoute(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prodTrafficRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetGroups(value: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestTrafficRoute(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTrafficRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestTrafficRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTrafficRoute")(js.undefined)
        ret
    }
  }
  
}

