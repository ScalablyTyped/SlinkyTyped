package typingsSlinky.antdMobile

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antdMobile.anon.Full
import typingsSlinky.antdMobile.anon.TypeofCardBody
import typingsSlinky.antdMobile.anon.TypeofCardFooter
import typingsSlinky.antdMobile.anon.TypeofCardHeader
import typingsSlinky.antdMobile.cardPropsTypeMod.CardPropsType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("antd-mobile/lib/card", JSImport.Default)
  @js.native
  class default () extends Card
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/card", "default.Body")
    @js.native
    def Body: TypeofCardBody = js.native
    @scala.inline
    def Body_=(x: TypeofCardBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/card", "default.Footer")
    @js.native
    def Footer: TypeofCardFooter = js.native
    @scala.inline
    def Footer_=(x: TypeofCardFooter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/card", "default.Header")
    @js.native
    def Header: TypeofCardHeader = js.native
    @scala.inline
    def Header_=(x: TypeofCardHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/card", "default.defaultProps")
    @js.native
    def defaultProps: Full = js.native
    @scala.inline
    def defaultProps_=(x: Full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Card
    extends Component[CardProps, js.Any, js.Any]
  
  @js.native
  trait CardProps
    extends HTMLProps[HTMLDivElement]
       with CardPropsType {
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object CardProps {
    
    @scala.inline
    def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    @scala.inline
    implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
