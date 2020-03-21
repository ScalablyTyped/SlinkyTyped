package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.AxisType
import typingsSlinky.plotlyJs.mod.Calendar
import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.mod.Font
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsBooleans.`true`
import typingsSlinky.plotlyJs.plotlyJsStrings.B
import typingsSlinky.plotlyJs.plotlyJsStrings.E
import typingsSlinky.plotlyJs.plotlyJsStrings.SI
import typingsSlinky.plotlyJs.plotlyJsStrings._empty
import typingsSlinky.plotlyJs.plotlyJsStrings.`category ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`category descending`
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
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Axis> */
trait PartialAxisAutorange extends js.Object {
  var autorange: js.UndefOr[`true` | `false` | reversed] = js.undefined
  var calendar: js.UndefOr[Calendar] = js.undefined
  var categoryarray: js.UndefOr[js.Array[_]] = js.undefined
  var categoryorder: js.UndefOr[trace | (`category ascending`) | (`category descending`) | array] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var dtick: js.UndefOr[Double | String] = js.undefined
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.undefined
  var gridcolor: js.UndefOr[Color] = js.undefined
  var gridwidth: js.UndefOr[Double] = js.undefined
  var hoverformat: js.UndefOr[String] = js.undefined
  var linecolor: js.UndefOr[Color] = js.undefined
  var linewidth: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[`true` | ticks | `false` | all | allticks] = js.undefined
  var nticks: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[js.Array[_]] = js.undefined
  var rangemode: js.UndefOr[normal | tozero | nonnegative] = js.undefined
  var separatethousands: js.UndefOr[Boolean] = js.undefined
  var showexponent: js.UndefOr[all | first | last | none] = js.undefined
  var showgrid: js.UndefOr[Boolean] = js.undefined
  var showline: js.UndefOr[Boolean] = js.undefined
  var showspikes: js.UndefOr[Boolean] = js.undefined
  var showticklabels: js.UndefOr[Boolean] = js.undefined
  var showtickprefix: js.UndefOr[all | first | last | none] = js.undefined
  var showticksuffix: js.UndefOr[all | first | last | none] = js.undefined
  var spikecolor: js.UndefOr[Color] = js.undefined
  var spikethickness: js.UndefOr[Double] = js.undefined
  var tick0: js.UndefOr[Double | String] = js.undefined
  var tickangle: js.UndefOr[Double] = js.undefined
  var tickcolor: js.UndefOr[Color] = js.undefined
  var tickfont: js.UndefOr[Partial[Font]] = js.undefined
  var tickformat: js.UndefOr[String] = js.undefined
  var ticklen: js.UndefOr[Double] = js.undefined
  var tickmode: js.UndefOr[auto | linear | array] = js.undefined
  var tickprefix: js.UndefOr[String] = js.undefined
  var ticks: js.UndefOr[outside | inside | _empty] = js.undefined
  var ticksuffix: js.UndefOr[String] = js.undefined
  var ticktext: js.UndefOr[js.Array[String]] = js.undefined
  var tickvals: js.UndefOr[js.Array[_]] = js.undefined
  var tickwidth: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlefont: js.UndefOr[Partial[Font]] = js.undefined
  var `type`: js.UndefOr[AxisType] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zeroline: js.UndefOr[Boolean] = js.undefined
  var zerolinecolor: js.UndefOr[Color] = js.undefined
  var zerolinewidth: js.UndefOr[Double] = js.undefined
}

object PartialAxisAutorange {
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed = null,
    calendar: Calendar = null,
    categoryarray: js.Array[_] = null,
    categoryorder: trace | (`category ascending`) | (`category descending`) | array = null,
    color: Color = null,
    dtick: Double | String = null,
    exponentformat: none | e_ | E | power | SI | B = null,
    gridcolor: Color = null,
    gridwidth: Int | Double = null,
    hoverformat: String = null,
    linecolor: Color = null,
    linewidth: Int | Double = null,
    mirror: `true` | ticks | `false` | all | allticks = null,
    nticks: Int | Double = null,
    range: js.Array[_] = null,
    rangemode: normal | tozero | nonnegative = null,
    separatethousands: js.UndefOr[Boolean] = js.undefined,
    showexponent: all | first | last | none = null,
    showgrid: js.UndefOr[Boolean] = js.undefined,
    showline: js.UndefOr[Boolean] = js.undefined,
    showspikes: js.UndefOr[Boolean] = js.undefined,
    showticklabels: js.UndefOr[Boolean] = js.undefined,
    showtickprefix: all | first | last | none = null,
    showticksuffix: all | first | last | none = null,
    spikecolor: Color = null,
    spikethickness: Int | Double = null,
    tick0: Double | String = null,
    tickangle: Int | Double = null,
    tickcolor: Color = null,
    tickfont: Partial[Font] = null,
    tickformat: String = null,
    ticklen: Int | Double = null,
    tickmode: auto | linear | array = null,
    tickprefix: String = null,
    ticks: outside | inside | _empty = null,
    ticksuffix: String = null,
    ticktext: js.Array[String] = null,
    tickvals: js.Array[_] = null,
    tickwidth: Int | Double = null,
    title: String = null,
    titlefont: Partial[Font] = null,
    `type`: AxisType = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zeroline: js.UndefOr[Boolean] = js.undefined,
    zerolinecolor: Color = null,
    zerolinewidth: Int | Double = null
  ): PartialAxisAutorange = {
    val __obj = js.Dynamic.literal()
    if (autorange != null) __obj.updateDynamic("autorange")(autorange.asInstanceOf[js.Any])
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (categoryarray != null) __obj.updateDynamic("categoryarray")(categoryarray.asInstanceOf[js.Any])
    if (categoryorder != null) __obj.updateDynamic("categoryorder")(categoryorder.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dtick != null) __obj.updateDynamic("dtick")(dtick.asInstanceOf[js.Any])
    if (exponentformat != null) __obj.updateDynamic("exponentformat")(exponentformat.asInstanceOf[js.Any])
    if (gridcolor != null) __obj.updateDynamic("gridcolor")(gridcolor.asInstanceOf[js.Any])
    if (gridwidth != null) __obj.updateDynamic("gridwidth")(gridwidth.asInstanceOf[js.Any])
    if (hoverformat != null) __obj.updateDynamic("hoverformat")(hoverformat.asInstanceOf[js.Any])
    if (linecolor != null) __obj.updateDynamic("linecolor")(linecolor.asInstanceOf[js.Any])
    if (linewidth != null) __obj.updateDynamic("linewidth")(linewidth.asInstanceOf[js.Any])
    if (mirror != null) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (nticks != null) __obj.updateDynamic("nticks")(nticks.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangemode != null) __obj.updateDynamic("rangemode")(rangemode.asInstanceOf[js.Any])
    if (!js.isUndefined(separatethousands)) __obj.updateDynamic("separatethousands")(separatethousands.asInstanceOf[js.Any])
    if (showexponent != null) __obj.updateDynamic("showexponent")(showexponent.asInstanceOf[js.Any])
    if (!js.isUndefined(showgrid)) __obj.updateDynamic("showgrid")(showgrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showline)) __obj.updateDynamic("showline")(showline.asInstanceOf[js.Any])
    if (!js.isUndefined(showspikes)) __obj.updateDynamic("showspikes")(showspikes.asInstanceOf[js.Any])
    if (!js.isUndefined(showticklabels)) __obj.updateDynamic("showticklabels")(showticklabels.asInstanceOf[js.Any])
    if (showtickprefix != null) __obj.updateDynamic("showtickprefix")(showtickprefix.asInstanceOf[js.Any])
    if (showticksuffix != null) __obj.updateDynamic("showticksuffix")(showticksuffix.asInstanceOf[js.Any])
    if (spikecolor != null) __obj.updateDynamic("spikecolor")(spikecolor.asInstanceOf[js.Any])
    if (spikethickness != null) __obj.updateDynamic("spikethickness")(spikethickness.asInstanceOf[js.Any])
    if (tick0 != null) __obj.updateDynamic("tick0")(tick0.asInstanceOf[js.Any])
    if (tickangle != null) __obj.updateDynamic("tickangle")(tickangle.asInstanceOf[js.Any])
    if (tickcolor != null) __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    if (tickfont != null) __obj.updateDynamic("tickfont")(tickfont.asInstanceOf[js.Any])
    if (tickformat != null) __obj.updateDynamic("tickformat")(tickformat.asInstanceOf[js.Any])
    if (ticklen != null) __obj.updateDynamic("ticklen")(ticklen.asInstanceOf[js.Any])
    if (tickmode != null) __obj.updateDynamic("tickmode")(tickmode.asInstanceOf[js.Any])
    if (tickprefix != null) __obj.updateDynamic("tickprefix")(tickprefix.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (ticksuffix != null) __obj.updateDynamic("ticksuffix")(ticksuffix.asInstanceOf[js.Any])
    if (ticktext != null) __obj.updateDynamic("ticktext")(ticktext.asInstanceOf[js.Any])
    if (tickvals != null) __obj.updateDynamic("tickvals")(tickvals.asInstanceOf[js.Any])
    if (tickwidth != null) __obj.updateDynamic("tickwidth")(tickwidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlefont != null) __obj.updateDynamic("titlefont")(titlefont.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroline)) __obj.updateDynamic("zeroline")(zeroline.asInstanceOf[js.Any])
    if (zerolinecolor != null) __obj.updateDynamic("zerolinecolor")(zerolinecolor.asInstanceOf[js.Any])
    if (zerolinewidth != null) __obj.updateDynamic("zerolinewidth")(zerolinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAxisAutorange]
  }
}

