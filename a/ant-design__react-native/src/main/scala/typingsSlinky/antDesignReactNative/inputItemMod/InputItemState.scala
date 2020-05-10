package typingsSlinky.antDesignReactNative.inputItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputItemState extends js.Object {
  var focus: Boolean = js.native
}

object InputItemState {
  @scala.inline
  def apply(focus: Boolean): InputItemState = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputItemState]
  }
  @scala.inline
  implicit class InputItemStateOps[Self <: InputItemState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

