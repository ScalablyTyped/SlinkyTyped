package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.amapJsApiStrings.MultiLineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinatesArray
  extends typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry {
  
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]] = js.native
  
  var `type`: MultiLineString | MultiPolygon = js.native
}
object CoordinatesArray {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): CoordinatesArray = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesArray]
  }
  
  @scala.inline
  implicit class CoordinatesArrayMutableBuilder[Self <: CoordinatesArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MultiLineString | MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
