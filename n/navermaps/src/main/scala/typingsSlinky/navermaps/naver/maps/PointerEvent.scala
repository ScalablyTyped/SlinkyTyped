package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvent extends js.Object {
  var coord: Coord
  var feature: Feature
  var offset: Point
  var point: Point
  var pointerEvent: org.scalajs.dom.raw.Event
}

object PointerEvent {
  @scala.inline
  def apply(
    coord: Coord,
    feature: Feature,
    offset: Point,
    point: Point,
    pointerEvent: org.scalajs.dom.raw.Event
  ): PointerEvent = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointerEvent = pointerEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointerEvent]
  }
}

