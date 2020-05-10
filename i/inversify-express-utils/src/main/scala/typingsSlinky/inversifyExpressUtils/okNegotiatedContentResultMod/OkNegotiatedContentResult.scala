package typingsSlinky.inversifyExpressUtils.okNegotiatedContentResultMod

import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OkNegotiatedContentResult[T] extends IHttpActionResult {
  var apiController: js.Any = js.native
  var content: js.Any = js.native
}

object OkNegotiatedContentResult {
  @scala.inline
  def apply[T](apiController: js.Any, content: js.Any, executeAsync: () => js.Promise[HttpResponseMessage]): OkNegotiatedContentResult[T] = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync))
    __obj.asInstanceOf[OkNegotiatedContentResult[T]]
  }
  @scala.inline
  implicit class OkNegotiatedContentResultOps[Self[t] <: OkNegotiatedContentResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withApiController(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

