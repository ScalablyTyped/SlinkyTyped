package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.drillup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillupEventObject extends js.Object {
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  /**
    * Options for the new series.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.native
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  /**
    * The event type.
    */
  var `type`: drillup = js.native
}

object DrillupEventObject {
  @scala.inline
  def apply(preventDefault: js.Function, target: Chart_, `type`: drillup): DrillupEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillupEventObject]
  }
  @scala.inline
  implicit class DrillupEventObjectOps[Self <: DrillupEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withType(value: drillup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

