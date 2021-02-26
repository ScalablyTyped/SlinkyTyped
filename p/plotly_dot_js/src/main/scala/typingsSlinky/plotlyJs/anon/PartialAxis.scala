package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.AxisType
import typingsSlinky.plotlyJs.mod.Calendar
import typingsSlinky.plotlyJs.mod.DTickValue
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsBooleans.`true`
import typingsSlinky.plotlyJs.plotlyJsStrings.B
import typingsSlinky.plotlyJs.plotlyJsStrings.E
import typingsSlinky.plotlyJs.plotlyJsStrings.SI
import typingsSlinky.plotlyJs.plotlyJsStrings._empty
import typingsSlinky.plotlyJs.plotlyJsStrings.`category ascending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`category descending`
import typingsSlinky.plotlyJs.plotlyJsStrings.`hovered data`
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
import typingsSlinky.plotlyJs.plotlyJsStrings.across
import typingsSlinky.plotlyJs.plotlyJsStrings.acrossPlussignmarker
import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.allticks
import typingsSlinky.plotlyJs.plotlyJsStrings.array
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.cursor
import typingsSlinky.plotlyJs.plotlyJsStrings.data
import typingsSlinky.plotlyJs.plotlyJsStrings.e_
import typingsSlinky.plotlyJs.plotlyJsStrings.first
import typingsSlinky.plotlyJs.plotlyJsStrings.inside
import typingsSlinky.plotlyJs.plotlyJsStrings.last
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.marker
import typingsSlinky.plotlyJs.plotlyJsStrings.none
import typingsSlinky.plotlyJs.plotlyJsStrings.nonnegative
import typingsSlinky.plotlyJs.plotlyJsStrings.normal
import typingsSlinky.plotlyJs.plotlyJsStrings.outside
import typingsSlinky.plotlyJs.plotlyJsStrings.power
import typingsSlinky.plotlyJs.plotlyJsStrings.reversed
import typingsSlinky.plotlyJs.plotlyJsStrings.ticks
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxis
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxisPlussignacross
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxisPlussignacrossPlussignmarker
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxisPlussignmarker
import typingsSlinky.plotlyJs.plotlyJsStrings.tozero
import typingsSlinky.plotlyJs.plotlyJsStrings.trace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Axis> */
@js.native
trait PartialAxis extends StObject {
  
  var autorange: js.UndefOr[`true` | `false` | reversed] = js.native
  
  var calendar: js.UndefOr[Calendar] = js.native
  
  var categoryarray: js.UndefOr[js.Array[_]] = js.native
  
  var categoryorder: js.UndefOr[
    trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
  ] = js.native
  
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var dividercolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var dividerwidth: js.UndefOr[Double] = js.native
  
  var dtick: js.UndefOr[DTickValue] = js.native
  
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.native
  
  var fixedrange: js.UndefOr[Boolean] = js.native
  
  var gridcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var gridwidth: js.UndefOr[Double] = js.native
  
  var hoverformat: js.UndefOr[String] = js.native
  
  var linecolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var linewidth: js.UndefOr[Double] = js.native
  
  var mirror: js.UndefOr[`true` | ticks | `false` | all | allticks] = js.native
  
  var nticks: js.UndefOr[Double] = js.native
  
  var range: js.UndefOr[js.Array[_]] = js.native
  
  var rangemode: js.UndefOr[normal | tozero | nonnegative] = js.native
  
  var separatethousands: js.UndefOr[Boolean] = js.native
  
  var showdividers: js.UndefOr[Boolean] = js.native
  
  var showexponent: js.UndefOr[all | first | last | none] = js.native
  
  var showgrid: js.UndefOr[Boolean] = js.native
  
  var showline: js.UndefOr[Boolean] = js.native
  
  var showspikes: js.UndefOr[Boolean] = js.native
  
  var showticklabels: js.UndefOr[Boolean] = js.native
  
  var showtickprefix: js.UndefOr[all | first | last | none] = js.native
  
  var showticksuffix: js.UndefOr[all | first | last | none] = js.native
  
  var spikecolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var spikedash: js.UndefOr[String] = js.native
  
  var spikemode: js.UndefOr[
    toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
  ] = js.native
  
  var spikesnap: js.UndefOr[data | cursor | (`hovered data`)] = js.native
  
  var spikethickness: js.UndefOr[Double] = js.native
  
  var tick0: js.UndefOr[Double | String] = js.native
  
  var tickangle: js.UndefOr[Double] = js.native
  
  var tickcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var tickfont: js.UndefOr[PartialFont] = js.native
  
  var tickformat: js.UndefOr[String] = js.native
  
  var tickformatstops: js.UndefOr[js.Array[PartialTickFormatStop]] = js.native
  
  var ticklen: js.UndefOr[Double] = js.native
  
  var tickmode: js.UndefOr[auto | linear | array] = js.native
  
  var tickprefix: js.UndefOr[String] = js.native
  
  var ticks: js.UndefOr[outside | inside | _empty] = js.native
  
  var ticksuffix: js.UndefOr[String] = js.native
  
  var ticktext: js.UndefOr[js.Array[String]] = js.native
  
  var tickvals: js.UndefOr[js.Array[_]] = js.native
  
  var tickwidth: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String | PartialDataTitleFont] = js.native
  
  var titlefont: js.UndefOr[PartialFont] = js.native
  
  var `type`: js.UndefOr[AxisType] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zeroline: js.UndefOr[Boolean] = js.native
  
  var zerolinecolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var zerolinewidth: js.UndefOr[Double] = js.native
}
object PartialAxis {
  
  @scala.inline
  def apply(): PartialAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAxis]
  }
  
  @scala.inline
  implicit class PartialAxisMutableBuilder[Self <: PartialAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutorange(value: `true` | `false` | reversed): Self = StObject.set(x, "autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutorangeUndefined: Self = StObject.set(x, "autorange", js.undefined)
    
    @scala.inline
    def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setCategoryarray(value: js.Array[_]): Self = StObject.set(x, "categoryarray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryarrayUndefined: Self = StObject.set(x, "categoryarray", js.undefined)
    
    @scala.inline
    def setCategoryarrayVarargs(value: js.Any*): Self = StObject.set(x, "categoryarray", js.Array(value :_*))
    
    @scala.inline
    def setCategoryorder(
      value: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
    ): Self = StObject.set(x, "categoryorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryorderUndefined: Self = StObject.set(x, "categoryorder", js.undefined)
    
    @scala.inline
    def setColor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDividercolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "dividercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividercolorUndefined: Self = StObject.set(x, "dividercolor", js.undefined)
    
    @scala.inline
    def setDividercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "dividercolor", js.Array(value :_*))
    
    @scala.inline
    def setDividerwidth(value: Double): Self = StObject.set(x, "dividerwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerwidthUndefined: Self = StObject.set(x, "dividerwidth", js.undefined)
    
    @scala.inline
    def setDtick(value: DTickValue): Self = StObject.set(x, "dtick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtickUndefined: Self = StObject.set(x, "dtick", js.undefined)
    
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = StObject.set(x, "exponentformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentformatUndefined: Self = StObject.set(x, "exponentformat", js.undefined)
    
    @scala.inline
    def setFixedrange(value: Boolean): Self = StObject.set(x, "fixedrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedrangeUndefined: Self = StObject.set(x, "fixedrange", js.undefined)
    
    @scala.inline
    def setGridcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "gridcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridcolorUndefined: Self = StObject.set(x, "gridcolor", js.undefined)
    
    @scala.inline
    def setGridcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "gridcolor", js.Array(value :_*))
    
    @scala.inline
    def setGridwidth(value: Double): Self = StObject.set(x, "gridwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridwidthUndefined: Self = StObject.set(x, "gridwidth", js.undefined)
    
    @scala.inline
    def setHoverformat(value: String): Self = StObject.set(x, "hoverformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverformatUndefined: Self = StObject.set(x, "hoverformat", js.undefined)
    
    @scala.inline
    def setLinecolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "linecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinecolorUndefined: Self = StObject.set(x, "linecolor", js.undefined)
    
    @scala.inline
    def setLinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "linecolor", js.Array(value :_*))
    
    @scala.inline
    def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
    
    @scala.inline
    def setMirror(value: `true` | ticks | `false` | all | allticks): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    @scala.inline
    def setNticks(value: Double): Self = StObject.set(x, "nticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNticksUndefined: Self = StObject.set(x, "nticks", js.undefined)
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setRangemode(value: normal | tozero | nonnegative): Self = StObject.set(x, "rangemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangemodeUndefined: Self = StObject.set(x, "rangemode", js.undefined)
    
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = StObject.set(x, "separatethousands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatethousandsUndefined: Self = StObject.set(x, "separatethousands", js.undefined)
    
    @scala.inline
    def setShowdividers(value: Boolean): Self = StObject.set(x, "showdividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowdividersUndefined: Self = StObject.set(x, "showdividers", js.undefined)
    
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = StObject.set(x, "showexponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowexponentUndefined: Self = StObject.set(x, "showexponent", js.undefined)
    
    @scala.inline
    def setShowgrid(value: Boolean): Self = StObject.set(x, "showgrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowgridUndefined: Self = StObject.set(x, "showgrid", js.undefined)
    
    @scala.inline
    def setShowline(value: Boolean): Self = StObject.set(x, "showline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowlineUndefined: Self = StObject.set(x, "showline", js.undefined)
    
    @scala.inline
    def setShowspikes(value: Boolean): Self = StObject.set(x, "showspikes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowspikesUndefined: Self = StObject.set(x, "showspikes", js.undefined)
    
    @scala.inline
    def setShowticklabels(value: Boolean): Self = StObject.set(x, "showticklabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticklabelsUndefined: Self = StObject.set(x, "showticklabels", js.undefined)
    
    @scala.inline
    def setShowtickprefix(value: all | first | last | none): Self = StObject.set(x, "showtickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowtickprefixUndefined: Self = StObject.set(x, "showtickprefix", js.undefined)
    
    @scala.inline
    def setShowticksuffix(value: all | first | last | none): Self = StObject.set(x, "showticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticksuffixUndefined: Self = StObject.set(x, "showticksuffix", js.undefined)
    
    @scala.inline
    def setSpikecolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "spikecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikecolorUndefined: Self = StObject.set(x, "spikecolor", js.undefined)
    
    @scala.inline
    def setSpikecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "spikecolor", js.Array(value :_*))
    
    @scala.inline
    def setSpikedash(value: String): Self = StObject.set(x, "spikedash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikedashUndefined: Self = StObject.set(x, "spikedash", js.undefined)
    
    @scala.inline
    def setSpikemode(
      value: toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
    ): Self = StObject.set(x, "spikemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikemodeUndefined: Self = StObject.set(x, "spikemode", js.undefined)
    
    @scala.inline
    def setSpikesnap(value: data | cursor | (`hovered data`)): Self = StObject.set(x, "spikesnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikesnapUndefined: Self = StObject.set(x, "spikesnap", js.undefined)
    
    @scala.inline
    def setSpikethickness(value: Double): Self = StObject.set(x, "spikethickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikethicknessUndefined: Self = StObject.set(x, "spikethickness", js.undefined)
    
    @scala.inline
    def setTick0(value: Double | String): Self = StObject.set(x, "tick0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick0Undefined: Self = StObject.set(x, "tick0", js.undefined)
    
    @scala.inline
    def setTickangle(value: Double): Self = StObject.set(x, "tickangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickangleUndefined: Self = StObject.set(x, "tickangle", js.undefined)
    
    @scala.inline
    def setTickcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorUndefined: Self = StObject.set(x, "tickcolor", js.undefined)
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTickfont(value: PartialFont): Self = StObject.set(x, "tickfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickfontUndefined: Self = StObject.set(x, "tickfont", js.undefined)
    
    @scala.inline
    def setTickformat(value: String): Self = StObject.set(x, "tickformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatUndefined: Self = StObject.set(x, "tickformat", js.undefined)
    
    @scala.inline
    def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = StObject.set(x, "tickformatstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatstopsUndefined: Self = StObject.set(x, "tickformatstops", js.undefined)
    
    @scala.inline
    def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = StObject.set(x, "tickformatstops", js.Array(value :_*))
    
    @scala.inline
    def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicklenUndefined: Self = StObject.set(x, "ticklen", js.undefined)
    
    @scala.inline
    def setTickmode(value: auto | linear | array): Self = StObject.set(x, "tickmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickmodeUndefined: Self = StObject.set(x, "tickmode", js.undefined)
    
    @scala.inline
    def setTickprefix(value: String): Self = StObject.set(x, "tickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickprefixUndefined: Self = StObject.set(x, "tickprefix", js.undefined)
    
    @scala.inline
    def setTicks(value: outside | inside | _empty): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksuffix(value: String): Self = StObject.set(x, "ticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksuffixUndefined: Self = StObject.set(x, "ticksuffix", js.undefined)
    
    @scala.inline
    def setTicktext(value: js.Array[String]): Self = StObject.set(x, "ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextUndefined: Self = StObject.set(x, "ticktext", js.undefined)
    
    @scala.inline
    def setTicktextVarargs(value: String*): Self = StObject.set(x, "ticktext", js.Array(value :_*))
    
    @scala.inline
    def setTickvals(value: js.Array[_]): Self = StObject.set(x, "tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsUndefined: Self = StObject.set(x, "tickvals", js.undefined)
    
    @scala.inline
    def setTickvalsVarargs(value: js.Any*): Self = StObject.set(x, "tickvals", js.Array(value :_*))
    
    @scala.inline
    def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    @scala.inline
    def setTitle(value: String | PartialDataTitleFont): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitlefont(value: PartialFont): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlefontUndefined: Self = StObject.set(x, "titlefont", js.undefined)
    
    @scala.inline
    def setType(value: AxisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZeroline(value: Boolean): Self = StObject.set(x, "zeroline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZerolineUndefined: Self = StObject.set(x, "zeroline", js.undefined)
    
    @scala.inline
    def setZerolinecolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "zerolinecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZerolinecolorUndefined: Self = StObject.set(x, "zerolinecolor", js.undefined)
    
    @scala.inline
    def setZerolinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "zerolinecolor", js.Array(value :_*))
    
    @scala.inline
    def setZerolinewidth(value: Double): Self = StObject.set(x, "zerolinewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZerolinewidthUndefined: Self = StObject.set(x, "zerolinewidth", js.undefined)
  }
}
