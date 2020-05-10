package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.AnonData
import typingsSlinky.protractorHttpMock.AnonMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock with payload.
  */
@js.native
trait PostData[TResponse, TPayload] extends js.Object {
  var request: AnonMethod[TPayload] = js.native
  var response: AnonData[TResponse] = js.native
}

object PostData {
  @scala.inline
  def apply[TResponse, TPayload](request: AnonMethod[TPayload], response: AnonData[TResponse]): PostData[TResponse, TPayload] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostData[TResponse, TPayload]]
  }
  @scala.inline
  implicit class PostDataOps[Self[tresponse, tpayload] <: PostData[tresponse, tpayload], TResponse, TPayload] (val x: Self[TResponse, TPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResponse, TPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResponse, TPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TResponse, TPayload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TResponse, TPayload]) with Other]
    @scala.inline
    def withRequest(value: AnonMethod[TPayload]): Self[TResponse, TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: AnonData[TResponse]): Self[TResponse, TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

