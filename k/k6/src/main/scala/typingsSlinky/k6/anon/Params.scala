package typingsSlinky.k6.anon

import typingsSlinky.k6.httpMod.RefinedParams
import typingsSlinky.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
  var selector: js.UndefOr[String] = js.native
}

object Params {
  @scala.inline
  def apply[RT](): Params[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params[RT]]
  }
  @scala.inline
  implicit class ParamsOps[Self[rt] <: Params[rt], RT] (val x: Self[RT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RT] with Other]
    @scala.inline
    def withParams(value: RefinedParams[RT]): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsNull: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(null)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

