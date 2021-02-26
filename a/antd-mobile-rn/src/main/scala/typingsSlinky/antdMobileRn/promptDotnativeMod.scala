package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.BorderBottomRightRadius
import typingsSlinky.antdMobileRn.anon.BorderTopLeftRadius
import typingsSlinky.antdMobileRn.anon.BorderTopWidthBorderWidth
import typingsSlinky.antdMobileRn.anon.FlexDirectionMarginTop
import typingsSlinky.antdMobileRn.anon.FontSizeMarginTop
import typingsSlinky.antdMobileRn.anon.HeightPaddingHorizontal
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.input")
    @js.native
    def input: HeightPaddingHorizontal = js.native
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputFirst")
    @js.native
    def inputFirst: BorderTopLeftRadius = js.native
    @scala.inline
    def inputFirst_=(x: BorderTopLeftRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputGroup")
    @js.native
    def inputGroup: FlexDirectionMarginTop = js.native
    @scala.inline
    def inputGroup_=(x: FlexDirectionMarginTop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputGroup")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputLast")
    @js.native
    def inputLast: BorderBottomRightRadius = js.native
    @scala.inline
    def inputLast_=(x: BorderBottomRightRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputLast")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputWrapper")
    @js.native
    def inputWrapper: BorderTopWidthBorderWidth = js.native
    @scala.inline
    def inputWrapper_=(x: BorderTopWidthBorderWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputWrapper")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def input_=(x: HeightPaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.message")
    @js.native
    def message: FontSizeMarginTop = js.native
    @scala.inline
    def message_=(x: FontSizeMarginTop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPromptStyle extends StObject {
    
    var input: TextStyle = js.native
    
    var inputFirst: ViewStyle = js.native
    
    var inputGroup: ViewStyle = js.native
    
    var inputLast: ViewStyle = js.native
    
    var inputWrapper: ViewStyle = js.native
    
    var message: TextStyle = js.native
  }
  object IPromptStyle {
    
    @scala.inline
    def apply(
      input: TextStyle,
      inputFirst: ViewStyle,
      inputGroup: ViewStyle,
      inputLast: ViewStyle,
      inputWrapper: ViewStyle,
      message: TextStyle
    ): IPromptStyle = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPromptStyle]
    }
    
    @scala.inline
    implicit class IPromptStyleMutableBuilder[Self <: IPromptStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFirst(value: ViewStyle): Self = StObject.set(x, "inputFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputGroup(value: ViewStyle): Self = StObject.set(x, "inputGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputLast(value: ViewStyle): Self = StObject.set(x, "inputLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: TextStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
