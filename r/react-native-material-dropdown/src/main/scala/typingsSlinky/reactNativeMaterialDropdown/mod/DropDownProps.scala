package typingsSlinky.reactNativeMaterialDropdown.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMaterialDropdown.PartialDropDownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownProps extends TouchableWithoutFeedbackProps {
  /** Enable RTL layout */
  var absoluteRTLLayout: js.UndefOr[Boolean] = js.native
  /** Animation duration (default: 225) */
  var animationDuration: js.UndefOr[Double] = js.native
  /** Set base color (default: rgba(0, 0, 0, .38)) */
  var baseColor: js.UndefOr[String] = js.native
  /** Set container styles */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /** Dropdown data items */
  var data: js.Array[DropDownData] = js.native
  /** Set disabled item color */
  var disabledItemColor: js.UndefOr[String] = js.native
  /** Provide Dropdown margins */
  var dropdownMargins: js.UndefOr[DropDownMargins] = js.native
  /** Provide Dropdown top-left position */
  var dropdownOffset: js.UndefOr[DropDownOffset] = js.native
  /** Provide dropdown position (dynamic if undefined) */
  var dropdownPosition: js.UndefOr[Double] = js.native
  /** Set font size of dropdown items (default: 16) */
  var fontSize: js.UndefOr[Double] = js.native
  /** Hitslop insets (default: { top: 6, right: 4, bottom: 6, left: 4 }) */
  @JSName("hitSlop")
  var hitSlop_DropDownProps: js.UndefOr[DropDownInsets] = js.native
  /** Set input container styles */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /** Set Item color (default: rgba(0, 0, 0, .54)) */
  var itemColor: js.UndefOr[String] = js.native
  /** Set Item count (default: 4) */
  var itemCount: js.UndefOr[Double] = js.native
  /** Set Item padding (default: 8) */
  var itemPadding: js.UndefOr[Double] = js.native
  /** Set Item text style. */
  var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /** Label to be shown for dropdown */
  var label: js.UndefOr[String] = js.native
  /** Label extractor function. Extract label from item. */
  var labelExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.native
  /** Set font size of label (default: 12) */
  var labelFontSize: js.UndefOr[Double] = js.native
  /** Set the label styles */
  var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /** Event: When focus lost from dropdown */
  @JSName("onBlur")
  var onBlur_DropDownProps: js.UndefOr[js.Function0[Unit]] = js.native
  /** Event: When change selected item */
  var onChangeText: js.UndefOr[
    js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData], Unit]
  ] = js.native
  /** Event: When dropdown opens */
  @JSName("onFocus")
  var onFocus_DropDownProps: js.UndefOr[js.Function0[Unit]] = js.native
  /** Set overlay styles */
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /** Set picker styles */
  var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /** Props extractor function. Extract props from item. */
  var propsExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, PartialDropDownProps]] = js.native
  /** Render text field accessory */
  var renderAccessory: js.UndefOr[js.Function0[ReactElement]] = js.native
  /** Render base component */
  var renderBase: js.UndefOr[js.Function1[/* props */ RenderBaseProps, ReactElement]] = js.native
  /** Whether ripple be centered or not (default: false) */
  var rippleCentered: js.UndefOr[Boolean] = js.native
  /** Provide Ripple color */
  var rippleColor: js.UndefOr[String] = js.native
  /** Ripple duration (defailt: 400) */
  var rippleDuration: js.UndefOr[Double] = js.native
  /** Ripple insets  */
  var rippleInsets: js.UndefOr[DropDownInsets] = js.native
  /** Ripple opacity (default: 0.54) */
  var rippleOpacity: js.UndefOr[Double] = js.native
  /** Whether ripple rendered in sequential order (default: false)  */
  var rippleSequential: js.UndefOr[Boolean] = js.native
  /** Set selected item color */
  var selectedItemColor: js.UndefOr[String] = js.native
  /** Shade opacity (default: 0.12) */
  var shadeOpacity: js.UndefOr[Double] = js.native
  /** Specify which orientations are supported. (default: ['portrait', 'portrait-upside-down', 'landscape', 'landscape-left', 'landscape-right']) */
  var supportedOrientations: js.UndefOr[js.Array[String]] = js.native
  /** Set Text color (default: rgba(0, 0, 0, .87)) */
  var textColor: js.UndefOr[String] = js.native
  /** Use native driver (default: false) */
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  /** Selected value */
  var value: js.UndefOr[String | Double] = js.native
  /** Value extractor function. Extract value from item. */
  var valueExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.native
}

object DropDownProps {
  @scala.inline
  def apply(data: js.Array[DropDownData]): DropDownProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownProps]
  }
  @scala.inline
  implicit class DropDownPropsOps[Self <: DropDownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[DropDownData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteRTLLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteRTLLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteRTLLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteRTLLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withDisabledItemColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItemColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledItemColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledItemColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownMargins(value: DropDownMargins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMargins")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownOffset(value: DropDownOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHitSlop(value: DropDownInsets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(null)
        ret
    }
    @scala.inline
    def withItemColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemColor")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextStyle")(null)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLabelExtractor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextStyle")(null)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChangeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(null)
        ret
    }
    @scala.inline
    def withPickerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerStyle")(null)
        ret
    }
    @scala.inline
    def withPropsExtractor(value: (/* item */ DropDownData, /* index */ Double) => PartialDropDownProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propsExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPropsExtractor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propsExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAccessory(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAccessory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderAccessory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAccessory")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBase(value: /* props */ RenderBaseProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBase")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleCentered")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleInsets(value: DropDownInsets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleInsets")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleSequential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleSequential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleSequential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleSequential")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedOrientations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeDriver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValueExtractor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExtractor")(js.undefined)
        ret
    }
  }
  
}

