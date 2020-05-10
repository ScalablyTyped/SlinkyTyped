package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedQuantileLoss extends js.Object {
  /**
    * The difference between the predicted value and the actual value over the quantile, weighted (normalized) by dividing by the sum over all quantiles.
    */
  var LossValue: js.UndefOr[Double] = js.native
  /**
    * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
    */
  var Quantile: js.UndefOr[Double] = js.native
}

object WeightedQuantileLoss {
  @scala.inline
  def apply(): WeightedQuantileLoss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightedQuantileLoss]
  }
  @scala.inline
  implicit class WeightedQuantileLossOps[Self <: WeightedQuantileLoss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLossValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LossValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LossValue")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantile")(js.undefined)
        ret
    }
  }
  
}

