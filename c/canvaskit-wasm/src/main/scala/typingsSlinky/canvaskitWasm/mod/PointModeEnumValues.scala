package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointModeEnumValues extends EmbindEnum {
  
  var Lines: PointMode = js.native
  
  var Points: PointMode = js.native
  
  var Polygon: PointMode = js.native
}
object PointModeEnumValues {
  
  @scala.inline
  def apply(Lines: PointMode, Points: PointMode, Polygon: PointMode, values: js.Array[Double]): PointModeEnumValues = {
    val __obj = js.Dynamic.literal(Lines = Lines.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointModeEnumValues]
  }
  
  @scala.inline
  implicit class PointModeEnumValuesMutableBuilder[Self <: PointModeEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLines(value: PointMode): Self = StObject.set(x, "Lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: PointMode): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon(value: PointMode): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
