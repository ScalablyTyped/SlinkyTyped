package typingsSlinky.officeUiFabricReact.textFieldBaseMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldState extends js.Object {
  /**
    * Dynamic error message returned by `onGetErrorMessage`.
    * Use `this._errorMessage` to get the actual current error message.
    */
  var errorMessage: String | ReactElement
  /** Is true when the control has focus. */
  var isFocused: js.UndefOr[Boolean] = js.undefined
  /** The currently displayed value if uncontrolled. */
  var uncontrolledValue: js.UndefOr[String] = js.undefined
}

object ITextFieldState {
  @scala.inline
  def apply(
    errorMessage: String | ReactElement,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    uncontrolledValue: String = null
  ): ITextFieldState = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (uncontrolledValue != null) __obj.updateDynamic("uncontrolledValue")(uncontrolledValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldState]
  }
}

