package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.AxisName
import typingsSlinky.plotlyJs.mod.AxisType
import typingsSlinky.plotlyJs.mod.Calendar
import typingsSlinky.plotlyJs.mod.DTickValue
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
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.clockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.counterclockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.cursor
import typingsSlinky.plotlyJs.plotlyJsStrings.data
import typingsSlinky.plotlyJs.plotlyJsStrings.domain
import typingsSlinky.plotlyJs.plotlyJsStrings.e_
import typingsSlinky.plotlyJs.plotlyJsStrings.first
import typingsSlinky.plotlyJs.plotlyJsStrings.free
import typingsSlinky.plotlyJs.plotlyJsStrings.inside
import typingsSlinky.plotlyJs.plotlyJsStrings.last
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.marker
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
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxis
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxisPlussignacross
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxisPlussignacrossPlussignmarker
import typingsSlinky.plotlyJs.plotlyJsStrings.toaxisPlussignmarker
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.plotlyJs.plotlyJsStrings.tozero
import typingsSlinky.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var constrain: js.UndefOr[range | domain] = js.native
  
  var constraintoward: js.UndefOr[left | center | right | top | middle | bottom] = js.native
  
  var dividercolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var dividerwidth: js.UndefOr[Double] = js.native
  
  var domain: js.UndefOr[js.Array[Double]] = js.native
  
  var dtick: js.UndefOr[DTickValue] = js.native
  
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.native
  
  var fixedrange: js.UndefOr[Boolean] = js.native
  
  var gridcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var gridwidth: js.UndefOr[Double] = js.native
  
  var hoverformat: js.UndefOr[String] = js.native
  
  var layer: js.UndefOr[(`above traces`) | (`below traces`)] = js.native
  
  var linecolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
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
  
  var showdividers: js.UndefOr[Boolean] = js.native
  
  var showexponent: js.UndefOr[all | first | last | none] = js.native
  
  var showgrid: js.UndefOr[Boolean] = js.native
  
  var showline: js.UndefOr[Boolean] = js.native
  
  var showspikes: js.UndefOr[Boolean] = js.native
  
  var showticklabels: js.UndefOr[Boolean] = js.native
  
  var showtickprefix: js.UndefOr[all | first | last | none] = js.native
  
  var showticksuffix: js.UndefOr[all | first | last | none] = js.native
  
  var side: js.UndefOr[top | bottom | left | right | clockwise | counterclockwise] = js.native
  
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
  
  var title: js.UndefOr[String | PartialDataTitle] = js.native
  
  var titlefont: js.UndefOr[PartialFont] = js.native
  
  var `type`: js.UndefOr[AxisType] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zeroline: js.UndefOr[Boolean] = js.native
  
  var zerolinecolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchor(value: free | AxisName): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAngle(value: js.Any): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAutomargin(value: Boolean): Self = this.set("automargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomargin: Self = this.set("automargin", js.undefined)
    
    @scala.inline
    def setAutorange(value: `true` | `false` | reversed): Self = this.set("autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutorange: Self = this.set("autorange", js.undefined)
    
    @scala.inline
    def setAutotick(value: Boolean): Self = this.set("autotick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutotick: Self = this.set("autotick", js.undefined)
    
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setCategoryarrayVarargs(value: js.Any*): Self = this.set("categoryarray", js.Array(value :_*))
    
    @scala.inline
    def setCategoryarray(value: js.Array[_]): Self = this.set("categoryarray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryarray: Self = this.set("categoryarray", js.undefined)
    
    @scala.inline
    def setCategoryorder(
      value: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
    ): Self = this.set("categoryorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryorder: Self = this.set("categoryorder", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setConstrain(value: range | domain): Self = this.set("constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrain: Self = this.set("constrain", js.undefined)
    
    @scala.inline
    def setConstraintoward(value: left | center | right | top | middle | bottom): Self = this.set("constraintoward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintoward: Self = this.set("constraintoward", js.undefined)
    
    @scala.inline
    def setDividercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("dividercolor", js.Array(value :_*))
    
    @scala.inline
    def setDividercolor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("dividercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDividercolor: Self = this.set("dividercolor", js.undefined)
    
    @scala.inline
    def setDividerwidth(value: Double): Self = this.set("dividerwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDividerwidth: Self = this.set("dividerwidth", js.undefined)
    
    @scala.inline
    def setDomainVarargs(value: Double*): Self = this.set("domain", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: js.Array[Double]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDtick(value: DTickValue): Self = this.set("dtick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtick: Self = this.set("dtick", js.undefined)
    
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = this.set("exponentformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponentformat: Self = this.set("exponentformat", js.undefined)
    
    @scala.inline
    def setFixedrange(value: Boolean): Self = this.set("fixedrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedrange: Self = this.set("fixedrange", js.undefined)
    
    @scala.inline
    def setGridcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("gridcolor", js.Array(value :_*))
    
    @scala.inline
    def setGridcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("gridcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridcolor: Self = this.set("gridcolor", js.undefined)
    
    @scala.inline
    def setGridwidth(value: Double): Self = this.set("gridwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridwidth: Self = this.set("gridwidth", js.undefined)
    
    @scala.inline
    def setHoverformat(value: String): Self = this.set("hoverformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverformat: Self = this.set("hoverformat", js.undefined)
    
    @scala.inline
    def setLayer(value: (`above traces`) | (`below traces`)): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setLinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("linecolor", js.Array(value :_*))
    
    @scala.inline
    def setLinecolor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("linecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinecolor: Self = this.set("linecolor", js.undefined)
    
    @scala.inline
    def setLinewidth(value: Double): Self = this.set("linewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinewidth: Self = this.set("linewidth", js.undefined)
    
    @scala.inline
    def setMirror(value: `true` | ticks | `false` | all | allticks): Self = this.set("mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    
    @scala.inline
    def setNticks(value: Double): Self = this.set("nticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNticks: Self = this.set("nticks", js.undefined)
    
    @scala.inline
    def setOverlaying(value: free | AxisName): Self = this.set("overlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlaying: Self = this.set("overlaying", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRangemode(value: normal | tozero | nonnegative): Self = this.set("rangemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangemode: Self = this.set("rangemode", js.undefined)
    
    @scala.inline
    def setRangeselector(value: PartialRangeSelector): Self = this.set("rangeselector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeselector: Self = this.set("rangeselector", js.undefined)
    
    @scala.inline
    def setRangeslider(value: PartialRangeSlider): Self = this.set("rangeslider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeslider: Self = this.set("rangeslider", js.undefined)
    
    @scala.inline
    def setScaleanchor(value: AxisName): Self = this.set("scaleanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleanchor: Self = this.set("scaleanchor", js.undefined)
    
    @scala.inline
    def setScaleratio(value: Double): Self = this.set("scaleratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleratio: Self = this.set("scaleratio", js.undefined)
    
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = this.set("separatethousands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparatethousands: Self = this.set("separatethousands", js.undefined)
    
    @scala.inline
    def setShowdividers(value: Boolean): Self = this.set("showdividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowdividers: Self = this.set("showdividers", js.undefined)
    
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = this.set("showexponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowexponent: Self = this.set("showexponent", js.undefined)
    
    @scala.inline
    def setShowgrid(value: Boolean): Self = this.set("showgrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowgrid: Self = this.set("showgrid", js.undefined)
    
    @scala.inline
    def setShowline(value: Boolean): Self = this.set("showline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowline: Self = this.set("showline", js.undefined)
    
    @scala.inline
    def setShowspikes(value: Boolean): Self = this.set("showspikes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowspikes: Self = this.set("showspikes", js.undefined)
    
    @scala.inline
    def setShowticklabels(value: Boolean): Self = this.set("showticklabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowticklabels: Self = this.set("showticklabels", js.undefined)
    
    @scala.inline
    def setShowtickprefix(value: all | first | last | none): Self = this.set("showtickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowtickprefix: Self = this.set("showtickprefix", js.undefined)
    
    @scala.inline
    def setShowticksuffix(value: all | first | last | none): Self = this.set("showticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowticksuffix: Self = this.set("showticksuffix", js.undefined)
    
    @scala.inline
    def setSide(value: top | bottom | left | right | clockwise | counterclockwise): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setSpikecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("spikecolor", js.Array(value :_*))
    
    @scala.inline
    def setSpikecolor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("spikecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpikecolor: Self = this.set("spikecolor", js.undefined)
    
    @scala.inline
    def setSpikedash(value: String): Self = this.set("spikedash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpikedash: Self = this.set("spikedash", js.undefined)
    
    @scala.inline
    def setSpikemode(
      value: toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
    ): Self = this.set("spikemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpikemode: Self = this.set("spikemode", js.undefined)
    
    @scala.inline
    def setSpikesnap(value: data | cursor | (`hovered data`)): Self = this.set("spikesnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpikesnap: Self = this.set("spikesnap", js.undefined)
    
    @scala.inline
    def setSpikethickness(value: Double): Self = this.set("spikethickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpikethickness: Self = this.set("spikethickness", js.undefined)
    
    @scala.inline
    def setTick0(value: Double | String): Self = this.set("tick0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick0: Self = this.set("tick0", js.undefined)
    
    @scala.inline
    def setTickangle(value: Double): Self = this.set("tickangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickangle: Self = this.set("tickangle", js.undefined)
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTickcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickcolor: Self = this.set("tickcolor", js.undefined)
    
    @scala.inline
    def setTickfont(value: PartialFont): Self = this.set("tickfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickfont: Self = this.set("tickfont", js.undefined)
    
    @scala.inline
    def setTickformat(value: String): Self = this.set("tickformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickformat: Self = this.set("tickformat", js.undefined)
    
    @scala.inline
    def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = this.set("tickformatstops", js.Array(value :_*))
    
    @scala.inline
    def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = this.set("tickformatstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickformatstops: Self = this.set("tickformatstops", js.undefined)
    
    @scala.inline
    def setTicklen(value: Double): Self = this.set("ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicklen: Self = this.set("ticklen", js.undefined)
    
    @scala.inline
    def setTickmode(value: auto | linear | array): Self = this.set("tickmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickmode: Self = this.set("tickmode", js.undefined)
    
    @scala.inline
    def setTickprefix(value: String): Self = this.set("tickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickprefix: Self = this.set("tickprefix", js.undefined)
    
    @scala.inline
    def setTicks(value: outside | inside | _empty): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setTicksuffix(value: String): Self = this.set("ticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicksuffix: Self = this.set("ticksuffix", js.undefined)
    
    @scala.inline
    def setTicktextVarargs(value: String*): Self = this.set("ticktext", js.Array(value :_*))
    
    @scala.inline
    def setTicktext(value: js.Array[String]): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicktext: Self = this.set("ticktext", js.undefined)
    
    @scala.inline
    def setTickvalsVarargs(value: js.Any*): Self = this.set("tickvals", js.Array(value :_*))
    
    @scala.inline
    def setTickvals(value: js.Array[_]): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickvals: Self = this.set("tickvals", js.undefined)
    
    @scala.inline
    def setTickwidth(value: Double): Self = this.set("tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickwidth: Self = this.set("tickwidth", js.undefined)
    
    @scala.inline
    def setTitle(value: String | PartialDataTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitlefont(value: PartialFont): Self = this.set("titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlefont: Self = this.set("titlefont", js.undefined)
    
    @scala.inline
    def setType(value: AxisType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZeroline(value: Boolean): Self = this.set("zeroline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroline: Self = this.set("zeroline", js.undefined)
    
    @scala.inline
    def setZerolinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("zerolinecolor", js.Array(value :_*))
    
    @scala.inline
    def setZerolinecolor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("zerolinecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZerolinecolor: Self = this.set("zerolinecolor", js.undefined)
    
    @scala.inline
    def setZerolinewidth(value: Double): Self = this.set("zerolinewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZerolinewidth: Self = this.set("zerolinewidth", js.undefined)
  }
}
