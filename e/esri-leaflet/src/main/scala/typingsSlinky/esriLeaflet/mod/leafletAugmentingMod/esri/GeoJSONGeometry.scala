package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.Point
import typingsSlinky.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geojson.mod.Point
  - typingsSlinky.geojson.mod.Polygon
  - typingsSlinky.geojson.mod.LineString
*/
trait GeoJSONGeometry extends Geometry

object GeoJSONGeometry {
  @scala.inline
  implicit def apply(value: LineString): GeoJSONGeometry = value.asInstanceOf[GeoJSONGeometry]
  @scala.inline
  implicit def apply(value: Point): GeoJSONGeometry = value.asInstanceOf[GeoJSONGeometry]
  @scala.inline
  implicit def apply(value: Polygon): GeoJSONGeometry = value.asInstanceOf[GeoJSONGeometry]
}

