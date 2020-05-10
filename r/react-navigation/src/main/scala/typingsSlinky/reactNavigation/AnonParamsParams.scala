package typingsSlinky.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParamsParams[Params] extends js.Object {
  var params: js.UndefOr[Params] = js.native
}

object AnonParamsParams {
  @scala.inline
  def apply[Params](): AnonParamsParams[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonParamsParams[Params]]
  }
  @scala.inline
  implicit class AnonParamsParamsOps[Self[params] <: AnonParamsParams[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withParams(value: Params): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

