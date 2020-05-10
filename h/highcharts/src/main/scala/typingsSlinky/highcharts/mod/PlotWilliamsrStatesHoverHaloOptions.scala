package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotWilliamsrStatesHoverHaloOptions extends js.Object {
  /**
    * (Highcharts, Highstock) A collection of SVG attributes to override the
    * appearance of the halo, for example `fill`, `stroke` and `stroke-width`.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.native
  /**
    * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
    * overridden using the `attributes` setting. Note that Highcharts is only
    * able to apply opacity to colors of hex or rgb(a) formats.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The pixel size of the halo. For point markers
    * this is the radius of the halo. For pie slices it is the width of the
    * halo outside the slice. For bubbles it defaults to 5 and is the width of
    * the halo outside the bubble.
    */
  var size: js.UndefOr[Double] = js.native
}

object PlotWilliamsrStatesHoverHaloOptions {
  @scala.inline
  def apply(): PlotWilliamsrStatesHoverHaloOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWilliamsrStatesHoverHaloOptions]
  }
  @scala.inline
  implicit class PlotWilliamsrStatesHoverHaloOptionsOps[Self <: PlotWilliamsrStatesHoverHaloOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
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
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

