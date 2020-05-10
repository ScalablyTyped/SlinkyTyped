package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.AnonError
import typingsSlinky.leafletDraw.AnonRadius
import typingsSlinky.leafletDraw.AnonTooltip
import typingsSlinky.leafletDraw.AnonTooltipAnonCont
import typingsSlinky.leafletDraw.AnonTooltipAnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawHandlers extends js.Object {
  var circle: AnonRadius = js.native
  var circlemarker: AnonTooltip = js.native
  var marker: AnonTooltip = js.native
  var polygon: AnonTooltipAnonCont = js.native
  var polyline: AnonError = js.native
  var rectangle: AnonTooltip = js.native
  var simpleshape: AnonTooltipAnonEnd = js.native
}

object DrawHandlers {
  @scala.inline
  def apply(
    circle: AnonRadius,
    circlemarker: AnonTooltip,
    marker: AnonTooltip,
    polygon: AnonTooltipAnonCont,
    polyline: AnonError,
    rectangle: AnonTooltip,
    simpleshape: AnonTooltipAnonEnd
  ): DrawHandlers = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], simpleshape = simpleshape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawHandlers]
  }
  @scala.inline
  implicit class DrawHandlersOps[Self <: DrawHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: AnonRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCirclemarker(value: AnonTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circlemarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: AnonTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygon(value: AnonTooltipAnonCont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyline(value: AnonError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangle(value: AnonTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimpleshape(value: AnonTooltipAnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleshape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

