package typingsSlinky.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthSetting extends StObject {
  
  var authSetting: typingsSlinky.baiduApp.swan.AuthSetting = js.native
}
object AuthSetting {
  
  @scala.inline
  def apply(authSetting: typingsSlinky.baiduApp.swan.AuthSetting): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit class AuthSettingMutableBuilder[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSetting(value: typingsSlinky.baiduApp.swan.AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
