package typingsSlinky.istanbulMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetOnGet extends js.Object {
  var resetOnGet: js.UndefOr[Boolean] = js.native
}

object ResetOnGet {
  @scala.inline
  def apply(): ResetOnGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetOnGet]
  }
  @scala.inline
  implicit class ResetOnGetOps[Self <: ResetOnGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResetOnGet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnGet")(js.undefined)
        ret
    }
  }
  
}

