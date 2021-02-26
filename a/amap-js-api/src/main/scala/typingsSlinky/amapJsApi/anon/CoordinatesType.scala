package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.amapJsApiStrings.LineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPoint
import typingsSlinky.amapJsApi.amapJsApiStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinatesType
  extends typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry {
  
  var coordinates: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var `type`: MultiPoint | LineString | Polygon = js.native
}
object CoordinatesType {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): CoordinatesType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesType]
  }
  
  @scala.inline
  implicit class CoordinatesTypeMutableBuilder[Self <: CoordinatesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MultiPoint | LineString | Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
