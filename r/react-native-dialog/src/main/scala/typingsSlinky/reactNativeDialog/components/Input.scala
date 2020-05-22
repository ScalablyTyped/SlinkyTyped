package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.InputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Input {
  @JSImport("react-native-dialog", "default.Input")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: InputProps[T] with ViewProps with TextInputProps): SharedBuilder_InputPropsViewPropsTextInputProps_70886183[typingsSlinky.reactNativeDialog.mod.default.Input[js.Any], T] = new SharedBuilder_InputPropsViewPropsTextInputProps_70886183[typingsSlinky.reactNativeDialog.mod.default.Input[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): SharedBuilder_InputPropsViewPropsTextInputProps_70886183[typingsSlinky.reactNativeDialog.mod.default.Input[js.Any], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_InputPropsViewPropsTextInputProps_70886183[typingsSlinky.reactNativeDialog.mod.default.Input[js.Any], T](js.Array(this.component, __props.asInstanceOf[InputProps[T] with ViewProps with TextInputProps]))
  }
  implicit def make[T](companion: Input.type): SharedBuilder_InputPropsViewPropsTextInputProps_70886183[typingsSlinky.reactNativeDialog.mod.default.Input[js.Any], T] = new SharedBuilder_InputPropsViewPropsTextInputProps_70886183[typingsSlinky.reactNativeDialog.mod.default.Input[js.Any], T](js.Array(this.component, js.Dictionary.empty))()
}

