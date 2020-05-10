package typingsSlinky.bootbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ButtonMap options for confirm and prompt modals */
@js.native
trait BootboxConfirmPromptButtonMap extends BootboxButtonMap {
  var cancel: BootboxButton | js.Function = js.native
  var confirm: BootboxButton | js.Function = js.native
}

object BootboxConfirmPromptButtonMap {
  @scala.inline
  def apply(cancel: BootboxButton | js.Function, confirm: BootboxButton | js.Function): BootboxConfirmPromptButtonMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxConfirmPromptButtonMap]
  }
  @scala.inline
  implicit class BootboxConfirmPromptButtonMapOps[Self <: BootboxConfirmPromptButtonMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: BootboxButton | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirm(value: BootboxButton | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

