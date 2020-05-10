package typingsSlinky.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxState extends js.Object {
  val isFocus: Boolean = js.native
  val isHover: Boolean = js.native
}

object CheckboxState {
  @scala.inline
  def apply(isFocus: Boolean, isHover: Boolean): CheckboxState = {
    val __obj = js.Dynamic.literal(isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxState]
  }
  @scala.inline
  implicit class CheckboxStateOps[Self <: CheckboxState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

