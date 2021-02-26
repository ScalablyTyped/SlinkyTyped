package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.BlankTarget
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalFooterMod {
  
  @JSImport("ant-design-pro/lib/GlobalFooter", JSImport.Default)
  @js.native
  class default ()
    extends Component[GlobalFooterProps, js.Any, js.Any]
  
  type GlobalFooter = ReactComponentClass[GlobalFooterProps]
  
  @js.native
  trait GlobalFooterProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var copyright: js.UndefOr[ReactElement] = js.native
    
    var links: js.UndefOr[js.Array[BlankTarget]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object GlobalFooterProps {
    
    @scala.inline
    def apply(): GlobalFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalFooterProps]
    }
    
    @scala.inline
    implicit class GlobalFooterPropsMutableBuilder[Self <: GlobalFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCopyright(value: ReactElement): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightReactElement(value: ReactElement): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[BlankTarget]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setLinksVarargs(value: BlankTarget*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
