package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialAnnotationsAlign
import typingsSlinky.plotlyJs.anon.PartialAxis
import typingsSlinky.plotlyJs.anon.PartialFont
import typingsSlinky.plotlyJs.anon.PartialHoverLabel
import typingsSlinky.plotlyJs.anon.PartialImage
import typingsSlinky.plotlyJs.anon.PartialLayoutAxis
import typingsSlinky.plotlyJs.anon.PartialLegend
import typingsSlinky.plotlyJs.anon.PartialMargin
import typingsSlinky.plotlyJs.anon.PartialPolarLayout
import typingsSlinky.plotlyJs.anon.PartialScene
import typingsSlinky.plotlyJs.anon.PartialShape
import typingsSlinky.plotlyJs.anon.PartialSlider
import typingsSlinky.plotlyJs.anon.Partialrowsnumberroworder
import typingsSlinky.plotlyJs.anon.PartialtextstringfontPart
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsNumbers.`0`
import typingsSlinky.plotlyJs.plotlyJsNumbers.`1`
import typingsSlinky.plotlyJs.plotlyJsStrings._empty
import typingsSlinky.plotlyJs.plotlyJsStrings.any
import typingsSlinky.plotlyJs.plotlyJsStrings.closest
import typingsSlinky.plotlyJs.plotlyJsStrings.d
import typingsSlinky.plotlyJs.plotlyJsStrings.fraction
import typingsSlinky.plotlyJs.plotlyJsStrings.group
import typingsSlinky.plotlyJs.plotlyJsStrings.h
import typingsSlinky.plotlyJs.plotlyJsStrings.lasso
import typingsSlinky.plotlyJs.plotlyJsStrings.orbit
import typingsSlinky.plotlyJs.plotlyJsStrings.overlay
import typingsSlinky.plotlyJs.plotlyJsStrings.pan
import typingsSlinky.plotlyJs.plotlyJsStrings.percent
import typingsSlinky.plotlyJs.plotlyJsStrings.relative
import typingsSlinky.plotlyJs.plotlyJsStrings.select
import typingsSlinky.plotlyJs.plotlyJsStrings.stack
import typingsSlinky.plotlyJs.plotlyJsStrings.turntable
import typingsSlinky.plotlyJs.plotlyJsStrings.v
import typingsSlinky.plotlyJs.plotlyJsStrings.x
import typingsSlinky.plotlyJs.plotlyJsStrings.y
import typingsSlinky.plotlyJs.plotlyJsStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<plotly.js.plotly.js.Layout> */
@js.native
trait PlotRelayoutEvent extends js.Object {
  var angularaxis: js.UndefOr[js.Object] = js.native
  var annotations: js.UndefOr[js.Array[PartialAnnotationsAlign]] = js.native
  var autosize: js.UndefOr[Boolean] = js.native
  var bargap: js.UndefOr[`0` | `1`] = js.native
  var bargroupgap: js.UndefOr[`0` | `1`] = js.native
  var barmode: js.UndefOr[stack | group | overlay | relative] = js.native
  var barnorm: js.UndefOr[_empty | fraction | percent] = js.native
  var calendar: js.UndefOr[Calendar] = js.native
  var colorway: js.UndefOr[js.Array[String]] = js.native
  var dragmode: js.UndefOr[zoom | pan | select | lasso | orbit | turntable | `false`] = js.native
  var font: js.UndefOr[PartialFont] = js.native
  var geo: js.UndefOr[js.Object] = js.native
  var grid: js.UndefOr[Partialrowsnumberroworder] = js.native
  var height: js.UndefOr[Double] = js.native
  var hiddenlabels: js.UndefOr[js.Array[String]] = js.native
  var hidesources: js.UndefOr[Boolean] = js.native
  var hoverlabel: js.UndefOr[PartialHoverLabel] = js.native
  var hovermode: js.UndefOr[closest | x | y | `false`] = js.native
  var images: js.UndefOr[js.Array[PartialImage]] = js.native
  var legend: js.UndefOr[PartialLegend] = js.native
  var mapbox: js.UndefOr[js.Object] = js.native
  var margin: js.UndefOr[PartialMargin] = js.native
  var orientation: js.UndefOr[Double] = js.native
  var paper_bgcolor: js.UndefOr[Color] = js.native
  var plot_bgcolor: js.UndefOr[Color] = js.native
  var polar: js.UndefOr[PartialPolarLayout] = js.native
  var polar2: js.UndefOr[PartialPolarLayout] = js.native
  var polar3: js.UndefOr[PartialPolarLayout] = js.native
  var polar4: js.UndefOr[PartialPolarLayout] = js.native
  var polar5: js.UndefOr[PartialPolarLayout] = js.native
  var polar6: js.UndefOr[PartialPolarLayout] = js.native
  var polar7: js.UndefOr[PartialPolarLayout] = js.native
  var polar8: js.UndefOr[PartialPolarLayout] = js.native
  var polar9: js.UndefOr[PartialPolarLayout] = js.native
  var radialaxis: js.UndefOr[PartialAxis] = js.native
  var scene: js.UndefOr[PartialScene] = js.native
  var selectdirection: js.UndefOr[h | v | d | any] = js.native
  var separators: js.UndefOr[String] = js.native
  var shapes: js.UndefOr[js.Array[PartialShape]] = js.native
  var showlegend: js.UndefOr[Boolean] = js.native
  var sliders: js.UndefOr[js.Array[PartialSlider]] = js.native
  var ternary: js.UndefOr[js.Object] = js.native
  var title: js.UndefOr[String | PartialtextstringfontPart] = js.native
  var titlefont: js.UndefOr[PartialFont] = js.native
  var transition: js.UndefOr[Transition] = js.native
  var updatemenus: js.UndefOr[js.Object] = js.native
  var width: js.UndefOr[Double] = js.native
  var xaxis: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis2: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis3: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis4: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis5: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis6: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis7: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis8: js.UndefOr[PartialLayoutAxis] = js.native
  var xaxis9: js.UndefOr[PartialLayoutAxis] = js.native
  @JSName("xaxis.autorange")
  var xaxisDotautorange: js.UndefOr[Boolean] = js.native
  @JSName("xaxis.range")
  var xaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: js.UndefOr[Double] = js.native
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: js.UndefOr[Double] = js.native
  @JSName("xaxis.title")
  var xaxisDottitle: js.UndefOr[String] = js.native
  @JSName("xaxis.type")
  var xaxisDottype: js.UndefOr[AxisType] = js.native
  var yaxis: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis2: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis3: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis4: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis5: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis6: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis7: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis8: js.UndefOr[PartialLayoutAxis] = js.native
  var yaxis9: js.UndefOr[PartialLayoutAxis] = js.native
  @JSName("yaxis.autorange")
  var yaxisDotautorange: js.UndefOr[Boolean] = js.native
  @JSName("yaxis.range")
  var yaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: js.UndefOr[Double] = js.native
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: js.UndefOr[Double] = js.native
  @JSName("yaxis.title")
  var yaxisDottitle: js.UndefOr[String] = js.native
  @JSName("yaxis.type")
  var yaxisDottype: js.UndefOr[AxisType] = js.native
}

object PlotRelayoutEvent {
  @scala.inline
  def apply(): PlotRelayoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotRelayoutEvent]
  }
  @scala.inline
  implicit class PlotRelayoutEventOps[Self <: PlotRelayoutEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngularaxis(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Array[PartialAnnotationsAlign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosize")(js.undefined)
        ret
    }
    @scala.inline
    def withBargap(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bargap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBargap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bargap")(js.undefined)
        ret
    }
    @scala.inline
    def withBargroupgap(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bargroupgap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBargroupgap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bargroupgap")(js.undefined)
        ret
    }
    @scala.inline
    def withBarmode(value: stack | group | overlay | relative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barmode")(js.undefined)
        ret
    }
    @scala.inline
    def withBarnorm(value: _empty | fraction | percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barnorm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarnorm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barnorm")(js.undefined)
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
    def withColorway(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorway")(js.undefined)
        ret
    }
    @scala.inline
    def withDragmode(value: zoom | pan | select | lasso | orbit | turntable | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragmode")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withGeo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Partialrowsnumberroworder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenlabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenlabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenlabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenlabels")(js.undefined)
        ret
    }
    @scala.inline
    def withHidesources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidesources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesources")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverlabel(value: PartialHoverLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverlabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverlabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverlabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHovermode(value: closest | typingsSlinky.plotlyJs.plotlyJsStrings.x | y | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovermode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHovermode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovermode")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[PartialImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: PartialLegend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withMapbox(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapbox")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: PartialMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPaper_bgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper_bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaper_bgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper_bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withPlot_bgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plot_bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlot_bgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plot_bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar2(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar2")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar3(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar3")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar4(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar4")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar5(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar5")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar6(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar6")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar7(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar7")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar8(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar8")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar9(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar9: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar9")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialaxis(value: PartialAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withScene(value: PartialScene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectdirection(value: h | v | d | any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectdirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectdirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectdirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparators(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separators")(js.undefined)
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[PartialShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowlegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showlegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowlegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showlegend")(js.undefined)
        ret
    }
    @scala.inline
    def withSliders(value: js.Array[PartialSlider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliders")(js.undefined)
        ret
    }
    @scala.inline
    def withTernary(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ternary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTernary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ternary")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | PartialtextstringfontPart): Self = {
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
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatemenus(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatemenus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatemenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatemenus")(js.undefined)
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
    @scala.inline
    def withXaxis(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis2(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis2")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis3(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis3")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis4(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis4")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis5(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis5")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis6(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis6")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis7(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis7")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis8(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis8")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis9(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxis9: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis9")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxisDotautorange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.autorange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxisDotautorange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.autorange")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxisDotrange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range")(js.undefined)
        ret
    }
    @scala.inline
    def `withXaxisDotrange[0]`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[0]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXaxisDotrange[0]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[0]")(js.undefined)
        ret
    }
    @scala.inline
    def `withXaxisDotrange[1]`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[1]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXaxisDotrange[1]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[1]")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxisDottitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxisDottitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.title")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxisDottype(value: AxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxisDottype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.type")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis2(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis2")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis3(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis3")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis4(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis4")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis5(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis5")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis6(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis6")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis7(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis7")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis8(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis8")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis9(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxis9: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis9")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxisDotautorange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.autorange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxisDotautorange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.autorange")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxisDotrange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range")(js.undefined)
        ret
    }
    @scala.inline
    def `withYaxisDotrange[0]`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[0]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutYaxisDotrange[0]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[0]")(js.undefined)
        ret
    }
    @scala.inline
    def `withYaxisDotrange[1]`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[1]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutYaxisDotrange[1]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[1]")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxisDottitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxisDottitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.title")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxisDottype(value: AxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxisDottype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.type")(js.undefined)
        ret
    }
  }
  
}

