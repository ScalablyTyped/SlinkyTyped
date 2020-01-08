package typingsSlinky.amapDashJsDashApi.AMap.GeoJSON

import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.GeometryCollection
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.LineString
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.MultiLineString
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPoint
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPolygon
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.Point
import typingsSlinky.amapDashJsDashApi.amapDashJsDashApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapDashJsDashApi.Anon_Coordinates
  - typings.amapDashJsDashApi.Anon_CoordinatesLineString
  - typings.amapDashJsDashApi.Anon_CoordinatesMultiLineString
  - typings.amapDashJsDashApi.Anon_Geometries
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  def Anon_Coordinates(coordinates: js.Tuple2[Double, Double], `type`: Point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Anon_CoordinatesLineString(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Anon_CoordinatesMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Anon_Geometries(
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

