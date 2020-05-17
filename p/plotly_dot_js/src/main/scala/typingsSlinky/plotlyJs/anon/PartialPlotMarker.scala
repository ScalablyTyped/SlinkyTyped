package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.ColorScale
import typingsSlinky.plotlyJs.mod.MarkerSymbol
import typingsSlinky.plotlyJs.plotlyJsStrings.area
import typingsSlinky.plotlyJs.plotlyJsStrings.diameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PlotMarker> */
@js.native
trait PartialPlotMarker extends js.Object {
  var autocolorscale: js.UndefOr[Boolean] = js.native
  var cauto: js.UndefOr[Boolean] = js.native
  var cmax: js.UndefOr[Double] = js.native
  var cmin: js.UndefOr[Double] = js.native
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color | js.Array[typingsSlinky.plotlyJs.mod.Color]] = js.native
  var colorbar: js.UndefOr[PartialColorBar] = js.native
  var colors: js.UndefOr[js.Array[typingsSlinky.plotlyJs.mod.Color]] = js.native
  var colorscale: js.UndefOr[ColorScale] = js.native
  var gradient: js.UndefOr[Colorsrc] = js.native
  var line: js.UndefOr[PartialScatterMarkerLine] = js.native
  var maxdisplayed: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  var pad: js.UndefOr[PartialPadding] = js.native
  var reversescale: js.UndefOr[Boolean] = js.native
  var showscale: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double | js.Array[Double]] = js.native
  var sizemax: js.UndefOr[Double] = js.native
  var sizemin: js.UndefOr[Double] = js.native
  var sizemode: js.UndefOr[diameter | area] = js.native
  var sizeref: js.UndefOr[Double] = js.native
  var symbol: js.UndefOr[MarkerSymbol] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialPlotMarker {
  @scala.inline
  def apply(): PartialPlotMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlotMarker]
  }
  @scala.inline
  implicit class PartialPlotMarkerOps[Self <: PartialPlotMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocolorscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocolorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocolorscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocolorscale")(js.undefined)
        ret
    }
    @scala.inline
    def withCauto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cauto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCauto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cauto")(js.undefined)
        ret
    }
    @scala.inline
    def withCmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmax")(js.undefined)
        ret
    }
    @scala.inline
    def withCmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmin")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: typingsSlinky.plotlyJs.mod.Color | js.Array[typingsSlinky.plotlyJs.mod.Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorbar(value: PartialColorBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbar")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[typingsSlinky.plotlyJs.mod.Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColorscale(value: ColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(js.undefined)
        ret
    }
    @scala.inline
    def withGradient(value: Colorsrc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: PartialScatterMarkerLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxdisplayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxdisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxdisplayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxdisplayed")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double | js.Array[Double]): Self = {
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
    def withPad(value: PartialPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
    @scala.inline
    def withReversescale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversescale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversescale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversescale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showscale")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double | js.Array[Double]): Self = {
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
    @scala.inline
    def withSizemax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizemax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemax")(js.undefined)
        ret
    }
    @scala.inline
    def withSizemin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizemin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemin")(js.undefined)
        ret
    }
    @scala.inline
    def withSizemode(value: diameter | area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemode")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeref(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeref")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: MarkerSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

