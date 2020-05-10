package typingsSlinky.pulumiAws.outputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerHealthCheck extends js.Object {
  var healthyThreshold: Double = js.native
  var interval: Double = js.native
  var target: String = js.native
  var timeout: Double = js.native
  var unhealthyThreshold: Double = js.native
}

object GetLoadBalancerHealthCheck {
  @scala.inline
  def apply(
    healthyThreshold: Double,
    interval: Double,
    target: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): GetLoadBalancerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerHealthCheck]
  }
  @scala.inline
  implicit class GetLoadBalancerHealthCheckOps[Self <: GetLoadBalancerHealthCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthyThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhealthyThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhealthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

