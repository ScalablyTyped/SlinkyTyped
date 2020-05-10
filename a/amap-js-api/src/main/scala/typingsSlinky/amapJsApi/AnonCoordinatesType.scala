package typingsSlinky.amapJsApi

import typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry
import typingsSlinky.amapJsApi.amapJsApiStrings.LineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPoint
import typingsSlinky.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoordinatesType extends Geometry {
  var coordinates: js.Array[js.Tuple2[Double, Double]] = js.native
  var `type`: MultiPoint | LineString | Polygon = js.native
}

object AnonCoordinatesType {
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): AnonCoordinatesType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinatesType]
  }
  @scala.inline
  implicit class AnonCoordinatesTypeOps[Self <: AnonCoordinatesType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MultiPoint | LineString | Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

