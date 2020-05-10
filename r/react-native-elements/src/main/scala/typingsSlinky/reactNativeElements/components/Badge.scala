package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.BadgeProps
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.error
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.primary
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.success
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  @JSImport("react-native-elements", "Badge")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Badge] {
    @scala.inline
    def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def badgeStyle(value: StyleProp[ViewStyle]): this.type = set("badgeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def badgeStyleNull: this.type = set("badgeStyle", null)
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def status(value: primary | success | warning | error): this.type = set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
    @scala.inline
    def valueReactElement(value: ReactElement): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: TagMod[Any]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

