package typingsSlinky.lambdaWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler[THandlerName /* <: String */] extends js.Object {
  var handler: js.UndefOr[THandlerName] = js.native
}

object Handler {
  @scala.inline
  def apply[THandlerName](): Handler[THandlerName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handler[THandlerName]]
  }
  @scala.inline
  implicit class HandlerOps[Self[thandlername] <: Handler[thandlername], THandlerName] (val x: Self[THandlerName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[THandlerName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[THandlerName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[THandlerName] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[THandlerName] with Other]
    @scala.inline
    def withHandler(value: THandlerName): Self[THandlerName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self[THandlerName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
  }
  
}

