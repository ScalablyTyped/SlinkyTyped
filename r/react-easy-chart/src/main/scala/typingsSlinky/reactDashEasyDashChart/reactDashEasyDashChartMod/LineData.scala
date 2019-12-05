package typingsSlinky.reactDashEasyDashChart.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineData extends js.Object {
  var x: Double | js.Date | String
  var y: Double | js.Date | String
}

object LineData {
  @scala.inline
  def apply(x: Double | js.Date | String, y: Double | js.Date | String): LineData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineData]
  }
}

