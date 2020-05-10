package typingsSlinky.antDesignReactNative.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.AnonNativeEvent
import typingsSlinky.antDesignReactNative.searchBarMod.SearchBarProps
import typingsSlinky.antDesignReactNative.searchBarMod.default
import typingsSlinky.antDesignReactNative.searchBarStyleMod.SearchBarStyle
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar {
  @JSImport("@ant-design/react-native/lib/search-bar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelText(value: String): this.type = set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onCancel(value: /* value */ String => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* value */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onChangeText(value: /* text */ String => Unit): this.type = set("onChangeText", js.Any.fromFunction1(value))
    @scala.inline
    def onClear(value: /* value */ String => Unit): this.type = set("onClear", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmit(value: /* value */ String => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmitEditing(value: /* event */ AnonNativeEvent => Unit): this.type = set("onSubmitEditing", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def showCancelButton(value: Boolean): this.type = set("showCancelButton", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: Partial[SearchBarStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SearchBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

