package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartViewWindow extends js.Object {
  var max: js.UndefOr[Double | js.Date | js.Array[Double]] = js.undefined
  var min: js.UndefOr[Double | js.Date | js.Array[Double]] = js.undefined
}

object ChartViewWindow {
  @scala.inline
  def apply(max: Double | js.Date | js.Array[Double] = null, min: Double | js.Date | js.Array[Double] = null): ChartViewWindow = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartViewWindow]
  }
}

