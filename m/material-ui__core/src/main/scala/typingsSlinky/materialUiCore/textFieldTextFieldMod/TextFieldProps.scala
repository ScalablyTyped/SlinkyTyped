package typingsSlinky.materialUiCore.textFieldTextFieldMod

import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.materialUiCore.textFieldTextFieldMod.StandardTextFieldProps
  - typingsSlinky.materialUiCore.textFieldTextFieldMod.FilledTextFieldProps
  - typingsSlinky.materialUiCore.textFieldTextFieldMod.OutlinedTextFieldProps
*/
trait TextFieldProps extends js.Object

object TextFieldProps {
  @scala.inline
  def StandardTextFieldProps(): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldProps]
  }
  @scala.inline
  def FilledTextFieldProps(variant: filled): TextFieldProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
  @scala.inline
  def OutlinedTextFieldProps(variant: outlined): TextFieldProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

