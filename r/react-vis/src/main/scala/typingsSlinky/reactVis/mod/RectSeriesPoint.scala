package typingsSlinky.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectSeriesPoint extends AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.native
  
  var fill: js.UndefOr[String | Double] = js.native
  
  var opacity: js.UndefOr[String | Double] = js.native
  
  var stroke: js.UndefOr[String | Double] = js.native
  
  var x: String | Double | js.Date = js.native
  
  var x0: String | Double | js.Date = js.native
  
  var y: String | Double | js.Date = js.native
  
  var y0: String | Double | js.Date = js.native
}
object RectSeriesPoint {
  
  @scala.inline
  def apply(
    x: String | Double | js.Date,
    x0: String | Double | js.Date,
    y: String | Double | js.Date,
    y0: String | Double | js.Date
  ): RectSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectSeriesPoint]
  }
  
  @scala.inline
  implicit class RectSeriesPointMutableBuilder[Self <: RectSeriesPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFill(value: String | Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setX(value: String | Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(value: String | Double | js.Date): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Date(value: js.Date): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDate(value: js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: String | Double | js.Date): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Date(value: js.Date): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDate(value: js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
