package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeVectorIcons.iconMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProps extends IconButtonProps {
  
  /**
    * View if no onPress method is defined, TouchableHighlight if onPress method is defined	React Native component	update React Native Component
    */
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  /**
    * FontAwesome5 brands icon set
    *
    * @default false
    */
  var brand: js.UndefOr[Boolean] = js.native
  
  /**
    * Add styling to container holding icon
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Styles for the Icon when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Adds box shadow to button
    *
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.native
  
  /**
    * Reverses color scheme
    *
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify reverse icon color
    *
    * @default 'white'
    */
  var reverseColor: js.UndefOr[String] = js.native
  
  /**
    * FontAwesome5 solid style
    *
    * @default false
    */
  var solid: js.UndefOr[Boolean] = js.native
  
  /**
    * Type (defaults to material, options are material-community, zocial, font-awesome, octicon, ionicon, foundation, evilicon, simple-line-icon, or entypo)
    * @default 'material'
    */
  var `type`: js.UndefOr[IconType] = js.native
}
object IconProps {
  
  @scala.inline
  def apply(name: String): IconProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ReactComponentClass[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setBrand(value: Boolean): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledStyleNull: Self = this.set("disabledStyle", null)
    
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setReverseColor(value: String): Self = this.set("reverseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseColor: Self = this.set("reverseColor", js.undefined)
    
    @scala.inline
    def setSolid(value: Boolean): Self = this.set("solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolid: Self = this.set("solid", js.undefined)
    
    @scala.inline
    def setType(value: IconType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
