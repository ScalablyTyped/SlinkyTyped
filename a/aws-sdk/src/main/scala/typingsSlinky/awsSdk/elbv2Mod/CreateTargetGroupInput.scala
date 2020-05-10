package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTargetGroupInput extends js.Object {
  /**
    * Indicates whether health checks are enabled. If the target type is lambda, health checks are disabled by default but can be enabled. If the target type is instance or ip, health checks are always enabled and cannot be disabled.
    */
  var HealthCheckEnabled: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckEnabled] = js.native
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For HTTP and HTTPS health checks, the range is 5–300 seconds. For TCP health checks, the supported values are 10 and 30 seconds. If the target type is instance or ip, the default is 30 seconds. If the target type is lambda, the default is 35 seconds.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.native
  /**
    * [HTTP/HTTPS health checks] The ping path that is the destination on the targets for health checks. The default is /.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.native
  /**
    * The port the load balancer uses when performing health checks on targets. The default is traffic-port, which is the port on which each target receives traffic from the load balancer.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  /**
    * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the default is HTTP. For Network Load Balancers, the default is TCP. The TCP protocol is supported for health checks only if the protocol of the target group is TCP, TLS, UDP, or TCP_UDP. The TLS, UDP, and TCP_UDP protocols are not supported for health checks.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * The amount of time, in seconds, during which no response from a target means a failed health check. For target groups with a protocol of HTTP or HTTPS, the default is 5 seconds. For target groups with a protocol of TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and HTTPS health checks. If the target type is lambda, the default is 30 seconds.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.native
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy. For target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of TCP or TLS, the default is 3. If the target type is lambda, the default is 5.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  /**
    * [HTTP/HTTPS health checks] The HTTP codes to use when checking for a successful response from a target.
    */
  var Matcher: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Matcher] = js.native
  /**
    * The name of the target group. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
    */
  var Name: TargetGroupName = js.native
  /**
    * The port on which the targets receive traffic. This port is used unless you specify a port override when registering the target. If the target is a Lambda function, this parameter does not apply.
    */
  var Port: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Port] = js.native
  /**
    * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. A TCP_UDP listener must be associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not apply.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * The type of target that you must specify when registering targets with this target group. You can't specify targets for a target group using more than one target type.    instance - Targets are specified by instance ID. This is the default value. If the target group protocol is UDP or TCP_UDP, the target type must be instance.    ip - Targets are specified by IP address. You can specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.    lambda - The target groups contains a single Lambda function.  
    */
  var TargetType: js.UndefOr[TargetTypeEnum] = js.native
  /**
    * The number of consecutive health check failures required before considering a target unhealthy. For target groups with a protocol of HTTP or HTTPS, the default is 2. For target groups with a protocol of TCP or TLS, this value must be the same as the healthy threshold count. If the target type is lambda, the default is 2.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  /**
    * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter is required.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.VpcId] = js.native
}

object CreateTargetGroupInput {
  @scala.inline
  def apply(Name: TargetGroupName): CreateTargetGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetGroupInput]
  }
  @scala.inline
  implicit class CreateTargetGroupInputOps[Self <: CreateTargetGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: TargetGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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

