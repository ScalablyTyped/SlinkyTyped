package typingsSlinky.hapi.mod

import typingsSlinky.hapi.hapiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth extends StObject {
  
  val data: js.UndefOr[AuthenticationData] = js.native
  
  val error: js.UndefOr[js.Error | Null] = js.native
  
  val isAuth: `true` = js.native
}
object Auth {
  
  @scala.inline
  def apply(isAuth: `true`): Auth = {
    val __obj = js.Dynamic.literal(isAuth = isAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
  
  @scala.inline
  implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: AuthenticationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIsAuth(value: `true`): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
  }
}
