package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.AlignItemsFlexDirection
import typingsSlinky.antdMobileRn.anon.AlignSelf
import typingsSlinky.antdMobileRn.anon.HeightWidth
import typingsSlinky.antdMobileRn.anon.MarginLeftMarginRight
import typingsSlinky.antdMobileRn.anon.MarginLeftNumber
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/checkbox/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/checkbox/style/index.native", "default.agreeItem")
    @js.native
    def agreeItem: AlignItemsFlexDirection = js.native
    
    @JSImport("antd-mobile-rn/lib/checkbox/style/index.native", "default.agreeItemCheckbox")
    @js.native
    def agreeItemCheckbox: MarginLeftMarginRight = js.native
    @scala.inline
    def agreeItemCheckbox_=(x: MarginLeftMarginRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agreeItemCheckbox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def agreeItem_=(x: AlignItemsFlexDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agreeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/style/index.native", "default.checkboxItemCheckbox")
    @js.native
    def checkboxItemCheckbox: AlignSelf = js.native
    @scala.inline
    def checkboxItemCheckbox_=(x: AlignSelf): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkboxItemCheckbox")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/style/index.native", "default.icon")
    @js.native
    def icon: HeightWidth = js.native
    
    @JSImport("antd-mobile-rn/lib/checkbox/style/index.native", "default.iconRight")
    @js.native
    def iconRight: MarginLeftNumber = js.native
    @scala.inline
    def iconRight_=(x: MarginLeftNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def icon_=(x: HeightWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/style/index.native", "default.wrapper")
    @js.native
    def wrapper: AlignItemsFlexDirection = js.native
    @scala.inline
    def wrapper_=(x: AlignItemsFlexDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ICheckboxStyle extends StObject {
    
    var agreeItem: ViewStyle = js.native
    
    var agreeItemCheckbox: ViewStyle = js.native
    
    var checkboxItemCheckbox: ViewStyle = js.native
    
    var icon: ViewStyle = js.native
    
    var iconRight: ViewStyle = js.native
    
    var wrapper: ViewStyle = js.native
  }
  object ICheckboxStyle {
    
    @scala.inline
    def apply(
      agreeItem: ViewStyle,
      agreeItemCheckbox: ViewStyle,
      checkboxItemCheckbox: ViewStyle,
      icon: ViewStyle,
      iconRight: ViewStyle,
      wrapper: ViewStyle
    ): ICheckboxStyle = {
      val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckboxStyle]
    }
    
    @scala.inline
    implicit class ICheckboxStyleMutableBuilder[Self <: ICheckboxStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgreeItem(value: ViewStyle): Self = StObject.set(x, "agreeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgreeItemCheckbox(value: ViewStyle): Self = StObject.set(x, "agreeItemCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxItemCheckbox(value: ViewStyle): Self = StObject.set(x, "checkboxItemCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: ViewStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconRight(value: ViewStyle): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
