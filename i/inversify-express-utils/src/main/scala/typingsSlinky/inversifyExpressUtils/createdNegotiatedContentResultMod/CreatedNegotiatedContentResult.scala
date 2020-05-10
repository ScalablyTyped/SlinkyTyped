package typingsSlinky.inversifyExpressUtils.createdNegotiatedContentResultMod

import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatedNegotiatedContentResult[T] extends IHttpActionResult {
  var apiController: js.Any = js.native
  var content: js.Any = js.native
  var location: js.Any = js.native
}

object CreatedNegotiatedContentResult {
  @scala.inline
  def apply[T](
    apiController: js.Any,
    content: js.Any,
    executeAsync: () => js.Promise[HttpResponseMessage],
    location: js.Any
  ): CreatedNegotiatedContentResult[T] = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedNegotiatedContentResult[T]]
  }
  @scala.inline
  implicit class CreatedNegotiatedContentResultOps[Self[t] <: CreatedNegotiatedContentResult[t], T] (val x: Self[T]) extends AnyVal {
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
    @scala.inline
    def withLocation(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

