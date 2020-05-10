package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackspaceLabel extends js.Object {
  var backspaceLabel: String = js.native
  var cancelKeyboardLabel: String = js.native
  var confirmLabel: String = js.native
}

object AnonBackspaceLabel {
  @scala.inline
  def apply(backspaceLabel: String, cancelKeyboardLabel: String, confirmLabel: String): AnonBackspaceLabel = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackspaceLabel]
  }
  @scala.inline
  implicit class AnonBackspaceLabelOps[Self <: AnonBackspaceLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackspaceLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspaceLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelKeyboardLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelKeyboardLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

