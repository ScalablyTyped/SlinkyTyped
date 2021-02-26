package typingsSlinky.asana.mod.auth

import org.scalablytyped.runtime.StObject
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
object BaseBrowserFlow {
  
  @JSImport("asana", "auth.BaseBrowserFlow")
  @js.native
  val ^ : BaseBrowserFlowStatic = js.native
  
  @scala.inline
  implicit class BaseBrowserFlowMutableBuilder[Self <: BaseBrowserFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsanaBaseUrl(value: () => String): Self = StObject.set(x, "asanaBaseUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinishAuthorization(value: String => Unit): Self = StObject.set(x, "finishAuthorization", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStateParam(value: () => String): Self = StObject.set(x, "getStateParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReceiverUrl(value: () => String): Self = StObject.set(x, "receiverUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartAuthorization(value: (String, String) => js.Any): Self = StObject.set(x, "startAuthorization", js.Any.fromFunction2(value))
  }
}
