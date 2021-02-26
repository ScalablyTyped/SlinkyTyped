package typingsSlinky.bmapgl.anon

import typingsSlinky.bmapgl.bmapglStrings.LineString
import typingsSlinky.bmapgl.bmapglStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinates extends StObject {
  
  var coordinates: js.Array[_] = js.native
  
  var `type`: typingsSlinky.bmapgl.bmapglStrings.Point | LineString | Polygon = js.native
}
object Coordinates {
  
  @scala.inline
  def apply(coordinates: js.Array[_], `type`: typingsSlinky.bmapgl.bmapglStrings.Point | LineString | Polygon): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  @scala.inline
  implicit class CoordinatesMutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[_]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Any*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.bmapgl.bmapglStrings.Point | LineString | Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
