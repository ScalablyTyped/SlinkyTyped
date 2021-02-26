package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.Full
import typingsSlinky.antdMobileRn.anon.TypeofCardBody
import typingsSlinky.antdMobileRn.anon.TypeofCardFooter
import typingsSlinky.antdMobileRn.anon.TypeofCardHeader
import typingsSlinky.antdMobileRn.cardPropsTypeMod.CardPropsType
import typingsSlinky.antdMobileRn.cardStyleIndexNativeMod.ICardStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/card/index.native", JSImport.Default)
  @js.native
  class default () extends Card
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/card/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.Body")
    @js.native
    def Body: TypeofCardBody = js.native
    @scala.inline
    def Body_=(x: TypeofCardBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.Footer")
    @js.native
    def Footer: TypeofCardFooter = js.native
    @scala.inline
    def Footer_=(x: TypeofCardFooter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.Header")
    @js.native
    def Header: TypeofCardHeader = js.native
    @scala.inline
    def Header_=(x: TypeofCardHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Full = js.native
    @scala.inline
    def defaultProps_=(x: Full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Card
    extends Component[CardNativeProps, js.Any, js.Any]
  
  @js.native
  trait CardNativeProps extends CardPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[ICardStyle] = js.native
  }
  object CardNativeProps {
    
    @scala.inline
    def apply(): CardNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardNativeProps]
    }
    
    @scala.inline
    implicit class CardNativePropsMutableBuilder[Self <: CardNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: ICardStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
