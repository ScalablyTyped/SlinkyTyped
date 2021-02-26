package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Style
import typingsSlinky.antdMobileRn.cardPropsTypeMod.CardFooterPropsType
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardFooterNativeMod {
  
  @JSImport("antd-mobile-rn/lib/card/CardFooter.native", JSImport.Default)
  @js.native
  class default () extends CardFooter
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/card/CardFooter.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/card/CardFooter.native", "default.defaultProps")
    @js.native
    def defaultProps: Style = js.native
    @scala.inline
    def defaultProps_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardFooter
    extends Component[CardFooterProps, js.Any, js.Any]
  
  @js.native
  trait CardFooterProps extends CardFooterPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
  }
  object CardFooterProps {
    
    @scala.inline
    def apply(): CardFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterProps]
    }
    
    @scala.inline
    implicit class CardFooterPropsMutableBuilder[Self <: CardFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
