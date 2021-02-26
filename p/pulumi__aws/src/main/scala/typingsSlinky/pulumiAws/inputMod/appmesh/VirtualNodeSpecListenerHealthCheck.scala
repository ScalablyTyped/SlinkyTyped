package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerHealthCheck extends StObject {
  
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    */
  var healthyThreshold: Input[Double] = js.native
  
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: Input[Double] = js.native
  
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
    */
  var path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The protocol for the health check request. Valid values are `http`, `http2`, `tcp` and `grpc`.
    */
  var protocol: Input[String] = js.native
  
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: Input[Double] = js.native
  
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
    */
  var unhealthyThreshold: Input[Double] = js.native
}
object VirtualNodeSpecListenerHealthCheck {
  
  @scala.inline
  def apply(
    healthyThreshold: Input[Double],
    intervalMillis: Input[Double],
    protocol: Input[String],
    timeoutMillis: Input[Double],
    unhealthyThreshold: Input[Double]
  ): VirtualNodeSpecListenerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerHealthCheck]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerHealthCheckMutableBuilder[Self <: VirtualNodeSpecListenerHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthyThreshold(value: Input[Double]): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalMillis(value: Input[Double]): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMillis(value: Input[Double]): Self = StObject.set(x, "timeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThreshold(value: Input[Double]): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
