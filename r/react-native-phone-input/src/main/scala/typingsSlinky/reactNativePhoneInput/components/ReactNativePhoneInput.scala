package typingsSlinky.reactNativePhoneInput.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativePhoneInput.mod.CountriesListItem
import typingsSlinky.reactNativePhoneInput.mod.ReactNativePhoneInputProps
import typingsSlinky.reactNativePhoneInput.mod.TextStyle
import typingsSlinky.reactNativePhoneInput.mod.ViewStyle
import typingsSlinky.reactNativePhoneInput.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativePhoneInput {
  @JSImport("react-native-phone-input", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.react.mod.ComponentType[js.Object] */ TextComponentType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[TextComponentType]] {
    @scala.inline
    def allowZeroAfterCountryCode(value: Boolean): this.type = set("allowZeroAfterCountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonTextStyle(value: TextStyle): this.type = set("buttonTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonTextStyleNull: this.type = set("buttonTextStyle", null)
    @scala.inline
    def cancelText(value: String): this.type = set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def confirmText(value: String): this.type = set("confirmText", value.asInstanceOf[js.Any])
    @scala.inline
    def countriesListVarargs(value: CountriesListItem*): this.type = set("countriesList", js.Array(value :_*))
    @scala.inline
    def countriesList(value: js.Array[CountriesListItem]): this.type = set("countriesList", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def flagStyle(value: ViewStyle): this.type = set("flagStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def flagStyleNull: this.type = set("flagStyle", null)
    @scala.inline
    def initialCountry(value: String): this.type = set("initialCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def onChangePhoneNumber(value: /* number */ Double => Unit): this.type = set("onChangePhoneNumber", js.Any.fromFunction1(value))
    @scala.inline
    def onPressCancel(value: () => Unit): this.type = set("onPressCancel", js.Any.fromFunction0(value))
    @scala.inline
    def onPressConfirm(value: () => Unit): this.type = set("onPressConfirm", js.Any.fromFunction0(value))
    @scala.inline
    def onPressFlag(value: () => Unit): this.type = set("onPressFlag", js.Any.fromFunction0(value))
    @scala.inline
    def onSelectCountry(value: /* iso2 */ String => Unit): this.type = set("onSelectCountry", js.Any.fromFunction1(value))
    @scala.inline
    def pickerBackgroundColor(value: String): this.type = set("pickerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pickerButtonColor(value: String): this.type = set("pickerButtonColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pickerItemStyle(value: ViewStyle): this.type = set("pickerItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def pickerItemStyleNull: this.type = set("pickerItemStyle", null)
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def textComponent(value: TextComponentType): this.type = set("textComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def textProps(value: ComponentProps[TextComponentType]): this.type = set("textProps", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps[/* <: typingsSlinky.react.mod.ComponentType[js.Object] */ TextComponentType](p: ReactNativePhoneInputProps[TextComponentType]): Builder[TextComponentType] = new Builder[TextComponentType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.react.mod.ComponentType[js.Object] */ TextComponentType](): Builder[TextComponentType] = {
    val __props = js.Dynamic.literal()
    new Builder[TextComponentType](js.Array(this.component, __props.asInstanceOf[ReactNativePhoneInputProps[TextComponentType]]))
  }
  implicit def make[/* <: typingsSlinky.react.mod.ComponentType[js.Object] */ TextComponentType](companion: ReactNativePhoneInput.type): Builder[TextComponentType] = new Builder[TextComponentType](js.Array(this.component, js.Dictionary.empty))()
}

