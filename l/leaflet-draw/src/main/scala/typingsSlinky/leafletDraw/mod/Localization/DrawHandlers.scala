package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.anon.Error
import typingsSlinky.leafletDraw.anon.Radius
import typingsSlinky.leafletDraw.anon.TooltipCont
import typingsSlinky.leafletDraw.anon.TooltipEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawHandlers extends js.Object {
  var circle: Radius
  var circlemarker: typingsSlinky.leafletDraw.anon.Tooltip
  var marker: typingsSlinky.leafletDraw.anon.Tooltip
  var polygon: TooltipCont
  var polyline: Error
  var rectangle: typingsSlinky.leafletDraw.anon.Tooltip
  var simpleshape: TooltipEnd
}

object DrawHandlers {
  @scala.inline
  def apply(
    circle: Radius,
    circlemarker: typingsSlinky.leafletDraw.anon.Tooltip,
    marker: typingsSlinky.leafletDraw.anon.Tooltip,
    polygon: TooltipCont,
    polyline: Error,
    rectangle: typingsSlinky.leafletDraw.anon.Tooltip,
    simpleshape: TooltipEnd
  ): DrawHandlers = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], simpleshape = simpleshape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawHandlers]
  }
}

