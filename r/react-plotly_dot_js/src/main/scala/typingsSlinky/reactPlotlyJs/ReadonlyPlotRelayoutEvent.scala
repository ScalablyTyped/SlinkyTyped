package typingsSlinky.reactPlotlyJs

import typingsSlinky.plotlyJs.PartialAnnotationsAlign
import typingsSlinky.plotlyJs.PartialAxis
import typingsSlinky.plotlyJs.PartialFont
import typingsSlinky.plotlyJs.PartialHoverLabel
import typingsSlinky.plotlyJs.PartialImage
import typingsSlinky.plotlyJs.PartialLayoutAxis
import typingsSlinky.plotlyJs.PartialLegend
import typingsSlinky.plotlyJs.PartialMargin
import typingsSlinky.plotlyJs.PartialPolarLayout
import typingsSlinky.plotlyJs.PartialScene
import typingsSlinky.plotlyJs.PartialShape
import typingsSlinky.plotlyJs.PartialSlider
import typingsSlinky.plotlyJs.Partialrowsnumberroworder
import typingsSlinky.plotlyJs.PartialtextstringfontPart
import typingsSlinky.plotlyJs.mod.AxisType
import typingsSlinky.plotlyJs.mod.Calendar
import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.Transition
import typingsSlinky.reactPlotlyJs.reactPlotlyJsBooleans.`false`
import typingsSlinky.reactPlotlyJs.reactPlotlyJsNumbers.`0`
import typingsSlinky.reactPlotlyJs.reactPlotlyJsNumbers.`1`
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings._empty
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.any
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.closest
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.d
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.fraction
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.group
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.h
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.lasso
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.orbit
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.overlay
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.pan
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.percent
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.relative
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.select
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.stack
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.turntable
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.v
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.x
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.y
import typingsSlinky.reactPlotlyJs.reactPlotlyJsStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.PlotRelayoutEvent> */
@js.native
trait ReadonlyPlotRelayoutEvent extends js.Object {
  val angularaxis: js.UndefOr[js.Object] = js.native
  val annotations: js.UndefOr[js.Array[PartialAnnotationsAlign]] = js.native
  val autosize: js.UndefOr[Boolean] = js.native
  val bargap: js.UndefOr[`0` | `1`] = js.native
  val bargroupgap: js.UndefOr[`0` | `1`] = js.native
  val barmode: js.UndefOr[stack | group | overlay | relative] = js.native
  val barnorm: js.UndefOr[_empty | fraction | percent] = js.native
  val calendar: js.UndefOr[Calendar] = js.native
  val colorway: js.UndefOr[js.Array[String]] = js.native
  val dragmode: js.UndefOr[zoom | pan | select | lasso | orbit | turntable | `false`] = js.native
  val font: js.UndefOr[PartialFont] = js.native
  val geo: js.UndefOr[js.Object] = js.native
  val grid: js.UndefOr[Partialrowsnumberroworder] = js.native
  val height: js.UndefOr[Double] = js.native
  val hiddenlabels: js.UndefOr[js.Array[String]] = js.native
  val hidesources: js.UndefOr[Boolean] = js.native
  val hoverlabel: js.UndefOr[PartialHoverLabel] = js.native
  val hovermode: js.UndefOr[closest | x | y | `false`] = js.native
  val images: js.UndefOr[js.Array[PartialImage]] = js.native
  val legend: js.UndefOr[PartialLegend] = js.native
  val mapbox: js.UndefOr[js.Object] = js.native
  val margin: js.UndefOr[PartialMargin] = js.native
  val orientation: js.UndefOr[Double] = js.native
  val paper_bgcolor: js.UndefOr[Color] = js.native
  val plot_bgcolor: js.UndefOr[Color] = js.native
  val polar: js.UndefOr[PartialPolarLayout] = js.native
  val polar2: js.UndefOr[PartialPolarLayout] = js.native
  val polar3: js.UndefOr[PartialPolarLayout] = js.native
  val polar4: js.UndefOr[PartialPolarLayout] = js.native
  val polar5: js.UndefOr[PartialPolarLayout] = js.native
  val polar6: js.UndefOr[PartialPolarLayout] = js.native
  val polar7: js.UndefOr[PartialPolarLayout] = js.native
  val polar8: js.UndefOr[PartialPolarLayout] = js.native
  val polar9: js.UndefOr[PartialPolarLayout] = js.native
  val radialaxis: js.UndefOr[PartialAxis] = js.native
  val scene: js.UndefOr[PartialScene] = js.native
  val selectdirection: js.UndefOr[h | v | d | any] = js.native
  val separators: js.UndefOr[String] = js.native
  val shapes: js.UndefOr[js.Array[PartialShape]] = js.native
  val showlegend: js.UndefOr[Boolean] = js.native
  val sliders: js.UndefOr[js.Array[PartialSlider]] = js.native
  val ternary: js.UndefOr[js.Object] = js.native
  val title: js.UndefOr[String | PartialtextstringfontPart] = js.native
  val titlefont: js.UndefOr[PartialFont] = js.native
  val transition: js.UndefOr[Transition] = js.native
  val updatemenus: js.UndefOr[js.Object] = js.native
  val width: js.UndefOr[Double] = js.native
  val xaxis: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis2: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis3: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis4: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis5: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis6: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis7: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis8: js.UndefOr[PartialLayoutAxis] = js.native
  val xaxis9: js.UndefOr[PartialLayoutAxis] = js.native
  @JSName("xaxis.autorange")
  val xaxisDotautorange: js.UndefOr[Boolean] = js.native
  @JSName("xaxis.range")
  val xaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  @JSName("xaxis.range[0]")
  val `xaxisDotrange[0]`: js.UndefOr[Double] = js.native
  @JSName("xaxis.range[1]")
  val `xaxisDotrange[1]`: js.UndefOr[Double] = js.native
  @JSName("xaxis.title")
  val xaxisDottitle: js.UndefOr[String] = js.native
  @JSName("xaxis.type")
  val xaxisDottype: js.UndefOr[AxisType] = js.native
  val yaxis: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis2: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis3: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis4: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis5: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis6: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis7: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis8: js.UndefOr[PartialLayoutAxis] = js.native
  val yaxis9: js.UndefOr[PartialLayoutAxis] = js.native
  @JSName("yaxis.autorange")
  val yaxisDotautorange: js.UndefOr[Boolean] = js.native
  @JSName("yaxis.range")
  val yaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  @JSName("yaxis.range[0]")
  val `yaxisDotrange[0]`: js.UndefOr[Double] = js.native
  @JSName("yaxis.range[1]")
  val `yaxisDotrange[1]`: js.UndefOr[Double] = js.native
  @JSName("yaxis.title")
  val yaxisDottitle: js.UndefOr[String] = js.native
  @JSName("yaxis.type")
  val yaxisDottype: js.UndefOr[AxisType] = js.native
}

object ReadonlyPlotRelayoutEvent {
  @scala.inline
  def apply(): ReadonlyPlotRelayoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPlotRelayoutEvent]
  }
  @scala.inline
  implicit class ReadonlyPlotRelayoutEventOps[Self <: ReadonlyPlotRelayoutEvent] (val x: Self) extends AnyVal {
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
    def withHovermode(value: closest | x | y | `false`): Self = {
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

