package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroup extends js.Object {
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckEnabled] = js.native
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.native
  /**
    * The destination for the health check request.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.native
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  /**
    * The protocol to use to connect with the target.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * The amount of time, in seconds, during which no response means a failed health check.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.native
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  /**
    * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
    */
  var LoadBalancerArns: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArns] = js.native
  /**
    * The HTTP codes to use when checking for a successful response from a target.
    */
  var Matcher: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Matcher] = js.native
  /**
    * The port on which the targets are listening. Not used if the target is a Lambda function.
    */
  var Port: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Port] = js.native
  /**
    * The protocol to use for routing traffic to the targets.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn] = js.native
  /**
    * The name of the target group.
    */
  var TargetGroupName: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroupName] = js.native
  /**
    * The type of target that you must specify when registering targets with this target group. The possible values are instance (targets are specified by instance ID) or ip (targets are specified by IP address).
    */
  var TargetType: js.UndefOr[TargetTypeEnum] = js.native
  /**
    * The number of consecutive health check failures required before considering the target unhealthy.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  /**
    * The ID of the VPC for the targets.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.VpcId] = js.native
}

object TargetGroup {
  @scala.inline
  def apply(): TargetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroup]
  }
  @scala.inline
  implicit class TargetGroupOps[Self <: TargetGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLoadBalancerArns(value: LoadBalancerArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerArns")(js.undefined)
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
    def withPort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: ProtocolEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupArn(value: TargetGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupName(value: TargetGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: TargetTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(js.undefined)
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
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

