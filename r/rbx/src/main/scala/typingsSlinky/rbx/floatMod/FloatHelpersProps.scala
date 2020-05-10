package typingsSlinky.rbx.floatMod

import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloatHelpersProps extends js.Object {
  var clearfix: js.UndefOr[Boolean] = js.native
  var pull: js.UndefOr[left | right] = js.native
}

object FloatHelpersProps {
  @scala.inline
  def apply(): FloatHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatHelpersProps]
  }
  @scala.inline
  implicit class FloatHelpersPropsOps[Self <: FloatHelpersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearfix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearfix")(js.undefined)
        ret
    }
    @scala.inline
    def withPull(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
  }
  
}

