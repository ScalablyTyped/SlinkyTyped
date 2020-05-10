package typingsSlinky.inversifyExpressUtils.responseMessageResultMod

import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseMessageResult extends IHttpActionResult {
  var apiController: js.Any = js.native
  var message: js.Any = js.native
}

object ResponseMessageResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], message: js.Any): ResponseMessageResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMessageResult]
  }
  @scala.inline
  implicit class ResponseMessageResultOps[Self <: ResponseMessageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiController(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

