package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.leaflet.mod.GeoJSON_
import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.Marker_
import typingsSlinky.leaflet.mod.Polygon_
import typingsSlinky.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.leaflet.mod.Marker_[js.Any]
  - typingsSlinky.leaflet.mod.Polygon_[js.Any]
  - typingsSlinky.leaflet.mod.Polyline_[
typingsSlinky.geojson.mod.LineString | typingsSlinky.geojson.mod.MultiLineString, 
js.Any]
  - typingsSlinky.leaflet.mod.LatLngExpression
  - typingsSlinky.leaflet.mod.LatLngBounds_
  - typingsSlinky.leaflet.mod.GeoJSON_[js.Any]
*/
trait LeafletGeometry extends Geometry

object LeafletGeometry {
  @scala.inline
  implicit def apply(value: GeoJSON_[js.Any]): LeafletGeometry = value.asInstanceOf[LeafletGeometry]
  @scala.inline
  implicit def apply(value: LatLngBounds_): LeafletGeometry = value.asInstanceOf[LeafletGeometry]
  @scala.inline
  implicit def apply(value: LatLngExpression): LeafletGeometry = value.asInstanceOf[LeafletGeometry]
  @scala.inline
  implicit def apply(value: Marker_[js.Any]): LeafletGeometry = value.asInstanceOf[LeafletGeometry]
  @scala.inline
  implicit def apply(value: Polygon_[js.Any]): LeafletGeometry = value.asInstanceOf[LeafletGeometry]
  @scala.inline
  implicit def apply(value: Polyline_[LineString | MultiLineString, js.Any]): LeafletGeometry = value.asInstanceOf[LeafletGeometry]
}

