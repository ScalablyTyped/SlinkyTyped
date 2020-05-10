package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.DescriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Description {
  @JSImport("react-native-dialog", "default.Description")
  @js.native
  object component extends js.Object
  
  def withProps(p: DescriptionProps with ViewProps with TextProps): `SharedBuilder_<intersection>1493291014`[typingsSlinky.reactNativeDialog.mod.default.Description] = new `SharedBuilder_<intersection>1493291014`[typingsSlinky.reactNativeDialog.mod.default.Description](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Description.type): `SharedBuilder_<intersection>1493291014`[typingsSlinky.reactNativeDialog.mod.default.Description] = new `SharedBuilder_<intersection>1493291014`[typingsSlinky.reactNativeDialog.mod.default.Description](js.Array(this.component, js.Dictionary.empty))()
}

