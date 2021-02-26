package typingsSlinky.plotlyJs

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object violinMod {
  
  @js.native
  trait ViolinData extends StObject {
    
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
    implicit class ViolinDataMutableBuilder[Self <: ViolinData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignmentgroup(value: String): Self = StObject.set(x, "alignmentgroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBox(value: Partialvisiblebooleanwidt): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillcolor(value: Color): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "fillcolor", js.Array(value :_*))
      
      @scala.inline
      def setHoveron(value: violins | points | kde | all | String): Self = StObject.set(x, "hoveron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHovertemplate(value: String | js.Array[String]): Self = StObject.set(x, "hovertemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHovertemplateVarargs(value: String*): Self = StObject.set(x, "hovertemplate", js.Array(value :_*))
      
      @scala.inline
      def setHovertext(value: String | js.Array[String]): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHovertextVarargs(value: String*): Self = StObject.set(x, "hovertext", js.Array(value :_*))
      
      @scala.inline
      def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: PartialcolorColorwidthnumColor): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker(value: PartialoutliercolorColors): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanline(value: Partialvisiblebooleancolo): Self = StObject.set(x, "meanline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetgroup(value: String): Self = StObject.set(x, "offsetgroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointpos(value: Double): Self = StObject.set(x, "pointpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoints(value: all | outliers | suspectedoutliers | `false`): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalegroup(value: String): Self = StObject.set(x, "scalegroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalemode(value: width | count): Self = StObject.set(x, "scalemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: ScatterSelectedMarker): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSide(value: both | positive | negative): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: js.Array[_]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanVarargs(value: js.Any*): Self = StObject.set(x, "span", js.Array(value :_*))
      
      @scala.inline
      def setSpanmode(value: soft | hard | manual): Self = StObject.set(x, "spanmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      @scala.inline
      def setType(value: violin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselected(value: ScatterSelectedMarker): Self = StObject.set(x, "unselected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX0(
        value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['x0'] */ js.Any
      ): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
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
      def setY(value: (js.Array[js.Array[Datum] | Datum]) | TypedArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY0(
        value: /* import warning: importer.ImportType#apply Failed type conversion: plotly.js.plotly.js/lib/traces/box.BoxPlotData['y0'] */ js.Any
      ): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
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
    }
  }
}
