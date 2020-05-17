package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.Colorsrc
import typingsSlinky.plotlyJs.anon.PartialColorBar
import typingsSlinky.plotlyJs.anon.PartialPadding
import typingsSlinky.plotlyJs.anon.PartialScatterMarkerLine
import typingsSlinky.plotlyJs.plotlyJsStrings.area
import typingsSlinky.plotlyJs.plotlyJsStrings.diameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMarker extends js.Object {
  var autocolorscale: Boolean = js.native
  var cauto: Boolean = js.native
  var cmax: Double = js.native
  var cmin: Double = js.native
  var color: Color | js.Array[Color] = js.native
  var colorbar: PartialColorBar = js.native
  var colors: js.Array[Color] = js.native
  var colorscale: ColorScale = js.native
  var gradient: Colorsrc = js.native
  var line: PartialScatterMarkerLine = js.native
  var maxdisplayed: Double = js.native
  var opacity: Double | js.Array[Double] = js.native
  var pad: PartialPadding = js.native
  var reversescale: Boolean = js.native
  var showscale: Boolean = js.native
  var size: Double | js.Array[Double] = js.native
  var sizemax: Double = js.native
  var sizemin: Double = js.native
  var sizemode: diameter | area = js.native
  var sizeref: Double = js.native
  var symbol: MarkerSymbol = js.native
  var width: Double = js.native
}

object PlotMarker {
  @scala.inline
  def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color | js.Array[Color],
    colorbar: PartialColorBar,
    colors: js.Array[Color],
    colorscale: ColorScale,
    gradient: Colorsrc,
    line: PartialScatterMarkerLine,
    maxdisplayed: Double,
    opacity: Double | js.Array[Double],
    pad: PartialPadding,
    reversescale: Boolean,
    showscale: Boolean,
    size: Double | js.Array[Double],
    sizemax: Double,
    sizemin: Double,
    sizemode: diameter | area,
    sizeref: Double,
    symbol: MarkerSymbol,
    width: Double
  ): PlotMarker = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorbar = colorbar.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxdisplayed = maxdisplayed.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], showscale = showscale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizemax = sizemax.asInstanceOf[js.Any], sizemin = sizemin.asInstanceOf[js.Any], sizemode = sizemode.asInstanceOf[js.Any], sizeref = sizeref.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMarker]
  }
  @scala.inline
  implicit class PlotMarkerOps[Self <: PlotMarker] (val x: Self) extends AnyVal {
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
    def withCauto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cauto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color | js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorbar(value: PartialColorBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorscale(value: ColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: Colorsrc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: PartialScatterMarkerLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxdisplayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxdisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPad(value: PartialPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversescale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversescale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizemax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizemin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizemode(value: diameter | area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeref(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: MarkerSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

