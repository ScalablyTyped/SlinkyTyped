package typingsSlinky.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authenticated extends StObject {
  
  var authenticated: Boolean = js.native
  
  var user: js.Object | Null = js.native
}
object Authenticated {
  
  @scala.inline
  def apply(authenticated: Boolean): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
  
  @scala.inline
  implicit class AuthenticatedMutableBuilder[Self <: Authenticated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
  }
}
