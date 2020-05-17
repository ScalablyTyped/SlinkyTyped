package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FixedValueErrorBars class.
  */
@js.native
trait ASPxClientFixedValueErrorBars extends ASPxClientIndicator {
  /**
    * Returns the fixed negative error value.
    */
  var negativeError: Double = js.native
  /**
    * Gets or sets the fixed positive error value.
    */
  var positiveError: Double = js.native
}

object ASPxClientFixedValueErrorBars {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: String,
    negativeError: Double,
    positiveError: Double,
    series: ASPxClientSeries
  ): ASPxClientFixedValueErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], negativeError = negativeError.asInstanceOf[js.Any], positiveError = positiveError.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFixedValueErrorBars]
  }
  @scala.inline
  implicit class ASPxClientFixedValueErrorBarsOps[Self <: ASPxClientFixedValueErrorBars] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNegativeError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositiveError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

