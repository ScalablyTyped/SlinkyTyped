package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.amapJsApiStrings.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates
  extends typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry {
  var coordinates: js.Tuple2[Double, Double]
  var `type`: Point
}

object Coordinates {
  @scala.inline
  def apply(coordinates: js.Tuple2[Double, Double], `type`: Point): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
}

