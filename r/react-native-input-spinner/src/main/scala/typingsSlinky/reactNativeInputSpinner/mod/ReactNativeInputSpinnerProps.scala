package typingsSlinky.reactNativeInputSpinner.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeInputSpinner.reactNativeInputSpinnerStrings.float
import typingsSlinky.reactNativeInputSpinner.reactNativeInputSpinnerStrings.int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativeInputSpinnerProps extends js.Object {
  var activeOpacity: js.UndefOr[Double] = js.native
  var append: js.UndefOr[ReactElement] = js.native
  var arrows: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[String] = js.native
  var buttonFontFamily: js.UndefOr[String] = js.native
  var buttonFontSize: js.UndefOr[Double] = js.native
  var buttonLeftDisabled: js.UndefOr[Boolean] = js.native
  var buttonLeftImage: js.UndefOr[ReactElement] = js.native
  var buttonLeftText: js.UndefOr[String] = js.native
  var buttonPressLeftImage: js.UndefOr[ReactElement] = js.native
  var buttonPressRightImage: js.UndefOr[ReactElement] = js.native
  var buttonPressStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var buttonRightDisabled: js.UndefOr[Boolean] = js.native
  var buttonRightImage: js.UndefOr[ReactElement] = js.native
  var buttonRightText: js.UndefOr[String] = js.native
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var buttonTextColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var colorLeft: js.UndefOr[String] = js.native
  var colorMax: js.UndefOr[String] = js.native
  var colorMin: js.UndefOr[String] = js.native
  var colorPress: js.UndefOr[String] = js.native
  var colorRight: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var inputStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var max: js.UndefOr[String | Double] = js.native
  var min: js.UndefOr[String | Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], _]] = js.native
  var onDecrease: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var onIncrease: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var onMax: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var onMin: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var prepend: js.UndefOr[ReactElement] = js.native
  var rounded: js.UndefOr[Boolean] = js.native
  var showBorder: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[String | Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var textColor: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[int | float] = js.native
  var value: js.UndefOr[String | Double] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object ReactNativeInputSpinnerProps {
  @scala.inline
  def apply(): ReactNativeInputSpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativeInputSpinnerProps]
  }
  @scala.inline
  implicit class ReactNativeInputSpinnerPropsOps[Self <: ReactNativeInputSpinnerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLeftDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLeftDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLeftDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLeftDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLeftImage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLeftImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLeftImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLeftImage")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLeftText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLeftText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLeftText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLeftText")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPressLeftImage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressLeftImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPressLeftImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressLeftImage")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPressRightImage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressRightImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPressRightImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressRightImage")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPressStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPressStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPressStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPressStyle")(null)
        ret
    }
    @scala.inline
    def withButtonRightDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRightDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonRightDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRightDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonRightImage(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRightImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonRightImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRightImage")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonRightText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonRightText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonRightText")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(null)
        ret
    }
    @scala.inline
    def withButtonTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMax")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMin")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPress")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRight")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
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
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(null)
        ret
    }
    @scala.inline
    def withMax(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* val */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDecrease(value: /* val */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDecrease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDecrease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDecrease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIncrease(value: /* val */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIncrease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIncrease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIncrease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMax(value: /* val */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMax")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMin(value: /* val */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMin")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withRounded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
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
    def withType(value: int | float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

