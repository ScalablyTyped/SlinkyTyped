package typingsSlinky.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSettings extends CommonRouteProperties {
  
  var auth: js.UndefOr[AuthSettings] = js.native
}
object RouteSettings {
  
  @scala.inline
  def apply(): RouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSettings]
  }
  
  @scala.inline
  implicit class RouteSettingsMutableBuilder[Self <: RouteSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: AuthSettings): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
