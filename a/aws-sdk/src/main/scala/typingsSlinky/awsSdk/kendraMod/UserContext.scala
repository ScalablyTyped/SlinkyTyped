package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserContext extends StObject {
  
  /**
    * The user context token. It must be a JWT or a JSON token.
    */
  var Token: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Token] = js.native
}
object UserContext {
  
  @scala.inline
  def apply(): UserContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContext]
  }
  
  @scala.inline
  implicit class UserContextMutableBuilder[Self <: UserContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: Token): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
