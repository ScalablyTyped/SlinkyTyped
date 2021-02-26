package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Rect", JSImport.Default)
  @js.native
  class default ()
    extends Component[RectProps, js.Object, js.Any]
  
  type Rect = ReactComponentClass[RectProps]
  
  @js.native
  trait RectProps extends PathProps {
    
    var height: NumberProp = js.native
    
    var rx: js.UndefOr[NumberProp] = js.native
    
    var ry: js.UndefOr[NumberProp] = js.native
    
    var width: NumberProp = js.native
    
    @JSName("x")
    var x_RectProps: NumberProp = js.native
    
    @JSName("y")
    var y_RectProps: NumberProp = js.native
  }
  object RectProps {
    
    @scala.inline
    def apply(height: NumberProp, width: NumberProp, x: NumberProp, y: NumberProp): RectProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectProps]
    }
    
    @scala.inline
    implicit class RectPropsMutableBuilder[Self <: RectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
