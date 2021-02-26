package typingsSlinky.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalBarSeriesPoint extends AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.native
  
  var fill: js.UndefOr[String | Double] = js.native
  
  var opacity: js.UndefOr[String | Double] = js.native
  
  var stroke: js.UndefOr[String | Double] = js.native
  
  var x: String | Double = js.native
  
  var y: Double = js.native
}
object VerticalBarSeriesPoint {
  
  @scala.inline
  def apply(x: String | Double, y: Double): VerticalBarSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalBarSeriesPoint]
  }
  
  @scala.inline
  implicit class VerticalBarSeriesPointMutableBuilder[Self <: VerticalBarSeriesPoint] (val x: Self) extends AnyVal {
    
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
    def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
