package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotNetworkgraphStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) Animation when not hovering over the node.
    */
  var animation: js.UndefOr[
    Boolean | AnimationOptionsObject | PlotNetworkgraphStatesInactiveAnimationOptions
  ] = js.native
  /**
    * (Highcharts) Opacity of inactive links.
    */
  var linkOpacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Opacity of series elements (dataLabels, line, area). Set to
    * 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.native
}

object PlotNetworkgraphStatesInactiveOptions {
  @scala.inline
  def apply(): PlotNetworkgraphStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphStatesInactiveOptions]
  }
  @scala.inline
  implicit class PlotNetworkgraphStatesInactiveOptionsOps[Self <: PlotNetworkgraphStatesInactiveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean | AnimationOptionsObject | PlotNetworkgraphStatesInactiveAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

