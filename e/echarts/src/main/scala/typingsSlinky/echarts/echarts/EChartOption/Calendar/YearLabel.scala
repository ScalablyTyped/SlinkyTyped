package typingsSlinky.echarts.echarts.EChartOption.Calendar

import typingsSlinky.echarts.echartsStrings.bottom
import typingsSlinky.echarts.echartsStrings.left
import typingsSlinky.echarts.echartsStrings.right
import typingsSlinky.echarts.echartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YearLabel extends Label {
  /**
    * Formatter of year text label, which supports string template and callback function.
    * By default, the current range of the year,
    * if the interval across the year, showing the first year and the last year
    */
  var formatter: js.UndefOr[String] = js.native
  /**
    * Position of year.
    * Default: when orient is set as horizontal,
    * position is left when orient is set as vertical, position is top
    */
  var position: js.UndefOr[top | bottom | left | right] = js.native
}

object YearLabel {
  @scala.inline
  def apply(): YearLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YearLabel]
  }
  @scala.inline
  implicit class YearLabelOps[Self <: YearLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatter(value: String): Self = {
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
    def withPosition(value: top | bottom | left | right): Self = {
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

