package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.TitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogTitle {
  @JSImport("react-native-dialog", "Dialog.Title")
  @js.native
  object component extends js.Object
  
  def withProps(p: TitleProps with ViewProps with TextProps): `SharedBuilder_<intersection>_1344350995`[typingsSlinky.reactNativeDialog.mod.Dialog.Title] = new `SharedBuilder_<intersection>_1344350995`[typingsSlinky.reactNativeDialog.mod.Dialog.Title](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DialogTitle.type): `SharedBuilder_<intersection>_1344350995`[typingsSlinky.reactNativeDialog.mod.Dialog.Title] = new `SharedBuilder_<intersection>_1344350995`[typingsSlinky.reactNativeDialog.mod.Dialog.Title](js.Array(this.component, js.Dictionary.empty))()
}

