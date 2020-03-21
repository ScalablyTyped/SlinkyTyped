package typingsSlinky.reactNativePhoneInput.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativePhoneInput.mod.CountriesListItem
import typingsSlinky.reactNativePhoneInput.mod.ReactNativePhoneInputProps
import typingsSlinky.reactNativePhoneInput.mod.TextStyle
import typingsSlinky.reactNativePhoneInput.mod.ViewStyle
import typingsSlinky.reactNativePhoneInput.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativePhoneInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-phone-input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply[TextComponentType /* <: ReactComponentClass[js.Object] */](
    allowZeroAfterCountryCode: js.UndefOr[Boolean] = js.undefined,
    buttonTextStyle: TextStyle = null,
    cancelText: String = null,
    confirmText: String = null,
    countriesList: js.Array[CountriesListItem] = null,
    flagStyle: ViewStyle = null,
    initialCountry: String = null,
    offset: Int | Double = null,
    onChangePhoneNumber: /* number */ Double => Unit = null,
    onPressCancel: () => Unit = null,
    onPressConfirm: () => Unit = null,
    onPressFlag: () => Unit = null,
    onSelectCountry: /* iso2 */ String => Unit = null,
    pickerBackgroundColor: String = null,
    pickerButtonColor: String = null,
    pickerItemStyle: ViewStyle = null,
    style: ViewStyle = null,
    textComponent: TextComponentType = null,
    textProps: ComponentProps[TextComponentType] = null,
    textStyle: TextStyle = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowZeroAfterCountryCode)) __obj.updateDynamic("allowZeroAfterCountryCode")(allowZeroAfterCountryCode.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (countriesList != null) __obj.updateDynamic("countriesList")(countriesList.asInstanceOf[js.Any])
    if (flagStyle != null) __obj.updateDynamic("flagStyle")(flagStyle.asInstanceOf[js.Any])
    if (initialCountry != null) __obj.updateDynamic("initialCountry")(initialCountry.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChangePhoneNumber != null) __obj.updateDynamic("onChangePhoneNumber")(js.Any.fromFunction1(onChangePhoneNumber))
    if (onPressCancel != null) __obj.updateDynamic("onPressCancel")(js.Any.fromFunction0(onPressCancel))
    if (onPressConfirm != null) __obj.updateDynamic("onPressConfirm")(js.Any.fromFunction0(onPressConfirm))
    if (onPressFlag != null) __obj.updateDynamic("onPressFlag")(js.Any.fromFunction0(onPressFlag))
    if (onSelectCountry != null) __obj.updateDynamic("onSelectCountry")(js.Any.fromFunction1(onSelectCountry))
    if (pickerBackgroundColor != null) __obj.updateDynamic("pickerBackgroundColor")(pickerBackgroundColor.asInstanceOf[js.Any])
    if (pickerButtonColor != null) __obj.updateDynamic("pickerButtonColor")(pickerButtonColor.asInstanceOf[js.Any])
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (textProps != null) __obj.updateDynamic("textProps")(textProps.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativePhoneInput.mod.default[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default[js.Any]] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativePhoneInput.mod.default[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactNativePhoneInputProps[js.Any]
}

