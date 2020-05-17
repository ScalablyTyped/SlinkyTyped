package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.ElementObject
import typingsSlinky.reactNativeElements.mod.InnerBorderStyleProperty
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ButtonGroupProps>> */
@js.native
trait RecursivePartialPartialBu extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[_]]]] = js.native
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var buttonStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var buttons: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[ElementObject | String]]]] = js.native
  var containerBorderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | js.Array[Double]]]] = js.native
  var disabledSelectedStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var disabledSelectedTextStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var disabledTextStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var innerBorderStyle: js.UndefOr[RecursivePartial[js.UndefOr[InnerBorderStyleProperty]]] = js.native
  var lastBorderStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle | ViewStyle]]]] = js.native
  var onHideUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]]]] = js.native
  var onShowUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var selectMultiple: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var selectedButtonStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var selectedIndex: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var selectedIndexes: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[Double]]]] = js.native
  var selectedTextStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var setOpacityTo: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
}

object RecursivePartialPartialBu {
  @scala.inline
  def apply(): RecursivePartialPartialBu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBu]
  }
  @scala.inline
  implicit class RecursivePartialPartialBuOps[Self <: RecursivePartialPartialBu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withButtonStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withButtons(value: RecursivePartial[js.UndefOr[js.Array[ElementObject | String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerBorderRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withDisabled(value: RecursivePartial[js.UndefOr[Boolean | js.Array[Double]]]): Self = {
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
    def withDisabledSelectedStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSelectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledSelectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSelectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledSelectedTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSelectedTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledSelectedTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSelectedTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerBorderStyle(value: RecursivePartial[js.UndefOr[InnerBorderStyleProperty]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBorderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLastBorderStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle | ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastBorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastBorderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHideUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: RecursivePartial[js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShowUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectMultiple(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedButtonStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedButtonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndex(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndexes(value: RecursivePartial[js.UndefOr[js.Array[Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOpacityTo(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacityTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetOpacityTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacityTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

