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
trait Geometry extends GeoJSON

object Geometry {
  @scala.inline
  implicit def apply(value: GeometryCollection): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: LineString): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: MultiLineString): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: MultiPoint): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: MultiPolygon): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: Point): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: Polygon): Geometry = value.asInstanceOf[Geometry]
}

