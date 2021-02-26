package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotXrangePartialFillOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) The fill color to be used for partial
    * fills. Defaults to a darker shade of the point color.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
}
object PlotXrangePartialFillOptions {
  
  @scala.inline
  def apply(): PlotXrangePartialFillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotXrangePartialFillOptions]
  }
  
  @scala.inline
  implicit class PlotXrangePartialFillOptionsMutableBuilder[Self <: PlotXrangePartialFillOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
