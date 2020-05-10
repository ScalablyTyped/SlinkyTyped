package typingsSlinky.chayns

import typingsSlinky.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.dialog
  * interfaces
  */
// chayns.dialog.confirm()
@js.native
trait DialogButton extends js.Object {
  var buttonType: typingsSlinky.chayns.chayns.dialog.buttonType = js.native
  var text: String = js.native
}

object DialogButton {
  @scala.inline
  def apply(buttonType: buttonType, text: String): DialogButton = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogButton]
  }
  @scala.inline
  implicit class DialogButtonOps[Self <: DialogButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonType(value: buttonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

