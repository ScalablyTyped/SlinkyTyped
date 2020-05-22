package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogButton {
  @JSImport("react-native-dialog", "Dialog.Button")
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonProps with ViewProps with TextProps): SharedBuilder_ButtonPropsViewPropsTextProps_620818419[typingsSlinky.reactNativeDialog.mod.Dialog.Button] = new SharedBuilder_ButtonPropsViewPropsTextProps_620818419[typingsSlinky.reactNativeDialog.mod.Dialog.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(label: String, onPress: () => Unit): SharedBuilder_ButtonPropsViewPropsTextProps_620818419[typingsSlinky.reactNativeDialog.mod.Dialog.Button] = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    new SharedBuilder_ButtonPropsViewPropsTextProps_620818419[typingsSlinky.reactNativeDialog.mod.Dialog.Button](js.Array(this.component, __props.asInstanceOf[ButtonProps with ViewProps with TextProps]))
  }
}

