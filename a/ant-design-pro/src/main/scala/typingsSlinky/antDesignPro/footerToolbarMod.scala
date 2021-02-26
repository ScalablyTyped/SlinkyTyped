package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerToolbarMod {
  
  @JSImport("ant-design-pro/lib/FooterToolbar", JSImport.Default)
  @js.native
  class default ()
    extends Component[FooterToolbarProps, js.Any, js.Any]
  
  type FooterToolbar = ReactComponentClass[FooterToolbarProps]
  
  @js.native
  trait FooterToolbarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var extra: ReactElement = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object FooterToolbarProps {
    
    @scala.inline
    def apply(): FooterToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterToolbarProps]
    }
    
    @scala.inline
    implicit class FooterToolbarPropsMutableBuilder[Self <: FooterToolbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
