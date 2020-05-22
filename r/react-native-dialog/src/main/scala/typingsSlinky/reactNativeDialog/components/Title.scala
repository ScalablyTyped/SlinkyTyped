package typingsSlinky.reactNativeDialog.components

import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeDialog.mod.TitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Title {
  @JSImport("react-native-dialog", "default.Title")
  @js.native
  object component extends js.Object
  
  def withProps(p: TitleProps with ViewProps with TextProps): SharedBuilder_TitlePropsViewPropsTextProps_1344350995[typingsSlinky.reactNativeDialog.mod.default.Title] = new SharedBuilder_TitlePropsViewPropsTextProps_1344350995[typingsSlinky.reactNativeDialog.mod.default.Title](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Title.type): SharedBuilder_TitlePropsViewPropsTextProps_1344350995[typingsSlinky.reactNativeDialog.mod.default.Title] = new SharedBuilder_TitlePropsViewPropsTextProps_1344350995[typingsSlinky.reactNativeDialog.mod.default.Title](js.Array(this.component, js.Dictionary.empty))()
}

