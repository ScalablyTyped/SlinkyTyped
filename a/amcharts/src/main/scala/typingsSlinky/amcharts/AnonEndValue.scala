package typingsSlinky.amcharts

import typingsSlinky.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndValue extends js.Object {
  var chart: default = js.native
  var endValue: js.UndefOr[js.Date] = js.native
  var startValue: js.UndefOr[js.Date] = js.native
  var `type`: String = js.native
}

object AnonEndValue {
  @scala.inline
  def apply(chart: default, `type`: String): AnonEndValue = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndValue]
  }
  @scala.inline
  implicit class AnonEndValueOps[Self <: AnonEndValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.undefined)
        ret
    }
  }
  
}

