package typingsSlinky.reactNavigationStack.vendorTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.anon.Style
import typingsSlinky.reactNavigationStack.anon.TintColor
import typingsSlinky.reactNavigationStack.anon.TintColorString
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.center
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackHeaderOptions extends StObject {
  
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
    * Extra padding to add at the top of header to account for translucent status bar.
    * By default, it uses the top value from the safe area insets of the device.
    * Pass 0 or a custom value to disable the default behaviour, and customize the height.
    */
  var headerStatusBarHeight: js.UndefOr[Double] = js.native
  
  /**
    * Style object for the header. You can specify a custom background color here, for example.
    */
  var headerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
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
}
object StackHeaderOptions {
  
  @scala.inline
  def apply(): StackHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackHeaderOptions]
  }
  
  @scala.inline
  implicit class StackHeaderOptionsMutableBuilder[Self <: StackHeaderOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaderStatusBarHeight(value: Double): Self = StObject.set(x, "headerStatusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStatusBarHeightUndefined: Self = StObject.set(x, "headerStatusBarHeight", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
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
  }
}
