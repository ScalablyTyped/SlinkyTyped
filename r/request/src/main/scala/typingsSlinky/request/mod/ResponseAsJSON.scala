package typingsSlinky.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseAsJSON extends StObject {
  
  var body: js.Any = js.native
  
  var headers: Headers = js.native
  
  var request: RequestAsJSON = js.native
  
  var statusCode: Double = js.native
}
object ResponseAsJSON {
  
  @scala.inline
  def apply(body: js.Any, headers: Headers, request: RequestAsJSON, statusCode: Double): ResponseAsJSON = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseAsJSON]
  }
  
  @scala.inline
  implicit class ResponseAsJSONMutableBuilder[Self <: ResponseAsJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestAsJSON): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
