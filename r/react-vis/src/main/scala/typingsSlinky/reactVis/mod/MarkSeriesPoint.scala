package typingsSlinky.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkSeriesPoint extends AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.native
  
  var fill: js.UndefOr[String | Double] = js.native
  
  var opacity: js.UndefOr[String | Double] = js.native
  
  var size: js.UndefOr[String | Double] = js.native
  
  var stroke: js.UndefOr[String | Double] = js.native
  
  var x: String | Double | js.Date = js.native
  
  var y: String | Double | js.Date = js.native
}
object MarkSeriesPoint {
  
  @scala.inline
  def apply(x: String | Double | js.Date, y: String | Double | js.Date): MarkSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkSeriesPoint]
  }
  
  @scala.inline
  implicit class MarkSeriesPointMutableBuilder[Self <: MarkSeriesPoint] (val x: Self) extends AnyVal {
    
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
    def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setX(value: String | Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDate(value: js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDate(value: js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
