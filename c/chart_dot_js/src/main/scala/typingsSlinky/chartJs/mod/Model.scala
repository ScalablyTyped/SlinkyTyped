package typingsSlinky.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// NOTE: This model is generic with a bunch of optional properties to represent all types of chart models.
// Each chart type defines their own unique model structure so some of these optional properties
// might always have values depending on the chart type.
@js.native
trait Model extends StObject {
  
  var backgroundColor: String = js.native
  
  var base: Double = js.native
  
  var borderAlign: js.UndefOr[BorderAlignment] = js.native
  
  var borderColor: String = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var circumference: js.UndefOr[Double] = js.native
  
  var controlPointNextX: Double = js.native
  
  var controlPointNextY: Double = js.native
  
  var controlPointPreviousX: Double = js.native
  
  var controlPointPreviousY: Double = js.native
  
  var endAngle: js.UndefOr[Double] = js.native
  
  var head: Double = js.native
  
  var hitRadius: Double = js.native
  
  var innerRadius: js.UndefOr[Double] = js.native
  
  var outerRadius: js.UndefOr[Double] = js.native
  
  var pointStyle: String = js.native
  
  var radius: String = js.native
  
  var skip: js.UndefOr[Boolean] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
  
  var steppedLine: js.UndefOr[scala.Nothing] = js.native
  
  var tension: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Model {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    base: Double,
    borderColor: String,
    controlPointNextX: Double,
    controlPointNextY: Double,
    controlPointPreviousX: Double,
    controlPointPreviousY: Double,
    head: Double,
    hitRadius: Double,
    pointStyle: String,
    radius: String,
    tension: Double,
    x: Double,
    y: Double
  ): Model = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], controlPointNextX = controlPointNextX.asInstanceOf[js.Any], controlPointNextY = controlPointNextY.asInstanceOf[js.Any], controlPointPreviousX = controlPointPreviousX.asInstanceOf[js.Any], controlPointPreviousY = controlPointPreviousY.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderAlign(value: BorderAlignment): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderAlignUndefined: Self = StObject.set(x, "borderAlign", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircumferenceUndefined: Self = StObject.set(x, "circumference", js.undefined)
    
    @scala.inline
    def setControlPointNextX(value: Double): Self = StObject.set(x, "controlPointNextX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointNextY(value: Double): Self = StObject.set(x, "controlPointNextY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointPreviousX(value: Double): Self = StObject.set(x, "controlPointPreviousX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointPreviousY(value: Double): Self = StObject.set(x, "controlPointPreviousY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitRadius(value: Double): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setPointStyle(value: String): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
