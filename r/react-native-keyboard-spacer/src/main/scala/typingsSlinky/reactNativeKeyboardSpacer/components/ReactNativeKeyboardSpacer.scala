package typingsSlinky.reactNativeKeyboardSpacer.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeKeyboardSpacer.mod.KeyboardSpacerProps
import typingsSlinky.reactNativeKeyboardSpacer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeKeyboardSpacer {
  @JSImport("react-native-keyboard-spacer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onToggle(value: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Unit): this.type = set("onToggle", js.Any.fromFunction2(value))
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def topSpacing(value: Double): this.type = set("topSpacing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KeyboardSpacerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeKeyboardSpacer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

