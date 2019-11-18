package typingsSlinky.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPoint extends js.Object {
  var r: js.UndefOr[Double] = js.undefined
  var t: js.UndefOr[Double | String | js.Date] = js.undefined
  var x: js.UndefOr[Double | String | js.Date] = js.undefined
  var y: js.UndefOr[Double | String | js.Date] = js.undefined
}

object ChartPoint {
  @scala.inline
  def apply(
    r: Int | Double = null,
    t: Double | String | js.Date = null,
    x: Double | String | js.Date = null,
    y: Double | String | js.Date = null
  ): ChartPoint = {
    val __obj = js.Dynamic.literal()
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPoint]
  }
}

