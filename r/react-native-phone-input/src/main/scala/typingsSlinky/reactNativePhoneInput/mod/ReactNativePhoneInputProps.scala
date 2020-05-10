package typingsSlinky.reactNativePhoneInput.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativePhoneInputProps[TextComponentType /* <: ReactComponentClass[js.Object] */] extends js.Object {
  /**
    * Allow user input 0 after country code
    */
  var allowZeroAfterCountryCode: js.UndefOr[Boolean] = js.native
  /**
    * Custom styles for country picker button
    */
  var buttonTextStyle: js.UndefOr[TextStyle] = js.native
  /**
    * Cancel word
    */
  var cancelText: js.UndefOr[String] = js.native
  /**
    * Confirm word
    */
  var confirmText: js.UndefOr[String] = js.native
  /**
    * Custom countries list
    */
  var countriesList: js.UndefOr[js.Array[CountriesListItem]] = js.native
  /**
    * If true, disable all interaction of this component
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Custom styles for flag image eg. {{width: 50, height: 30, borderWidth:0}}
    */
  var flagStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Initial selected country
    */
  var initialCountry: js.UndefOr[String] = js.native
  /**
    * Distance between flag and phone number
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Function to be invoked when phone number is changed
    */
  var onChangePhoneNumber: js.UndefOr[js.Function1[/* number */ Double, Unit]] = js.native
  /**
    * Function to be invoked when cancelling country picker selection
    */
  var onPressCancel: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function to be invoked when confirming country picker selection
    */
  var onPressConfirm: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function to be invoked when press on flag image
    */
  var onPressFlag: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function to be invoked when country picker is selected
    */
  var onSelectCountry: js.UndefOr[js.Function1[/* iso2 */ String, Unit]] = js.native
  /**
    * Set background color of country picker
    */
  var pickerBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Set button color of country picker
    */
  var pickerButtonColor: js.UndefOr[String] = js.native
  /**
    * Custom styles for text in country picker eg. {{fontSize: 14}}
    */
  var pickerItemStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Custom styles to be applied if supplied
    */
  var style: js.UndefOr[ViewStyle] = js.native
  /**
    * The input component to use
    */
  var textComponent: js.UndefOr[TextComponentType] = js.native
  /**
    * Properties for phone number text input eg. {{placeholder: 'Telephone number'}}
    */
  var textProps: js.UndefOr[ComponentProps[TextComponentType]] = js.native
  /**
    * Custom styles for phone number text input eg. {{fontSize: 14}}
    */
  var textStyle: js.UndefOr[TextStyle] = js.native
  /**
    * Initial phone number
    */
  var value: js.UndefOr[String] = js.native
}

object ReactNativePhoneInputProps {
  @scala.inline
  def apply[TextComponentType](): ReactNativePhoneInputProps[TextComponentType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativePhoneInputProps[TextComponentType]]
  }
  @scala.inline
  implicit class ReactNativePhoneInputPropsOps[Self[textcomponenttype] <: ReactNativePhoneInputProps[textcomponenttype], TextComponentType] (val x: Self[TextComponentType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TextComponentType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TextComponentType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TextComponentType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TextComponentType] with Other]
    @scala.inline
    def withAllowZeroAfterCountryCode(value: Boolean): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZeroAfterCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowZeroAfterCountryCode: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZeroAfterCountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonTextStyle(value: TextStyle): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTextStyle: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonTextStyleNull: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextStyle")(null)
        ret
    }
    @scala.inline
    def withCancelText(value: String): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmText(value: String): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmText: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(js.undefined)
        ret
    }
    @scala.inline
    def withCountriesList(value: js.Array[CountriesListItem]): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countriesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountriesList: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countriesList")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagStyle(value: ViewStyle): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagStyle: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagStyleNull: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagStyle")(null)
        ret
    }
    @scala.inline
    def withInitialCountry(value: String): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCountry: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangePhoneNumber(value: /* number */ Double => Unit): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangePhoneNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangePhoneNumber: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangePhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressCancel(value: () => Unit): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPressCancel: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressConfirm(value: () => Unit): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressConfirm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPressConfirm: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressFlag(value: () => Unit): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressFlag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPressFlag: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectCountry(value: /* iso2 */ String => Unit): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCountry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectCountry: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerBackgroundColor(value: String): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerBackgroundColor: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerButtonColor(value: String): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerButtonColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerButtonColor: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerButtonColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerItemStyle(value: ViewStyle): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerItemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerItemStyle: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerItemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerItemStyleNull: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerItemStyle")(null)
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTextComponent(value: TextComponentType): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComponent: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTextProps(value: ComponentProps[TextComponentType]): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextProps: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: TextStyle): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyleNull: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(null)
        ret
    }
    @scala.inline
    def withValue(value: String): Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[TextComponentType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

