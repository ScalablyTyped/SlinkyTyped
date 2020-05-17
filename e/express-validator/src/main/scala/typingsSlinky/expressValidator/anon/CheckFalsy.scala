package typingsSlinky.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckFalsy extends js.Object {
  var checkFalsy: js.UndefOr[Boolean] = js.native
  var checkNull: js.UndefOr[Boolean] = js.native
}

object CheckFalsy {
  @scala.inline
  def apply(): CheckFalsy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckFalsy]
  }
  @scala.inline
  implicit class CheckFalsyOps[Self <: CheckFalsy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckFalsy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFalsy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckFalsy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFalsy")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkNull")(js.undefined)
        ret
    }
  }
  
}

