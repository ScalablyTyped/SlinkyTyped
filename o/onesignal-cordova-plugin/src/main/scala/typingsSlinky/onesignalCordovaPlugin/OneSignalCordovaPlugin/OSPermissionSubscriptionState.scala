package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSPermissionSubscriptionState extends StObject {
  
  var emailSubscriptionStatus: OSEmailSubscriptionState = js.native
  
  var permissionStatus: OSPermissionState = js.native
  
  var subscriptionStatus: OSSubscriptionState = js.native
}
object OSPermissionSubscriptionState {
  
  @scala.inline
  def apply(
    emailSubscriptionStatus: OSEmailSubscriptionState,
    permissionStatus: OSPermissionState,
    subscriptionStatus: OSSubscriptionState
  ): OSPermissionSubscriptionState = {
    val __obj = js.Dynamic.literal(emailSubscriptionStatus = emailSubscriptionStatus.asInstanceOf[js.Any], permissionStatus = permissionStatus.asInstanceOf[js.Any], subscriptionStatus = subscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSPermissionSubscriptionState]
  }
  
  @scala.inline
  implicit class OSPermissionSubscriptionStateMutableBuilder[Self <: OSPermissionSubscriptionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailSubscriptionStatus(value: OSEmailSubscriptionState): Self = StObject.set(x, "emailSubscriptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionStatus(value: OSPermissionState): Self = StObject.set(x, "permissionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionStatus(value: OSSubscriptionState): Self = StObject.set(x, "subscriptionStatus", value.asInstanceOf[js.Any])
  }
}
