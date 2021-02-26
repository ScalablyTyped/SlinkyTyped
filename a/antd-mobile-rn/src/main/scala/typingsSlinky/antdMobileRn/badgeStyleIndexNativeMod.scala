package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.BorderStyle
import typingsSlinky.antdMobileRn.anon.FlexDirectionString
import typingsSlinky.antdMobileRn.anon.Height
import typingsSlinky.antdMobileRn.anon.Overflow
import typingsSlinky.antdMobileRn.anon.Position
import typingsSlinky.antdMobileRn.anon.TextAlign
import typingsSlinky.antdMobileRn.anon.Top
import typingsSlinky.antdMobileRn.anon.Width
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.dot")
    @js.native
    def dot: Height = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.dotSizelarge")
    @js.native
    def dotSizelarge: Width = js.native
    @scala.inline
    def dotSizelarge_=(x: Width): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotSizelarge")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def dot_=(x: Height): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.text")
    @js.native
    def text: TextAlign = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textCorner")
    @js.native
    def textCorner: Position = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textCornerWrap")
    @js.native
    def textCornerWrap: Overflow = js.native
    @scala.inline
    def textCornerWrap_=(x: Overflow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textCornerWrap")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def textCorner_=(x: Position): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textCorner")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textCornerlarge")
    @js.native
    def textCornerlarge: Top = js.native
    @scala.inline
    def textCornerlarge_=(x: Top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textCornerlarge")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.textDom")
    @js.native
    def textDom: BorderStyle = js.native
    @scala.inline
    def textDom_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textDom")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def text_=(x: TextAlign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/badge/style/index.native", "default.wrap")
    @js.native
    def wrap: FlexDirectionString = js.native
    @scala.inline
    def wrap_=(x: FlexDirectionString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrap")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IBadgeStyle extends StObject {
    
    var dot: ViewStyle = js.native
    
    var dotSizelarge: ViewStyle = js.native
    
    var text: TextStyle = js.native
    
    var textCorner: ViewStyle = js.native
    
    var textCornerWrap: ViewStyle = js.native
    
    var textCornerlarge: ViewStyle = js.native
    
    var textDom: ViewStyle = js.native
    
    var wrap: ViewStyle = js.native
  }
  object IBadgeStyle {
    
    @scala.inline
    def apply(
      dot: ViewStyle,
      dotSizelarge: ViewStyle,
      text: TextStyle,
      textCorner: ViewStyle,
      textCornerWrap: ViewStyle,
      textCornerlarge: ViewStyle,
      textDom: ViewStyle,
      wrap: ViewStyle
    ): IBadgeStyle = {
      val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBadgeStyle]
    }
    
    @scala.inline
    implicit class IBadgeStyleMutableBuilder[Self <: IBadgeStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDot(value: ViewStyle): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSizelarge(value: ViewStyle): Self = StObject.set(x, "dotSizelarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TextStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCorner(value: ViewStyle): Self = StObject.set(x, "textCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCornerWrap(value: ViewStyle): Self = StObject.set(x, "textCornerWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCornerlarge(value: ViewStyle): Self = StObject.set(x, "textCornerlarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDom(value: ViewStyle): Self = StObject.set(x, "textDom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
