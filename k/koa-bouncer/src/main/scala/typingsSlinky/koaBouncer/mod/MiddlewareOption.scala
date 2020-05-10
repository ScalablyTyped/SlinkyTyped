package typingsSlinky.koaBouncer.mod

import typingsSlinky.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareOption extends js.Object {
  var getBody: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
  var getParams: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
  var getQuery: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
}

object MiddlewareOption {
  @scala.inline
  def apply(): MiddlewareOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareOption]
  }
  @scala.inline
  implicit class MiddlewareOptionOps[Self <: MiddlewareOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBody(value: /* ctx */ Context => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBody")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParams(value: /* ctx */ Context => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParams")(js.undefined)
        ret
    }
    @scala.inline
    def withGetQuery(value: /* ctx */ Context => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuery")(js.undefined)
        ret
    }
  }
  
}

