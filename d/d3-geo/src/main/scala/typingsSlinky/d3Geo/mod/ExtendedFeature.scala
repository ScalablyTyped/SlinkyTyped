package typingsSlinky.d3Geo.mod

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedFeature[GeometryType /* <: GeoGeometryObjects | Null */, Properties /* <: GeoJsonProperties */] extends GeoJsonObject {
  var geometry: GeometryType
  var id: js.UndefOr[String | Double] = js.undefined
  var properties: Properties
}

object ExtendedFeature {
  @scala.inline
  def apply[GeometryType /* <: GeoGeometryObjects | Null */, Properties /* <: GeoJsonProperties */](
    geometry: GeometryType,
    properties: Properties,
    `type`: GeoJsonTypes,
    bbox: BBox = null,
    id: String | Double = null
  ): ExtendedFeature[GeometryType, Properties] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedFeature[GeometryType, Properties]]
  }
}

