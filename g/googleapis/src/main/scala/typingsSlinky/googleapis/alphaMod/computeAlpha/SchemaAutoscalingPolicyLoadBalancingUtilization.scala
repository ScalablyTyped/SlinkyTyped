package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration parameters of autoscaling based on load balancing.
  */
@js.native
trait SchemaAutoscalingPolicyLoadBalancingUtilization extends js.Object {
  /**
    * Fraction of backend capacity utilization (set in HTTP(S) load balancing
    * configuration) that autoscaler should maintain. Must be a positive float
    * value. If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingPolicyLoadBalancingUtilization {
  @scala.inline
  def apply(): SchemaAutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyLoadBalancingUtilization]
  }
  @scala.inline
  implicit class SchemaAutoscalingPolicyLoadBalancingUtilizationOps[Self <: SchemaAutoscalingPolicyLoadBalancingUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtilizationTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilizationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilizationTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilizationTarget")(js.undefined)
        ret
    }
  }
  
}

