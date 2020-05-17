package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.error
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.primary
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.success
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  bottom ? :number,   left ? :number,   right ? :number,   top ? :number,   hidden ? :boolean,   containerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} & react-native-elements.react-native-elements.BadgeProps */
@js.native
trait bottomnumberleftnumberrig extends js.Object {
  /**
    * Custom component to replace the badge component
    *
    * @default View (if onPress then TouchableOpacity)
    */
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  /**
    * Additional styling for badge (background) view component
    */
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var bottom: js.UndefOr[Double] = js.native
  /**
    * Style for the container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var left: js.UndefOr[Double] = js.native
  /**
    * Function called when pressed on the badge
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var right: js.UndefOr[Double] = js.native
  /**
    * Determines color of the indicator
    *
    * @default primary
    */
  var status: js.UndefOr[primary | success | warning | error] = js.native
  /**
    * Style for the text in the badge
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var top: js.UndefOr[Double] = js.native
  /**
    * Text value to be displayed by badge
    *
    * @default null
    */
  var value: js.UndefOr[TagMod[Any]] = js.native
}

object bottomnumberleftnumberrig {
  @scala.inline
  def apply(): bottomnumberleftnumberrig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[bottomnumberleftnumberrig]
  }
  @scala.inline
  implicit class bottomnumberleftnumberrigOps[Self <: bottomnumberleftnumberrig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[js.Object]): Self = {
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
    def withBadgeStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeStyle")(null)
        ret
    }
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
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
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: primary | success | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withValueReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: TagMod[Any]): Self = {
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
  }
  
}

