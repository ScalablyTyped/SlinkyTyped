package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the MovingAverage class.
  */
@js.native
trait ASPxClientMovingAverage extends ASPxClientSingleLevelIndicator {
  /**
    * Gets a value specifying the Envelope percent.
    */
  var envelopePercent: Double = js.native
  /**
    * Gets a value specifying whether to display a Moving Average, Envelope, or both.
    */
  var kind: String = js.native
  /**
    * Gets the number of data points used to calculate the moving average.
    */
  var pointsCount: Double = js.native
}

object ASPxClientMovingAverage {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    envelopePercent: Double,
    kind: String,
    name: String,
    pointsCount: Double,
    series: ASPxClientSeries,
    valueLevel: String
  ): ASPxClientMovingAverage = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], envelopePercent = envelopePercent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMovingAverage]
  }
  @scala.inline
  implicit class ASPxClientMovingAverageOps[Self <: ASPxClientMovingAverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvelopePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelopePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

