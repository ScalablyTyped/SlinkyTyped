package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.PartialDataTitle
import typingsSlinky.plotlyJs.PartialFont
import typingsSlinky.plotlyJs.PartialRangeSelector
import typingsSlinky.plotlyJs.PartialRangeSlider
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsBooleans.`true`
import typingsSlinky.plotlyJs.plotlyJsStrings.B
import typingsSlinky.plotlyJs.plotlyJsStrings.E
import typingsSlinky.plotlyJs.plotlyJsStrings.SI
import typingsSlinky.plotlyJs.plotlyJsStrings._empty
import typingsSlinky.plotlyJs.plotlyJsStrings.`above traces`
import typingsSlinky.plotlyJs.plotlyJsStrings.`below traces`
import typingsSlinky.plotlyJs.plotlyJsStrings.`category ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`category descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`max ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`max descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`mean ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`mean descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`median ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`median descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`min ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`min descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`sum ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`sum descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`total ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`total descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.allticks
import typingsSlinky.plotlyJs.plotlyJsStrings.array
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.clockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.counterclockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.domain
import typingsSlinky.plotlyJs.plotlyJsStrings.e_
import typingsSlinky.plotlyJs.plotlyJsStrings.first
import typingsSlinky.plotlyJs.plotlyJsStrings.free
import typingsSlinky.plotlyJs.plotlyJsStrings.inside
import typingsSlinky.plotlyJs.plotlyJsStrings.last
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.none
import typingsSlinky.plotlyJs.plotlyJsStrings.nonnegative
import typingsSlinky.plotlyJs.plotlyJsStrings.normal
import typingsSlinky.plotlyJs.plotlyJsStrings.outside
import typingsSlinky.plotlyJs.plotlyJsStrings.power
import typingsSlinky.plotlyJs.plotlyJsStrings.range
import typingsSlinky.plotlyJs.plotlyJsStrings.reversed
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.ticks
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.plotlyJs.plotlyJsStrings.tozero
import typingsSlinky.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutAxis extends Axis {
  var anchor: free | AxisName = js.native
  var angle: js.Any = js.native
  var automargin: Boolean = js.native
  var autotick: Boolean = js.native
  var constrain: range | domain = js.native
  var constraintoward: left | center | right | top | middle | bottom = js.native
  var domain: js.Array[Double] = js.native
  var fixedrange: Boolean = js.native
  var layer: (`above traces`) | (`below traces`) = js.native
  var overlaying: free | AxisName = js.native
  var position: Double = js.native
  var rangeselector: PartialRangeSelector = js.native
  var rangeslider: PartialRangeSlider = js.native
  var scaleanchor: AxisName = js.native
  var scaleratio: Double = js.native
  var side: top | bottom | left | right | clockwise | counterclockwise = js.native
  var spikedash: String = js.native
  var spikemode: String = js.native
}

object LayoutAxis {
  @scala.inline
  def apply(
    anchor: free | AxisName,
    angle: js.Any,
    automargin: Boolean,
    autorange: `true` | `false` | reversed,
    autotick: Boolean,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`),
    color: Color,
    constrain: range | domain,
    constraintoward: left | center | right | top | middle | bottom,
    domain: js.Array[Double],
    dtick: Double | String,
    exponentformat: none | e_ | E | power | SI | B,
    fixedrange: Boolean,
    gridcolor: Color,
    gridwidth: Double,
    hoverformat: String,
    layer: (`above traces`) | (`below traces`),
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    overlaying: free | AxisName,
    position: Double,
    range: js.Array[_],
    rangemode: normal | tozero | nonnegative,
    rangeselector: PartialRangeSelector,
    rangeslider: PartialRangeSlider,
    scaleanchor: AxisName,
    scaleratio: Double,
    separatethousands: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    side: top | bottom | left | right | clockwise | counterclockwise,
    spikecolor: Color,
    spikedash: String,
    spikemode: String,
    spikethickness: Double,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: PartialFont,
    tickformat: String,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | _empty,
    ticksuffix: String,
    ticktext: js.Array[String],
    tickvals: js.Array[_],
    tickwidth: Double,
    title: String | PartialDataTitle,
    titlefont: PartialFont,
    `type`: AxisType,
    visible: Boolean,
    zeroline: Boolean,
    zerolinecolor: Color,
    zerolinewidth: Double
  ): LayoutAxis = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], automargin = automargin.asInstanceOf[js.Any], autorange = autorange.asInstanceOf[js.Any], autotick = autotick.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constrain = constrain.asInstanceOf[js.Any], constraintoward = constraintoward.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], fixedrange = fixedrange.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], overlaying = overlaying.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], rangeselector = rangeselector.asInstanceOf[js.Any], rangeslider = rangeslider.asInstanceOf[js.Any], scaleanchor = scaleanchor.asInstanceOf[js.Any], scaleratio = scaleratio.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikedash = spikedash.asInstanceOf[js.Any], spikemode = spikemode.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAxis]
  }
  @scala.inline
  implicit class LayoutAxisOps[Self <: LayoutAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: free | AxisName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutotick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstrain(value: range | domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintoward(value: left | center | right | top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintoward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedrange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedrange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: (`above traces`) | (`below traces`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlaying(value: free | AxisName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeselector(value: PartialRangeSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeselector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeslider(value: PartialRangeSlider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeslider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleanchor(value: AxisName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSide(value: top | bottom | left | right | clockwise | counterclockwise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpikedash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikedash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpikemode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikemode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

