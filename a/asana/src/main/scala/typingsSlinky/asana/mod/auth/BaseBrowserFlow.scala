package typingsSlinky.asana.mod.auth

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBrowserFlow extends Flow {
  
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  def asanaBaseUrl(): String = js.native
  
  /**
    * @return {Promise<Object>} Credentials returned from Oauth.
    * @param state
    */
  def finishAuthorization(state: String): Unit = js.native
  
  /**
    * @returns {String} Generate a new unique state parameter for a request.
    * @return
    */
  def getStateParam(): String = js.native
  
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  def receiverUrl(): String = js.native
  
  /**
    * @param {String} authUrl The URL the user should be navigated to in order
    *     to authorize the app.
    * @param {String} state   The unique state generated for this auth request.
    * @return {Promise} Resolved when authorization has successfully started,
    *     i.e. the user has been navigated to a page requesting authorization.
    * @param authUrl
    * @param state
    * @return
    */
  def startAuthorization(authUrl: String, state: String): js.Any = js.native
}
@JSImport("asana", "auth.BaseBrowserFlow")
@js.native
object BaseBrowserFlow extends TopLevel[BaseBrowserFlowStatic]
