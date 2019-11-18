package typingsSlinky.geojson.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPoint
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[Position]
  @JSName("type")
  var type_MultiPoint: typingsSlinky.geojson.geojsonStrings.MultiPoint
}

object MultiPoint {
  @scala.inline
  def apply(
    coordinates: js.Array[Position],
    `type`: typingsSlinky.geojson.geojsonStrings.MultiPoint,
    bbox: BBox = null
  ): MultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPoint]
  }
}

