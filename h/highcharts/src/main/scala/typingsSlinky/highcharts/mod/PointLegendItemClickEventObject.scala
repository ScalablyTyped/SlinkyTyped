package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.highcharts.highchartsStrings.legendItemClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointLegendItemClickEventObject extends js.Object {
  /**
    * Related browser event.
    */
  var browserEvent: PointerEvent = js.native
  /**
    * Prevent the default action of toggle the visibility of the point.
    */
  var preventDefault: js.Function = js.native
  /**
    * Related point.
    */
  var target: Point = js.native
  /**
    * Event type.
    */
  var `type`: legendItemClick = js.native
}

object PointLegendItemClickEventObject {
  @scala.inline
  def apply(browserEvent: PointerEvent, preventDefault: js.Function, target: Point, `type`: legendItemClick): PointLegendItemClickEventObject = {
    val __obj = js.Dynamic.literal(browserEvent = browserEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLegendItemClickEventObject]
  }
  @scala.inline
  implicit class PointLegendItemClickEventObjectOps[Self <: PointLegendItemClickEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserEvent(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: legendItemClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

