package typingsSlinky.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckCustomConfig extends StObject {
  
  /**
    *  This parameter has been deprecated and is always set to 1. AWS Cloud Map waits for approximately 30 seconds after receiving an UpdateInstanceCustomHealthStatus request before changing the status of the service instance.  The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status of a service instance. Sending a second or subsequent UpdateInstanceCustomHealthStatus request with the same value before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits 30 seconds after the first request to make the change.
    */
  var FailureThreshold: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.FailureThreshold] = js.native
}
object HealthCheckCustomConfig {
  
  @scala.inline
  def apply(): HealthCheckCustomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckCustomConfig]
  }
  
  @scala.inline
  implicit class HealthCheckCustomConfigMutableBuilder[Self <: HealthCheckCustomConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureThreshold(value: FailureThreshold): Self = StObject.set(x, "FailureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureThresholdUndefined: Self = StObject.set(x, "FailureThreshold", js.undefined)
  }
}
