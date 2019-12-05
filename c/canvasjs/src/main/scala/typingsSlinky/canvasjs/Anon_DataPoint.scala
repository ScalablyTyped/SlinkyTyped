package typingsSlinky.canvasjs

import typingsSlinky.canvasjs.canvasjsMod.ChartDataPoint
import typingsSlinky.canvasjs.canvasjsMod.ChartDataSeriesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataPoint extends js.Object {
  var dataPoint: ChartDataPoint
  var dataSeries: ChartDataSeriesOptions
}

object Anon_DataPoint {
  @scala.inline
  def apply(dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): Anon_DataPoint = {
    val __obj = js.Dynamic.literal(dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataPoint]
  }
}

