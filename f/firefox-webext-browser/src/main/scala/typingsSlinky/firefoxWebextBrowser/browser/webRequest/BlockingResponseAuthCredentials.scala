package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Only used as a response to the onAuthRequired event. If set, the request is made using the supplied credentials.
  */
@js.native
trait BlockingResponseAuthCredentials extends StObject {
  
  var password: String = js.native
  
  var username: String = js.native
}
object BlockingResponseAuthCredentials {
  
  @scala.inline
  def apply(password: String, username: String): BlockingResponseAuthCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockingResponseAuthCredentials]
  }
  
  @scala.inline
  implicit class BlockingResponseAuthCredentialsMutableBuilder[Self <: BlockingResponseAuthCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
