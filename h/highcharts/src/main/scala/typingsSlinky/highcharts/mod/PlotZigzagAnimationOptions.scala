package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotZigzagAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotZigzagAnimationOptions {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotZigzagAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotZigzagAnimationOptions]
  }
}

