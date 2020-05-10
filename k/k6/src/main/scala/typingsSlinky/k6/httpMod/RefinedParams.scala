package typingsSlinky.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefinedParams[RT /* <: js.UndefOr[ResponseType] */] extends Params {
  @JSName("responseType")
  var responseType_RefinedParams: js.UndefOr[RT] = js.native
}

object RefinedParams {
  @scala.inline
  def apply[RT](): RefinedParams[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefinedParams[RT]]
  }
  @scala.inline
  implicit class RefinedParamsOps[Self[rt] <: RefinedParams[rt], RT] (val x: Self[RT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RT] with Other]
    @scala.inline
    def withResponseType(value: RT): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
  }
  
}

