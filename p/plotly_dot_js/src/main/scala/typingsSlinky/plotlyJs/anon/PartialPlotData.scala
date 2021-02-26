package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.ColorScale
import typingsSlinky.plotlyJs.mod.Dash
import typingsSlinky.plotlyJs.mod.DataTransform
import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.ErrorBar
import typingsSlinky.plotlyJs.mod.MarkerSymbol
import typingsSlinky.plotlyJs.mod.PlotType
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

/* Inlined std.Partial<plotly.js.plotly.js.PlotData> */
@js.native
trait PartialPlotData extends StObject {
  
  var autobinx: js.UndefOr[Boolean] = js.native
  
  var boxmean: js.UndefOr[Boolean | sd] = js.native
  
  var boxpoints: js.UndefOr[all | outliers | suspectedoutliers | `false`] = js.native
  
  var branchvalues: js.UndefOr[total | remainder] = js.native
  
  var colorscale: js.UndefOr[ColorScale] = js.native
  
  var connectgaps: js.UndefOr[Boolean] = js.native
  
  var customdata: js.UndefOr[js.Array[js.Array[Datum] | Datum]] = js.native
  
  var delta: js.UndefOr[PartialDelta] = js.native
  
  var direction: js.UndefOr[clockwise | counterclockwise] = js.native
  
  var domain: js.UndefOr[Partialrowsnumbercolumnsn] = js.native
  
  var error_x: js.UndefOr[ErrorBar] = js.native
  
  var error_y: js.UndefOr[ErrorBar] = js.native
  
  var fill: js.UndefOr[none | tozeroy | tozerox | tonexty | tonextx | toself | tonext] = js.native
  
  var fillcolor: js.UndefOr[String] = js.native
  
  var gauge: js.UndefOr[PartialGauge] = js.native
  
  var groupnorm: js.UndefOr[_empty | fraction | percent] = js.native
  
  var histfunc: js.UndefOr[count | sum | avg | min | max] = js.native
  
  var hole: js.UndefOr[Double] = js.native
  
  var hoverinfo: js.UndefOr[
    all | name | none | skip | text | x | xPlussigntext | xPlussignname | xPlussigny | xPlussignyPlussigntext | xPlussignyPlussignname | xPlussignyPlussignz | xPlussignyPlussignzPlussigntext | xPlussignyPlussignzPlussignname | y | yPlussignname | yPlussignx | yPlussigntext | yPlussignxPlussigntext | yPlussignxPlussignname | yPlussignz | yPlussignzPlussigntext | yPlussignzPlussignname | yPlussignxPlussignz | yPlussignxPlussignzPlussigntext | yPlussignxPlussignzPlussignname | z | zPlussignx | zPlussignxPlussigntext | zPlussignxPlussignname | zPlussignyPlussignx | zPlussignyPlussignxPlussigntext | zPlussignyPlussignxPlussignname | zPlussignxPlussigny | zPlussignxPlussignyPlussigntext | zPlussignxPlussignyPlussignname
  ] = js.native
  
  var hoverlabel: js.UndefOr[PartialHoverLabelAlign] = js.native
  
  var hoveron: js.UndefOr[points | fills] = js.native
  
  var hovertemplate: js.UndefOr[String | js.Array[String]] = js.native
  
  var hovertext: js.UndefOr[String | js.Array[String]] = js.native
  
  var i: js.UndefOr[TypedArray] = js.native
  
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  var j: js.UndefOr[TypedArray] = js.native
  
  var jitter: js.UndefOr[Double] = js.native
  
  var k: js.UndefOr[TypedArray] = js.native
  
  var labels: js.UndefOr[js.Array[Datum]] = js.native
  
  var lat: js.UndefOr[js.Array[Datum]] = js.native
  
  var legendgroup: js.UndefOr[String] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[PartialScatterLine] = js.native
  
  @JSName("line.color")
  var lineDotcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  @JSName("line.dash")
  var lineDotdash: js.UndefOr[Dash] = js.native
  
  @JSName("line.shape")
  var lineDotshape: js.UndefOr[linear | spline | hv | vh | hvh | vhv] = js.native
  
  @JSName("line.simplify")
  var lineDotsimplify: js.UndefOr[Boolean] = js.native
  
  @JSName("line.smoothing")
  var lineDotsmoothing: js.UndefOr[Double] = js.native
  
  @JSName("line.width")
  var lineDotwidth: js.UndefOr[Double] = js.native
  
  var lon: js.UndefOr[js.Array[Datum]] = js.native
  
  var marker: js.UndefOr[PartialPlotMarker] = js.native
  
  @JSName("marker.color")
  var markerDotcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  @JSName("marker.colorbar")
  var markerDotcolorbar: js.UndefOr[js.Object] = js.native
  
  @JSName("marker.colorscale")
  var markerDotcolorscale: js.UndefOr[ColorScale | js.Array[ColorScale]] = js.native
  
  @JSName("marker.line")
  var markerDotline: js.UndefOr[PartialScatterMarkerLine] = js.native
  
  @JSName("marker.line.color")
  var markerDotlineDotcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  @JSName("marker.line.colorscale")
  var markerDotlineDotcolorscale: js.UndefOr[ColorScale | js.Array[ColorScale]] = js.native
  
  @JSName("marker.maxdisplayed")
  var markerDotmaxdisplayed: js.UndefOr[Double] = js.native
  
  @JSName("marker.opacity")
  var markerDotopacity: js.UndefOr[Double | js.Array[Double]] = js.native
  
  @JSName("marker.pad.b")
  var markerDotpadDotb: js.UndefOr[Double] = js.native
  
  @JSName("marker.pad.l")
  var markerDotpadDotl: js.UndefOr[Double] = js.native
  
  @JSName("marker.pad.r")
  var markerDotpadDotr: js.UndefOr[Double] = js.native
  
  @JSName("marker.pad.t")
  var markerDotpadDott: js.UndefOr[Double] = js.native
  
  @JSName("marker.showscale")
  var markerDotshowscale: js.UndefOr[Boolean] = js.native
  
  @JSName("marker.size")
  var markerDotsize: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.native
  
  @JSName("marker.sizemax")
  var markerDotsizemax: js.UndefOr[Double] = js.native
  
  @JSName("marker.sizemin")
  var markerDotsizemin: js.UndefOr[Double] = js.native
  
  @JSName("marker.sizemode")
  var markerDotsizemode: js.UndefOr[diameter | area] = js.native
  
  @JSName("marker.sizeref")
  var markerDotsizeref: js.UndefOr[Double] = js.native
  
  @JSName("marker.symbol")
  var markerDotsymbol: js.UndefOr[MarkerSymbol | js.Array[MarkerSymbol]] = js.native
  
  var mode: js.UndefOr[
    lines | markers | text | linesPlussignmarkers | textPlussignmarkers | textPlussignlines | textPlussignlinesPlussignmarkers | none | gauge | number | delta | numberPlussigndelta | gaugePlussignnumber | gaugePlussignnumberPlussigndelta | gaugePlussigndelta
  ] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[PartialPlotNumber] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[v | h] = js.native
  
  var parents: js.UndefOr[js.Array[String]] = js.native
  
  var pointpos: js.UndefOr[Double] = js.native
  
  var r: js.UndefOr[js.Array[Datum]] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var selectedpoints: js.UndefOr[js.Array[Datum]] = js.native
  
  var showlegend: js.UndefOr[Boolean] = js.native
  
  var showscale: js.UndefOr[Boolean] = js.native
  
  var stackgaps: js.UndefOr[(`infer zero`) | interpolate] = js.native
  
  var stackgroup: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String | js.Array[String]] = js.native
  
  var textfont: js.UndefOr[PartialFont] = js.native
  
  var textinfo: js.UndefOr[
    label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
  ] = js.native
  
  var textposition: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle left`) | (`middle center`) | (`middle right`) | (`bottom left`) | (`bottom center`) | (`bottom right`) | inside | outside | auto | none
  ] = js.native
  
  var theta: js.UndefOr[js.Array[Datum]] = js.native
  
  var title: js.UndefOr[PartialDataTitle] = js.native
  
  var transforms: js.UndefOr[js.Array[DataTransform]] = js.native
  
  var transpose: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[PlotType] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var values: js.UndefOr[js.Array[Datum]] = js.native
  
  var visible: js.UndefOr[Boolean | legendonly] = js.native
  
  var width: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var x: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.native
  
  var xaxis: js.UndefOr[String] = js.native
  
  var xbins: js.UndefOr[End] = js.native
  
  var xgap: js.UndefOr[Double] = js.native
  
  var xy: js.UndefOr[js.typedarray.Float32Array] = js.native
  
  var y: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.native
  
  var yaxis: js.UndefOr[String] = js.native
  
  var ygap: js.UndefOr[Double] = js.native
  
  var z: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.native
  
  var zsmooth: js.UndefOr[fast | best | `false`] = js.native
}
object PartialPlotData {
  
  @scala.inline
  def apply(): PartialPlotData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlotData]
  }
  
  @scala.inline
  implicit class PartialPlotDataMutableBuilder[Self <: PartialPlotData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutobinx(value: Boolean): Self = StObject.set(x, "autobinx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutobinxUndefined: Self = StObject.set(x, "autobinx", js.undefined)
    
    @scala.inline
    def setBoxmean(value: Boolean | sd): Self = StObject.set(x, "boxmean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxmeanUndefined: Self = StObject.set(x, "boxmean", js.undefined)
    
    @scala.inline
    def setBoxpoints(value: all | outliers | suspectedoutliers | `false`): Self = StObject.set(x, "boxpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxpointsUndefined: Self = StObject.set(x, "boxpoints", js.undefined)
    
    @scala.inline
    def setBranchvalues(value: total | remainder): Self = StObject.set(x, "branchvalues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchvaluesUndefined: Self = StObject.set(x, "branchvalues", js.undefined)
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorscaleUndefined: Self = StObject.set(x, "colorscale", js.undefined)
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value :_*))
    
    @scala.inline
    def setConnectgaps(value: Boolean): Self = StObject.set(x, "connectgaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectgapsUndefined: Self = StObject.set(x, "connectgaps", js.undefined)
    
    @scala.inline
    def setCustomdata(value: js.Array[js.Array[Datum] | Datum]): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdataUndefined: Self = StObject.set(x, "customdata", js.undefined)
    
    @scala.inline
    def setCustomdataVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "customdata", js.Array(value :_*))
    
    @scala.inline
    def setDelta(value: PartialDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setDirection(value: clockwise | counterclockwise): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDomain(value: Partialrowsnumbercolumnsn): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setError_x(value: ErrorBar): Self = StObject.set(x, "error_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_xUndefined: Self = StObject.set(x, "error_x", js.undefined)
    
    @scala.inline
    def setError_y(value: ErrorBar): Self = StObject.set(x, "error_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_yUndefined: Self = StObject.set(x, "error_y", js.undefined)
    
    @scala.inline
    def setFill(value: none | tozeroy | tozerox | tonexty | tonextx | toself | tonext): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFillcolor(value: String): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillcolorUndefined: Self = StObject.set(x, "fillcolor", js.undefined)
    
    @scala.inline
    def setGauge(value: PartialGauge): Self = StObject.set(x, "gauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaugeUndefined: Self = StObject.set(x, "gauge", js.undefined)
    
    @scala.inline
    def setGroupnorm(value: _empty | fraction | percent): Self = StObject.set(x, "groupnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupnormUndefined: Self = StObject.set(x, "groupnorm", js.undefined)
    
    @scala.inline
    def setHistfunc(value: count | sum | avg | min | max): Self = StObject.set(x, "histfunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistfuncUndefined: Self = StObject.set(x, "histfunc", js.undefined)
    
    @scala.inline
    def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoleUndefined: Self = StObject.set(x, "hole", js.undefined)
    
    @scala.inline
    def setHoverinfo(
      value: all | name | none | skip | text | typingsSlinky.plotlyJs.plotlyJsStrings.x | xPlussigntext | xPlussignname | xPlussigny | xPlussignyPlussigntext | xPlussignyPlussignname | xPlussignyPlussignz | xPlussignyPlussignzPlussigntext | xPlussignyPlussignzPlussignname | y | yPlussignname | yPlussignx | yPlussigntext | yPlussignxPlussigntext | yPlussignxPlussignname | yPlussignz | yPlussignzPlussigntext | yPlussignzPlussignname | yPlussignxPlussignz | yPlussignxPlussignzPlussigntext | yPlussignxPlussignzPlussignname | z | zPlussignx | zPlussignxPlussigntext | zPlussignxPlussignname | zPlussignyPlussignx | zPlussignyPlussignxPlussigntext | zPlussignyPlussignxPlussignname | zPlussignxPlussigny | zPlussignxPlussignyPlussigntext | zPlussignxPlussignyPlussignname
    ): Self = StObject.set(x, "hoverinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverinfoUndefined: Self = StObject.set(x, "hoverinfo", js.undefined)
    
    @scala.inline
    def setHoverlabel(value: PartialHoverLabelAlign): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverlabelUndefined: Self = StObject.set(x, "hoverlabel", js.undefined)
    
    @scala.inline
    def setHoveron(value: points | fills): Self = StObject.set(x, "hoveron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveronUndefined: Self = StObject.set(x, "hoveron", js.undefined)
    
    @scala.inline
    def setHovertemplate(value: String | js.Array[String]): Self = StObject.set(x, "hovertemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertemplateUndefined: Self = StObject.set(x, "hovertemplate", js.undefined)
    
    @scala.inline
    def setHovertemplateVarargs(value: String*): Self = StObject.set(x, "hovertemplate", js.Array(value :_*))
    
    @scala.inline
    def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertextUndefined: Self = StObject.set(x, "hovertext", js.undefined)
    
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
    def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
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
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
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
    def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[Datum]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: Datum*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLat(value: js.Array[Datum]): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    @scala.inline
    def setLatVarargs(value: Datum*): Self = StObject.set(x, "lat", js.Array(value :_*))
    
    @scala.inline
    def setLegendgroup(value: String): Self = StObject.set(x, "legendgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendgroupUndefined: Self = StObject.set(x, "legendgroup", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLine(value: PartialScatterLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "line.color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotcolorUndefined: Self = StObject.set(x, "line.color", js.undefined)
    
    @scala.inline
    def setLineDotcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "line.color", js.Array(value :_*))
    
    @scala.inline
    def setLineDotdash(value: Dash): Self = StObject.set(x, "line.dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotdashUndefined: Self = StObject.set(x, "line.dash", js.undefined)
    
    @scala.inline
    def setLineDotshape(value: linear | spline | hv | vh | hvh | vhv): Self = StObject.set(x, "line.shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotshapeUndefined: Self = StObject.set(x, "line.shape", js.undefined)
    
    @scala.inline
    def setLineDotsimplify(value: Boolean): Self = StObject.set(x, "line.simplify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotsimplifyUndefined: Self = StObject.set(x, "line.simplify", js.undefined)
    
    @scala.inline
    def setLineDotsmoothing(value: Double): Self = StObject.set(x, "line.smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotsmoothingUndefined: Self = StObject.set(x, "line.smoothing", js.undefined)
    
    @scala.inline
    def setLineDotwidth(value: Double): Self = StObject.set(x, "line.width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDotwidthUndefined: Self = StObject.set(x, "line.width", js.undefined)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLon(value: js.Array[Datum]): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLonUndefined: Self = StObject.set(x, "lon", js.undefined)
    
    @scala.inline
    def setLonVarargs(value: Datum*): Self = StObject.set(x, "lon", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: PartialPlotMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "marker.color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotcolorUndefined: Self = StObject.set(x, "marker.color", js.undefined)
    
    @scala.inline
    def setMarkerDotcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "marker.color", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotcolorbar(value: js.Object): Self = StObject.set(x, "marker.colorbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotcolorbarUndefined: Self = StObject.set(x, "marker.colorbar", js.undefined)
    
    @scala.inline
    def setMarkerDotcolorscale(value: ColorScale | js.Array[ColorScale]): Self = StObject.set(x, "marker.colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotcolorscaleUndefined: Self = StObject.set(x, "marker.colorscale", js.undefined)
    
    @scala.inline
    def setMarkerDotcolorscaleVarargs(value: (ColorScale | String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "marker.colorscale", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotline(value: PartialScatterMarkerLine): Self = StObject.set(x, "marker.line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotlineDotcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "marker.line.color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotlineDotcolorUndefined: Self = StObject.set(x, "marker.line.color", js.undefined)
    
    @scala.inline
    def setMarkerDotlineDotcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "marker.line.color", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotlineDotcolorscale(value: ColorScale | js.Array[ColorScale]): Self = StObject.set(x, "marker.line.colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotlineDotcolorscaleUndefined: Self = StObject.set(x, "marker.line.colorscale", js.undefined)
    
    @scala.inline
    def setMarkerDotlineDotcolorscaleVarargs(value: (ColorScale | String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "marker.line.colorscale", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotlineUndefined: Self = StObject.set(x, "marker.line", js.undefined)
    
    @scala.inline
    def setMarkerDotmaxdisplayed(value: Double): Self = StObject.set(x, "marker.maxdisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotmaxdisplayedUndefined: Self = StObject.set(x, "marker.maxdisplayed", js.undefined)
    
    @scala.inline
    def setMarkerDotopacity(value: Double | js.Array[Double]): Self = StObject.set(x, "marker.opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotopacityUndefined: Self = StObject.set(x, "marker.opacity", js.undefined)
    
    @scala.inline
    def setMarkerDotopacityVarargs(value: Double*): Self = StObject.set(x, "marker.opacity", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotpadDotb(value: Double): Self = StObject.set(x, "marker.pad.b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotpadDotbUndefined: Self = StObject.set(x, "marker.pad.b", js.undefined)
    
    @scala.inline
    def setMarkerDotpadDotl(value: Double): Self = StObject.set(x, "marker.pad.l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotpadDotlUndefined: Self = StObject.set(x, "marker.pad.l", js.undefined)
    
    @scala.inline
    def setMarkerDotpadDotr(value: Double): Self = StObject.set(x, "marker.pad.r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotpadDotrUndefined: Self = StObject.set(x, "marker.pad.r", js.undefined)
    
    @scala.inline
    def setMarkerDotpadDott(value: Double): Self = StObject.set(x, "marker.pad.t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotpadDottUndefined: Self = StObject.set(x, "marker.pad.t", js.undefined)
    
    @scala.inline
    def setMarkerDotshowscale(value: Boolean): Self = StObject.set(x, "marker.showscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotshowscaleUndefined: Self = StObject.set(x, "marker.showscale", js.undefined)
    
    @scala.inline
    def setMarkerDotsize(value: Double | (js.Array[js.Array[Double] | Double])): Self = StObject.set(x, "marker.size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizeUndefined: Self = StObject.set(x, "marker.size", js.undefined)
    
    @scala.inline
    def setMarkerDotsizeVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "marker.size", js.Array(value :_*))
    
    @scala.inline
    def setMarkerDotsizemax(value: Double): Self = StObject.set(x, "marker.sizemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizemaxUndefined: Self = StObject.set(x, "marker.sizemax", js.undefined)
    
    @scala.inline
    def setMarkerDotsizemin(value: Double): Self = StObject.set(x, "marker.sizemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizeminUndefined: Self = StObject.set(x, "marker.sizemin", js.undefined)
    
    @scala.inline
    def setMarkerDotsizemode(value: diameter | area): Self = StObject.set(x, "marker.sizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizemodeUndefined: Self = StObject.set(x, "marker.sizemode", js.undefined)
    
    @scala.inline
    def setMarkerDotsizeref(value: Double): Self = StObject.set(x, "marker.sizeref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsizerefUndefined: Self = StObject.set(x, "marker.sizeref", js.undefined)
    
    @scala.inline
    def setMarkerDotsymbol(value: MarkerSymbol | js.Array[MarkerSymbol]): Self = StObject.set(x, "marker.symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDotsymbolUndefined: Self = StObject.set(x, "marker.symbol", js.undefined)
    
    @scala.inline
    def setMarkerDotsymbolVarargs(value: (Double | MarkerSymbol | String)*): Self = StObject.set(x, "marker.symbol", js.Array(value :_*))
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMode(
      value: lines | markers | text | linesPlussignmarkers | textPlussignmarkers | textPlussignlines | textPlussignlinesPlussignmarkers | none | gauge | number | delta | numberPlussigndelta | gaugePlussignnumber | gaugePlussignnumberPlussigndelta | gaugePlussigndelta
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: PartialPlotNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setPointpos(value: Double): Self = StObject.set(x, "pointpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointposUndefined: Self = StObject.set(x, "pointpos", js.undefined)
    
    @scala.inline
    def setR(value: js.Array[Datum]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRVarargs(value: Datum*): Self = StObject.set(x, "r", js.Array(value :_*))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSelectedpoints(value: js.Array[Datum]): Self = StObject.set(x, "selectedpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedpointsUndefined: Self = StObject.set(x, "selectedpoints", js.undefined)
    
    @scala.inline
    def setSelectedpointsVarargs(value: Datum*): Self = StObject.set(x, "selectedpoints", js.Array(value :_*))
    
    @scala.inline
    def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowlegendUndefined: Self = StObject.set(x, "showlegend", js.undefined)
    
    @scala.inline
    def setShowscale(value: Boolean): Self = StObject.set(x, "showscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowscaleUndefined: Self = StObject.set(x, "showscale", js.undefined)
    
    @scala.inline
    def setStackgaps(value: (`infer zero`) | interpolate): Self = StObject.set(x, "stackgaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackgapsUndefined: Self = StObject.set(x, "stackgaps", js.undefined)
    
    @scala.inline
    def setStackgroup(value: String): Self = StObject.set(x, "stackgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackgroupUndefined: Self = StObject.set(x, "stackgroup", js.undefined)
    
    @scala.inline
    def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setTextfont(value: PartialFont): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextfontUndefined: Self = StObject.set(x, "textfont", js.undefined)
    
    @scala.inline
    def setTextinfo(
      value: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
    ): Self = StObject.set(x, "textinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextinfoUndefined: Self = StObject.set(x, "textinfo", js.undefined)
    
    @scala.inline
    def setTextposition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle left`) | (`middle center`) | (`middle right`) | (`bottom left`) | (`bottom center`) | (`bottom right`) | inside | outside | auto | none
    ): Self = StObject.set(x, "textposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextpositionUndefined: Self = StObject.set(x, "textposition", js.undefined)
    
    @scala.inline
    def setTheta(value: js.Array[Datum]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    @scala.inline
    def setThetaVarargs(value: Datum*): Self = StObject.set(x, "theta", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: PartialDataTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransforms(value: js.Array[DataTransform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: DataTransform*): Self = StObject.set(x, "transforms", js.Array(value :_*))
    
    @scala.inline
    def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
    
    @scala.inline
    def setType(value: PlotType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[Datum]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Datum*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean | legendonly): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
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
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setXaxis(value: String): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setXbins(value: End): Self = StObject.set(x, "xbins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXbinsUndefined: Self = StObject.set(x, "xbins", js.undefined)
    
    @scala.inline
    def setXgap(value: Double): Self = StObject.set(x, "xgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXgapUndefined: Self = StObject.set(x, "xgap", js.undefined)
    
    @scala.inline
    def setXy(value: js.typedarray.Float32Array): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
    
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
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYVarargs(value: (js.Array[Datum] | Datum)*): Self = StObject.set(x, "y", js.Array(value :_*))
    
    @scala.inline
    def setYaxis(value: String): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
    
    @scala.inline
    def setYgap(value: Double): Self = StObject.set(x, "ygap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYgapUndefined: Self = StObject.set(x, "ygap", js.undefined)
    
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
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    
    @scala.inline
    def setZVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "z", js.Array(value :_*))
    
    @scala.inline
    def setZsmooth(value: fast | best | `false`): Self = StObject.set(x, "zsmooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZsmoothUndefined: Self = StObject.set(x, "zsmooth", js.undefined)
  }
}
