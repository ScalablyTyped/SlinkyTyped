package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.AxisName
import typingsSlinky.plotlyJs.mod.AxisType
import typingsSlinky.plotlyJs.mod.Calendar
import typingsSlinky.plotlyJs.mod.Color
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

/* Inlined std.Partial<plotly.js.plotly.js.LayoutAxis> */
@js.native
trait PartialLayoutAxis extends js.Object {
  var anchor: js.UndefOr[free | AxisName] = js.native
  var angle: js.UndefOr[js.Any] = js.native
  var automargin: js.UndefOr[Boolean] = js.native
  var autorange: js.UndefOr[`true` | `false` | reversed] = js.native
  var autotick: js.UndefOr[Boolean] = js.native
  var calendar: js.UndefOr[Calendar] = js.native
  var categoryarray: js.UndefOr[js.Array[_]] = js.native
  var categoryorder: js.UndefOr[
    trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
  ] = js.native
  var color: js.UndefOr[Color] = js.native
  var constrain: js.UndefOr[range | domain] = js.native
  var constraintoward: js.UndefOr[left | center | right | top | middle | bottom] = js.native
  var domain: js.UndefOr[js.Array[Double]] = js.native
  var dtick: js.UndefOr[Double | String] = js.native
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.native
  var fixedrange: js.UndefOr[Boolean] = js.native
  var gridcolor: js.UndefOr[Color] = js.native
  var gridwidth: js.UndefOr[Double] = js.native
  var hoverformat: js.UndefOr[String] = js.native
  var layer: js.UndefOr[(`above traces`) | (`below traces`)] = js.native
  var linecolor: js.UndefOr[Color] = js.native
  var linewidth: js.UndefOr[Double] = js.native
  var mirror: js.UndefOr[`true` | ticks | `false` | all | allticks] = js.native
  var nticks: js.UndefOr[Double] = js.native
  var overlaying: js.UndefOr[free | AxisName] = js.native
  var position: js.UndefOr[Double] = js.native
  var range: js.UndefOr[js.Array[_]] = js.native
  var rangemode: js.UndefOr[normal | tozero | nonnegative] = js.native
  var rangeselector: js.UndefOr[PartialRangeSelector] = js.native
  var rangeslider: js.UndefOr[PartialRangeSlider] = js.native
  var scaleanchor: js.UndefOr[AxisName] = js.native
  var scaleratio: js.UndefOr[Double] = js.native
  var separatethousands: js.UndefOr[Boolean] = js.native
  var showexponent: js.UndefOr[all | first | last | none] = js.native
  var showgrid: js.UndefOr[Boolean] = js.native
  var showline: js.UndefOr[Boolean] = js.native
  var showspikes: js.UndefOr[Boolean] = js.native
  var showticklabels: js.UndefOr[Boolean] = js.native
  var showtickprefix: js.UndefOr[all | first | last | none] = js.native
  var showticksuffix: js.UndefOr[all | first | last | none] = js.native
  var side: js.UndefOr[top | bottom | left | right | clockwise | counterclockwise] = js.native
  var spikecolor: js.UndefOr[Color] = js.native
  var spikedash: js.UndefOr[String] = js.native
  var spikemode: js.UndefOr[String] = js.native
  var spikethickness: js.UndefOr[Double] = js.native
  var tick0: js.UndefOr[Double | String] = js.native
  var tickangle: js.UndefOr[Double] = js.native
  var tickcolor: js.UndefOr[Color] = js.native
  var tickfont: js.UndefOr[PartialFont] = js.native
  var tickformat: js.UndefOr[String] = js.native
  var ticklen: js.UndefOr[Double] = js.native
  var tickmode: js.UndefOr[auto | linear | array] = js.native
  var tickprefix: js.UndefOr[String] = js.native
  var ticks: js.UndefOr[outside | inside | _empty] = js.native
  var ticksuffix: js.UndefOr[String] = js.native
  var ticktext: js.UndefOr[js.Array[String]] = js.native
  var tickvals: js.UndefOr[js.Array[_]] = js.native
  var tickwidth: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String | PartialDataTitle] = js.native
  var titlefont: js.UndefOr[PartialFont] = js.native
  var `type`: js.UndefOr[AxisType] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zeroline: js.UndefOr[Boolean] = js.native
  var zerolinecolor: js.UndefOr[Color] = js.native
  var zerolinewidth: js.UndefOr[Double] = js.native
}

object PartialLayoutAxis {
  @scala.inline
  def apply(): PartialLayoutAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLayoutAxis]
  }
  @scala.inline
  implicit class PartialLayoutAxisOps[Self <: PartialLayoutAxis] (val x: Self) extends AnyVal {
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
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAngle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automargin")(js.undefined)
        ret
    }
    @scala.inline
    def withAutorange(value: `true` | `false` | reversed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutorange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autorange")(js.undefined)
        ret
    }
    @scala.inline
    def withAutotick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutotick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotick")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryarray(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryarray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryarray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryarray")(js.undefined)
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
    def withoutCategoryorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryorder")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
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
    def withConstrain(value: range | domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraintoward(value: left | center | right | top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintoward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintoward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintoward")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDtick(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtick")(js.undefined)
        ret
    }
    @scala.inline
    def withExponentformat(value: none | e_ | E | power | SI | B): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponentformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentformat")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedrange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedrange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedrange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedrange")(js.undefined)
        ret
    }
    @scala.inline
    def withGridcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverformat")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: (`above traces`) | (`below traces`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withLinecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinecolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linecolor")(js.undefined)
        ret
    }
    @scala.inline
    def withLinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinewidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMirror(value: `true` | ticks | `false` | all | allticks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(js.undefined)
        ret
    }
    @scala.inline
    def withNticks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNticks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nticks")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlaying(value: free | AxisName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRangemode(value: normal | tozero | nonnegative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangemode")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeselector(value: PartialRangeSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeselector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeselector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeselector")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeslider(value: PartialRangeSlider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeslider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeslider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeslider")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleanchor(value: AxisName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleanchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleanchor")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleratio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleratio")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatethousands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatethousands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparatethousands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatethousands")(js.undefined)
        ret
    }
    @scala.inline
    def withShowexponent(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showexponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowexponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showexponent")(js.undefined)
        ret
    }
    @scala.inline
    def withShowgrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showgrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowgrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showgrid")(js.undefined)
        ret
    }
    @scala.inline
    def withShowline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showline")(js.undefined)
        ret
    }
    @scala.inline
    def withShowspikes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showspikes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowspikes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showspikes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowticklabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticklabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowticklabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticklabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowtickprefix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showtickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowtickprefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showtickprefix")(js.undefined)
        ret
    }
    @scala.inline
    def withShowticksuffix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowticksuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticksuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: top | bottom | left | right | clockwise | counterclockwise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withSpikecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpikecolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikecolor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpikedash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikedash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpikedash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikedash")(js.undefined)
        ret
    }
    @scala.inline
    def withSpikemode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpikemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikemode")(js.undefined)
        ret
    }
    @scala.inline
    def withSpikethickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikethickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpikethickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spikethickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTick0(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick0")(js.undefined)
        ret
    }
    @scala.inline
    def withTickangle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickangle")(js.undefined)
        ret
    }
    @scala.inline
    def withTickcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withTickfont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickfont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickfont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickfont")(js.undefined)
        ret
    }
    @scala.inline
    def withTickformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformat")(js.undefined)
        ret
    }
    @scala.inline
    def withTicklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicklen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(js.undefined)
        ret
    }
    @scala.inline
    def withTickmode(value: auto | linear | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmode")(js.undefined)
        ret
    }
    @scala.inline
    def withTickprefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickprefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickprefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: outside | inside | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withTicktext(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicktext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(js.undefined)
        ret
    }
    @scala.inline
    def withTickvals(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickvals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(js.undefined)
        ret
    }
    @scala.inline
    def withTickwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | PartialDataTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlefont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlefont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlefont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlefont")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: AxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroline")(js.undefined)
        ret
    }
    @scala.inline
    def withZerolinecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerolinecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZerolinecolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerolinecolor")(js.undefined)
        ret
    }
    @scala.inline
    def withZerolinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerolinewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZerolinewidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerolinewidth")(js.undefined)
        ret
    }
  }
  
}

