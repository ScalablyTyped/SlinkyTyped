package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock with payload.
  */
@js.native
trait PostData[TResponse, TPayload] extends AllRequests {
  var request: typingsSlinky.protractorHttpMock.anon.Method[TPayload] = js.native
  var response: Data[TResponse] = js.native
}

object PostData {
  @scala.inline
  def apply[TResponse, TPayload](request: typingsSlinky.protractorHttpMock.anon.Method[TPayload], response: Data[TResponse]): PostData[TResponse, TPayload] = {
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
    def withRequest(value: typingsSlinky.protractorHttpMock.anon.Method[TPayload]): Self[TResponse, TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Data[TResponse]): Self[TResponse, TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

