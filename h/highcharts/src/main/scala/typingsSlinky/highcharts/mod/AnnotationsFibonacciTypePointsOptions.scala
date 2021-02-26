package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsFibonacciTypePointsOptions extends StObject {
  
  var controlPoint: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The y position of the point.
    */
  var y: js.UndefOr[Double] = js.native
}
object AnnotationsFibonacciTypePointsOptions {
  
  @scala.inline
  def apply(): AnnotationsFibonacciTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciTypePointsOptions]
  }
  
  @scala.inline
  implicit class AnnotationsFibonacciTypePointsOptionsMutableBuilder[Self <: AnnotationsFibonacciTypePointsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlPoint(value: Double): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointUndefined: Self = StObject.set(x, "controlPoint", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
