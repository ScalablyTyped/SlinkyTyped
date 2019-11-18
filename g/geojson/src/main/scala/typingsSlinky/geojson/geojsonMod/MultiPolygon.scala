package typingsSlinky.geojson.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPolygon
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[js.Array[js.Array[Position]]]
  @JSName("type")
  var type_MultiPolygon: typingsSlinky.geojson.geojsonStrings.MultiPolygon
}

object MultiPolygon {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: typingsSlinky.geojson.geojsonStrings.MultiPolygon,
    bbox: BBox = null
  ): MultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPolygon]
  }
}

