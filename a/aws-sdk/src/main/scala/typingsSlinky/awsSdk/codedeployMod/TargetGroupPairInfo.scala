package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupPairInfo extends js.Object {
  /**
    *  The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete. 
    */
  var prodTrafficRoute: js.UndefOr[TrafficRoute] = js.native
  /**
    *  One pair of target groups. One is associated with the original task set. The second is associated with the task set that serves traffic after the deployment is complete. 
    */
  var targetGroups: js.UndefOr[TargetGroupInfoList] = js.native
  /**
    *  An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can occur while test traffic is served during a deployment. 
    */
  var testTrafficRoute: js.UndefOr[TrafficRoute] = js.native
}

object TargetGroupPairInfo {
  @scala.inline
  def apply(): TargetGroupPairInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupPairInfo]
  }
  @scala.inline
  implicit class TargetGroupPairInfoOps[Self <: TargetGroupPairInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProdTrafficRoute(value: TrafficRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prodTrafficRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProdTrafficRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prodTrafficRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroups(value: TargetGroupInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withTestTrafficRoute(value: TrafficRoute): Self = {
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

