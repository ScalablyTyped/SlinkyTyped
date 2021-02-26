package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Polygon", JSImport.Default)
  @js.native
  class default ()
    extends Component[PolygonProps, js.Object, js.Any]
  
  type Polygon = ReactComponentClass[PolygonProps]
  
  @js.native
  trait PolygonProps extends PathProps {
    
    var points: String = js.native
  }
  object PolygonProps {
    
    @scala.inline
    def apply(points: String): PolygonProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolygonProps]
    }
    
    @scala.inline
    implicit class PolygonPropsMutableBuilder[Self <: PolygonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
}
