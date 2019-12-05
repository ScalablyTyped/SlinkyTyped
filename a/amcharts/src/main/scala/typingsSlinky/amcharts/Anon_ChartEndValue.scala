package typingsSlinky.amcharts

import typingsSlinky.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartEndValue extends js.Object {
  var chart: default
  var endValue: js.UndefOr[js.Date] = js.undefined
  var startValue: js.UndefOr[js.Date] = js.undefined
  var `type`: String
}

object Anon_ChartEndValue {
  @scala.inline
  def apply(chart: default, `type`: String, endValue: js.Date = null, startValue: js.Date = null): Anon_ChartEndValue = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartEndValue]
  }
}

