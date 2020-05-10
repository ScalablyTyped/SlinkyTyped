package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StatusBarProperties
import typingsSlinky.reactNative.mod.StatusBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.center
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.left
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderProps extends ViewProps {
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Sets backgroundColor of the parent component
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Background image source
    */
  var backgroundImage: js.UndefOr[ImageSourcePropType] = js.native
  /**
    * Styles for the background image in the container
    */
  var backgroundImageStyle: js.UndefOr[ImageStyle] = js.native
  /**
    * Sets the color of the status bar text.
    *
    * @default 'default'
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.native
  /**
    * Configuration object for default component (text: string, ...props for React Native Text component) valid React Element	define your center component here
    */
  var centerComponent: js.UndefOr[HeaderSubComponent] = js.native
  /**
    * Styles for the container surrounding the title
    */
  var centerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Styling for main container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon) or a valid React Element	define your left component here
    */
  var leftComponent: js.UndefOr[HeaderSubComponent] = js.native
  /**
    * Styling for container around the leftComponent
    */
  var leftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.native
  /**
    * Determines the alignment of the title
    *
    * @default 'center'
    */
  var placement: js.UndefOr[left | center | right] = js.native
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon component) or a valid React Element	define your right component here
    */
  var rightComponent: js.UndefOr[HeaderSubComponent] = js.native
  /**
    * Styling for container around the rightComponent
    */
  var rightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Accepts all props for StatusBar
    */
  var statusBarProps: js.UndefOr[StatusBarProperties] = js.native
}

object HeaderProps {
  @scala.inline
  def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImage(value: ImageSourcePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageStyle(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyle(value: StatusBarStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterComponentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterComponent(value: HeaderSubComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerContainerStyle")(null)
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
    def withLeftComponentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftComponent(value: HeaderSubComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftContainerStyle")(null)
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
    def withPlacement(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withRightComponentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightComponent(value: HeaderSubComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContainerStyle")(null)
        ret
    }
    @scala.inline
    def withStatusBarProps(value: StatusBarProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarProps")(js.undefined)
        ret
    }
  }
  
}

