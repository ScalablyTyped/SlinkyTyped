package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarStyleMod {
  
  @JSImport("@ant-design/react-native/lib/notice-bar/style", JSImport.Default)
  @js.native
  def default(variables: Theme): NoticeBarStyle = js.native
  
  @js.native
  trait NoticeBarStyle extends StObject {
    
    var actionWrap: ViewStyle = js.native
    
    var close: TextStyle = js.native
    
    var container: ViewStyle = js.native
    
    var content: TextStyle = js.native
    
    var left15: ViewStyle = js.native
    
    var left6: ViewStyle = js.native
    
    var link: TextStyle = js.native
    
    var notice: ViewStyle = js.native
  }
  object NoticeBarStyle {
    
    @scala.inline
    def apply(
      actionWrap: ViewStyle,
      close: TextStyle,
      container: ViewStyle,
      content: TextStyle,
      left15: ViewStyle,
      left6: ViewStyle,
      link: TextStyle,
      notice: ViewStyle
    ): NoticeBarStyle = {
      val __obj = js.Dynamic.literal(actionWrap = actionWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], left15 = left15.asInstanceOf[js.Any], left6 = left6.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticeBarStyle]
    }
    
    @scala.inline
    implicit class NoticeBarStyleMutableBuilder[Self <: NoticeBarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionWrap(value: ViewStyle): Self = StObject.set(x, "actionWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: TextStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: TextStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft15(value: ViewStyle): Self = StObject.set(x, "left15", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft6(value: ViewStyle): Self = StObject.set(x, "left6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: TextStyle): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice(value: ViewStyle): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
    }
  }
}
