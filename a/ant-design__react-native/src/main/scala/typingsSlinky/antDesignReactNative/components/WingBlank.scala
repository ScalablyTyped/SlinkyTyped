package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.lg
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.md
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.sm
import typingsSlinky.antDesignReactNative.wingBlankMod.WingBlankProps
import typingsSlinky.antDesignReactNative.wingBlankMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WingBlank {
  @JSImport("@ant-design/react-native/lib/wing-blank", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def size(value: sm | md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: WingBlankProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: WingBlank.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

