package typingsSlinky.expoLocation.locationTypesMod

import typingsSlinky.unimodulesPermissionsInterface.mod.PermissionExpiration
import typingsSlinky.unimodulesPermissionsInterface.mod.PermissionResponse
import typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationPermissionResponse extends PermissionResponse {
  
  var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.native
  
  var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.native
}
object LocationPermissionResponse {
  
  @scala.inline
  def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): LocationPermissionResponse = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPermissionResponse]
  }
  
  @scala.inline
  implicit class LocationPermissionResponseMutableBuilder[Self <: LocationPermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: PermissionDetailsLocationAndroid): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setIos(value: PermissionDetailsLocationIOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
