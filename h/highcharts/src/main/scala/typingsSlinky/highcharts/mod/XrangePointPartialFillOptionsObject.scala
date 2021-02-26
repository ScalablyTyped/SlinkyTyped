package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XrangePointPartialFillOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
    * filled. Values can be 0-1 and are converted to percentages in the default
    * data label formatter.
    */
  var amount: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The fill color to be used for partial
    * fills. Defaults to a darker shade of the point color.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
}
object XrangePointPartialFillOptionsObject {
  
  @scala.inline
  def apply(): XrangePointPartialFillOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XrangePointPartialFillOptionsObject]
  }
  
  @scala.inline
  implicit class XrangePointPartialFillOptionsObjectMutableBuilder[Self <: XrangePointPartialFillOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
