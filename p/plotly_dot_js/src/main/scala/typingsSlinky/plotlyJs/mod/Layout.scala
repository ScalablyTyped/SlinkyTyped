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

@js.native
trait Layout extends js.Object {
  var annotations: js.Array[PartialAnnotationsAlign] = js.native
  var autosize: Boolean = js.native
  var bargap: `0` | `1` = js.native
  var bargroupgap: `0` | `1` = js.native
  var barmode: stack | group | overlay | relative = js.native
  var barnorm: _empty | fraction | percent = js.native
  var calendar: Calendar = js.native
  var colorway: js.Array[String] = js.native
   // TODO
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false` = js.native
  var font: PartialFont = js.native
  var grid: Partialrowsnumberroworder = js.native
  var height: Double = js.native
  var hiddenlabels: js.Array[String] = js.native
  var hidesources: Boolean = js.native
  var hoverlabel: PartialHoverLabel = js.native
  var hovermode: closest | x | y | `false` = js.native
  var images: js.Array[PartialImage] = js.native
  var legend: PartialLegend = js.native
  var margin: PartialMargin = js.native
  var orientation: Double = js.native
  var paper_bgcolor: Color = js.native
  var plot_bgcolor: Color = js.native
  var polar: PartialPolarLayout = js.native
  var polar2: PartialPolarLayout = js.native
  var polar3: PartialPolarLayout = js.native
  var polar4: PartialPolarLayout = js.native
  var polar5: PartialPolarLayout = js.native
  var polar6: PartialPolarLayout = js.native
  var polar7: PartialPolarLayout = js.native
  var polar8: PartialPolarLayout = js.native
  var polar9: PartialPolarLayout = js.native
   // TODO
  var radialaxis: PartialAxis = js.native
  var scene: PartialScene = js.native
  var selectdirection: h | v | d | any = js.native
  var separators: String = js.native
  var shapes: js.Array[PartialShape] = js.native
  var showlegend: Boolean = js.native
   // TODO
  var sliders: js.Array[PartialSlider] = js.native
  var title: String | PartialtextstringfontPart = js.native
  var titlefont: PartialFont = js.native
  var transition: Transition = js.native
  var width: Double = js.native
  var xaxis: PartialLayoutAxis = js.native
  var xaxis2: PartialLayoutAxis = js.native
  var xaxis3: PartialLayoutAxis = js.native
  var xaxis4: PartialLayoutAxis = js.native
  var xaxis5: PartialLayoutAxis = js.native
  var xaxis6: PartialLayoutAxis = js.native
  var xaxis7: PartialLayoutAxis = js.native
  var xaxis8: PartialLayoutAxis = js.native
  var xaxis9: PartialLayoutAxis = js.native
  @JSName("xaxis.autorange")
  var xaxisDotautorange: Boolean = js.native
  @JSName("xaxis.range")
  var xaxisDotrange: js.Tuple2[Datum, Datum] = js.native
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: Datum = js.native
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: Datum = js.native
  @JSName("xaxis.title")
  var xaxisDottitle: String = js.native
  @JSName("xaxis.type")
  var xaxisDottype: AxisType = js.native
  var yaxis: PartialLayoutAxis = js.native
  var yaxis2: PartialLayoutAxis = js.native
  var yaxis3: PartialLayoutAxis = js.native
  var yaxis4: PartialLayoutAxis = js.native
  var yaxis5: PartialLayoutAxis = js.native
  var yaxis6: PartialLayoutAxis = js.native
  var yaxis7: PartialLayoutAxis = js.native
  var yaxis8: PartialLayoutAxis = js.native
  var yaxis9: PartialLayoutAxis = js.native
  @JSName("yaxis.autorange")
  var yaxisDotautorange: Boolean = js.native
  @JSName("yaxis.range")
  var yaxisDotrange: js.Tuple2[Datum, Datum] = js.native
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: Datum = js.native
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: Datum = js.native
  @JSName("yaxis.title")
  var yaxisDottitle: String = js.native
  @JSName("yaxis.type")
  var yaxisDottype: AxisType = js.native
}

object Layout {
  @scala.inline
  def apply(
    annotations: js.Array[PartialAnnotationsAlign],
    autosize: Boolean,
    bargap: `0` | `1`,
    bargroupgap: `0` | `1`,
    barmode: stack | group | overlay | relative,
    barnorm: _empty | fraction | percent,
    calendar: Calendar,
    colorway: js.Array[String],
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false`,
    font: PartialFont,
    grid: Partialrowsnumberroworder,
    height: Double,
    hiddenlabels: js.Array[String],
    hidesources: Boolean,
    hoverlabel: PartialHoverLabel,
    hovermode: closest | x | y | `false`,
    images: js.Array[PartialImage],
    legend: PartialLegend,
    margin: PartialMargin,
    orientation: Double,
    paper_bgcolor: Color,
    plot_bgcolor: Color,
    polar: PartialPolarLayout,
    polar2: PartialPolarLayout,
    polar3: PartialPolarLayout,
    polar4: PartialPolarLayout,
    polar5: PartialPolarLayout,
    polar6: PartialPolarLayout,
    polar7: PartialPolarLayout,
    polar8: PartialPolarLayout,
    polar9: PartialPolarLayout,
    radialaxis: PartialAxis,
    scene: PartialScene,
    selectdirection: h | v | d | any,
    separators: String,
    shapes: js.Array[PartialShape],
    showlegend: Boolean,
    sliders: js.Array[PartialSlider],
    title: String | PartialtextstringfontPart,
    titlefont: PartialFont,
    transition: Transition,
    width: Double,
    xaxis: PartialLayoutAxis,
    xaxis2: PartialLayoutAxis,
    xaxis3: PartialLayoutAxis,
    xaxis4: PartialLayoutAxis,
    xaxis5: PartialLayoutAxis,
    xaxis6: PartialLayoutAxis,
    xaxis7: PartialLayoutAxis,
    xaxis8: PartialLayoutAxis,
    xaxis9: PartialLayoutAxis,
    xaxisDotautorange: Boolean,
    xaxisDotrange: js.Tuple2[Datum, Datum],
    xaxisDottitle: String,
    xaxisDottype: AxisType,
    yaxis: PartialLayoutAxis,
    yaxis2: PartialLayoutAxis,
    yaxis3: PartialLayoutAxis,
    yaxis4: PartialLayoutAxis,
    yaxis5: PartialLayoutAxis,
    yaxis6: PartialLayoutAxis,
    yaxis7: PartialLayoutAxis,
    yaxis8: PartialLayoutAxis,
    yaxis9: PartialLayoutAxis,
    yaxisDotautorange: Boolean,
    yaxisDotrange: js.Tuple2[Datum, Datum],
    yaxisDottitle: String,
    yaxisDottype: AxisType
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], colorway = colorway.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], polar2 = polar2.asInstanceOf[js.Any], polar3 = polar3.asInstanceOf[js.Any], polar4 = polar4.asInstanceOf[js.Any], polar5 = polar5.asInstanceOf[js.Any], polar6 = polar6.asInstanceOf[js.Any], polar7 = polar7.asInstanceOf[js.Any], polar8 = polar8.asInstanceOf[js.Any], polar9 = polar9.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: js.Array[PartialAnnotationsAlign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutosize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBargap(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bargap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBargroupgap(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bargroupgap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarmode(value: stack | group | overlay | relative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarnorm(value: _empty | fraction | percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barnorm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorway(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragmode(value: zoom | pan | select | lasso | orbit | turntable | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: Partialrowsnumberroworder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenlabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenlabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidesources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverlabel(value: PartialHoverLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverlabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHovermode(value: closest | typingsSlinky.plotlyJs.plotlyJsStrings.x | y | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovermode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[PartialImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegend(value: PartialLegend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: PartialMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaper_bgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper_bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlot_bgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plot_bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar2(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar3(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar4(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar5(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar6(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar7(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar8(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolar9(value: PartialPolarLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadialaxis(value: PartialAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: PartialScene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectdirection(value: h | v | d | any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectdirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparators(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[PartialShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowlegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showlegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliders(value: js.Array[PartialSlider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | PartialtextstringfontPart): Self = {
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
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis2(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis3(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis4(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis5(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis6(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis7(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis8(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxis9(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxisDotautorange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.autorange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxisDottitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaxisDottype(value: AxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis2(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis3(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis4(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis5(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis6(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis7(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis8(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis9(value: PartialLayoutAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis9")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxisDotautorange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.autorange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxisDottitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxisDottype(value: AxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXaxisDotrange[0]Date`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[0]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXaxisDotrange[0]`(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[0]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXaxisDotrange[0]Null`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[0]")(null)
        ret
    }
    @scala.inline
    def `withXaxisDotrange[1]Date`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[1]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXaxisDotrange[1]`(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[1]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withXaxisDotrange[1]Null`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis.range[1]")(null)
        ret
    }
    @scala.inline
    def `withYaxisDotrange[0]Date`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[0]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYaxisDotrange[0]`(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[0]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYaxisDotrange[0]Null`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[0]")(null)
        ret
    }
    @scala.inline
    def `withYaxisDotrange[1]Date`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[1]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYaxisDotrange[1]`(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[1]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYaxisDotrange[1]Null`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis.range[1]")(null)
        ret
    }
  }
  
}

