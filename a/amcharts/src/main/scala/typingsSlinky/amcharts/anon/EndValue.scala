package typingsSlinky.amcharts.anon

import typingsSlinky.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndValue extends js.Object {
  var chart: default
  var endValue: js.UndefOr[js.Date] = js.undefined
  var startValue: js.UndefOr[js.Date] = js.undefined
  var `type`: String
}

object EndValue {
  @scala.inline
  def apply(chart: default, `type`: String, endValue: js.Date = null, startValue: js.Date = null): EndValue = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndValue]
  }
}

