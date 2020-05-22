package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGanttStatesInactiveOptions extends js.Object {
  /**
    * (Gantt) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotGanttStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Gantt) Opacity of series elements (dataLabels, line, area). Set to 1 to
    * disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotGanttStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotGanttStatesInactiveAnimationOptions = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): PlotGanttStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotGanttStatesInactiveOptions]
  }
}

