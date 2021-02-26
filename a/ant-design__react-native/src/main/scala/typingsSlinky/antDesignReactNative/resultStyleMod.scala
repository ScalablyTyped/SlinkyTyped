package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultStyleMod {
  
  @JSImport("@ant-design/react-native/lib/result/style", JSImport.Default)
  @js.native
  def default(theme: Theme): ResultStyle = js.native
  
  @js.native
  trait ResultStyle extends StObject {
    
    var button: ViewStyle = js.native
    
    var buttonWrap: ViewStyle = js.native
    
    var img: ImageStyle = js.native
    
    var imgWrap: ViewStyle = js.native
    
    var message: ViewStyle = js.native
    
    var messageText: TextStyle = js.native
    
    var result: ViewStyle = js.native
    
    var title: ViewStyle = js.native
    
    var titleText: TextStyle = js.native
  }
  object ResultStyle {
    
    @scala.inline
    def apply(
      button: ViewStyle,
      buttonWrap: ViewStyle,
      img: ImageStyle,
      imgWrap: ViewStyle,
      message: ViewStyle,
      messageText: TextStyle,
      result: ViewStyle,
      title: ViewStyle,
      titleText: TextStyle
    ): ResultStyle = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonWrap = buttonWrap.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], imgWrap = imgWrap.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultStyle]
    }
    
    @scala.inline
    implicit class ResultStyleMutableBuilder[Self <: ResultStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: ViewStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWrap(value: ViewStyle): Self = StObject.set(x, "buttonWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImg(value: ImageStyle): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgWrap(value: ViewStyle): Self = StObject.set(x, "imgWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: ViewStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageText(value: TextStyle): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: ViewStyle): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ViewStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleText(value: TextStyle): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    }
  }
}
