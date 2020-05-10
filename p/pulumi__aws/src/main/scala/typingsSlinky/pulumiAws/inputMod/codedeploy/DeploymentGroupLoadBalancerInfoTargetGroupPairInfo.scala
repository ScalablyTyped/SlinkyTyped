package typingsSlinky.pulumiAws.inputMod.codedeploy

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends js.Object {
  /**
    * Configuration block for the production traffic route (documented below).
    */
  var prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute] = js.native
  /**
    * Configuration blocks for a target group within a target group pair (documented below).
    */
  var targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]] = js.native
  /**
    * Configuration block for the test traffic route (documented below).
    */
  var testTrafficRoute: js.UndefOr[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]] = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
  @scala.inline
  def apply(
    prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute],
    targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]]
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
    def withProdTrafficRoute(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prodTrafficRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetGroups(value: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestTrafficRoute(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]): Self = {
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

