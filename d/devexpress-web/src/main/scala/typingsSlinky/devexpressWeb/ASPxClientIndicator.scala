package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Indicator class.
  */
@js.native
trait ASPxClientIndicator extends ASPxClientWebChartElementNamed {
  
  /**
    * Gets the indicator's associated series.
    */
  var series: ASPxClientSeries = js.native
}
object ASPxClientIndicator {
  
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, series: ASPxClientSeries): ASPxClientIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientIndicator]
  }
  
  @scala.inline
  implicit class ASPxClientIndicatorMutableBuilder[Self <: ASPxClientIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
