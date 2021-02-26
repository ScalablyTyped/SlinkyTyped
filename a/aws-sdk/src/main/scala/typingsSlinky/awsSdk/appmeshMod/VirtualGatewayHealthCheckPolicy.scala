package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayHealthCheckPolicy extends StObject {
  
  /**
    * The number of consecutive successful health checks that must occur before declaring the listener healthy.
    */
  var healthyThreshold: VirtualGatewayHealthCheckThreshold = js.native
  
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: VirtualGatewayHealthCheckIntervalMillis = js.native
  
  /**
    * The destination path for the health check request. This value is only used if the specified protocol is HTTP or HTTP/2. For any other protocol, this value is ignored.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The destination port for the health check request. This port must match the port defined in the PortMapping for the listener.
    */
  var port: js.UndefOr[PortNumber] = js.native
  
  /**
    * The protocol for the health check request. If you specify grpc, then your service must conform to the GRPC Health Checking Protocol.
    */
  var protocol: VirtualGatewayPortProtocol = js.native
  
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: VirtualGatewayHealthCheckTimeoutMillis = js.native
  
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
    */
  var unhealthyThreshold: VirtualGatewayHealthCheckThreshold = js.native
}
object VirtualGatewayHealthCheckPolicy {
  
  @scala.inline
  def apply(
    healthyThreshold: VirtualGatewayHealthCheckThreshold,
    intervalMillis: VirtualGatewayHealthCheckIntervalMillis,
    protocol: VirtualGatewayPortProtocol,
    timeoutMillis: VirtualGatewayHealthCheckTimeoutMillis,
    unhealthyThreshold: VirtualGatewayHealthCheckThreshold
  ): VirtualGatewayHealthCheckPolicy = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayHealthCheckPolicy]
  }
  
  @scala.inline
  implicit class VirtualGatewayHealthCheckPolicyMutableBuilder[Self <: VirtualGatewayHealthCheckPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthyThreshold(value: VirtualGatewayHealthCheckThreshold): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalMillis(value: VirtualGatewayHealthCheckIntervalMillis): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: VirtualGatewayPortProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMillis(value: VirtualGatewayHealthCheckTimeoutMillis): Self = StObject.set(x, "timeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThreshold(value: VirtualGatewayHealthCheckThreshold): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
