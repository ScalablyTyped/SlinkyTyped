package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.large
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.small
import typingsSlinky.antDesignReactNative.badgeMod.BadgeProps
import typingsSlinky.antDesignReactNative.badgeMod.default
import typingsSlinky.antDesignReactNative.badgeStyleMod.BadgeStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  @JSImport("@ant-design/react-native/lib/badge", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def corner(value: Boolean): this.type = set("corner", value.asInstanceOf[js.Any])
    @scala.inline
    def dot(value: Boolean): this.type = set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowCount(value: Double): this.type = set("overflowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: Partial[BadgeStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: js.Any): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

