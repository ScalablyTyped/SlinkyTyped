package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.End
import typingsSlinky.plotlyJs.anon.PartialDataTitleFont
import typingsSlinky.plotlyJs.anon.PartialDelta
import typingsSlinky.plotlyJs.anon.PartialFont
import typingsSlinky.plotlyJs.anon.PartialGaugeBgcolor
import typingsSlinky.plotlyJs.anon.PartialHoverLabel
import typingsSlinky.plotlyJs.anon.PartialPlotMarkerCauto
import typingsSlinky.plotlyJs.anon.PartialPlotNumberFont
import typingsSlinky.plotlyJs.anon.PartialScatterLine
import typingsSlinky.plotlyJs.anon.PartialScatterMarkerLine
import typingsSlinky.plotlyJs.anon.Partialrowsnumbercolumnsn
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsStrings._empty
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`infer zero`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top right`
import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.area
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.avg
import typingsSlinky.plotlyJs.plotlyJsStrings.best
import typingsSlinky.plotlyJs.plotlyJsStrings.clockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.count
import typingsSlinky.plotlyJs.plotlyJsStrings.counterclockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.delta
import typingsSlinky.plotlyJs.plotlyJsStrings.diameter
import typingsSlinky.plotlyJs.plotlyJsStrings.fast
import typingsSlinky.plotlyJs.plotlyJsStrings.fills
import typingsSlinky.plotlyJs.plotlyJsStrings.fraction
import typingsSlinky.plotlyJs.plotlyJsStrings.gauge
import typingsSlinky.plotlyJs.plotlyJsStrings.gaugePlussigndelta
import typingsSlinky.plotlyJs.plotlyJsStrings.gaugePlussignnumber
import typingsSlinky.plotlyJs.plotlyJsStrings.gaugePlussignnumberPlussigndelta
import typingsSlinky.plotlyJs.plotlyJsStrings.h
import typingsSlinky.plotlyJs.plotlyJsStrings.hv
import typingsSlinky.plotlyJs.plotlyJsStrings.hvh
import typingsSlinky.plotlyJs.plotlyJsStrings.inside
import typingsSlinky.plotlyJs.plotlyJsStrings.interpolate
import typingsSlinky.plotlyJs.plotlyJsStrings.label
import typingsSlinky.plotlyJs.plotlyJsStrings.labelPlussignpercent
import typingsSlinky.plotlyJs.plotlyJsStrings.labelPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignpercent
import typingsSlinky.plotlyJs.plotlyJsStrings.labelPlussigntextPlussignvalue
import typingsSlinky.plotlyJs.plotlyJsStrings.labelPlussignvalue
import typingsSlinky.plotlyJs.plotlyJsStrings.labelPlussignvaluePlussignpercent
import typingsSlinky.plotlyJs.plotlyJsStrings.legendonly
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.lines
import typingsSlinky.plotlyJs.plotlyJsStrings.linesPlussignmarkers
import typingsSlinky.plotlyJs.plotlyJsStrings.markers
import typingsSlinky.plotlyJs.plotlyJsStrings.max
import typingsSlinky.plotlyJs.plotlyJsStrings.min
import typingsSlinky.plotlyJs.plotlyJsStrings.name
import typingsSlinky.plotlyJs.plotlyJsStrings.none
import typingsSlinky.plotlyJs.plotlyJsStrings.number
import typingsSlinky.plotlyJs.plotlyJsStrings.numberPlussigndelta
import typingsSlinky.plotlyJs.plotlyJsStrings.outliers
import typingsSlinky.plotlyJs.plotlyJsStrings.outside
import typingsSlinky.plotlyJs.plotlyJsStrings.percent
import typingsSlinky.plotlyJs.plotlyJsStrings.points
import typingsSlinky.plotlyJs.plotlyJsStrings.remainder
import typingsSlinky.plotlyJs.plotlyJsStrings.sd
import typingsSlinky.plotlyJs.plotlyJsStrings.skip
import typingsSlinky.plotlyJs.plotlyJsStrings.spline
import typingsSlinky.plotlyJs.plotlyJsStrings.sum
import typingsSlinky.plotlyJs.plotlyJsStrings.suspectedoutliers
import typingsSlinky.plotlyJs.plotlyJsStrings.text
import typingsSlinky.plotlyJs.plotlyJsStrings.textPlussignlines
import typingsSlinky.plotlyJs.plotlyJsStrings.textPlussignlinesPlussignmarkers
import typingsSlinky.plotlyJs.plotlyJsStrings.textPlussignmarkers
import typingsSlinky.plotlyJs.plotlyJsStrings.textPlussignpercent
import typingsSlinky.plotlyJs.plotlyJsStrings.textPlussignvalue
import typingsSlinky.plotlyJs.plotlyJsStrings.textPlussignvaluePlussignpercent
import typingsSlinky.plotlyJs.plotlyJsStrings.tonext
import typingsSlinky.plotlyJs.plotlyJsStrings.tonextx
import typingsSlinky.plotlyJs.plotlyJsStrings.tonexty
import typingsSlinky.plotlyJs.plotlyJsStrings.toself
import typingsSlinky.plotlyJs.plotlyJsStrings.total
import typingsSlinky.plotlyJs.plotlyJsStrings.tozerox
import typingsSlinky.plotlyJs.plotlyJsStrings.tozeroy
import typingsSlinky.plotlyJs.plotlyJsStrings.v
import typingsSlinky.plotlyJs.plotlyJsStrings.value
import typingsSlinky.plotlyJs.plotlyJsStrings.valuePlussignpercent
import typingsSlinky.plotlyJs.plotlyJsStrings.vh
import typingsSlinky.plotlyJs.plotlyJsStrings.vhv
import typingsSlinky.plotlyJs.plotlyJsStrings.x
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussigny
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussignyPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussignyPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussignyPlussignz
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussignyPlussignzPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.xPlussignyPlussignzPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.y
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignx
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignxPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignxPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignxPlussignz
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignxPlussignzPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignxPlussignzPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignz
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignzPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.yPlussignzPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.z
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignx
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussigny
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussignyPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussignyPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignyPlussignx
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignyPlussignxPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignyPlussignxPlussigntext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotData extends StObject {
  
  var autobinx: Boolean = js.native
  
  var boxmean: Boolean | sd = js.native
  
  var boxpoints: all | outliers | suspectedoutliers | `false` = js.native
  
  var branchvalues: total | remainder = js.native
  
  var colorscale: ColorScale = js.native
  
  var connectgaps: Boolean = js.native
  
  var customdata: js.Array[js.Array[Datum] | Datum] = js.native
  
  var delta: PartialDelta = js.native
  
  var direction: clockwise | counterclockwise = js.native
  
  var domain: Partialrowsnumbercolumnsn = js.native
  
  var error_x: ErrorBar = js.native
  
  var error_y: ErrorBar = js.native
  
  var fill: none | tozeroy | tozerox | tonexty | tonextx | toself | tonext = js.native
  
  var fillcolor: String = js.native
  
  var gauge: PartialGaugeBgcolor = js.native
  
  var groupnorm: _empty | fraction | percent = js.native
  
  var histfunc: count | sum | avg | min | max = js.native
  
  var hole: Double = js.native
  
  var hoverinfo: all | name | none | skip | text | x | xPlussigntext | xPlussignname | xPlussigny | xPlussignyPlussigntext | xPlussignyPlussignname | xPlussignyPlussignz | xPlussignyPlussignzPlussigntext | xPlussignyPlussignzPlussignname | y | yPlussignname | yPlussignx | yPlussigntext | yPlussignxPlussigntext | yPlussignxPlussignname | yPlussignz | yPlussignzPlussigntext | yPlussignzPlussignname | yPlussignxPlussignz | yPlussignxPlussignzPlussigntext | yPlussignxPlussignzPlussignname | z | zPlussignx | zPlussignxPlussigntext | zPlussignxPlussignname | zPlussignyPlussignx | zPlussignyPlussignxPlussigntext | zPlussignyPlussignxPlussignname | zPlussignxPlussigny | zPlussignxPlussignyPlussigntext | zPlussignxPlussignyPlussignname = js.native
  
  var hoverlabel: PartialHoverLabel = js.native
  
  var hoveron: points | fills = js.native
  
  var hovertemplate: String | js.Array[String] = js.native
  
  var hovertext: String | js.Array[String] = js.native
  
  var i: TypedArray = js.native
  
  var ids: js.Array[String] = js.native
  
  var j: TypedArray = js.native
  
  var jitter: Double = js.native
  
  var k: TypedArray = js.native
  
  var labels: js.Array[Datum] = js.native
  
  var lat: js.Array[Datum] = js.native
  
  var legendgroup: String = js.native
  
  var level: String = js.native
  
  var line: PartialScatterLine = js.native
  
  @JSName("line.color")
  var lineDotcolor: Color = js.native
  
  @JSName("line.dash")
  var lineDotdash: Dash = js.native
  
  @JSName("line.shape")
  var lineDotshape: linear | spline | hv | vh | hvh | vhv = js.native
  
  @JSName("line.simplify")
  var lineDotsimplify: Boolean = js.native
  
  @JSName("line.smoothing")
  var lineDotsmoothing: Double = js.native
  
  @JSName("line.width")
  var lineDotwidth: Double = js.native
  
  var lon: js.Array[Datum] = js.native
  
  var marker: PartialPlotMarkerCauto = js.native
  
  @JSName("marker.color")
  var markerDotcolor: Color = js.native
  
  @JSName("marker.colorscale")
  var markerDotcolorscale: ColorScale | js.Array[ColorScale] = js.native
  
  @JSName("marker.line")
  var markerDotline: PartialScatterMarkerLine = js.native
  
  @JSName("marker.line.color")
  var markerDotlineDotcolor: Color = js.native
  
  @JSName("marker.line.colorscale")
  var markerDotlineDotcolorscale: ColorScale | js.Array[ColorScale] = js.native
  
  @JSName("marker.maxdisplayed")
  var markerDotmaxdisplayed: Double = js.native
  
  @JSName("marker.opacity")
  var markerDotopacity: Double | js.Array[Double] = js.native
  
  @JSName("marker.pad.b")
  var markerDotpadDotb: Double = js.native
  
  @JSName("marker.pad.l")
  var markerDotpadDotl: Double = js.native
  
  @JSName("marker.pad.r")
  var markerDotpadDotr: Double = js.native
  
  // TODO
  @JSName("marker.pad.t")
  var markerDotpadDott: Double = js.native
  
  @JSName("marker.showscale")
  var markerDotshowscale: Boolean = js.native
  
  @JSName("marker.size")
  var markerDotsize: Double | (js.Array[js.Array[Double] | Double]) = js.native
  
  @JSName("marker.sizemax")
  var markerDotsizemax: Double = js.native
  
  @JSName("marker.sizemin")
  var markerDotsizemin: Double = js.native
  
  @JSName("marker.sizemode")
  var markerDotsizemode: diameter | area = js.native
  
  @JSName("marker.sizeref")
  var markerDotsizeref: Double = js.native
  
  @JSName("marker.symbol")
  var markerDotsymbol: MarkerSymbol | js.Array[MarkerSymbol] = js.native
  
  var mode: lines | markers | text | linesPlussignmarkers | textPlussignmarkers | textPlussignlines | textPlussignlinesPlussignmarkers | none | gauge | number | delta | numberPlussigndelta | gaugePlussignnumber | gaugePlussignnumberPlussigndelta | gaugePlussigndelta = js.native
  
  var name: String = js.native
  
  var number: PartialPlotNumberFont = js.native
  
  var opacity: Double = js.native
  
  var orientation: v | h = js.native
  
  var parents: js.Array[String] = js.native
  
  var pointpos: Double = js.native
  
  var r: js.Array[Datum] = js.native
  
  var rotation: Double = js.native
  
  var selectedpoints: js.Array[Datum] = js.native
  
  var showlegend: Boolean = js.native
  
  var showscale: Boolean = js.native
  
  var stackgaps: (`infer zero`) | interpolate = js.native
  
  var stackgroup: String = js.native
  
  var text: String | js.Array[String] = js.native
  
  var textfont: PartialFont = js.native
  
  var textinfo: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none = js.native
  
  var textposition: (`top left`) | (`top center`) | (`top right`) | (`middle left`) | (`middle center`) | (`middle right`) | (`bottom left`) | (`bottom center`) | (`bottom right`) | inside | outside | auto | none = js.native
  
  var theta: js.Array[Datum] = js.native
  
  var title: PartialDataTitleFont = js.native
  
  var transforms: js.Array[DataTransform] = js.native
  
  var transpose: Boolean = js.native
  
  var `type`: PlotType = js.native
  
  var value: Double = js.native
  
  var values: js.Array[Datum] = js.native
  
  var visible: Boolean | legendonly = js.native
  
  var width: Double | js.Array[Double] = js.native
  
  var x: (js.Array[js.Array[Datum] | Datum]) | TypedArray = js.native
  
  var xaxis: String = js.native
  
  var xbins: End = js.native
  
  var xgap: Double = js.native
  
  var xy: js.typedarray.Float32Array = js.native
  
  var y: (js.Array[js.Array[Datum] | Datum]) | TypedArray = js.native
  
  var yaxis: String = js.native
  
  var ygap: Double = js.native
  
  var z: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray = js.native
  
  var zsmooth: fast | best | `false` = js.native
}
object PlotData {
  
  @scala.inline
  def apply(
    autobinx: Boolean,
    boxmean: Boolean | sd,
    boxpoints: all | outliers | suspectedoutliers | `false`,
    branchvalues: total | remainder,
    colorscale: ColorScale,
    connectgaps: Boolean,
    customdata: js.Array[js.Array[Datum] | Datum],
    delta: PartialDelta,
    direction: clockwise | counterclockwise,
    domain: Partialrowsnumbercolumnsn,
    error_x: ErrorBar,
    error_y: ErrorBar,
    fill: none | tozeroy | tozerox | tonexty | tonextx | toself | tonext,
    fillcolor: String,
    gauge: PartialGaugeBgcolor,
    groupnorm: _empty | fraction | percent,
    histfunc: count | sum | avg | min | max,
    hole: Double,
    hoverinfo: all | name | none | skip | text | x | xPlussigntext | xPlussignname | xPlussigny | xPlussignyPlussigntext | xPlussignyPlussignname | xPlussignyPlussignz | xPlussignyPlussignzPlussigntext | xPlussignyPlussignzPlussignname | y | yPlussignname | yPlussignx | yPlussigntext | yPlussignxPlussigntext | yPlussignxPlussignname | yPlussignz | yPlussignzPlussigntext | yPlussignzPlussignname | yPlussignxPlussignz | yPlussignxPlussignzPlussigntext | yPlussignxPlussignzPlussignname | z | zPlussignx | zPlussignxPlussigntext | zPlussignxPlussignname | zPlussignyPlussignx | zPlussignyPlussignxPlussigntext | zPlussignyPlussignxPlussignname | zPlussignxPlussigny | zPlussignxPlussignyPlussigntext | zPlussignxPlussignyPlussignname,
    hoverlabel: PartialHoverLabel,
    hoveron: points | fills,
    hovertemplate: String | js.Array[String],
    hovertext: String | js.Array[String],
    i: TypedArray,
    ids: js.Array[String],
    j: TypedArray,
    jitter: Double,
    k: TypedArray,
    labels: js.Array[Datum],
    lat: js.Array[Datum],
    legendgroup: String,
    level: String,
    line: PartialScatterLine,
    lineDotcolor: Color,
    lineDotdash: Dash,
    lineDotshape: linear | spline | hv | vh | hvh | vhv,
    lineDotsimplify: Boolean,
    lineDotsmoothing: Double,
    lineDotwidth: Double,
    lon: js.Array[Datum],
    marker: PartialPlotMarkerCauto,
    markerDotcolor: Color,
    markerDotcolorscale: ColorScale | js.Array[ColorScale],
    markerDotline: PartialScatterMarkerLine,
    markerDotlineDotcolor: Color,
    markerDotlineDotcolorscale: ColorScale | js.Array[ColorScale],
    markerDotmaxdisplayed: Double,
    markerDotopacity: Double | js.Array[Double],
    markerDotpadDotb: Double,
    markerDotpadDotl: Double,
    markerDotpadDotr: Double,
    markerDotpadDott: Double,
    markerDotshowscale: Boolean,
    markerDotsize: Double | (js.Array[js.Array[Double] | Double]),
    markerDotsizemax: Double,
    markerDotsizemin: Double,
    markerDotsizemode: diameter | area,
    markerDotsizeref: Double,
    markerDotsymbol: MarkerSymbol | js.Array[MarkerSymbol],
    mode: lines | markers | text | linesPlussignmarkers | textPlussignmarkers | textPlussignlines | textPlussignlinesPlussignmarkers | none | gauge | number | delta | numberPlussigndelta | gaugePlussignnumber | gaugePlussignnumberPlussigndelta | gaugePlussigndelta,
    name: String,
    number: PartialPlotNumberFont,
    opacity: Double,
    orientation: v | h,
    parents: js.Array[String],
    pointpos: Double,
    r: js.Array[Datum],
    rotation: Double,
    selectedpoints: js.Array[Datum],
    showlegend: Boolean,
    showscale: Boolean,
    stackgaps: (`infer zero`) | interpolate,
    stackgroup: String,
    text: String | js.Array[String],
    textfont: PartialFont,
    textinfo: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none,
    textposition: (`top left`) | (`top center`) | (`top right`) | (`middle left`) | (`middle center`) | (`middle right`) | (`bottom left`) | (`bottom center`) | (`bottom right`) | inside | outside | auto | none,
    theta: js.Array[Datum],
    title: PartialDataTitleFont,
    transforms: js.Array[DataTransform],
    transpose: Boolean,
    `type`: PlotType,
    value: Double,
    values: js.Array[Datum],
    visible: Boolean | legendonly,
    width: Double | js.Array[Double],
    x: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
    xaxis: String,
    xbins: End,
    xgap: Double,
    xy: js.typedarray.Float32Array,
    y: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
    yaxis: String,
    ygap: Double,
    z: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    zsmooth: fast | best | `false`
  ): PlotData = {
    val __obj = js.Dynamic.literal(autobinx = autobinx.asInstanceOf[js.Any], boxmean = boxmean.asInstanceOf[js.Any], boxpoints = boxpoints.asInstanceOf[js.Any], branchvalues = branchvalues.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], connectgaps = connectgaps.asInstanceOf[js.Any], customdata = customdata.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], error_x = error_x.asInstanceOf[js.Any], error_y = error_y.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fillcolor = fillcolor.asInstanceOf[js.Any], gauge = gauge.asInstanceOf[js.Any], groupnorm = groupnorm.asInstanceOf[js.Any], histfunc = histfunc.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], hoverinfo = hoverinfo.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hoveron = hoveron.asInstanceOf[js.Any], hovertemplate = hovertemplate.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], legendgroup = legendgroup.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], pointpos = pointpos.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], selectedpoints = selectedpoints.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], showscale = showscale.asInstanceOf[js.Any], stackgaps = stackgaps.asInstanceOf[js.Any], stackgroup = stackgroup.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any], textinfo = textinfo.asInstanceOf[js.Any], textposition = textposition.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xbins = xbins.asInstanceOf[js.Any], xgap = xgap.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], ygap = ygap.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], zsmooth = zsmooth.asInstanceOf[js.Any])
    __obj.updateDynamic("line.color")(lineDotcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("line.dash")(lineDotdash.asInstanceOf[js.Any])
    __obj.updateDynamic("line.shape")(lineDotshape.asInstanceOf[js.Any])
    __obj.updateDynamic("line.simplify")(lineDotsimplify.asInstanceOf[js.Any])
    __obj.updateDynamic("line.smoothing")(lineDotsmoothing.asInstanceOf[js.Any])
    __obj.updateDynamic("line.width")(lineDotwidth.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.color")(markerDotcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.colorscale")(markerDotcolorscale.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.line")(markerDotline.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.line.color")(markerDotlineDotcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.line.colorscale")(markerDotlineDotcolorscale.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.maxdisplayed")(markerDotmaxdisplayed.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.opacity")(markerDotopacity.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.pad.b")(markerDotpadDotb.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.pad.l")(markerDotpadDotl.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.pad.r")(markerDotpadDotr.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.pad.t")(markerDotpadDott.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.showscale")(markerDotshowscale.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.size")(markerDotsize.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.sizemax")(markerDotsizemax.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.sizemin")(markerDotsizemin.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.sizemode")(markerDotsizemode.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.sizeref")(markerDotsizeref.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.symbol")(markerDotsymbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotData]
  }
  
  @scala.inline
  implicit class PlotDataMutableBuilder[Self <: PlotData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutobinx(value: Boolean): Self = StObject.set(x, "autobinx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxmean(value: Boolean | sd): Self = StObject.set(x, "boxmean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxpoints(value: all | outliers | suspectedoutliers | `false`): Self = StObject.set(x, "boxpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchvalues(value: total | remainder): Self = StObject.set(x, "branchvalues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value :_*))
    
    @scala.inline
    def setConnectgaps(value: Boolean): Self = StObject.set(x, "connectgaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdata(value: js.Array[js.Array[Datum] | Datum]): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdataVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "customdata", js.Array(value :_*))
    
    @scala.inline
    def setDelta(value: PartialDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: clockwise | counterclockwise): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: Partialrowsnumbercolumnsn): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_x(value: ErrorBar): Self = StObject.set(x, "error_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_y(value: ErrorBar): Self = StObject.set(x, "error_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: none | tozeroy | tozerox | tonexty | tonextx | toself | tonext): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillcolor(value: String): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGauge(value: PartialGaugeBgcolor): Self = StObject.set(x, "gauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupnorm(value: _empty | fraction | percent): Self = StObject.set(x, "groupnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistfunc(value: count | sum | avg | min | max): Self = StObject.set(x, "histfunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverinfo(
      value: all | name | none | skip | text | typingsSlinky.plotlyJs.plotlyJsStrings.x | xPlussigntext | xPlussignname | xPlussigny | xPlussignyPlussigntext | xPlussignyPlussignname | xPlussignyPlussignz | xPlussignyPlussignzPlussigntext | xPlussignyPlussignzPlussignname | y | yPlussignname | yPlussignx | yPlussigntext | yPlussignxPlussigntext | yPlussignxPlussignname | yPlussignz | yPlussignzPlussigntext | yPlussignzPlussignname | yPlussignxPlussignz | yPlussignxPlussignzPlussigntext | yPlussignxPlussignzPlussignname | z | zPlussignx | zPlussignxPlussigntext | zPlussignxPlussignname | zPlussignyPlussignx | zPlussignyPlussignxPlussigntext | zPlussignyPlussignxPlussignname | zPlussignxPlussigny | zPlussignxPlussignyPlussigntext | zPlussignxPlussignyPlussignname
    ): Self = StObject.set(x, "hoverinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverlabel(value: PartialHoverLabel): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveron(value: points | fills): Self = StObject.set(x, "hoveron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertemplate(value: String | js.Array[String]): Self = StObject.set(x, "hovertemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertemplateVarargs(value: String*): Self = StObject.set(x, "hovertemplate", js.Array(value :_*))
    
    @scala.inline
    def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value :_*))
    
    @scala.inline
    def setI(value: TypedArray): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setJ(value: TypedArray): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK(value: TypedArray): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[Datum]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: Datum*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLat(value: js.Array[Datum]): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatVarargs(value: Datum*): Self = StObject.set(x, "lat", js.Array(value :_*))
    
    @scala.inline
    def setLegendgroup(value: String): Self = StObject.set(x, "legendgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: PartialScatterLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotcolor(value: Color): Self = StObject.set(x, "line.color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "line.color", js.Array(value :_*))
    
    @scala.inline
    def setLineDotdash(value: Dash): Self = StObject.set(x, "line.dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotshape(value: linear | spline | hv | vh | hvh | vhv): Self = StObject.set(x, "line.shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotsimplify(value: Boolean): Self = StObject.set(x, "line.simplify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotsmoothing(value: Double): Self = StObject.set(x, "line.smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotwidth(value: Double): Self = StObject.set(x, "line.width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLon(value: js.Array[Datum]): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLonVarargs(value: Datum*): Self = StObject.set(x, "lon", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: PartialPlotMarkerCauto): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotcolor(value: Color): Self = StObject.set(x, "marker.color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "marker.color", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotcolorscale(value: ColorScale | js.Array[ColorScale]): Self = StObject.set(x, "marker.colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotcolorscaleVarargs(value: (ColorScale | String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "marker.colorscale", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotline(value: PartialScatterMarkerLine): Self = StObject.set(x, "marker.line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotlineDotcolor(value: Color): Self = StObject.set(x, "marker.line.color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotlineDotcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "marker.line.color", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotlineDotcolorscale(value: ColorScale | js.Array[ColorScale]): Self = StObject.set(x, "marker.line.colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotlineDotcolorscaleVarargs(value: (ColorScale | String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "marker.line.colorscale", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotmaxdisplayed(value: Double): Self = StObject.set(x, "marker.maxdisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotopacity(value: Double | js.Array[Double]): Self = StObject.set(x, "marker.opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotopacityVarargs(value: Double*): Self = StObject.set(x, "marker.opacity", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotpadDotb(value: Double): Self = StObject.set(x, "marker.pad.b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotpadDotl(value: Double): Self = StObject.set(x, "marker.pad.l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotpadDotr(value: Double): Self = StObject.set(x, "marker.pad.r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotpadDott(value: Double): Self = StObject.set(x, "marker.pad.t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotshowscale(value: Boolean): Self = StObject.set(x, "marker.showscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsize(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "marker.size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizeVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "marker.size", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotsizemax(value: Double): Self = StObject.set(x, "marker.sizemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizemin(value: Double): Self = StObject.set(x, "marker.sizemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizemode(value: diameter | area): Self = StObject.set(x, "marker.sizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizeref(value: Double): Self = StObject.set(x, "marker.sizeref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsymbol(value: MarkerSymbol | js.Array[MarkerSymbol]): Self = StObject.set(x, "marker.symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsymbolVarargs(value: (Double | MarkerSymbol | String)*): Self = StObject.set(x, "marker.symbol", js.Array(value :_*))
    
    @scala.inline
    def setMode(
      value: lines | markers | text | linesPlussignmarkers | textPlussignmarkers | textPlussignlines | textPlussignlinesPlussignmarkers | none | gauge | number | delta | numberPlussigndelta | gaugePlussignnumber | gaugePlussignnumberPlussigndelta | gaugePlussigndelta
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: PartialPlotNumberFont): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setPointpos(value: Double): Self = StObject.set(x, "pointpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: js.Array[Datum]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRVarargs(value: Datum*): Self = StObject.set(x, "r", js.Array(value :_*))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedpoints(value: js.Array[Datum]): Self = StObject.set(x, "selectedpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedpointsVarargs(value: Datum*): Self = StObject.set(x, "selectedpoints", js.Array(value :_*))
    
    @scala.inline
    def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowscale(value: Boolean): Self = StObject.set(x, "showscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackgaps(value: (`infer zero`) | interpolate): Self = StObject.set(x, "stackgaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackgroup(value: String): Self = StObject.set(x, "stackgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setTextfont(value: PartialFont): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextinfo(
      value: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
    ): Self = StObject.set(x, "textinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextposition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle left`) | (`middle center`) | (`middle right`) | (`bottom left`) | (`bottom center`) | (`bottom right`) | inside | outside | auto | none
    ): Self = StObject.set(x, "textposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta(value: js.Array[Datum]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaVarargs(value: Datum*): Self = StObject.set(x, "theta", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: PartialDataTitleFont): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransforms(value: js.Array[DataTransform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsVarargs(value: DataTransform*): Self = StObject.set(x, "transforms", js.Array(value :_*))
    
    @scala.inline
    def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PlotType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[Datum]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Datum*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean | legendonly): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value :_*))
    
    @scala.inline
    def setX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setXaxis(value: String): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXbins(value: End): Self = StObject.set(x, "xbins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXgap(value: Double): Self = StObject.set(x, "xgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXy(value: js.typedarray.Float32Array): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "y", js.Array(value :_*))
    
    @scala.inline
    def setYaxis(value: String): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYgap(value: Double): Self = StObject.set(x, "ygap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "z", js.Array(value :_*))
    
    @scala.inline
    def setZsmooth(value: fast | best | `false`): Self = StObject.set(x, "zsmooth", value.asInstanceOf[js.Any])
  }
}
