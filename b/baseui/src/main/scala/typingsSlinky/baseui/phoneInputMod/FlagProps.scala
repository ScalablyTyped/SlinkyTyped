package typingsSlinky.baseui.phoneInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagProps extends js.Object {
  var iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any = js.native
  var width: js.UndefOr[String] = js.native
}

object FlagProps {
  @scala.inline
  def apply(iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any): FlagProps = {
    val __obj = js.Dynamic.literal(iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagProps]
  }
  @scala.inline
  implicit class FlagPropsOps[Self <: FlagProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIso(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

