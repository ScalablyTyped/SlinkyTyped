package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputItemStyleMod {
  
  @JSImport("@ant-design/react-native/lib/input-item/style", JSImport.Default)
  @js.native
  def default(theme: Theme): InputItemStyle = js.native
  
  @js.native
  trait InputItemStyle extends StObject {
    
    var clear: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var errorIcon: ViewStyle = js.native
    
    var extra: TextStyle = js.native
    
    var input: TextStyle = js.native
    
    var inputDisabled: TextStyle = js.native
    
    var inputErrorColor: TextStyle = js.native
    
    var text: TextStyle = js.native
  }
  object InputItemStyle {
    
    @scala.inline
    def apply(
      clear: ViewStyle,
      container: ViewStyle,
      errorIcon: ViewStyle,
      extra: TextStyle,
      input: TextStyle,
      inputDisabled: TextStyle,
      inputErrorColor: TextStyle,
      text: TextStyle
    ): InputItemStyle = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], inputErrorColor = inputErrorColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputItemStyle]
    }
    
    @scala.inline
    implicit class InputItemStyleMutableBuilder[Self <: InputItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: ViewStyle): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIcon(value: ViewStyle): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtra(value: TextStyle): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDisabled(value: TextStyle): Self = StObject.set(x, "inputDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputErrorColor(value: TextStyle): Self = StObject.set(x, "inputErrorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
