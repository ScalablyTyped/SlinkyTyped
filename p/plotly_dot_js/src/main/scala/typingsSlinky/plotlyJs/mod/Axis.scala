package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialDataTitle
import typingsSlinky.plotlyJs.anon.PartialFont
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsBooleans.`true`
import typingsSlinky.plotlyJs.plotlyJsStrings.B
import typingsSlinky.plotlyJs.plotlyJsStrings.E
import typingsSlinky.plotlyJs.plotlyJsStrings.SI
import typingsSlinky.plotlyJs.plotlyJsStrings._empty
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
import typingsSlinky.plotlyJs.plotlyJsStrings.e_
import typingsSlinky.plotlyJs.plotlyJsStrings.first
import typingsSlinky.plotlyJs.plotlyJsStrings.inside
import typingsSlinky.plotlyJs.plotlyJsStrings.last
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.none
import typingsSlinky.plotlyJs.plotlyJsStrings.nonnegative
import typingsSlinky.plotlyJs.plotlyJsStrings.normal
import typingsSlinky.plotlyJs.plotlyJsStrings.outside
import typingsSlinky.plotlyJs.plotlyJsStrings.power
import typingsSlinky.plotlyJs.plotlyJsStrings.reversed
import typingsSlinky.plotlyJs.plotlyJsStrings.ticks
import typingsSlinky.plotlyJs.plotlyJsStrings.tozero
import typingsSlinky.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  var autorange: `true` | `false` | reversed = js.native
  var calendar: Calendar = js.native
  var categoryarray: js.Array[_] = js.native
  var categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`) = js.native
  var color: Color = js.native
  var dtick: Double | String = js.native
  var exponentformat: none | e_ | E | power | SI | B = js.native
  var gridcolor: Color = js.native
  var gridwidth: Double = js.native
  var hoverformat: String = js.native
  var linecolor: Color = js.native
  var linewidth: Double = js.native
  var mirror: `true` | ticks | `false` | all | allticks = js.native
  var nticks: Double = js.native
  var range: js.Array[_] = js.native
  var rangemode: normal | tozero | nonnegative = js.native
  var separatethousands: Boolean = js.native
  var showexponent: all | first | last | none = js.native
  var showgrid: Boolean = js.native
  var showline: Boolean = js.native
  var showspikes: Boolean = js.native
  var showticklabels: Boolean = js.native
  var showtickprefix: all | first | last | none = js.native
  var showticksuffix: all | first | last | none = js.native
  var spikecolor: Color = js.native
  var spikethickness: Double = js.native
  var tick0: Double | String = js.native
  var tickangle: Double = js.native
  var tickcolor: Color = js.native
  var tickfont: PartialFont = js.native
  var tickformat: String = js.native
  var ticklen: Double = js.native
  var tickmode: auto | linear | array = js.native
  var tickprefix: String = js.native
  var ticks: outside | inside | _empty = js.native
  var ticksuffix: String = js.native
  var ticktext: js.Array[String] = js.native
  var tickvals: js.Array[_] = js.native
  var tickwidth: Double = js.native
  var title: String | PartialDataTitle = js.native
  var titlefont: PartialFont = js.native
  var `type`: AxisType = js.native
  var visible: Boolean = js.native
  var zeroline: Boolean = js.native
  var zerolinecolor: Color = js.native
  var zerolinewidth: Double = js.native
}

object Axis {
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`),
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
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    spikecolor: Color,
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
  ): Axis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutorange(value: `true` | `false` | reversed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryarray(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryarray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryorder(
      value: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtick(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponentformat(value: none | e_ | E | power | SI | B): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirror(value: `true` | ticks | `false` | all | allticks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNticks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangemode(value: normal | tozero | nonnegative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparatethousands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatethousands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowexponent(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showexponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowgrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showgrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowspikes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showspikes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowticklabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticklabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowtickprefix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showtickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowticksuffix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpikecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpikethickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikethickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTick0(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickangle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickfont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickfont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickmode(value: auto | linear | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickprefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicks(value: outside | inside | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicksuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktext(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvals(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | PartialDataTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitlefont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlefont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZerolinecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerolinecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZerolinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerolinewidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

