package typingsSlinky.echarts.echarts.EChartOption.Calendar

import typingsSlinky.echarts.echartsStrings.end
import typingsSlinky.echarts.echartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayLabel extends Label {
  /**
    * A week from the beginning of the week, the default starting on Sunday.
    *
    * @default 0
    */
  var firstDay: js.UndefOr[Double] = js.native
  /**
    * Position of week, at the beginning or end of the range.
    *
    * @default 'start'
    */
  var position: js.UndefOr[start | end] = js.native
}

object DayLabel {
  @scala.inline
  def apply(): DayLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayLabel]
  }
  @scala.inline
  implicit class DayLabelOps[Self <: DayLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

