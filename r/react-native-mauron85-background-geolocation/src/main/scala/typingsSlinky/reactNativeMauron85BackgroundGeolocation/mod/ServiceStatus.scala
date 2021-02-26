package typingsSlinky.reactNativeMauron85BackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceStatus extends StObject {
  
  /**
    * Authorization status.
    *
    * Posible values:
    *  NOT_AUTHORIZED, AUTHORIZED, AUTHORIZED_FOREGROUND
    *
    * @example
    * if (authorization == BackgroundGeolocation.NOT_AUTHORIZED) {...}
    */
  var authorization: AuthorizationStatus = js.native
  
  /** TRUE if service is running. */
  var isRunning: Boolean = js.native
  
  /** TRUE if location services are enabled */
  var locationServicesEnabled: Boolean = js.native
}
object ServiceStatus {
  
  @scala.inline
  def apply(authorization: AuthorizationStatus, isRunning: Boolean, locationServicesEnabled: Boolean): ServiceStatus = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  
  @scala.inline
  implicit class ServiceStatusMutableBuilder[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: AuthorizationStatus): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationServicesEnabled(value: Boolean): Self = StObject.set(x, "locationServicesEnabled", value.asInstanceOf[js.Any])
  }
}
