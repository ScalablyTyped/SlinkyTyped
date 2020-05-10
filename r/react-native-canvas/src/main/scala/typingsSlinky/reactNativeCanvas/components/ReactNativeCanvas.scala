package typingsSlinky.reactNativeCanvas.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCanvas.mod.CanvasProps
import typingsSlinky.reactNativeCanvas.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCanvas {
  @JSImport("react-native-canvas", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def baseUrl(value: String): this.type = set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def originWhitelist(value: js.Array[String]): this.type = set("originWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: CanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeCanvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

