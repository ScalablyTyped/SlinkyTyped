package typingsSlinky.devtoolsProtocol.mod.Protocol.Storage

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCookiesResponse extends StObject {
  
  /**
    * Array of cookie objects.
    */
  var cookies: js.Array[Cookie] = js.native
}
object GetCookiesResponse {
  
  @scala.inline
  def apply(cookies: js.Array[Cookie]): GetCookiesResponse = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCookiesResponse]
  }
  
  @scala.inline
  implicit class GetCookiesResponseMutableBuilder[Self <: GetCookiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value :_*))
  }
}
