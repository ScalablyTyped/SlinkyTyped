package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Stop", JSImport.Default)
  @js.native
  class default ()
    extends Component[StopProps, js.Object, js.Any]
  
  type Stop = ReactComponentClass[StopProps]
  
  @js.native
  trait StopProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
    
    var stopColor: js.UndefOr[String] = js.native
    
    var stopOpacity: js.UndefOr[NumberProp] = js.native
  }
  object StopProps {
    
    @scala.inline
    def apply(): StopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopProps]
    }
    
    @scala.inline
    implicit class StopPropsMutableBuilder[Self <: StopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopOpacity(value: NumberProp): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    }
  }
}
