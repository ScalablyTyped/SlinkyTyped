package typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinButtonState extends js.Object {
  /**
    * Is true when the control has focus.
    */
  var isFocused: Boolean = js.native
  /**
    * keyboard spin direction, used to style the up or down button
    * as active when up/down arrow is pressed
    */
  var keyboardSpinDirection: KeyboardSpinDirection = js.native
  /**
    * the value of the spin button
    */
  var value: String = js.native
}

object ISpinButtonState {
  @scala.inline
  def apply(isFocused: Boolean, keyboardSpinDirection: KeyboardSpinDirection, value: String): ISpinButtonState = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], keyboardSpinDirection = keyboardSpinDirection.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonState]
  }
  @scala.inline
  implicit class ISpinButtonStateOps[Self <: ISpinButtonState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardSpinDirection(value: KeyboardSpinDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardSpinDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

