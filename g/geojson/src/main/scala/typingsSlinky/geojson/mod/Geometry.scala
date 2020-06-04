package typingsSlinky.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geojson.mod.Point
  - typingsSlinky.geojson.mod.MultiPoint
  - typingsSlinky.geojson.mod.LineString
  - typingsSlinky.geojson.mod.MultiLineString
  - typingsSlinky.geojson.mod.Polygon
  - typingsSlinky.geojson.mod.MultiPolygon
  - typingsSlinky.geojson.mod.GeometryCollection
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  def LineString(coordinates: js.Array[Position], `type`: typingsSlinky.geojson.geojsonStrings.LineString): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiPoint(coordinates: js.Array[Position], `type`: typingsSlinky.geojson.geojsonStrings.MultiPoint): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Polygon(coordinates: js.Array[js.Array[Position]], `type`: typingsSlinky.geojson.geojsonStrings.Polygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def GeometryCollection(geometries: js.Array[Geometry], `type`: typingsSlinky.geojson.geojsonStrings.GeometryCollection): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiPolygon(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: typingsSlinky.geojson.geojsonStrings.MultiPolygon
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiLineString(
    coordinates: js.Array[js.Array[Position]],
    `type`: typingsSlinky.geojson.geojsonStrings.MultiLineString
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Point(coordinates: Position, `type`: typingsSlinky.geojson.geojsonStrings.Point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

