package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxColumnOption extends js.Object {
  var actionOnCheckbox: ActionOnCellCheckboxCheck = js.native
}

object CheckboxColumnOption {
  @scala.inline
  def apply(actionOnCheckbox: ActionOnCellCheckboxCheck): CheckboxColumnOption = {
    val __obj = js.Dynamic.literal(actionOnCheckbox = actionOnCheckbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxColumnOption]
  }
  @scala.inline
  implicit class CheckboxColumnOptionOps[Self <: CheckboxColumnOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionOnCheckbox(value: ActionOnCellCheckboxCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOnCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

