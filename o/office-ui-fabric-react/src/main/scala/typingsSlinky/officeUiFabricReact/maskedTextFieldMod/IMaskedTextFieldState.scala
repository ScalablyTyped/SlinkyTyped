package typingsSlinky.officeUiFabricReact.maskedTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaskedTextFieldState extends js.Object {
  /**
    * The mask string formatted with the input value.
    * This is what is displayed inside the TextField
    * @example
    *  `Phone Number: 12_ - 4___`
    */
  var displayValue: String = js.native
  /** The index into the rendered value of the first unfilled format character */
  var maskCursorPosition: js.UndefOr[Double] = js.native
}

object IMaskedTextFieldState {
  @scala.inline
  def apply(displayValue: String): IMaskedTextFieldState = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaskedTextFieldState]
  }
  @scala.inline
  implicit class IMaskedTextFieldStateOps[Self <: IMaskedTextFieldState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskCursorPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskCursorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskCursorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskCursorPosition")(js.undefined)
        ret
    }
  }
  
}

