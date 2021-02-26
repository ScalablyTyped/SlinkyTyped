package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the CommodityChannelIndex class.
  */
@js.native
trait ASPxClientCommodityChannelIndex extends ASPxSeparatePaneIndicator {
  
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  var pointsCount: Double = js.native
}
object ASPxClientCommodityChannelIndex {
  
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    name: String,
    pane: String,
    pointsCount: Double,
    series: ASPxClientSeries
  ): ASPxClientCommodityChannelIndex = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCommodityChannelIndex]
  }
  
  @scala.inline
  implicit class ASPxClientCommodityChannelIndexMutableBuilder[Self <: ASPxClientCommodityChannelIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointsCount(value: Double): Self = StObject.set(x, "pointsCount", value.asInstanceOf[js.Any])
  }
}
