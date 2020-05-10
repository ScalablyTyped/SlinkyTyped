package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBoxReturnValue extends js.Object {
  /**
    * The checked state of the checkbox if checkboxLabel was set. Otherwise false.
    */
  var checkboxChecked: Boolean = js.native
  /**
    * The index of the clicked button.
    */
  var response: Double = js.native
}

object MessageBoxReturnValue {
  @scala.inline
  def apply(checkboxChecked: Boolean, response: Double): MessageBoxReturnValue = {
    val __obj = js.Dynamic.literal(checkboxChecked = checkboxChecked.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxReturnValue]
  }
  @scala.inline
  implicit class MessageBoxReturnValueOps[Self <: MessageBoxReturnValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckboxChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

