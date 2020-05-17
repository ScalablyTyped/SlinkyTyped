package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.anon.Data
import typingsSlinky.protractorHttpMock.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GET request mock.
  */
@js.native
trait Get[TResponse] extends AllRequests {
  var request: Headers = js.native
  var response: Data[TResponse] = js.native
}

object Get {
  @scala.inline
  def apply[TResponse](request: Headers, response: Data[TResponse]): Get[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get[TResponse]]
  }
  @scala.inline
  implicit class GetOps[Self[tresponse] <: Get[tresponse], TResponse] (val x: Self[TResponse]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResponse] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResponse]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResponse] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResponse] with Other]
    @scala.inline
    def withRequest(value: Headers): Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Data[TResponse]): Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

