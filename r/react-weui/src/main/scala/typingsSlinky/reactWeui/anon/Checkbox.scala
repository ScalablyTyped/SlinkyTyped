package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox extends js.Object {
  var checkbox: Boolean = js.native
  var radio: Boolean = js.native
}

object Checkbox {
  @scala.inline
  def apply(checkbox: Boolean, radio: Boolean): Checkbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  @scala.inline
  implicit class CheckboxOps[Self <: Checkbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

