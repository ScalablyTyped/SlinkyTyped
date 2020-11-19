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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackHeaderOptions extends js.Object {
  
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
  var headerTitleStyle: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any
  ] = js.native
  
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
  implicit class StackHeaderOptionsOps[Self <: StackHeaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeaderBackAllowFontScaling(value: Boolean): Self = this.set("headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackAllowFontScaling: Self = this.set("headerBackAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderBackImage(value: /* props */ TintColorString => ReactElement): Self = this.set("headerBackImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderBackImage: Self = this.set("headerBackImage", js.undefined)
    
    @scala.inline
    def setHeaderBackTitle(value: String): Self = this.set("headerBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackTitle: Self = this.set("headerBackTitle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = this.set("headerBackTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackTitleStyle: Self = this.set("headerBackTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleStyleNull: Self = this.set("headerBackTitleStyle", null)
    
    @scala.inline
    def setHeaderBackTitleVisible(value: Boolean): Self = this.set("headerBackTitleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackTitleVisible: Self = this.set("headerBackTitleVisible", js.undefined)
    
    @scala.inline
    def setHeaderBackground(value: /* props */ Style => ReactElement): Self = this.set("headerBackground", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderBackground: Self = this.set("headerBackground", js.undefined)
    
    @scala.inline
    def setHeaderLeft(value: /* props */ StackHeaderLeftButtonProps => ReactElement): Self = this.set("headerLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderLeft: Self = this.set("headerLeft", js.undefined)
    
    @scala.inline
    def setHeaderLeftContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerLeftContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderLeftContainerStyle: Self = this.set("headerLeftContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderPressColorAndroid(value: String): Self = this.set("headerPressColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderPressColorAndroid: Self = this.set("headerPressColorAndroid", js.undefined)
    
    @scala.inline
    def setHeaderRight(value: /* props */ TintColor => ReactElement): Self = this.set("headerRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderRight: Self = this.set("headerRight", js.undefined)
    
    @scala.inline
    def setHeaderRightContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerRightContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRightContainerStyle: Self = this.set("headerRightContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStatusBarHeight(value: Double): Self = this.set("headerStatusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStatusBarHeight: Self = this.set("headerStatusBarHeight", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTintColor(value: String): Self = this.set("headerTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTintColor: Self = this.set("headerTintColor", js.undefined)
    
    @scala.inline
    def setHeaderTitleFunction1(value: /* props */ StackHeaderTitleProps => ReactElement): Self = this.set("headerTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderTitle(value: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactElement])): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    
    @scala.inline
    def setHeaderTitleAlign(value: left | center): Self = this.set("headerTitleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleAlign: Self = this.set("headerTitleAlign", js.undefined)
    
    @scala.inline
    def setHeaderTitleAllowFontScaling(value: Boolean): Self = this.set("headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleAllowFontScaling: Self = this.set("headerTitleAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderTitleContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerTitleContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleContainerStyle: Self = this.set("headerTitleContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTitleStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>>['style'] */ js.Any
    ): Self = this.set("headerTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleStyle: Self = this.set("headerTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderTransparent(value: Boolean): Self = this.set("headerTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTransparent: Self = this.set("headerTransparent", js.undefined)
    
    @scala.inline
    def setHeaderTruncatedBackTitle(value: String): Self = this.set("headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTruncatedBackTitle: Self = this.set("headerTruncatedBackTitle", js.undefined)
  }
}
