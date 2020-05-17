package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackspaceLabel extends js.Object {
  var backspaceLabel: String = js.native
  var cancelKeyboardLabel: String = js.native
  var confirmLabel: String = js.native
}

object BackspaceLabel {
  @scala.inline
  def apply(backspaceLabel: String, cancelKeyboardLabel: String, confirmLabel: String): BackspaceLabel = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackspaceLabel]
  }
  @scala.inline
  implicit class BackspaceLabelOps[Self <: BackspaceLabel] (val x: Self) extends AnyVal {
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

