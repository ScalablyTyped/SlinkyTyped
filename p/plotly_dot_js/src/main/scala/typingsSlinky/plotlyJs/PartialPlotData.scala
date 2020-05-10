package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.mod.ColorScale
import typingsSlinky.plotlyJs.mod.Dash
import typingsSlinky.plotlyJs.mod.DataTransform
import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.ErrorBar
import typingsSlinky.plotlyJs.mod.MarkerSymbol
import typingsSlinky.plotlyJs.mod.PlotType
import typingsSlinky.plotlyJs.mod.TypedArray
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top right`
import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.area
import typingsSlinky.plotlyJs.plotlyJsStrings.best
import typingsSlinky.plotlyJs.plotlyJsStrings.clockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.counterclockwise
import typingsSlinky.plotlyJs.plotlyJsStrings.delta
import typingsSlinky.plotlyJs.plotlyJsStrings.diameter
import typingsSlinky.plotlyJs.plotlyJsStrings.fast
import typingsSlinky.plotlyJs.plotlyJsStrings.fills
import typingsSlinky.plotlyJs.plotlyJsStrings.gauge
import typingsSlinky.plotlyJs.plotlyJsStrings.gaugePlussigndelta
import typingsSlinky.plotlyJs.plotlyJsStrings.gaugePlussignnumber
import typingsSlinky.plotlyJs.plotlyJsStrings.gaugePlussignnumberPlussigndelta
import typingsSlinky.plotlyJs.plotlyJsStrings.h
import typingsSlinky.plotlyJs.plotlyJsStrings.hv
import typingsSlinky.plotlyJs.plotlyJsStrings.hvh
import typingsSlinky.plotlyJs.plotlyJsStrings.inside
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
import typingsSlinky.plotlyJs.plotlyJsStrings.name
import typingsSlinky.plotlyJs.plotlyJsStrings.none
import typingsSlinky.plotlyJs.plotlyJsStrings.number
import typingsSlinky.plotlyJs.plotlyJsStrings.numberPlussigndelta
import typingsSlinky.plotlyJs.plotlyJsStrings.outside
import typingsSlinky.plotlyJs.plotlyJsStrings.percent
import typingsSlinky.plotlyJs.plotlyJsStrings.points
import typingsSlinky.plotlyJs.plotlyJsStrings.sd
import typingsSlinky.plotlyJs.plotlyJsStrings.skip
import typingsSlinky.plotlyJs.plotlyJsStrings.spline
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
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignx
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussigny
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussignyPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignxPlussignyPlussigntext
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignyPlussignx
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignyPlussignxPlussignname
import typingsSlinky.plotlyJs.plotlyJsStrings.zPlussignyPlussignxPlussigntext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PlotData> */
@js.native
trait PartialPlotData extends js.Object {
  var autobinx: js.UndefOr[Boolean] = js.native
  var boxmean: js.UndefOr[Boolean | sd] = js.native
  var colorscale: js.UndefOr[ColorScale] = js.native
  var connectgaps: js.UndefOr[Boolean] = js.native
  var customdata: js.UndefOr[js.Array[Datum]] = js.native
  var delta: js.UndefOr[PartialDelta] = js.native
  var direction: js.UndefOr[clockwise | counterclockwise] = js.native
  var domain: js.UndefOr[Partialrowsnumbercolumnsn] = js.native
  var error_x: js.UndefOr[ErrorBar] = js.native
  var error_y: js.UndefOr[ErrorBar] = js.native
  var fill: js.UndefOr[none | tozeroy | tozerox | tonexty | tonextx | toself | tonext] = js.native
  var fillcolor: js.UndefOr[String] = js.native
  var gauge: js.UndefOr[PartialGaugeAxis] = js.native
  var hole: js.UndefOr[Double] = js.native
  var hoverinfo: js.UndefOr[
    all | name | none | skip | text | x | xPlussigntext | xPlussignname | xPlussigny | xPlussignyPlussigntext | xPlussignyPlussignname | xPlussignyPlussignz | xPlussignyPlussignzPlussigntext | xPlussignyPlussignzPlussignname | yPlussignname | yPlussignx | yPlussigntext | yPlussignxPlussigntext | yPlussignxPlussignname | yPlussignz | yPlussignzPlussigntext | yPlussignzPlussignname | yPlussignxPlussignz | yPlussignxPlussignzPlussigntext | yPlussignxPlussignzPlussignname | zPlussignx | zPlussignxPlussigntext | zPlussignxPlussignname | zPlussignyPlussignx | zPlussignyPlussignxPlussigntext | zPlussignyPlussignxPlussignname | zPlussignxPlussigny | zPlussignxPlussignyPlussigntext | zPlussignxPlussignyPlussignname
  ] = js.native
  var hoverlabel: js.UndefOr[PartialHoverLabel] = js.native
  var hoveron: js.UndefOr[points | fills] = js.native
  var hovertemplate: js.UndefOr[String | js.Array[String]] = js.native
  var hovertext: js.UndefOr[String | js.Array[String]] = js.native
  var labels: js.UndefOr[js.Array[Datum]] = js.native
  var legendgroup: js.UndefOr[String] = js.native
  var line: js.UndefOr[PartialScatterLine] = js.native
  @JSName("line.color")
  var lineDotcolor: js.UndefOr[Color] = js.native
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
  var marker: js.UndefOr[PartialPlotMarker] = js.native
  @JSName("marker.color")
  var markerDotcolor: js.UndefOr[Color] = js.native
  @JSName("marker.colorbar")
  var markerDotcolorbar: js.UndefOr[js.Object] = js.native
  @JSName("marker.colorscale")
  var markerDotcolorscale: js.UndefOr[ColorScale | js.Array[ColorScale]] = js.native
  @JSName("marker.line")
  var markerDotline: js.UndefOr[PartialScatterMarkerLine] = js.native
  @JSName("marker.line.color")
  var markerDotlineDotcolor: js.UndefOr[Color] = js.native
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
  var r: js.UndefOr[js.Array[Datum]] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var showlegend: js.UndefOr[Boolean] = js.native
  var showscale: js.UndefOr[Boolean] = js.native
  var stackgroup: js.UndefOr[String] = js.native
  var text: js.UndefOr[String | js.Array[String]] = js.native
  var textfont: js.UndefOr[PartialFont] = js.native
  var textinfo: js.UndefOr[
    label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
  ] = js.native
  var textposition: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle left`) | (`middle center`) | (`middle right`) | (`bottom left`) | (`bottom center`) | (`bottom right`) | inside | outside
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
  var xbins: js.UndefOr[AnonEnd] = js.native
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
  implicit class PartialPlotDataOps[Self <: PartialPlotData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutobinx(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autobinx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutobinx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autobinx")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxmean(value: Boolean | sd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxmean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxmean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxmean")(js.undefined)
        ret
    }
    @scala.inline
    def withColorscale(value: ColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectgaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectgaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectgaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectgaps")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomdata(value: js.Array[Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customdata")(js.undefined)
        ret
    }
    @scala.inline
    def withDelta(value: PartialDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: clockwise | counterclockwise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: Partialrowsnumbercolumnsn): Self = {
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
    def withError_x(value: ErrorBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_x: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_x")(js.undefined)
        ret
    }
    @scala.inline
    def withError_y(value: ErrorBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_y: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_y")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: none | tozeroy | tozerox | tonexty | tonextx | toself | tonext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withGauge(value: PartialGaugeAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGauge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauge")(js.undefined)
        ret
    }
    @scala.inline
    def withHole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hole")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverinfo(
      value: all | name | none | skip | text | x | xPlussigntext | xPlussignname | xPlussigny | xPlussignyPlussigntext | xPlussignyPlussignname | xPlussignyPlussignz | xPlussignyPlussignzPlussigntext | xPlussignyPlussignzPlussignname | yPlussignname | yPlussignx | yPlussigntext | yPlussignxPlussigntext | yPlussignxPlussignname | yPlussignz | yPlussignzPlussigntext | yPlussignzPlussignname | yPlussignxPlussignz | yPlussignxPlussignzPlussigntext | yPlussignxPlussignzPlussignname | zPlussignx | zPlussignxPlussigntext | zPlussignxPlussignname | zPlussignyPlussignx | zPlussignyPlussignxPlussigntext | zPlussignyPlussignxPlussignname | zPlussignxPlussigny | zPlussignxPlussignyPlussigntext | zPlussignxPlussignyPlussignname
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverinfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverinfo")(js.undefined)
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
    def withHoveron(value: points | fills): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoveron: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveron")(js.undefined)
        ret
    }
    @scala.inline
    def withHovertemplate(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovertemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHovertemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovertemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHovertext(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovertext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHovertext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovertext")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendgroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendgroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendgroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendgroup")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: PartialScatterLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDotcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDotcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.color")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDotdash(value: Dash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.dash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDotdash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.dash")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDotshape(value: linear | spline | hv | vh | hvh | vhv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDotshape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.shape")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDotsimplify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.simplify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDotsimplify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.simplify")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDotsmoothing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.smoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDotsmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.smoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDotwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDotwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line.width")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: PartialPlotMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.color")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotcolorbar(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.colorbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotcolorbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.colorbar")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotcolorscale(value: ColorScale | js.Array[ColorScale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.colorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotcolorscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.colorscale")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotline(value: PartialScatterMarkerLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.line")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotlineDotcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.line.color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotlineDotcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.line.color")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotlineDotcolorscale(value: ColorScale | js.Array[ColorScale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.line.colorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotlineDotcolorscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.line.colorscale")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotmaxdisplayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.maxdisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotmaxdisplayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.maxdisplayed")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotopacity(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotopacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotpadDotb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotpadDotb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.b")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotpadDotl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotpadDotl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.l")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotpadDotr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotpadDotr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.r")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotpadDott(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotpadDott: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.pad.t")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotshowscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.showscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotshowscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.showscale")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotsize(value: Double | (js.Array[js.Array[Double] | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.size")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotsizemax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotsizemax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizemax")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotsizemin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotsizemin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizemin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotsizemode(value: diameter | area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotsizemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizemode")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotsizeref(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizeref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotsizeref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.sizeref")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDotsymbol(value: MarkerSymbol | js.Array[MarkerSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDotsymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker.symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(
      value: lines | markers | text | linesPlussignmarkers | textPlussignmarkers | textPlussignlines | textPlussignlinesPlussignmarkers | none | gauge | number | delta | numberPlussigndelta | gaugePlussignnumber | gaugePlussignnumberPlussigndelta | gaugePlussigndelta
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: PartialPlotNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: v | h): Self = {
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
    def withParents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(js.undefined)
        ret
    }
    @scala.inline
    def withR(value: js.Array[Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
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
    def withShowscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showscale")(js.undefined)
        ret
    }
    @scala.inline
    def withStackgroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackgroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackgroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackgroup")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextfont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textfont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextfont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textfont")(js.undefined)
        ret
    }
    @scala.inline
    def withTextinfo(
      value: label | labelPlussigntext | labelPlussignvalue | labelPlussignpercent | labelPlussigntextPlussignvalue | labelPlussigntextPlussignpercent | labelPlussignvaluePlussignpercent | text | textPlussignvalue | textPlussignpercent | textPlussignvaluePlussignpercent | value | valuePlussignpercent | percent | none
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextinfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textinfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTextposition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle left`) | (`middle center`) | (`middle right`) | (`bottom left`) | (`bottom center`) | (`bottom right`) | inside | outside
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textposition")(js.undefined)
        ret
    }
    @scala.inline
    def withTheta(value: js.Array[Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: PartialDataTitle): Self = {
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
    def withTransforms(value: js.Array[DataTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(js.undefined)
        ret
    }
    @scala.inline
    def withTranspose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranspose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PlotType): Self = {
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
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Datum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean | legendonly): Self = {
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
    def withWidth(value: Double | js.Array[Double]): Self = {
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
    def withXInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxis(value: String): Self = {
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
    def withXbins(value: AnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXbins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbins")(js.undefined)
        ret
    }
    @scala.inline
    def withXgap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xgap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXgap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xgap")(js.undefined)
        ret
    }
    @scala.inline
    def withXy(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xy")(js.undefined)
        ret
    }
    @scala.inline
    def withYUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxis(value: String): Self = {
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
    def withYgap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ygap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYgap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ygap")(js.undefined)
        ret
    }
    @scala.inline
    def withZInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
    @scala.inline
    def withZsmooth(value: fast | best | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zsmooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZsmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zsmooth")(js.undefined)
        ret
    }
  }
  
}

