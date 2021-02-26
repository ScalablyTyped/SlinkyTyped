package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defsMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Defs", JSImport.Default)
  @js.native
  class default ()
    extends Component[DefsProps, js.Object, js.Any]
  
  type Defs = ReactComponentClass[DefsProps]
  
  @js.native
  trait DefsProps extends StObject {
    
    var children: js.Array[ReactElement] | ReactElement = js.native
  }
  object DefsProps {
    
    @scala.inline
    def apply(): DefsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefsProps]
    }
    
    @scala.inline
    implicit class DefsPropsMutableBuilder[Self <: DefsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
}
