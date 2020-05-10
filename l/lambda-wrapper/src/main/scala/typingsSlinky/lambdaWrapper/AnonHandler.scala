package typingsSlinky.lambdaWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandler[THandlerName /* <: String */] extends js.Object {
  var handler: js.UndefOr[THandlerName] = js.native
}

object AnonHandler {
  @scala.inline
  def apply[THandlerName](): AnonHandler[THandlerName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHandler[THandlerName]]
  }
  @scala.inline
  implicit class AnonHandlerOps[Self[thandlername] <: AnonHandler[thandlername], THandlerName] (val x: Self[THandlerName]) extends AnyVal {
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

