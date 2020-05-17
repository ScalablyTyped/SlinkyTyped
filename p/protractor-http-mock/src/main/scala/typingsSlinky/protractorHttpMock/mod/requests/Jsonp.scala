package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.anon.Data
import typingsSlinky.protractorHttpMock.anon.PathString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONP request mock.
  */
@js.native
trait Jsonp[TResponse] extends AllRequests {
  var request: PathString = js.native
  var response: Data[TResponse] = js.native
}

object Jsonp {
  @scala.inline
  def apply[TResponse](request: PathString, response: Data[TResponse]): Jsonp[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jsonp[TResponse]]
  }
  @scala.inline
  implicit class JsonpOps[Self[tresponse] <: Jsonp[tresponse], TResponse] (val x: Self[TResponse]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResponse] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResponse]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResponse] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResponse] with Other]
    @scala.inline
    def withRequest(value: PathString): Self[TResponse] = {
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

