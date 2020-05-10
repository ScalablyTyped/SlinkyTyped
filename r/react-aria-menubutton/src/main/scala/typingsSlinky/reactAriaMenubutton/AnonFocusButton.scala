package typingsSlinky.reactAriaMenubutton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocusButton extends js.Object {
  /**
  		 * If `true`, the widget's button will receive focus when the
  		 * menu closes. Default: `false`.
  		 */
  var focusButton: Boolean = js.native
}

object AnonFocusButton {
  @scala.inline
  def apply(focusButton: Boolean): AnonFocusButton = {
    val __obj = js.Dynamic.literal(focusButton = focusButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusButton]
  }
  @scala.inline
  implicit class AnonFocusButtonOps[Self <: AnonFocusButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

