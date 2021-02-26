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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typingsSlinky.reactNative.mod.TouchableWithoutFeedbackPropsAndroid because Already inherited
- typingsSlinky.reactNative.mod.TouchableWithoutFeedbackPropsIOS because Already inherited
- typingsSlinky.reactNative.mod.AccessibilityProps because Already inherited
- typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps because Already inherited
- typingsSlinky.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, delayLongPress, delayPressIn, delayPressOut, disabled, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onBlur, onFocus, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID, touchSoundDisabled, tvParallaxProperties. Inlined useForeground, background */ @js.native
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
    * If the user is allowed to interact with the button
    *
    * @default false
    */
  @JSName("disabled")
  var disabled_ButtonProps: js.UndefOr[Boolean] = js.native
  
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
  implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
    
    @scala.inline
    def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    @scala.inline
    def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledTitleStyleNull: Self = StObject.set(x, "disabledTitleStyle", null)
    
    @scala.inline
    def setDisabledTitleStyleUndefined: Self = StObject.set(x, "disabledTitleStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: IconNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
    
    @scala.inline
    def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLinearGradientProps(value: js.Object): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingProps(value: ActivityIndicatorProperties): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    @scala.inline
    def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
    
    @scala.inline
    def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleProps(value: TextProperties): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTouchableComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "TouchableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchableComponentUndefined: Self = StObject.set(x, "TouchableComponent", js.undefined)
    
    @scala.inline
    def setType(value: solid | clear | outline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
    
    @scala.inline
    def setViewComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
