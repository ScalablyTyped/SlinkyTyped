package typingsSlinky.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeFlow extends Flow {
  
  /**
    * @param {String} code An authorization code obtained via `asanaAuthorizeUrl`.
    * @return {Promise<Object>} The token, which will include the `access_token`
    *     used for API access, as well as a `refresh_token` which can be stored
    *     to get a new access token without going through the flow again.
    * @param code
    */
  def accessToken(code: String): Unit = js.native
  
  /**
    * @return {Promise} The access token, which will include a refresh token
    *     that can be stored in the future to create a client without going
    *     through the Oauth flow.
    * @param url
    * @return
    */
  def promptForCode(url: String): js.Any = js.native
}
object NativeFlow {
  
  @JSImport("asana", "auth.NativeFlow")
  @js.native
  val ^ : NativeFlowStatic = js.native
  
  @scala.inline
  implicit class NativeFlowMutableBuilder[Self <: NativeFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String => Unit): Self = StObject.set(x, "accessToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPromptForCode(value: String => js.Any): Self = StObject.set(x, "promptForCode", js.Any.fromFunction1(value))
  }
}
