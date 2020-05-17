package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.anon.Data
import typingsSlinky.protractorHttpMock.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock.
  */
@js.native
trait Post[TResponse] extends AllRequests {
  var request: Path = js.native
  var response: Data[TResponse] = js.native
}

object Post {
  @scala.inline
  def apply[TResponse](request: Path, response: Data[TResponse]): Post[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post[TResponse]]
  }
  @scala.inline
  implicit class PostOps[Self[tresponse] <: Post[tresponse], TResponse] (val x: Self[TResponse]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResponse] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResponse]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResponse] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResponse] with Other]
    @scala.inline
    def withRequest(value: Path): Self[TResponse] = {
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

