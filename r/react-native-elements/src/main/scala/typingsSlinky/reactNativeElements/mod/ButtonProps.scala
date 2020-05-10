package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ActivityIndicatorProperties
import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.TouchableOpacityProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.clear
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.outline
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typingsSlinky.reactNative.mod.TouchableWithoutFeedbackPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityProps because Already inherited
- typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps because Already inherited
- typingsSlinky.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityStates, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, delayLongPress, delayPressIn, delayPressOut, disabled, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onBlur, onFocus, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID, tvParallaxProperties. Inlined background, useForeground */ @js.native
trait ButtonProps extends TouchableOpacityProps {
  /**
    * Specify other touchable such as TouchableOpacity/TouchableNativeFeedback
    *
    * Default is TouchableOpacity on IOS and TouchableNativeFeedback on Android
    */
  var TouchableComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Determines the type of background drawable that's going to be used to display feedback.
    * It takes an object with type property and extra data depending on the type.
    * It's recommended to use one of the following static methods to generate that dictionary:
    *      1) TouchableNativeFeedback.SelectableBackground() - will create object that represents android theme's
    *         default background for selectable elements (?android:attr/selectableItemBackground)
    *      2) TouchableNativeFeedback.SelectableBackgroundBorderless() - will create object that represent android
    *         theme's default background for borderless selectable elements
    *         (?android:attr/selectableItemBackgroundBorderless). Available on android API level 21+
    *      3) TouchableNativeFeedback.Ripple(color, borderless) - will create object that represents ripple drawable
    *         with specified color (as a string). If property borderless evaluates to true the ripple will render
    *         outside of the view bounds (see native actionbar buttons as an example of that behavior). This background
    *         type is available on Android API level 21+
    */
  var background: js.UndefOr[BackgroundPropType] = js.native
  /**
    * Additional styling for button (background) view component
    *
    * @default null
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Styling for Component container
    *
    * @default null
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Style of the button when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Style of the title when the button is disabled
    */
  var disabledTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Icon to show in the button
    */
  var icon: js.UndefOr[IconNode] = js.native
  /**
    * Style for the container around the icon
    */
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * If to show the icon on the right
    *
    * @default false
    */
  var iconRight: js.UndefOr[Boolean] = js.native
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.native
  /**
    * Display a loading spinner
    *
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * Additional props to applied to the ActivityIndicator
    */
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.native
  /**
    * Additional style to applied to the ActivityIndicator
    */
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * If the button has raised styling
    *
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.native
  /**
    * Button title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Optional props for the title inside the button
    */
  var titleProps: js.UndefOr[TextProperties] = js.native
  /**
    * Title styling
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Type of button
    *
    * @default solid
    */
  var `type`: js.UndefOr[solid | clear | outline] = js.native
  var useForeground: js.UndefOr[Boolean] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTouchableComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchableComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchableComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withViewComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: BackgroundPropType): Self = {
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
    def withDisabledTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTitleStyle")(null)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: IconNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(null)
        ret
    }
    @scala.inline
    def withIconRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(js.undefined)
        ret
    }
    @scala.inline
    def withLinearGradientProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearGradientProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearGradientProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearGradientProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingProps(value: ActivityIndicatorProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStyle")(null)
        ret
    }
    @scala.inline
    def withRaised(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raised")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaised: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raised")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleProps(value: TextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(null)
        ret
    }
    @scala.inline
    def withType(value: solid | clear | outline): Self = {
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
    def withUseForeground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForeground")(js.undefined)
        ret
    }
  }
  
}

