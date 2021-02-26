package typingsSlinky.reactScroll

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("react-scroll/modules/components/Element", JSImport.Default)
  @js.native
  class default ()
    extends Component[ElementProps, js.Object, js.Any]
  
  type Element = ReactComponentClass[ElementProps]
  
  @js.native
  trait ElementProps extends HTMLProps[HTMLDivElement] {
    
    @JSName("name")
    var name_ElementProps: String = js.native
  }
  object ElementProps {
    
    @scala.inline
    def apply(name: String): ElementProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementProps]
    }
    
    @scala.inline
    implicit class ElementPropsMutableBuilder[Self <: ElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
