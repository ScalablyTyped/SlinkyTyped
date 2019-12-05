package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsNumbers.`false`
import typingsSlinky.plotlyDotJs.plotlyDotJsNumbers.`true`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.B
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.E
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.Empty
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.SI
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`category ascending`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.`category descending`
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.all
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.allticks
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.array
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.auto
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.e_
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.first
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.inside
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.last
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.linear
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.none
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.nonnegative
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.normal
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.outside
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.power
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.reversed
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.ticks
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.tozero
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.trace
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneAxis extends Axis {
  var backgroundcolor: Color
  var showaxeslabels: Boolean
  var showbackground: Boolean
  var spikesides: Boolean
}

object SceneAxis {
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed,
    backgroundcolor: Color,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array,
    color: Color,
    dtick: Double | String,
    exponentformat: none | e_ | E | power | SI | B,
    gridcolor: Color,
    gridwidth: Double,
    hoverformat: String,
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    range: js.Array[_],
    rangemode: normal | tozero | nonnegative,
    separatethousands: Boolean,
    showaxeslabels: Boolean,
    showbackground: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    spikecolor: Color,
    spikesides: Boolean,
    spikethickness: Double,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: Partial[Font],
    tickformat: String,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | Empty,
    ticksuffix: String,
    ticktext: js.Array[String],
    tickvals: js.Array[_],
    tickwidth: Double,
    title: String,
    titlefont: Partial[Font],
    `type`: AxisType,
    visible: Boolean,
    zeroline: Boolean,
    zerolinecolor: Color,
    zerolinewidth: Double
  ): SceneAxis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], backgroundcolor = backgroundcolor.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showaxeslabels = showaxeslabels.asInstanceOf[js.Any], showbackground = showbackground.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikesides = spikesides.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAxis]
  }
}

