package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.amapJsApiStrings.MultiLineString
import typingsSlinky.amapJsApi.amapJsApiStrings.MultiPolygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinatesArray
  extends typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry {
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]] = js.native
  var `type`: MultiLineString | MultiPolygon = js.native
}

object CoordinatesArray {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): CoordinatesArray = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesArray]
  }
  @scala.inline
  implicit class CoordinatesArrayOps[Self <: CoordinatesArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MultiLineString | MultiPolygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

