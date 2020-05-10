package typingsSlinky.baseui.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait initialState extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var isIndeterminate: js.UndefOr[Boolean] = js.native
}

object initialState {
  @scala.inline
  def apply(): initialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[initialState]
  }
  @scala.inline
  implicit class initialStateOps[Self <: initialState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndeterminate")(js.undefined)
        ret
    }
  }
  
}

