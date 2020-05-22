package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.DescriptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogDescription {
  @JSImport("react-native-dialog", "Dialog.Description")
  @js.native
  object component extends js.Object
  
  def withProps(p: DescriptionProps with ViewProps with TextProps): SharedBuilder_DescriptionPropsViewPropsTextProps1493291014[typingsSlinky.reactNativeDialog.mod.Dialog.Description] = new SharedBuilder_DescriptionPropsViewPropsTextProps1493291014[typingsSlinky.reactNativeDialog.mod.Dialog.Description](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DialogDescription.type): SharedBuilder_DescriptionPropsViewPropsTextProps1493291014[typingsSlinky.reactNativeDialog.mod.Dialog.Description] = new SharedBuilder_DescriptionPropsViewPropsTextProps1493291014[typingsSlinky.reactNativeDialog.mod.Dialog.Description](js.Array(this.component, js.Dictionary.empty))()
}

