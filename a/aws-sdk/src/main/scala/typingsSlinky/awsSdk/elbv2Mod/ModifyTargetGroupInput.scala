package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTargetGroupInput extends js.Object {
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckEnabled] = js.native
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For Application Load Balancers, the range is 5 to 300 seconds. For Network Load Balancers, the supported values are 10 or 30 seconds. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.native
  /**
    * [HTTP/HTTPS health checks] The ping path that is the destination for the health check request.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.native
  /**
    * The port the load balancer uses when performing health checks on targets.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  /**
    * The protocol the load balancer uses when performing health checks on targets. The TCP protocol is supported for health checks only if the protocol of the target group is TCP, TLS, UDP, or TCP_UDP. The TLS, UDP, and TCP_UDP protocols are not supported for health checks. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * [HTTP/HTTPS health checks] The amount of time, in seconds, during which no response means a failed health check. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.native
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  /**
    * [HTTP/HTTPS health checks] The HTTP codes to use when checking for a successful response from a target. With Network Load Balancers, you can't modify this setting.
    */
  var Matcher: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Matcher] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn = js.native
  /**
    * The number of consecutive health check failures required before considering the target unhealthy. For Network Load Balancers, this value must be the same as the healthy threshold count.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
}

object ModifyTargetGroupInput {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn): ModifyTargetGroupInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTargetGroupInput]
  }
  @scala.inline
  implicit class ModifyTargetGroupInputOps[Self <: ModifyTargetGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetGroupArn(value: TargetGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheckEnabled(value: HealthCheckEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckIntervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckIntervalSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckPort(value: HealthCheckPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckPort")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckProtocol(value: ProtocolEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckTimeoutSeconds(value: HealthCheckTimeoutSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthyThresholdCount(value: HealthCheckThresholdCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthyThresholdCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthyThresholdCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthyThresholdCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(value: Matcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Matcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Matcher")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhealthyThresholdCount(value: HealthCheckThresholdCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnhealthyThresholdCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnhealthyThresholdCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnhealthyThresholdCount")(js.undefined)
        ret
    }
  }
  
}

