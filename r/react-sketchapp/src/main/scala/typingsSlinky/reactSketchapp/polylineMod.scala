package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Polyline", JSImport.Default)
  @js.native
  class default ()
    extends Component[PolylineProps, js.Object, js.Any]
  
  type Polyline = ReactComponentClass[PolylineProps]
  
  @js.native
  trait PolylineProps extends PathProps {
    
    var points: String = js.native
  }
  object PolylineProps {
    
    @scala.inline
    def apply(points: String): PolylineProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolylineProps]
    }
    
    @scala.inline
    implicit class PolylinePropsMutableBuilder[Self <: PolylineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
}
