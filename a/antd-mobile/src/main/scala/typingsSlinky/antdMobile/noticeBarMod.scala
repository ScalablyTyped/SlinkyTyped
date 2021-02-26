package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.anon.Icon
import typingsSlinky.antdMobile.marqueeMod.MarqueeProps
import typingsSlinky.antdMobile.noticeBarPropsTypeMod.NoticeBarPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarMod {
  
  @JSImport("antd-mobile/lib/notice-bar", JSImport.Default)
  @js.native
  class default protected () extends NoticeBar {
    def this(props: NoticeWebProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/notice-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/notice-bar", "default.defaultProps")
    @js.native
    def defaultProps: Icon = js.native
    @scala.inline
    def defaultProps_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NoticeBar
    extends Component[NoticeWebProps, js.Any, js.Any] {
    
    def onClick(): Unit = js.native
  }
  
  @js.native
  trait NoticeWebProps extends NoticeBarPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var marqueeProps: js.UndefOr[MarqueeProps] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object NoticeWebProps {
    
    @scala.inline
    def apply(): NoticeWebProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeWebProps]
    }
    
    @scala.inline
    implicit class NoticeWebPropsMutableBuilder[Self <: NoticeWebProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMarqueeProps(value: MarqueeProps): Self = StObject.set(x, "marqueeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarqueePropsUndefined: Self = StObject.set(x, "marqueeProps", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
