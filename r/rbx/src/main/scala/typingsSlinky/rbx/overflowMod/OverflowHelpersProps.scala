package typingsSlinky.rbx.overflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowHelpersProps extends js.Object {
  var clipped: js.UndefOr[Boolean] = js.native
}

object OverflowHelpersProps {
  @scala.inline
  def apply(): OverflowHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowHelpersProps]
  }
  @scala.inline
  implicit class OverflowHelpersPropsOps[Self <: OverflowHelpersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(js.undefined)
        ret
    }
  }
  
}

