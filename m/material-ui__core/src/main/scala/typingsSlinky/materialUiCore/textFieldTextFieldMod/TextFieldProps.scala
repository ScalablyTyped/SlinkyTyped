package typingsSlinky.materialUiCore.textFieldTextFieldMod

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
  implicit def apply(value: FilledTextFieldProps): TextFieldProps = value.asInstanceOf[TextFieldProps]
  @scala.inline
  implicit def apply(value: OutlinedTextFieldProps): TextFieldProps = value.asInstanceOf[TextFieldProps]
  @scala.inline
  implicit def apply(value: StandardTextFieldProps): TextFieldProps = value.asInstanceOf[TextFieldProps]
}

