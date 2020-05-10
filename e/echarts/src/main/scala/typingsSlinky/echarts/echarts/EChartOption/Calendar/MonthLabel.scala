package typingsSlinky.echarts.echarts.EChartOption.Calendar

import typingsSlinky.echarts.echartsStrings.end
import typingsSlinky.echarts.echartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthLabel extends Label {
  /**
    * Formatter of month text label, which supports string template and callback function.
    */
  var formatter: js.UndefOr[String | MonthLabelFormatter] = js.native
  /**
    * Position of week, at the beginning or end of the range.
    *
    * @default 'start'
    */
  var position: js.UndefOr[start | end] = js.native
}

object MonthLabel {
  @scala.inline
  def apply(): MonthLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthLabel]
  }
  @scala.inline
  implicit class MonthLabelOps[Self <: MonthLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatterFunction1(value: /* params */ MonthLabelFormatterParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatter(value: String | MonthLabelFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
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

