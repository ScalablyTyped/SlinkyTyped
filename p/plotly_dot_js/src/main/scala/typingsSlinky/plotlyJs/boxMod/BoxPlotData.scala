package typingsSlinky.plotlyJs.boxMod

import typingsSlinky.plotlyJs.anon.End
import typingsSlinky.plotlyJs.anon.PartialDataTitleFont
import typingsSlinky.plotlyJs.anon.PartialDelta
import typingsSlinky.plotlyJs.anon.PartialFont
import typingsSlinky.plotlyJs.anon.PartialGaugeBgcolor
import typingsSlinky.plotlyJs.anon.PartialHoverLabel
import typingsSlinky.plotlyJs.anon.PartialPlotNumberFont
import typingsSlinky.plotlyJs.anon.PartialScatterLine
import typingsSlinky.plotlyJs.anon.PartialScatterMarkerLine
import typingsSlinky.plotlyJs.anon.PartialoutliercolorColors
import typingsSlinky.plotlyJs.anon.Partialrowsnumbercolumnsn
import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.mod.ColorScale
import typingsSlinky.plotlyJs.mod.Dash
import typingsSlinky.plotlyJs.mod.DataTransform
import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.ErrorBar
import typingsSlinky.plotlyJs.mod.MarkerSymbol
import typingsSlinky.plotlyJs.mod.PlotData
import typingsSlinky.plotlyJs.mod.TypedArray
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
import typingsSlinky.plotlyJs.plotlyJsStrings.box
import typingsSlinky.plotlyJs.plotlyJsStrings.clockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.count
import typingsSlinky.plotlyJs.plotlyJsStrings.counterclockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.delta
import typingsSlinky.plotlyJs.plotlyJsStrings.diameter
import typingsSlinky.plotlyJs.plotlyJsStrings.exclusive
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
import typingsSlinky.plotlyJs.plotlyJsStrings.inclusive
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
import typingsSlinky.plotlyJs.scatterMod.ScatterSelectedMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxPlotData extends PlotData {
  
  var alignmentgroup: String = js.native
  
  @JSName("marker")
  var marker_BoxPlotData: PartialoutliercolorColors = js.native
  
  var offsetgroup: String = js.native
  
  var quartilemethod: linear | exclusive | inclusive = js.native
  
  var selected: ScatterSelectedMarker = js.native
  
  @JSName("type")
  var type_BoxPlotData: box = js.native
  
  var unselected: ScatterSelectedMarker = js.native
  
  @JSName("width")
  var width_BoxPlotData: Double = js.native
  
  var x0: js.Any = js.native
  
  var y0: js.Any = js.native
}
object BoxPlotData {
  
  @scala.inline
  def apply(
    alignmentgroup: String,
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
    marker: PartialoutliercolorColors,
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
    offsetgroup: String,
    opacity: Double,
    orientation: v | h,
    parents: js.Array[String],
    pointpos: Double,
    quartilemethod: linear | exclusive | inclusive,
    r: js.Array[Datum],
    rotation: Double,
    selected: ScatterSelectedMarker,
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
    `type`: box,
    unselected: ScatterSelectedMarker,
    value: Double,
    values: js.Array[Datum],
    visible: Boolean | legendonly,
    width: Double,
    x: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
    x0: js.Any,
    xaxis: String,
    xbins: End,
    xgap: Double,
    xy: js.typedarray.Float32Array,
    y: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
    y0: js.Any,
    yaxis: String,
    ygap: Double,
    z: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    zsmooth: fast | best | `false`
  ): BoxPlotData = {
    val __obj = js.Dynamic.literal(alignmentgroup = alignmentgroup.asInstanceOf[js.Any], autobinx = autobinx.asInstanceOf[js.Any], boxmean = boxmean.asInstanceOf[js.Any], boxpoints = boxpoints.asInstanceOf[js.Any], branchvalues = branchvalues.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], connectgaps = connectgaps.asInstanceOf[js.Any], customdata = customdata.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], error_x = error_x.asInstanceOf[js.Any], error_y = error_y.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fillcolor = fillcolor.asInstanceOf[js.Any], gauge = gauge.asInstanceOf[js.Any], groupnorm = groupnorm.asInstanceOf[js.Any], histfunc = histfunc.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], hoverinfo = hoverinfo.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hoveron = hoveron.asInstanceOf[js.Any], hovertemplate = hovertemplate.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], legendgroup = legendgroup.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], offsetgroup = offsetgroup.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], pointpos = pointpos.asInstanceOf[js.Any], quartilemethod = quartilemethod.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedpoints = selectedpoints.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], showscale = showscale.asInstanceOf[js.Any], stackgaps = stackgaps.asInstanceOf[js.Any], stackgroup = stackgroup.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any], textinfo = textinfo.asInstanceOf[js.Any], textposition = textposition.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], unselected = unselected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xbins = xbins.asInstanceOf[js.Any], xgap = xgap.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], ygap = ygap.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], zsmooth = zsmooth.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[BoxPlotData]
  }
  
  @scala.inline
  implicit class BoxPlotDataOps[Self <: BoxPlotData] (val x: Self) extends AnyVal {
    
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
    def setAlignmentgroup(value: String): Self = this.set("alignmentgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: PartialoutliercolorColors): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetgroup(value: String): Self = this.set("offsetgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartilemethod(value: linear | exclusive | inclusive): Self = this.set("quartilemethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: ScatterSelectedMarker): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: box): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselected(value: ScatterSelectedMarker): Self = this.set("unselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(value: js.Any): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: js.Any): Self = this.set("y0", value.asInstanceOf[js.Any])
  }
}
