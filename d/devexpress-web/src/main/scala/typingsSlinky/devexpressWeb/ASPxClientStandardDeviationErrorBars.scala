package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the StandardDeviationErrorBars class.
  */
@js.native
trait ASPxClientStandardDeviationErrorBars extends ASPxClientIndicator {
  
  /**
    * Returns the multiplier on which the standard deviation value is multiplied before display.
    */
  var multiplier: Double = js.native
}
object ASPxClientStandardDeviationErrorBars {
  
  @scala.inline
  def apply(chart: ASPxClientWebChart, multiplier: Double, name: String, series: ASPxClientSeries): ASPxClientStandardDeviationErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientStandardDeviationErrorBars]
  }
  
  @scala.inline
  implicit class ASPxClientStandardDeviationErrorBarsMutableBuilder[Self <: ASPxClientStandardDeviationErrorBars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
  }
}
