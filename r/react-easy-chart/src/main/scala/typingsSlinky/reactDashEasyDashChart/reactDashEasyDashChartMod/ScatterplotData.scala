package typingsSlinky.reactDashEasyDashChart.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterplotData extends js.Object {
  var `type`: String | Double
  var x: Double | js.Date | String
  var y: Double | js.Date | String
  var z: js.UndefOr[Double] = js.undefined
}

object ScatterplotData {
  @scala.inline
  def apply(
    `type`: String | Double,
    x: Double | js.Date | String,
    y: Double | js.Date | String,
    z: Int | Double = null
  ): ScatterplotData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterplotData]
  }
}

