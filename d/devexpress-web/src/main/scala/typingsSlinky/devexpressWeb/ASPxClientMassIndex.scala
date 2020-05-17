package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MassIndex class.
  */
@js.native
trait ASPxClientMassIndex extends ASPxSeparatePaneIndicator {
  /**
    * Returns the count of points used to calculate the exponential moving average (EMA).
    */
  var movingAveragePointsCount: Double = js.native
  /**
    * Returns the count of summable values.
    */
  var sumPointsCount: Double = js.native
}

object ASPxClientMassIndex {
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    movingAveragePointsCount: Double,
    name: String,
    pane: String,
    series: ASPxClientSeries,
    sumPointsCount: Double
  ): ASPxClientMassIndex = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], movingAveragePointsCount = movingAveragePointsCount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], sumPointsCount = sumPointsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMassIndex]
  }
  @scala.inline
  implicit class ASPxClientMassIndexOps[Self <: ASPxClientMassIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovingAveragePointsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movingAveragePointsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSumPointsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumPointsCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

