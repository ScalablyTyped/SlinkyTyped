package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.AlignItemsFlexDirection
import typingsSlinky.antdMobileRn.anon.ColorString
import typingsSlinky.antdMobileRn.anon.HeightWidth
import typingsSlinky.antdMobileRn.anon.MarginLeftMarginRight
import typingsSlinky.antdMobileRn.anon.`0`
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/radio/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/radio/style/index.native", "default.icon")
    @js.native
    def icon: HeightWidth = js.native
    @scala.inline
    def icon_=(x: HeightWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/radio/style/index.native", "default.radioItem")
    @js.native
    def radioItem: AlignItemsFlexDirection = js.native
    
    @JSImport("antd-mobile-rn/lib/radio/style/index.native", "default.radioItemContent")
    @js.native
    def radioItemContent: `0` = js.native
    
    @JSImport("antd-mobile-rn/lib/radio/style/index.native", "default.radioItemContentDisable")
    @js.native
    def radioItemContentDisable: ColorString = js.native
    @scala.inline
    def radioItemContentDisable_=(x: ColorString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radioItemContentDisable")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def radioItemContent_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radioItemContent")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/radio/style/index.native", "default.radioItemRadio")
    @js.native
    def radioItemRadio: MarginLeftMarginRight = js.native
    @scala.inline
    def radioItemRadio_=(x: MarginLeftMarginRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radioItemRadio")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def radioItem_=(x: AlignItemsFlexDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radioItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/radio/style/index.native", "default.wrapper")
    @js.native
    def wrapper: AlignItemsFlexDirection = js.native
    @scala.inline
    def wrapper_=(x: AlignItemsFlexDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IRadioStyle extends StObject {
    
    var icon: ViewStyle = js.native
    
    var radioItem: ViewStyle = js.native
    
    var radioItemContent: TextStyle = js.native
    
    var radioItemContentDisable: TextStyle = js.native
    
    var radioItemRadio: ViewStyle = js.native
    
    var wrapper: ViewStyle = js.native
  }
  object IRadioStyle {
    
    @scala.inline
    def apply(
      icon: ViewStyle,
      radioItem: ViewStyle,
      radioItemContent: TextStyle,
      radioItemContentDisable: TextStyle,
      radioItemRadio: ViewStyle,
      wrapper: ViewStyle
    ): IRadioStyle = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRadioStyle]
    }
    
    @scala.inline
    implicit class IRadioStyleMutableBuilder[Self <: IRadioStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ViewStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItem(value: ViewStyle): Self = StObject.set(x, "radioItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItemContent(value: TextStyle): Self = StObject.set(x, "radioItemContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItemContentDisable(value: TextStyle): Self = StObject.set(x, "radioItemContentDisable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioItemRadio(value: ViewStyle): Self = StObject.set(x, "radioItemRadio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
