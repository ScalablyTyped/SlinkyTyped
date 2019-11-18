package typingsSlinky.d3DashContour.d3DashContourMod

import typingsSlinky.geojson.geojsonMod.BBox
import typingsSlinky.geojson.geojsonMod.MultiPolygon
import typingsSlinky.geojson.geojsonMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContourMultiPolygon extends MultiPolygon {
  /**
    * Threshold value of the contour.
    */
  var value: Double
}

object ContourMultiPolygon {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: typingsSlinky.geojson.geojsonStrings.MultiPolygon,
    value: Double,
    bbox: BBox = null
  ): ContourMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourMultiPolygon]
  }
}

