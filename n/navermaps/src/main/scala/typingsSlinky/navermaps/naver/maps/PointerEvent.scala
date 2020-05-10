package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEvent extends js.Object {
  var coord: Coord = js.native
  var feature: Feature = js.native
  var offset: Point = js.native
  var point: Point = js.native
  var pointerEvent: DOMEvent = js.native
}

object PointerEvent {
  @scala.inline
  def apply(coord: Coord, feature: Feature, offset: Point, point: Point, pointerEvent: DOMEvent): PointerEvent = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointerEvent = pointerEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent]
  }
  @scala.inline
  implicit class PointerEventOps[Self <: PointerEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoord(value: Coord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeature(value: Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerEvent(value: DOMEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

