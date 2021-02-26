package typingsSlinky.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSVGSeriesPoint extends AbstractSeriesPoint {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object CustomSVGSeriesPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): CustomSVGSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSVGSeriesPoint]
  }
  
  @scala.inline
  implicit class CustomSVGSeriesPointMutableBuilder[Self <: CustomSVGSeriesPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
