package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anchorAnchorMod.AntAnchor
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorLinkMod {
  
  @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
  @js.native
  class default () extends AnchorLink
  object default {
    
    @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/anchor/AnchorLink", "default.contextType")
    @js.native
    def contextType: Context[AntAnchor] = js.native
    @scala.inline
    def contextType_=(x: Context[AntAnchor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/anchor/AnchorLink", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/anchor/AnchorLink", "default.defaultProps.href")
      @js.native
      def href: String = js.native
      @scala.inline
      def href_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("href")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnchorLink
    extends Component[AnchorLinkProps, js.Any, AntAnchor] {
    
    @JSName("componentDidMount")
    def componentDidMount_MAnchorLink(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAnchorLink(): Unit = js.native
    
    @JSName("context")
    var context_AnchorLink: AntAnchor = js.native
    
    def handleClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  }
  
  @js.native
  trait AnchorLinkProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var href: String = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var title: ReactElement = js.native
  }
  object AnchorLinkProps {
    
    @scala.inline
    def apply(href: String): AnchorLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorLinkProps]
    }
    
    @scala.inline
    implicit class AnchorLinkPropsMutableBuilder[Self <: AnchorLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
