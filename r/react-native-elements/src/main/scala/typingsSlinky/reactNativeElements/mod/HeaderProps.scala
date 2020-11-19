package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setViewComponent(value: ReactComponentClass[_]): Self = this.set("ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewComponent: Self = this.set("ViewComponent", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundImageVarargs(value: ImageURISource*): Self = this.set("backgroundImage", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundImage(value: ImageSourcePropType): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    
    @scala.inline
    def setBackgroundImageStyle(value: ImageStyle): Self = this.set("backgroundImageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImageStyle: Self = this.set("backgroundImageStyle", js.undefined)
    
    @scala.inline
    def setBarStyle(value: StatusBarStyle): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    
    @scala.inline
    def setCenterComponentReactElement(value: ReactElement): Self = this.set("centerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterComponent(value: HeaderSubComponent): Self = this.set("centerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterComponent: Self = this.set("centerComponent", js.undefined)
    
    @scala.inline
    def setCenterContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("centerContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterContainerStyle: Self = this.set("centerContainerStyle", js.undefined)
    
    @scala.inline
    def setCenterContainerStyleNull: Self = this.set("centerContainerStyle", null)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setLeftComponentReactElement(value: ReactElement): Self = this.set("leftComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftComponent(value: HeaderSubComponent): Self = this.set("leftComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftComponent: Self = this.set("leftComponent", js.undefined)
    
    @scala.inline
    def setLeftContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("leftContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftContainerStyle: Self = this.set("leftContainerStyle", js.undefined)
    
    @scala.inline
    def setLeftContainerStyleNull: Self = this.set("leftContainerStyle", null)
    
    @scala.inline
    def setLinearGradientProps(value: js.Object): Self = this.set("linearGradientProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinearGradientProps: Self = this.set("linearGradientProps", js.undefined)
    
    @scala.inline
    def setPlacement(value: left | center | right): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setRightComponentReactElement(value: ReactElement): Self = this.set("rightComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightComponent(value: HeaderSubComponent): Self = this.set("rightComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightComponent: Self = this.set("rightComponent", js.undefined)
    
    @scala.inline
    def setRightContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("rightContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightContainerStyle: Self = this.set("rightContainerStyle", js.undefined)
    
    @scala.inline
    def setRightContainerStyleNull: Self = this.set("rightContainerStyle", null)
    
    @scala.inline
    def setStatusBarProps(value: StatusBarProperties): Self = this.set("statusBarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarProps: Self = this.set("statusBarProps", js.undefined)
  }
}
