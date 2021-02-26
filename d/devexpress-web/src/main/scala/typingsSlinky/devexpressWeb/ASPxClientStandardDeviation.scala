package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the StandardDeviation class.
  */
@js.native
trait ASPxClientStandardDeviation extends ASPxSeparatePaneIndicator {
  
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  var pointsCount: Double = js.native
  
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
    */
  var valueLevel: String = js.native
}
object ASPxClientStandardDeviation {
  
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    name: String,
    pane: String,
    pointsCount: Double,
    series: ASPxClientSeries,
    valueLevel: String
  ): ASPxClientStandardDeviation = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientStandardDeviation]
  }
  
  @scala.inline
  implicit class ASPxClientStandardDeviationMutableBuilder[Self <: ASPxClientStandardDeviation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointsCount(value: Double): Self = StObject.set(x, "pointsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLevel(value: String): Self = StObject.set(x, "valueLevel", value.asInstanceOf[js.Any])
  }
}
