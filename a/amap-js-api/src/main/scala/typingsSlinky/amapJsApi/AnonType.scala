package typingsSlinky.amapJsApi

import typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry
import typingsSlinky.amapJsApi.amapJsApiStrings.LineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPoint
import typingsSlinky.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends Geometry {
  var coordinates: js.Array[js.Tuple2[Double, Double]]
  var `type`: MultiPoint | LineString | Polygon
}

object AnonType {
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): AnonType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

