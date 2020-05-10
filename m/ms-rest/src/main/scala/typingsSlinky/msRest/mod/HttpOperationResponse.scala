package typingsSlinky.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class HttpOperationResponseOps[Self[t] <: HttpOperationResponse[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: WebResource): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: typingsSlinky.node.httpMod.IncomingMessage): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

