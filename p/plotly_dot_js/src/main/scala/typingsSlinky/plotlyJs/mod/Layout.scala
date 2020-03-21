package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.PartialAnnotationsArrowcolor
import typingsSlinky.plotlyJs.PartialAxis
import typingsSlinky.plotlyJs.PartialFont
import typingsSlinky.plotlyJs.PartialHoverLabel
import typingsSlinky.plotlyJs.PartialImage
import typingsSlinky.plotlyJs.PartialLayoutAxisAutomargin
import typingsSlinky.plotlyJs.PartialLegend
import typingsSlinky.plotlyJs.PartialMargin
import typingsSlinky.plotlyJs.PartialSceneAspectmode
import typingsSlinky.plotlyJs.PartialShape
import typingsSlinky.plotlyJs.PartialSliderActivebgcolor
import typingsSlinky.plotlyJs.Partialrowsnumberroworder
import typingsSlinky.plotlyJs.PartialtextstringfontPart
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

trait Layout extends js.Object {
  var annotations: js.Array[PartialAnnotationsArrowcolor]
  var autosize: Boolean
  var bargap: `0` | `1`
  var bargroupgap: `0` | `1`
  var barmode: stack | group | overlay | relative
  var barnorm: _empty | fraction | percent
  var calendar: Calendar
   // TODO
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false`
  var font: PartialFont
  var grid: Partialrowsnumberroworder
  var height: Double
  var hiddenlabels: js.Array[String]
  var hidesources: Boolean
  var hoverlabel: PartialHoverLabel
  var hovermode: closest | x | y | `false`
  var images: js.Array[PartialImage]
  var legend: PartialLegend
  var margin: PartialMargin
  var orientation: Double
  var paper_bgcolor: Color
  var plot_bgcolor: Color
   // TODO
  var radialaxis: PartialAxis
  var scene: PartialSceneAspectmode
  var selectdirection: h | v | d | any
  var separators: String
  var shapes: js.Array[PartialShape]
  var showlegend: Boolean
   // TODO
  var sliders: js.Array[PartialSliderActivebgcolor]
  var title: String | PartialtextstringfontPart
  var titlefont: PartialFont
  var width: Double
  var xaxis: PartialLayoutAxisAutomargin
  var xaxis2: PartialLayoutAxisAutomargin
  var xaxis3: PartialLayoutAxisAutomargin
  var xaxis4: PartialLayoutAxisAutomargin
  var xaxis5: PartialLayoutAxisAutomargin
  var xaxis6: PartialLayoutAxisAutomargin
  var xaxis7: PartialLayoutAxisAutomargin
  var xaxis8: PartialLayoutAxisAutomargin
  var xaxis9: PartialLayoutAxisAutomargin
  @JSName("xaxis.autorange")
  var xaxisDotautorange: Boolean
  @JSName("xaxis.range")
  var xaxisDotrange: js.Tuple2[Datum, Datum]
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: Datum
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: Datum
  @JSName("xaxis.title")
  var xaxisDottitle: String
  @JSName("xaxis.type")
  var xaxisDottype: AxisType
  var yaxis: PartialLayoutAxisAutomargin
  var yaxis2: PartialLayoutAxisAutomargin
  var yaxis3: PartialLayoutAxisAutomargin
  var yaxis4: PartialLayoutAxisAutomargin
  var yaxis5: PartialLayoutAxisAutomargin
  var yaxis6: PartialLayoutAxisAutomargin
  var yaxis7: PartialLayoutAxisAutomargin
  var yaxis8: PartialLayoutAxisAutomargin
  var yaxis9: PartialLayoutAxisAutomargin
  @JSName("yaxis.autorange")
  var yaxisDotautorange: Boolean
  @JSName("yaxis.range")
  var yaxisDotrange: js.Tuple2[Datum, Datum]
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: Datum
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: Datum
  @JSName("yaxis.title")
  var yaxisDottitle: String
  @JSName("yaxis.type")
  var yaxisDottype: AxisType
}

object Layout {
  @scala.inline
  def apply(
    annotations: js.Array[PartialAnnotationsArrowcolor],
    autosize: Boolean,
    bargap: `0` | `1`,
    bargroupgap: `0` | `1`,
    barmode: stack | group | overlay | relative,
    barnorm: _empty | fraction | percent,
    calendar: Calendar,
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
    radialaxis: PartialAxis,
    scene: PartialSceneAspectmode,
    selectdirection: h | v | d | any,
    separators: String,
    shapes: js.Array[PartialShape],
    showlegend: Boolean,
    sliders: js.Array[PartialSliderActivebgcolor],
    title: String | PartialtextstringfontPart,
    titlefont: PartialFont,
    width: Double,
    xaxis: PartialLayoutAxisAutomargin,
    xaxis2: PartialLayoutAxisAutomargin,
    xaxis3: PartialLayoutAxisAutomargin,
    xaxis4: PartialLayoutAxisAutomargin,
    xaxis5: PartialLayoutAxisAutomargin,
    xaxis6: PartialLayoutAxisAutomargin,
    xaxis7: PartialLayoutAxisAutomargin,
    xaxis8: PartialLayoutAxisAutomargin,
    xaxis9: PartialLayoutAxisAutomargin,
    xaxisDotautorange: Boolean,
    xaxisDotrange: js.Tuple2[Datum, Datum],
    xaxisDottitle: String,
    xaxisDottype: AxisType,
    yaxis: PartialLayoutAxisAutomargin,
    yaxis2: PartialLayoutAxisAutomargin,
    yaxis3: PartialLayoutAxisAutomargin,
    yaxis4: PartialLayoutAxisAutomargin,
    yaxis5: PartialLayoutAxisAutomargin,
    yaxis6: PartialLayoutAxisAutomargin,
    yaxis7: PartialLayoutAxisAutomargin,
    yaxis8: PartialLayoutAxisAutomargin,
    yaxis9: PartialLayoutAxisAutomargin,
    yaxisDotautorange: Boolean,
    yaxisDotrange: js.Tuple2[Datum, Datum],
    yaxisDottitle: String,
    yaxisDottype: AxisType,
    `xaxisDotrange[0]`: Datum = null,
    `xaxisDotrange[1]`: Datum = null,
    `yaxisDotrange[0]`: Datum = null,
    `yaxisDotrange[1]`: Datum = null
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    if (`xaxisDotrange[0]` != null) __obj.updateDynamic("xaxis.range[0]")(`xaxisDotrange[0]`.asInstanceOf[js.Any])
    if (`xaxisDotrange[1]` != null) __obj.updateDynamic("xaxis.range[1]")(`xaxisDotrange[1]`.asInstanceOf[js.Any])
    if (`yaxisDotrange[0]` != null) __obj.updateDynamic("yaxis.range[0]")(`yaxisDotrange[0]`.asInstanceOf[js.Any])
    if (`yaxisDotrange[1]` != null) __obj.updateDynamic("yaxis.range[1]")(`yaxisDotrange[1]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

