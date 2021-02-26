package typingsSlinky.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of observable attributes for overlays, including color and opacity of
  * stroke and fill, and line styles.
  */
@js.native
trait Style extends StObject {
  
  /**
    * The fill color of a shape.
    */
  var fillColor: String = js.native
  
  /**
    * The opacity of the fill color.
    */
  var fillOpacity: Double = js.native
  
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  var fillRule: String = js.native
  
  /**
    * The style to use when drawing line endings.
    */
  var lineCap: String = js.native
  
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  var lineDash: js.Array[Double] = js.native
  
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  var lineDashOffset: Double = js.native
  
  /**
    * The gradient to apply along the line.
    */
  var lineGradient: LineGradient = js.native
  
  /**
    * The style to use when drawing joins between line segments.
    */
  var lineJoin: String = js.native
  
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  var lineWidth: Double = js.native
  
  /**
    * The stroke color of a line.
    */
  var strokeColor: String = js.native
  
  /**
    * The unit distance along the line where a stroke ends.
    */
  var strokeEnd: Double = js.native
  
  /**
    * The opacity of the stroke color.
    */
  var strokeOpacity: Double = js.native
  
  /**
    * The unit distance along the line where a stroke begins.
    */
  var strokeStart: Double = js.native
}
object Style {
  
  @scala.inline
  def apply(
    fillColor: String,
    fillOpacity: Double,
    fillRule: String,
    lineCap: String,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineGradient: LineGradient,
    lineJoin: String,
    lineWidth: Double,
    strokeColor: String,
    strokeEnd: Double,
    strokeOpacity: Double,
    strokeStart: Double
  ): Style = {
    val __obj = js.Dynamic.literal(fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], fillRule = fillRule.asInstanceOf[js.Any], lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineGradient = lineGradient.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeEnd = strokeEnd.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStart = strokeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
    
    @scala.inline
    def setLineGradient(value: LineGradient): Self = StObject.set(x, "lineGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeEnd(value: Double): Self = StObject.set(x, "strokeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStart(value: Double): Self = StObject.set(x, "strokeStart", value.asInstanceOf[js.Any])
  }
}
