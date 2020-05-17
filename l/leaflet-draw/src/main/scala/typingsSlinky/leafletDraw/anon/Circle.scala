package typingsSlinky.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends js.Object {
  var circle: String = js.native
  var circlemarker: String = js.native
  var marker: String = js.native
  var polygon: String = js.native
  var polyline: String = js.native
  var rectangle: String = js.native
}

object Circle {
  @scala.inline
  def apply(
    circle: String,
    circlemarker: String,
    marker: String,
    polygon: String,
    polyline: String,
    rectangle: String
  ): Circle = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCirclemarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circlemarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

