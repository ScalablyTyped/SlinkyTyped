package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.highcharts.highchartsStrings.drilldown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrilldownEventObject extends js.Object {
  /**
    * If a category label was clicked, which index.
    */
  var category: js.UndefOr[Double] = js.native
  /**
    * The original browser event (usually click) that triggered the drilldown.
    */
  var originalEvent: js.UndefOr[Event] = js.native
  /**
    * The originating point.
    */
  var point: Point = js.native
  /**
    * If a category label was clicked, this array holds all points corresponing
    * to the category. Otherwise it is set to false.
    */
  var points: js.UndefOr[Boolean | js.Array[Point]] = js.native
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  /**
    * Options for the new series. If the event is utilized for async drilldown,
    * the seriesOptions are not added, but rather loaded async.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.native
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  /**
    * The event type.
    */
  var `type`: drilldown = js.native
}

object DrilldownEventObject {
  @scala.inline
  def apply(point: Point, preventDefault: js.Function, target: Chart_, `type`: drilldown): DrilldownEventObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownEventObject]
  }
  @scala.inline
  implicit class DrilldownEventObjectOps[Self <: DrilldownEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Chart_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: drilldown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: Boolean | js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesOptions(value: SeriesOptionsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesOptions")(js.undefined)
        ret
    }
  }
  
}

