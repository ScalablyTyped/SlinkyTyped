package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  /**
    * The root mean square error (RMSE).
    */
  var RMSE: js.UndefOr[Double] = js.native
  /**
    * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal probability. The distribution in this case is the loss function.
    */
  var WeightedQuantileLosses: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.WeightedQuantileLosses] = js.native
}

object Metrics {
  @scala.inline
  def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRMSE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RMSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRMSE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RMSE")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedQuantileLosses(value: WeightedQuantileLosses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeightedQuantileLosses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedQuantileLosses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeightedQuantileLosses")(js.undefined)
        ret
    }
  }
  
}

