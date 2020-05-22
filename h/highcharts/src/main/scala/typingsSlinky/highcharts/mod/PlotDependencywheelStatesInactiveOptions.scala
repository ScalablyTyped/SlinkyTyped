package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDependencywheelStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[PlotDependencywheelStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram in
    * inactive mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Opacity of series elements (dataLabels, line, area). Set to
    * 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotDependencywheelStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: PlotDependencywheelStatesInactiveAnimationOptions = null,
    linkOpacity: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): PlotDependencywheelStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(linkOpacity)) __obj.updateDynamic("linkOpacity")(linkOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDependencywheelStatesInactiveOptions]
  }
}

