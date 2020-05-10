package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.actionSheetStyleMod.ActionSheetStyle
import typingsSlinky.antDesignReactNative.androidContainerMod.ActionSheetNativeProps
import typingsSlinky.antDesignReactNative.androidContainerMod.default
import typingsSlinky.reactNative.mod.ActionSheetIOSOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AndroidContainer {
  @JSImport("@ant-design/react-native/lib/action-sheet/AndroidContainer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def callback(value: /* index */ Double => Unit): this.type = set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: Partial[ActionSheetStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionSheetNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(config: ActionSheetIOSOptions): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetNativeProps]))
  }
}

