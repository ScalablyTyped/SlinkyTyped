package typingsSlinky.request.mod

import typingsSlinky.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestAsJSON extends StObject {
  
  var headers: Headers = js.native
  
  var method: String = js.native
  
  var uri: Url = js.native
}
object RequestAsJSON {
  
  @scala.inline
  def apply(headers: Headers, method: String, uri: Url): RequestAsJSON = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAsJSON]
  }
  
  @scala.inline
  implicit class RequestAsJSONMutableBuilder[Self <: RequestAsJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Url): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
