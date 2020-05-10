package typingsSlinky.resourcejs.mod

import typingsSlinky.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpMethodOptions extends js.Object {
  var after: js.UndefOr[HttpHandler] = js.native
  var before: js.UndefOr[HttpHandler] = js.native
}

object HttpMethodOptions {
  @scala.inline
  def apply(): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpMethodOptions]
  }
  @scala.inline
  implicit class HttpMethodOptionsOps[Self <: HttpMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
  }
  
}

