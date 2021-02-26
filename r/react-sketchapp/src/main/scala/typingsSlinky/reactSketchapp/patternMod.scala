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

object patternMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Pattern", JSImport.Default)
  @js.native
  class default ()
    extends Component[PatternProps, js.Object, js.Any]
  
  type Pattern = ReactComponentClass[PatternProps]
  
  @js.native
  trait PatternProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
    
    var patternContentUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.native
    
    var patternTransform: js.UndefOr[String] = js.native
    
    var patternUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.native
    
    var x1: js.UndefOr[NumberProp] = js.native
    
    var x2: js.UndefOr[NumberProp] = js.native
    
    var y1: js.UndefOr[NumberProp] = js.native
    
    var y2: js.UndefOr[NumberProp] = js.native
  }
  object PatternProps {
    
    @scala.inline
    def apply(): PatternProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternProps]
    }
    
    @scala.inline
    implicit class PatternPropsMutableBuilder[Self <: PatternProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setPatternContentUnits(value: userSpaceOnUse | objectBoundingBox): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      @scala.inline
      def setPatternTransform(value: String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      @scala.inline
      def setPatternUnits(value: userSpaceOnUse | objectBoundingBox): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      @scala.inline
      def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
}
