package typingsSlinky.protractorHttpMock.mod.requests

import typingsSlinky.protractorHttpMock.AnonData
import typingsSlinky.protractorHttpMock.AnonPathRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PUT request mock.
  */
@js.native
trait Put[TResponse] extends js.Object {
  var request: AnonPathRegex = js.native
  var response: AnonData[TResponse] = js.native
}

object Put {
  @scala.inline
  def apply[TResponse](request: AnonPathRegex, response: AnonData[TResponse]): Put[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Put[TResponse]]
  }
  @scala.inline
  implicit class PutOps[Self[tresponse] <: Put[tresponse], TResponse] (val x: Self[TResponse]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResponse] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResponse]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResponse] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResponse] with Other]
    @scala.inline
    def withRequest(value: AnonPathRegex): Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: AnonData[TResponse]): Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

