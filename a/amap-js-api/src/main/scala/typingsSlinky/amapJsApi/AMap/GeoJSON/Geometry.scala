package typingsSlinky.amapJsApi.AMap.GeoJSON

import typingsSlinky.amapJsApi.amapJsApiStrings.GeometryCollection
import typingsSlinky.amapJsApi.amapJsApiStrings.LineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiLineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPoint
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPolygon
import typingsSlinky.amapJsApi.amapJsApiStrings.Point
import typingsSlinky.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.anon.Coordinates
  - typingsSlinky.amapJsApi.anon.CoordinatesType
  - typingsSlinky.amapJsApi.anon.CoordinatesArray
  - typingsSlinky.amapJsApi.anon.Geometries
*/
trait Geometry extends js.Object
object Geometry {
  
  @scala.inline
  def Coordinates(coordinates: js.Tuple2[Double, Double], `type`: Point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  def CoordinatesType(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  def CoordinatesArray(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  def Geometries(
    geometries: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
    ],
    `type`: GeometryCollection
  ): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}
