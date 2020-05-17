package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.amapJsApiStrings.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coordinates
  extends typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry {
  var coordinates: js.Tuple2[Double, Double] = js.native
  var `type`: Point = js.native
}

object Coordinates {
  @scala.inline
  def apply(coordinates: js.Tuple2[Double, Double], `type`: Point): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  @scala.inline
  implicit class CoordinatesOps[Self <: Coordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

