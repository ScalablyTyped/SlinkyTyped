package typingsSlinky.antdMobileRn

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDotnativeMod {
  
  @js.native
  trait AccordionStyle extends StObject {
    
    var arrow: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var content: ViewStyle = js.native
    
    var contentText: TextStyle = js.native
    
    var header: ViewStyle = js.native
    
    var headerText: TextStyle = js.native
    
    var headerWrap: ViewStyle = js.native
  }
  object AccordionStyle {
    
    @scala.inline
    def apply(
      arrow: ViewStyle,
      container: ViewStyle,
      content: ViewStyle,
      contentText: TextStyle,
      header: ViewStyle,
      headerText: TextStyle,
      headerWrap: ViewStyle
    ): AccordionStyle = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionStyle]
    }
    
    @scala.inline
    implicit class AccordionStyleMutableBuilder[Self <: AccordionStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(value: ViewStyle): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentText(value: TextStyle): Self = StObject.set(x, "contentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderText(value: TextStyle): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
    }
  }
}
