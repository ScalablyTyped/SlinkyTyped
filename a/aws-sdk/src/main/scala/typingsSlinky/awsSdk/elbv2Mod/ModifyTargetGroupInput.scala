package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTargetGroupInput extends StObject {
  
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckEnabled] = js.native
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For TCP health checks, the supported values are 10 or 30 seconds. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.native
  
  /**
    * [HTTP/HTTPS health checks] The destination for health checks on the targets. [HTTP1 or HTTP2 protocol version] The ping path. The default is /. [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The default is /AWS.ALB/healthcheck.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.native
  
  /**
    * The port the load balancer uses when performing health checks on targets.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  
  /**
    * The protocol the load balancer uses when performing health checks on targets. The TCP protocol is supported for health checks only if the protocol of the target group is TCP, TLS, UDP, or TCP_UDP. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks. With Network Load Balancers, you can't modify this setting.
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
    * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target. With Network Load Balancers, you can't modify this setting.
    */
  var Matcher: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Matcher] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn = js.native
  
  /**
    * The number of consecutive health check failures required before considering the target unhealthy. For target groups with a protocol of TCP or TLS, this value must be the same as the healthy threshold count.
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
  implicit class ModifyTargetGroupInputMutableBuilder[Self <: ModifyTargetGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckEnabled(value: HealthCheckEnabled): Self = StObject.set(x, "HealthCheckEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckEnabledUndefined: Self = StObject.set(x, "HealthCheckEnabled", js.undefined)
    
    @scala.inline
    def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = StObject.set(x, "HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "HealthCheckIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: Path): Self = StObject.set(x, "HealthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPathUndefined: Self = StObject.set(x, "HealthCheckPath", js.undefined)
    
    @scala.inline
    def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    @scala.inline
    def setHealthCheckProtocol(value: ProtocolEnum): Self = StObject.set(x, "HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckProtocolUndefined: Self = StObject.set(x, "HealthCheckProtocol", js.undefined)
    
    @scala.inline
    def setHealthCheckTimeoutSeconds(value: HealthCheckTimeoutSeconds): Self = StObject.set(x, "HealthCheckTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckTimeoutSecondsUndefined: Self = StObject.set(x, "HealthCheckTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setHealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "HealthyThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdCountUndefined: Self = StObject.set(x, "HealthyThresholdCount", js.undefined)
    
    @scala.inline
    def setMatcher(value: Matcher): Self = StObject.set(x, "Matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "Matcher", js.undefined)
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "UnhealthyThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdCountUndefined: Self = StObject.set(x, "UnhealthyThresholdCount", js.undefined)
  }
}
