package typingsSlinky.reactNavigationStack.vendorTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.anon.Bottom
import typingsSlinky.reactNavigationStack.anon.Close
import typingsSlinky.reactNavigationStack.anon.Horizontal
import typingsSlinky.reactNavigationStack.anon.Style
import typingsSlinky.reactNavigationStack.anon.StyleWithAnimatedValue
import typingsSlinky.reactNavigationStack.anon.TintColor
import typingsSlinky.reactNavigationStack.anon.TintColorString
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.center
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.left
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.pop
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderOptions & std.Partial<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionPreset> & {  title :string | undefined,   header :(props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderProps): react.react.ReactNode | undefined,   headerShown :boolean | undefined,   cardShadowEnabled :boolean | undefined,   cardOverlayEnabled :boolean | undefined,   cardOverlay :(props : {  style :react-native.react-native.Animated.WithAnimatedValue<react-native.react-native.StyleProp<react-native.react-native.ViewStyle>>}): react.react.ReactNode | undefined,   cardStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   animationEnabled :boolean | undefined,   animationTypeForReplace :'push' | 'pop' | undefined,   gestureEnabled :boolean | undefined,   gestureResponseDistance :{  vertical :number | undefined,   horizontal :number | undefined} | undefined,   gestureVelocityImpact :number | undefined,   safeAreaInsets :{  top :number | undefined,   right :number | undefined,   bottom :number | undefined,   left :number | undefined} | undefined,   detachPreviousScreen :boolean | undefined,   onTransitionStart :(props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionCallbackProps): void | undefined,   onTransitionEnd :(props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionCallbackProps): void | undefined} */
@js.native
trait StackNavigationOptions extends StObject {
  
  /**
    * Whether transition animation should be enabled the screen.
    * If you set it to `false`, the screen won't animate when pushing or popping.
    * Defaults to `true` on Android and iOS, `false` on Web.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of animation to use when this screen replaces another screen. Defaults to `push`.
    * When `pop` is used, the `pop` animation is applied to the screen being replaced.
    */
  var animationTypeForReplace: js.UndefOr[push | pop] = js.native
  
  /**
    * Function that returns a React Element to display as a overlay for the card.
    */
  var cardOverlay: js.UndefOr[js.Function1[/* props */ StyleWithAnimatedValue, ReactElement]] = js.native
  
  /**
    * Whether to have a semi-transparent dark overlay visible under the card during transitions.
    * Defaults to `true` on Android and `false` on iOS.
    */
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether a shadow is visible for the card during transitions. Defaults to `true`.
    */
  var cardShadowEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Style object for the card in stack.
    * You can provide a custom background color to use instead of the default background here.
    *
    * You can also specify `{ backgroundColor: 'transparent' }` to make the previous screen visible underneath.
    * This is useful to implement things like modal dialogs.
    * If you use [`react-native-screens`](https://github.com/kmagiera/react-native-screens), you should also specify `mode: 'modal'`
    * in the stack view config when using a transparent background so previous screens aren't detached.
    */
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var cardStyleInterpolator: js.UndefOr[StackCardStyleInterpolator] = js.native
  
  /**
    * Whether to detach the previous screen from the view hierarchy to save memory.
    * Set it to `false` if you need the previous screen to be seen through the active screen.
    * Only applicable if `detachInactiveScreens` isn't set to `false`.
    * Defaults to `false` for the last screen when mode='modal', otherwise `true`.
    */
  var detachPreviousScreen: js.UndefOr[Boolean] = js.native
  
  var gestureDirection: js.UndefOr[GestureDirection] = js.native
  
  /**
    * Whether you can use gestures to dismiss this screen. Defaults to `true` on iOS, `false` on Android.
    * Not supported on Web.
    */
  var gestureEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Object to override the distance of touch start from the edge of the screen to recognize gestures.
    * Not supported on Web.
    */
  var gestureResponseDistance: js.UndefOr[Horizontal] = js.native
  
  /**
    * Number which determines the relevance of velocity for the gesture. Defaults to 0.3.
    * Not supported on Web.
    */
  var gestureVelocityImpact: js.UndefOr[Double] = js.native
  
  /**
    * Function that given `HeaderProps` returns a React Element to display as a header.
    */
  var header: js.UndefOr[js.Function1[/* props */ StackHeaderProps, ReactElement]] = js.native
  
  /**
    * Accessibility label for the header back button.
    */
  var headerBackAccessibilityLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether back button title font should scale to respect Text Size accessibility settings. Defaults to `false`.
    */
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Function which returns a React Element to display custom image in header's back button.
    * It receives the `tintColor` in in the options object as an argument. object.
    * Defaults to Image component with a the default back icon image for the platform (a chevron on iOS and an arrow on Android).
    */
  var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactElement]] = js.native
  
  /**
    * Title string used by the back button on iOS. Defaults to the previous scene's `headerTitle`.
    * Use `headerBackTitleVisible: false` to hide it.
    */
  var headerBackTitle: js.UndefOr[String] = js.native
  
  /**
    * Style object for the back title.
    */
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * A reasonable default is supplied for whether the back button title should be visible or not.
    * But if you want to override that you can use `true` or `false` in this option.
    */
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Function which returns a React Element to render as the background of the header.
    * This is useful for using backgrounds such as an image or a gradient.
    * You can use this with `headerTransparent` to render a blur view, for example, to create a translucent header.
    */
  var headerBackground: js.UndefOr[js.Function1[/* props */ Style, ReactElement]] = js.native
  
  /**
    * Function which returns a React Element to display on the left side of the header.
    * It receives a number of arguments when rendered (`onPress`, `label`, `labelStyle` and more.
    */
  var headerLeft: js.UndefOr[js.Function1[/* props */ StackHeaderLeftButtonProps, ReactElement]] = js.native
  
  /**
    * Style object for the container of the `headerLeft` component, for example to add padding.
    */
  var headerLeftContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  /**
    * Color for material ripple (Android >= 5.0 only).
    */
  var headerPressColorAndroid: js.UndefOr[String] = js.native
  
  /**
    * Function which returns a React Element to display on the right side of the header.
    */
  var headerRight: js.UndefOr[js.Function1[/* props */ TintColor, ReactElement]] = js.native
  
  /**
    * Style object for the container of the `headerRight` component, for example to add padding.
    */
  var headerRightContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  /**
    * Whether to show the header. The header is shown by default unless `headerMode` was set to `none`.
    * Setting this to `false` hides the header.
    */
  var headerShown: js.UndefOr[Boolean] = js.native
  
  /**
    * Extra padding to add at the top of header to account for translucent status bar.
    * By default, it uses the top value from the safe area insets of the device.
    * Pass 0 or a custom value to disable the default behaviour, and customize the height.
    */
  var headerStatusBarHeight: js.UndefOr[Double] = js.native
  
  /**
    * Style object for the header. You can specify a custom background color here, for example.
    */
  var headerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  var headerStyleInterpolator: js.UndefOr[StackHeaderStyleInterpolator] = js.native
  
  /**
    * Tint color for the header.
    */
  var headerTintColor: js.UndefOr[String] = js.native
  
  /**
    * String or a function that returns a React Element to be used by the header.
    * Defaults to scene `title`.
    * It receives `allowFontScaling`, `onLayout`, `style` and `children` in the options object as an argument.
    * The title string is passed in `children`.
    */
  var headerTitle: js.UndefOr[String | (js.Function1[/* props */ StackHeaderTitleProps, ReactElement])] = js.native
  
  /**
    * How to align the the header title.
    * Defaults to `center` on iOS and `left` on Android.
    */
  var headerTitleAlign: js.UndefOr[left | center] = js.native
  
  /**
    * Whether header title font should scale to respect Text Size accessibility settings. Defaults to `false`.
    */
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Style object for the container of the `headerTitle` component, for example to add padding.
    * By default, `headerTitleContainerStyle` is with an absolute position style and offsets both `left` and `right`.
    * This may lead to white space or overlap between `headerLeft` and `headerTitle` if a customized `headerLeft` is used.
    * It can be solved by adjusting `left` and `right` style in `headerTitleContainerStyle` and `marginHorizontal` in `headerTitleStyle`.
    */
  var headerTitleContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  /**
    * Style object for the title component.
    */
  var headerTitleStyle: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.native
  
  /**
    * Defaults to `false`. If `true`, the header will not have a background unless you explicitly provide it with `headerBackground`.
    * The header will also float over the screen so that it overlaps the content underneath.
    * This is useful if you want to render a semi-transparent header or a blurred background.
    */
  var headerTransparent: js.UndefOr[Boolean] = js.native
  
  /**
    * Title string used by the back button when `headerBackTitle` doesn't fit on the screen. `"Back"` by default.
    */
  var headerTruncatedBackTitle: js.UndefOr[String] = js.native
  
  var onTransitionEnd: js.UndefOr[js.Function1[/* props */ TransitionCallbackProps, Unit]] = js.native
  
  var onTransitionStart: js.UndefOr[js.Function1[/* props */ TransitionCallbackProps, Unit]] = js.native
  
  /**
    * Safe area insets for the screen. This is used to avoid elements like notch and status bar.
    * By default, the device's safe area insets are automatically detected. You can override the behavior with this option.
    * For example, to remove the extra spacing for status bar, pass `safeAreaInsets: { top: 0 }`.
    */
  var safeAreaInsets: js.UndefOr[Bottom] = js.native
  
  /**
    * String that can be displayed in the header as a fallback for `headerTitle`.
    */
  var title: js.UndefOr[String] = js.native
  
  var transitionSpec: js.UndefOr[Close] = js.native
}
object StackNavigationOptions {
  
  @scala.inline
  def apply(): StackNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackNavigationOptions]
  }
  
  @scala.inline
  implicit class StackNavigationOptionsMutableBuilder[Self <: StackNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    @scala.inline
    def setAnimationTypeForReplace(value: push | pop): Self = StObject.set(x, "animationTypeForReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeForReplaceUndefined: Self = StObject.set(x, "animationTypeForReplace", js.undefined)
    
    @scala.inline
    def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactElement): Self = StObject.set(x, "cardOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCardOverlayEnabled(value: Boolean): Self = StObject.set(x, "cardOverlayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardOverlayEnabledUndefined: Self = StObject.set(x, "cardOverlayEnabled", js.undefined)
    
    @scala.inline
    def setCardOverlayUndefined: Self = StObject.set(x, "cardOverlay", js.undefined)
    
    @scala.inline
    def setCardShadowEnabled(value: Boolean): Self = StObject.set(x, "cardShadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardShadowEnabledUndefined: Self = StObject.set(x, "cardShadowEnabled", js.undefined)
    
    @scala.inline
    def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = StObject.set(x, "cardStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCardStyleInterpolatorUndefined: Self = StObject.set(x, "cardStyleInterpolator", js.undefined)
    
    @scala.inline
    def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
    
    @scala.inline
    def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
    
    @scala.inline
    def setDetachPreviousScreen(value: Boolean): Self = StObject.set(x, "detachPreviousScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachPreviousScreenUndefined: Self = StObject.set(x, "detachPreviousScreen", js.undefined)
    
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureDirectionUndefined: Self = StObject.set(x, "gestureDirection", js.undefined)
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
    
    @scala.inline
    def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
    
    @scala.inline
    def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureVelocityImpactUndefined: Self = StObject.set(x, "gestureVelocityImpact", js.undefined)
    
    @scala.inline
    def setHeader(value: /* props */ StackHeaderProps => ReactElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderBackAccessibilityLabel(value: String): Self = StObject.set(x, "headerBackAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackAccessibilityLabelUndefined: Self = StObject.set(x, "headerBackAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setHeaderBackAllowFontScaling(value: Boolean): Self = StObject.set(x, "headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackAllowFontScalingUndefined: Self = StObject.set(x, "headerBackAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderBackImage(value: /* props */ TintColorString => ReactElement): Self = StObject.set(x, "headerBackImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderBackImageUndefined: Self = StObject.set(x, "headerBackImage", js.undefined)
    
    @scala.inline
    def setHeaderBackTitle(value: String): Self = StObject.set(x, "headerBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "headerBackTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackTitleStyleNull: Self = StObject.set(x, "headerBackTitleStyle", null)
    
    @scala.inline
    def setHeaderBackTitleStyleUndefined: Self = StObject.set(x, "headerBackTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleUndefined: Self = StObject.set(x, "headerBackTitle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleVisible(value: Boolean): Self = StObject.set(x, "headerBackTitleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackTitleVisibleUndefined: Self = StObject.set(x, "headerBackTitleVisible", js.undefined)
    
    @scala.inline
    def setHeaderBackground(value: /* props */ Style => ReactElement): Self = StObject.set(x, "headerBackground", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderBackgroundUndefined: Self = StObject.set(x, "headerBackground", js.undefined)
    
    @scala.inline
    def setHeaderLeft(value: /* props */ StackHeaderLeftButtonProps => ReactElement): Self = StObject.set(x, "headerLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderLeftContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerLeftContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLeftContainerStyleNull: Self = StObject.set(x, "headerLeftContainerStyle", null)
    
    @scala.inline
    def setHeaderLeftContainerStyleUndefined: Self = StObject.set(x, "headerLeftContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderLeftUndefined: Self = StObject.set(x, "headerLeft", js.undefined)
    
    @scala.inline
    def setHeaderPressColorAndroid(value: String): Self = StObject.set(x, "headerPressColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderPressColorAndroidUndefined: Self = StObject.set(x, "headerPressColorAndroid", js.undefined)
    
    @scala.inline
    def setHeaderRight(value: /* props */ TintColor => ReactElement): Self = StObject.set(x, "headerRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRightContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerRightContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRightContainerStyleNull: Self = StObject.set(x, "headerRightContainerStyle", null)
    
    @scala.inline
    def setHeaderRightContainerStyleUndefined: Self = StObject.set(x, "headerRightContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderRightUndefined: Self = StObject.set(x, "headerRight", js.undefined)
    
    @scala.inline
    def setHeaderShown(value: Boolean): Self = StObject.set(x, "headerShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderShownUndefined: Self = StObject.set(x, "headerShown", js.undefined)
    
    @scala.inline
    def setHeaderStatusBarHeight(value: Double): Self = StObject.set(x, "headerStatusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStatusBarHeightUndefined: Self = StObject.set(x, "headerStatusBarHeight", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "headerStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderStyleInterpolatorUndefined: Self = StObject.set(x, "headerStyleInterpolator", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTintColor(value: String): Self = StObject.set(x, "headerTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTintColorUndefined: Self = StObject.set(x, "headerTintColor", js.undefined)
    
    @scala.inline
    def setHeaderTitle(value: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactElement])): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleAlign(value: left | center): Self = StObject.set(x, "headerTitleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleAlignUndefined: Self = StObject.set(x, "headerTitleAlign", js.undefined)
    
    @scala.inline
    def setHeaderTitleAllowFontScaling(value: Boolean): Self = StObject.set(x, "headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleAllowFontScalingUndefined: Self = StObject.set(x, "headerTitleAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderTitleContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerTitleContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleContainerStyleNull: Self = StObject.set(x, "headerTitleContainerStyle", null)
    
    @scala.inline
    def setHeaderTitleContainerStyleUndefined: Self = StObject.set(x, "headerTitleContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTitleFunction1(value: /* props */ StackHeaderTitleProps => ReactElement): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderTitleStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "headerTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleStyleNull: Self = StObject.set(x, "headerTitleStyle", null)
    
    @scala.inline
    def setHeaderTitleStyleUndefined: Self = StObject.set(x, "headerTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
    
    @scala.inline
    def setHeaderTransparent(value: Boolean): Self = StObject.set(x, "headerTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTransparentUndefined: Self = StObject.set(x, "headerTransparent", js.undefined)
    
    @scala.inline
    def setHeaderTruncatedBackTitle(value: String): Self = StObject.set(x, "headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTruncatedBackTitleUndefined: Self = StObject.set(x, "headerTruncatedBackTitle", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: /* props */ TransitionCallbackProps => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionStart(value: /* props */ TransitionCallbackProps => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
    
    @scala.inline
    def setSafeAreaInsets(value: Bottom): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeAreaInsetsUndefined: Self = StObject.set(x, "safeAreaInsets", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransitionSpec(value: Close): Self = StObject.set(x, "transitionSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionSpecUndefined: Self = StObject.set(x, "transitionSpec", js.undefined)
  }
}
