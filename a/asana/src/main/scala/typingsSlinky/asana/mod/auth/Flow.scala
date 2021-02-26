package typingsSlinky.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flow extends StObject {
  
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  def authorizeUrl(): String = js.native
  
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  def run(): Unit = js.native
}
object Flow {
  
  @scala.inline
  def apply(authorizeUrl: () => String, run: () => Unit): Flow = {
    val __obj = js.Dynamic.literal(authorizeUrl = js.Any.fromFunction0(authorizeUrl), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  implicit class FlowMutableBuilder[Self <: Flow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizeUrl(value: () => String): Self = StObject.set(x, "authorizeUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
  }
}
