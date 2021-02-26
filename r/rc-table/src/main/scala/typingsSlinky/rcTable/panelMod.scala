package typingsSlinky.rcTable

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("rc-table/lib/Panel", JSImport.Default)
  @js.native
  def default(hasClassNameChildren: TitleProps): ReactElement = js.native
  
  @js.native
  trait TitleProps extends StObject {
    
    var children: ReactElement = js.native
    
    var className: String = js.native
  }
  object TitleProps {
    
    @scala.inline
    def apply(className: String): TitleProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleProps]
    }
    
    @scala.inline
    implicit class TitlePropsMutableBuilder[Self <: TitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
}
