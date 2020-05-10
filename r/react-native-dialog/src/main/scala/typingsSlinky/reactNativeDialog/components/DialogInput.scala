package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.InputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogInput {
  @JSImport("react-native-dialog", "Dialog.Input")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: InputProps[T] with ViewProps with TextInputProps): `SharedBuilder_<intersection>_70886183`[typingsSlinky.reactNativeDialog.mod.Dialog.Input[js.Any], T] = new `SharedBuilder_<intersection>_70886183`[typingsSlinky.reactNativeDialog.mod.Dialog.Input[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: DialogInput.type): `SharedBuilder_<intersection>_70886183`[typingsSlinky.reactNativeDialog.mod.Dialog.Input[js.Any], T] = new `SharedBuilder_<intersection>_70886183`[typingsSlinky.reactNativeDialog.mod.Dialog.Input[js.Any], T](js.Array(this.component, js.Dictionary.empty))()
}

