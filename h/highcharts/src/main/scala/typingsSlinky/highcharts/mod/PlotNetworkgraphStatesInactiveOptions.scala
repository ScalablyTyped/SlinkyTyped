package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) Animation when not hovering over the node.
    */
  var animation: js.UndefOr[
    Boolean | AnimationOptionsObject | PlotNetworkgraphStatesInactiveAnimationOptions
  ] = js.undefined
  /**
    * (Highcharts) Opacity of inactive links.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Opacity of series elements (dataLabels, line, area). Set to
    * 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotNetworkgraphStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotNetworkgraphStatesInactiveAnimationOptions = null,
    linkOpacity: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): PlotNetworkgraphStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(linkOpacity)) __obj.updateDynamic("linkOpacity")(linkOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNetworkgraphStatesInactiveOptions]
  }
}

