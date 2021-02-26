package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Model used with the doughnut chart
@js.native
trait DoughnutModel extends StObject {
  
  var backgroundColor: ChartColor = js.native
  
  var borderAlign: BorderAlignment = js.native
  
  var borderColor: String = js.native
  
  var borderWidth: Double = js.native
  
  var circumference: Double = js.native
  
  var endAngle: Double = js.native
  
  var innerRadius: Double = js.native
  
  var outerRadius: Double = js.native
  
  var startAngle: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object DoughnutModel {
  
  @scala.inline
  def apply(
    backgroundColor: ChartColor,
    borderAlign: BorderAlignment,
    borderColor: String,
    borderWidth: Double,
    circumference: Double,
    endAngle: Double,
    innerRadius: Double,
    outerRadius: Double,
    startAngle: Double,
    x: Double,
    y: Double
  ): DoughnutModel = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circumference = circumference.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoughnutModel]
  }
  
  @scala.inline
  implicit class DoughnutModelMutableBuilder[Self <: DoughnutModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorCanvasGradient(value: CanvasGradient): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorCanvasPattern(value: CanvasPattern): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderAlign(value: BorderAlignment): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
