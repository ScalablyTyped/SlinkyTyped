package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerInfo extends js.Object {
  /**
    * An array that contains information about the load balancer to use for load balancing in a deployment. In Elastic Load Balancing, load balancers are used with Classic Load Balancers.   Adding more than one load balancer to the array is not supported.  
    */
  var elbInfoList: js.UndefOr[ELBInfoList] = js.native
  /**
    * An array that contains information about the target group to use for load balancing in a deployment. In Elastic Load Balancing, target groups are used with Application Load Balancers.   Adding more than one target group to the array is not supported.  
    */
  var targetGroupInfoList: js.UndefOr[TargetGroupInfoList] = js.native
  /**
    *  The target group pair information. This is an array of TargeGroupPairInfo objects with a maximum size of one. 
    */
  var targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList] = js.native
}

object LoadBalancerInfo {
  @scala.inline
  def apply(): LoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerInfo]
  }
  @scala.inline
  implicit class LoadBalancerInfoOps[Self <: LoadBalancerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElbInfoList(value: ELBInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElbInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elbInfoList")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupInfoList(value: TargetGroupInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupInfoList")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupPairInfoList(value: TargetGroupPairInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupPairInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupPairInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupPairInfoList")(js.undefined)
        ret
    }
  }
  
}

