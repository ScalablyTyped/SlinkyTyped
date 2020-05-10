package typingsSlinky.reactNativeMaterialDesignSearchbar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ReturnKeyType
import typingsSlinky.reactNative.mod.ReturnKeyTypeAndroid
import typingsSlinky.reactNative.mod.ReturnKeyTypeIOS
import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeMaterialDesignSearchbar.mod.SearchBarProps
import typingsSlinky.reactNativeMaterialDesignSearchbar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMaterialDesignSearchbar {
  @JSImport("react-native-material-design-searchbar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def alwaysShowBackButton(value: Boolean): this.type = set("alwaysShowBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCorrect(value: Boolean): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def iconBackName(value: String): this.type = set("iconBackName", value.asInstanceOf[js.Any])
    @scala.inline
    def iconCloseName(value: String): this.type = set("iconCloseName", value.asInstanceOf[js.Any])
    @scala.inline
    def iconColor(value: String): this.type = set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def iconPadding(value: Double): this.type = set("iconPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def iconSearchName(value: String): this.type = set("iconSearchName", value.asInstanceOf[js.Any])
    @scala.inline
    def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: TextInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def inputStyle(value: TextStyle): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def onBackPress(value: () => Unit): this.type = set("onBackPress", js.Any.fromFunction0(value))
    @scala.inline
    def onBlur(value: () => Unit): this.type = set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onEndEditing(value: () => Unit): this.type = set("onEndEditing", js.Any.fromFunction0(value))
    @scala.inline
    def onFocus(value: () => Unit): this.type = set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def onSearchChange(value: /* text */ String => Unit): this.type = set("onSearchChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmitEditing(value: () => Unit): this.type = set("onSubmitEditing", js.Any.fromFunction0(value))
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholderColor(value: String): this.type = set("placeholderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def returnKeyType(value: ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(height: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SearchBarProps]))
  }
}

