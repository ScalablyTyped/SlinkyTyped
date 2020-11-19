package typingsSlinky.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpOperationResponse[T] extends js.Object {
  
  var body: T = js.native
  
  var request: WebResource = js.native
  
  var response: typingsSlinky.node.httpMod.IncomingMessage = js.native
}
object HttpOperationResponse {
  
  @scala.inline
  def apply[T](body: T, request: WebResource, response: typingsSlinky.node.httpMod.IncomingMessage): HttpOperationResponse[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOperationResponse[T]]
  }
  
  @scala.inline
  implicit class HttpOperationResponseOps[Self <: HttpOperationResponse[_], T] (val x: Self with HttpOperationResponse[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: WebResource): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: typingsSlinky.node.httpMod.IncomingMessage): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
