package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupProps extends js.Object {
  /**
    * Choose other button component such as TouchableOpacity
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  /**
    * inherited styling	specify styling for button
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Array of buttons for component, if returning a component, must be an object with { element: componentName }
    */
  var buttons: js.Array[ElementObject | String] = js.native
  /**
    * Border radius for the container
    */
  var containerBorderRadius: js.UndefOr[Double] = js.native
  /**
    * Specify styling for main button container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Controls if buttons are disabled
    *
    * Setting `true` makes all of them disabled, while using an array only makes those indices disabled
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean | js.Array[Double]] = js.native
  /**
    * Styling for each selected button when disabled
    */
  var disabledSelectedStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Styling for the text of each selected button when disabled
    */
  var disabledSelectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Styling for each button when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Styling for the text of each button when disabled
    */
  var disabledTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * inherited styling	object { width, color }	update the styling of the interior border of the list of buttons
    */
  var innerBorderStyle: js.UndefOr[InnerBorderStyleProperty] = js.native
  /**
    * Styling for the final border edge
    */
  var lastBorderStyle: js.UndefOr[StyleProp[TextStyle | ViewStyle]] = js.native
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Allows the user to select multiple items
    *
    * @default false
    */
  var selectMultiple: js.UndefOr[Boolean] = js.native
  /**
    * Specify styling selected button
    *
    * @default 'white'
    */
  var selectedButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Current selected index of array of buttons
    */
  var selectedIndex: js.UndefOr[Double | Null] = js.native
  /**
    * The indexes that are selected. Used with 'selectMultiple'
    *
    * @default []
    */
  var selectedIndexes: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Specify specific styling for text in the selected state
    */
  var selectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Animate the touchable to a new opacity.
    */
  var setOpacityTo: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Specify specific styling for text
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Specify underlayColor for TouchableHighlight
    *
    * @default 'white'
    */
  var underlayColor: js.UndefOr[String] = js.native
  /**
    * Method to update Button Group Index
    */
  def onPress(selectedIndex: Double): Unit = js.native
}

object ButtonGroupProps {
  @scala.inline
  def apply(buttons: js.Array[ElementObject | String], onPress: Double => Unit): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[ButtonGroupProps]
  }
  @scala.inline
  implicit class ButtonGroupPropsOps[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[ElementObject | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPress(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[_]): Self = {
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
    def withContainerBorderRadius(value: Double): Self = {
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
    def withDisabled(value: Boolean | js.Array[Double]): Self = {
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
    def withDisabledSelectedStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withDisabledSelectedStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSelectedStyle")(null)
        ret
    }
    @scala.inline
    def withDisabledSelectedTextStyle(value: StyleProp[TextStyle]): Self = {
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
    def withDisabledSelectedTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSelectedTextStyle")(null)
        ret
    }
    @scala.inline
    def withDisabledStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withDisabledStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(null)
        ret
    }
    @scala.inline
    def withDisabledTextStyle(value: StyleProp[TextStyle]): Self = {
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
    def withDisabledTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTextStyle")(null)
        ret
    }
    @scala.inline
    def withInnerBorderStyle(value: InnerBorderStyleProperty): Self = {
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
    def withLastBorderStyle(value: StyleProp[TextStyle | ViewStyle]): Self = {
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
    def withLastBorderStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastBorderStyle")(null)
        ret
    }
    @scala.inline
    def withOnHideUnderlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHideUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowUnderlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShowUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectMultiple(value: Boolean): Self = {
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
    def withSelectedButtonStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withSelectedButtonStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedButtonStyle")(null)
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
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
    def withSelectedIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(null)
        ret
    }
    @scala.inline
    def withSelectedIndexes(value: js.Array[Double]): Self = {
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
    def withSelectedTextStyle(value: StyleProp[TextStyle]): Self = {
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
    def withSelectedTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextStyle")(null)
        ret
    }
    @scala.inline
    def withSetOpacityTo(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacityTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOpacityTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacityTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: StyleProp[TextStyle]): Self = {
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
    def withTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(null)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: String): Self = {
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

