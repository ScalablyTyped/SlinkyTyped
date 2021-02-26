package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerStyleMod {
  
  @JSImport("@ant-design/react-native/lib/picker/style", JSImport.Default)
  @js.native
  def default(): PickerStyle = js.native
  
  @js.native
  trait PickerStyle extends StObject {
    
    var actionText: TextStyle = js.native
    
    var dismissText: TextStyle = js.native
    
    var header: ViewStyle = js.native
    
    var headerItem: ViewStyle = js.native
    
    var modal: ViewStyle = js.native
    
    var okText: TextStyle = js.native
    
    var title: TextStyle = js.native
  }
  object PickerStyle {
    
    @scala.inline
    def apply(
      actionText: TextStyle,
      dismissText: TextStyle,
      header: ViewStyle,
      headerItem: ViewStyle,
      modal: ViewStyle,
      okText: TextStyle,
      title: TextStyle
    ): PickerStyle = {
      val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerStyle]
    }
    
    @scala.inline
    implicit class PickerStyleMutableBuilder[Self <: PickerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionText(value: TextStyle): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissText(value: TextStyle): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderItem(value: ViewStyle): Self = StObject.set(x, "headerItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: ViewStyle): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: TextStyle): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: TextStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
