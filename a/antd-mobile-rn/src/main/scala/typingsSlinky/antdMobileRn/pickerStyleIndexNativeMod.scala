package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.AlignItemsBorderBottomColor
import typingsSlinky.antdMobileRn.anon.AlignItemsFlex
import typingsSlinky.antdMobileRn.anon.ColorFontSizeTextAlign
import typingsSlinky.antdMobileRn.anon.FlexFlexDirectionJustifyContent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.actionText")
    @js.native
    def actionText: ColorFontSizeTextAlign = js.native
    @scala.inline
    def actionText_=(x: ColorFontSizeTextAlign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actionText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.header")
    @js.native
    def header: AlignItemsBorderBottomColor = js.native
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.headerItem")
    @js.native
    def headerItem: AlignItemsFlex = js.native
    @scala.inline
    def headerItem_=(x: AlignItemsFlex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerItem")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def header_=(x: AlignItemsBorderBottomColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("header")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.modal")
    @js.native
    def modal: FlexFlexDirectionJustifyContent = js.native
    @scala.inline
    def modal_=(x: FlexFlexDirectionJustifyContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modal")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/style/index.native", "default.title")
    @js.native
    def title: ColorFontSizeTextAlign = js.native
    @scala.inline
    def title_=(x: ColorFontSizeTextAlign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPickerStyle extends StObject {
    
    var actionText: TextStyle = js.native
    
    var header: ViewStyle = js.native
    
    var headerItem: ViewStyle = js.native
    
    var modal: ViewStyle = js.native
    
    var title: TextStyle = js.native
  }
  object IPickerStyle {
    
    @scala.inline
    def apply(
      actionText: TextStyle,
      header: ViewStyle,
      headerItem: ViewStyle,
      modal: ViewStyle,
      title: TextStyle
    ): IPickerStyle = {
      val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerStyle]
    }
    
    @scala.inline
    implicit class IPickerStyleMutableBuilder[Self <: IPickerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionText(value: TextStyle): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderItem(value: ViewStyle): Self = StObject.set(x, "headerItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: ViewStyle): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: TextStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
