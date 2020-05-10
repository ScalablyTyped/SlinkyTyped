package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("react-native-dialog", "default.Button")
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonProps with ViewProps with TextProps): `SharedBuilder_<intersection>_620818419`[typingsSlinky.reactNativeDialog.mod.default.Button] = new `SharedBuilder_<intersection>_620818419`[typingsSlinky.reactNativeDialog.mod.default.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(label: String, onPress: () => Unit): `SharedBuilder_<intersection>_620818419`[typingsSlinky.reactNativeDialog.mod.default.Button] = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    new `SharedBuilder_<intersection>_620818419`[typingsSlinky.reactNativeDialog.mod.default.Button](js.Array(this.component, __props.asInstanceOf[ButtonProps with ViewProps with TextProps]))
  }
}

