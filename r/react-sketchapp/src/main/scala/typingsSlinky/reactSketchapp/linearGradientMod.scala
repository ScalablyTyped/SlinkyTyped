package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsSlinky.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearGradientMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/LinearGradient", JSImport.Default)
  @js.native
  class default ()
    extends Component[LinearGradientProps, js.Object, js.Any]
  
  type LinearGradient = ReactComponentClass[LinearGradientProps]
  
  @js.native
  trait LinearGradientProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
    
    var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var x1: NumberProp = js.native
    
    var x2: NumberProp = js.native
    
    var y1: NumberProp = js.native
    
    var y2: NumberProp = js.native
  }
  object LinearGradientProps {
    
    @scala.inline
    def apply(x1: NumberProp, x2: NumberProp, y1: NumberProp, y2: NumberProp): LinearGradientProps = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientProps]
    }
    
    @scala.inline
    implicit class LinearGradientPropsMutableBuilder[Self <: LinearGradientProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setGradientUnits(value: objectBoundingBox | userSpaceOnUse): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
