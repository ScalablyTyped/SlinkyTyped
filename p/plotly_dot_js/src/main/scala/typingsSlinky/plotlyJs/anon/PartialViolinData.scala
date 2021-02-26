package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Data
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/violin.ViolinData> */
@js.native
trait PartialViolinData extends Data {
  
  var alignmentgroup: js.UndefOr[String] = js.native
  
  var bandwidth: js.UndefOr[Double] = js.native
  
  var box: js.UndefOr[Partialvisiblebooleanwidt] = js.native
  
  var fillcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var hoveron: js.UndefOr[violins | points | kde | all | String] = js.native
  
  var hovertemplate: js.UndefOr[String | js.Array[String]] = js.native
  
  var hovertext: js.UndefOr[String | js.Array[String]] = js.native
  
  var jitter: js.UndefOr[Double] = js.native
  
  var line: js.UndefOr[PartialcolorColorwidthnumColor] = js.native
  
  var marker: js.UndefOr[PartialoutliercolorColors] = js.native
  
  var meanline: js.UndefOr[Partialvisiblebooleancolo] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offsetgroup: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[v | h] = js.native
  
  var pointpos: js.UndefOr[Double] = js.native
  
  var points: js.UndefOr[all | outliers | suspectedoutliers | `false`] = js.native
  
  var scalegroup: js.UndefOr[String] = js.native
  
  var scalemode: js.UndefOr[width | count] = js.native
  
  var selected: js.UndefOr[ScatterSelectedMarker] = js.native
  
  var side: js.UndefOr[both | positive | negative] = js.native
  
  var span: js.UndefOr[js.Array[_]] = js.native
  
  var spanmode: js.UndefOr[soft | hard | manual] = js.native
  
  var text: js.UndefOr[String | js.Array[String]] = js.native
  
  var `type`: js.UndefOr[violin] = js.native
  
  var unselected: js.UndefOr[ScatterSelectedMarker] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.native
  
  var x0: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
  ] = js.native
  
  var y: js.UndefOr[(js.Array[js.Array[Datum] | Datum]) | TypedArray] = js.native
  
  var y0: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
  ] = js.native
}
object PartialViolinData {
  
  @scala.inline
  def apply(): PartialViolinData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViolinData]
  }
  
  @scala.inline
  implicit class PartialViolinDataMutableBuilder[Self <: PartialViolinData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignmentgroup(value: String): Self = StObject.set(x, "alignmentgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentgroupUndefined: Self = StObject.set(x, "alignmentgroup", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setBox(value: Partialvisiblebooleanwidt): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    @scala.inline
    def setFillcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillcolorUndefined: Self = StObject.set(x, "fillcolor", js.undefined)
    
    @scala.inline
    def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "fillcolor", js.Array(value :_*))
    
    @scala.inline
    def setHoveron(value: violins | points | kde | all | String): Self = StObject.set(x, "hoveron", value.asInstanceOf[js.Any])
    
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
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    @scala.inline
    def setLine(value: PartialcolorColorwidthnumColor): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMarker(value: PartialoutliercolorColors): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMeanline(value: Partialvisiblebooleancolo): Self = StObject.set(x, "meanline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanlineUndefined: Self = StObject.set(x, "meanline", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffsetgroup(value: String): Self = StObject.set(x, "offsetgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetgroupUndefined: Self = StObject.set(x, "offsetgroup", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPointpos(value: Double): Self = StObject.set(x, "pointpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointposUndefined: Self = StObject.set(x, "pointpos", js.undefined)
    
    @scala.inline
    def setPoints(value: all | outliers | suspectedoutliers | `false`): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setScalegroup(value: String): Self = StObject.set(x, "scalegroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalegroupUndefined: Self = StObject.set(x, "scalegroup", js.undefined)
    
    @scala.inline
    def setScalemode(value: width | count): Self = StObject.set(x, "scalemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalemodeUndefined: Self = StObject.set(x, "scalemode", js.undefined)
    
    @scala.inline
    def setSelected(value: ScatterSelectedMarker): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSide(value: both | positive | negative): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setSpan(value: js.Array[_]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    @scala.inline
    def setSpanVarargs(value: js.Any*): Self = StObject.set(x, "span", js.Array(value :_*))
    
    @scala.inline
    def setSpanmode(value: soft | hard | manual): Self = StObject.set(x, "spanmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanmodeUndefined: Self = StObject.set(x, "spanmode", js.undefined)
    
    @scala.inline
    def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setType(value: violin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnselected(value: ScatterSelectedMarker): Self = StObject.set(x, "unselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedUndefined: Self = StObject.set(x, "unselected", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
    ): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
    
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
    def setY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
    ): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
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
  }
}
