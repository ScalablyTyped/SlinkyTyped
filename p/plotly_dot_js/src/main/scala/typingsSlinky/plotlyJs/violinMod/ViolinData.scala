package typingsSlinky.plotlyJs.violinMod

import typingsSlinky.plotlyJs.anon.PartialcolorColorwidthnumColor
import typingsSlinky.plotlyJs.anon.PartialoutliercolorColors
import typingsSlinky.plotlyJs.anon.Partialvisiblebooleancolo
import typingsSlinky.plotlyJs.anon.Partialvisiblebooleanwidt
import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.TypedArray
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.both
import typingsSlinky.plotlyJs.plotlyJsStrings.count
import typingsSlinky.plotlyJs.plotlyJsStrings.h
import typingsSlinky.plotlyJs.plotlyJsStrings.hard
import typingsSlinky.plotlyJs.plotlyJsStrings.kde
import typingsSlinky.plotlyJs.plotlyJsStrings.manual
import typingsSlinky.plotlyJs.plotlyJsStrings.negative
import typingsSlinky.plotlyJs.plotlyJsStrings.outliers
import typingsSlinky.plotlyJs.plotlyJsStrings.points
import typingsSlinky.plotlyJs.plotlyJsStrings.positive
import typingsSlinky.plotlyJs.plotlyJsStrings.soft
import typingsSlinky.plotlyJs.plotlyJsStrings.suspectedoutliers
import typingsSlinky.plotlyJs.plotlyJsStrings.v
import typingsSlinky.plotlyJs.plotlyJsStrings.violin
import typingsSlinky.plotlyJs.plotlyJsStrings.violins
import typingsSlinky.plotlyJs.plotlyJsStrings.width
import typingsSlinky.plotlyJs.scatterMod.ScatterSelectedMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolinData extends js.Object {
  
  var alignmentgroup: String = js.native
  
  var bandwidth: Double = js.native
  
  var box: Partialvisiblebooleanwidt = js.native
  
  var fillcolor: Color = js.native
  
  var hoveron: violins | points | kde | all | String = js.native
  
  var hovertemplate: String | js.Array[String] = js.native
  
  var hovertext: String | js.Array[String] = js.native
  
  var jitter: Double = js.native
  
  var line: PartialcolorColorwidthnumColor = js.native
  
  var marker: PartialoutliercolorColors = js.native
  
  var meanline: Partialvisiblebooleancolo = js.native
  
  var name: String = js.native
  
  var offsetgroup: String = js.native
  
  var opacity: Double = js.native
  
   // Missing from the list of attributes
  var orientation: v | h = js.native
  
  var pointpos: Double = js.native
  
  var points: all | outliers | suspectedoutliers | `false` = js.native
  
  var scalegroup: String = js.native
  
  var scalemode: width | count = js.native
  
  var selected: ScatterSelectedMarker = js.native
  
  var side: both | positive | negative = js.native
  
  var span: js.Array[_] = js.native
  
  var spanmode: soft | hard | manual = js.native
  
  var text: String | js.Array[String] = js.native
  
  var `type`: violin = js.native
  
  var unselected: ScatterSelectedMarker = js.native
  
  var width: Double = js.native
  
  var x: (js.Array[js.Array[Datum] | Datum]) | TypedArray = js.native
  
  var x0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any = js.native
  
  var y: (js.Array[js.Array[Datum] | Datum]) | TypedArray = js.native
  
  var y0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any = js.native
}
object ViolinData {
  
  @scala.inline
  def apply(
    alignmentgroup: String,
    bandwidth: Double,
    box: Partialvisiblebooleanwidt,
    fillcolor: Color,
    hoveron: violins | points | kde | all | String,
    hovertemplate: String | js.Array[String],
    hovertext: String | js.Array[String],
    jitter: Double,
    line: PartialcolorColorwidthnumColor,
    marker: PartialoutliercolorColors,
    meanline: Partialvisiblebooleancolo,
    name: String,
    offsetgroup: String,
    opacity: Double,
    orientation: v | h,
    pointpos: Double,
    points: all | outliers | suspectedoutliers | `false`,
    scalegroup: String,
    scalemode: width | count,
    selected: ScatterSelectedMarker,
    side: both | positive | negative,
    span: js.Array[_],
    spanmode: soft | hard | manual,
    text: String | js.Array[String],
    `type`: violin,
    unselected: ScatterSelectedMarker,
    width: Double,
    x: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
    x0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any,
    y: (js.Array[js.Array[Datum] | Datum]) | TypedArray,
    y0: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
  ): ViolinData = {
    val __obj = js.Dynamic.literal(alignmentgroup = alignmentgroup.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], fillcolor = fillcolor.asInstanceOf[js.Any], hoveron = hoveron.asInstanceOf[js.Any], hovertemplate = hovertemplate.asInstanceOf[js.Any], hovertext = hovertext.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], meanline = meanline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetgroup = offsetgroup.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointpos = pointpos.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], scalegroup = scalegroup.asInstanceOf[js.Any], scalemode = scalemode.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], spanmode = spanmode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unselected = unselected.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolinData]
  }
  
  @scala.inline
  implicit class ViolinDataOps[Self <: ViolinData] (val x: Self) extends AnyVal {
    
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
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBox(value: Partialvisiblebooleanwidt): Self = this.set("box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("fillcolor", js.Array(value :_*))
    
    @scala.inline
    def setFillcolor(value: Color): Self = this.set("fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveron(value: violins | points | kde | all | String): Self = this.set("hoveron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertemplateVarargs(value: String*): Self = this.set("hovertemplate", js.Array(value :_*))
    
    @scala.inline
    def setHovertemplate(value: String | js.Array[String]): Self = this.set("hovertemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovertextVarargs(value: String*): Self = this.set("hovertext", js.Array(value :_*))
    
    @scala.inline
    def setHovertext(value: String | js.Array[String]): Self = this.set("hovertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: PartialcolorColorwidthnumColor): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: PartialoutliercolorColors): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanline(value: Partialvisiblebooleancolo): Self = this.set("meanline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetgroup(value: String): Self = this.set("offsetgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: v | h): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointpos(value: Double): Self = this.set("pointpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: all | outliers | suspectedoutliers | `false`): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalegroup(value: String): Self = this.set("scalegroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalemode(value: width | count): Self = this.set("scalemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: ScatterSelectedMarker): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: both | positive | negative): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanVarargs(value: js.Any*): Self = this.set("span", js.Array(value :_*))
    
    @scala.inline
    def setSpan(value: js.Array[_]): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanmode(value: soft | hard | manual): Self = this.set("spanmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String | js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: violin): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselected(value: ScatterSelectedMarker): Self = this.set("unselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint32Array(value: js.typedarray.Uint32Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt8Array(value: js.typedarray.Int8Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: (js.Array[Datum] | Datum)*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setXFloat64Array(value: js.typedarray.Float64Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint8Array(value: js.typedarray.Uint8Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt32Array(value: js.typedarray.Int32Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXInt16Array(value: js.typedarray.Int16Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUint16Array(value: js.typedarray.Uint16Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFloat32Array(value: js.typedarray.Float32Array): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
    ): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFloat32Array(value: js.typedarray.Float32Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFloat64Array(value: js.typedarray.Float64Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUint32Array(value: js.typedarray.Uint32Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInt32Array(value: js.typedarray.Int32Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: (js.Array[Datum] | Datum)*): Self = this.set("y", js.Array(value :_*))
    
    @scala.inline
    def setYUint16Array(value: js.typedarray.Uint16Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInt8Array(value: js.typedarray.Int8Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUint8Array(value: js.typedarray.Uint8Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYInt16Array(value: js.typedarray.Int16Array): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
    ): Self = this.set("y0", value.asInstanceOf[js.Any])
  }
}
