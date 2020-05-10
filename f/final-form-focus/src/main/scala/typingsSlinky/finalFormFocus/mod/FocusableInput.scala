package typingsSlinky.finalFormFocus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusableInput extends js.Object {
  var name: String = js.native
  def focus(): Unit = js.native
}

object FocusableInput {
  @scala.inline
  def apply(focus: () => Unit, name: String): FocusableInput = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusableInput]
  }
  @scala.inline
  implicit class FocusableInputOps[Self <: FocusableInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

