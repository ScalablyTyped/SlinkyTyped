package typingsSlinky.reactWidgets.commonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFocus extends js.Object {
  /**
    * Pass focus to component when it mounts.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
}

object AutoFocus {
  @scala.inline
  def apply(): AutoFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFocus]
  }
  @scala.inline
  implicit class AutoFocusOps[Self <: AutoFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
  }
  
}

