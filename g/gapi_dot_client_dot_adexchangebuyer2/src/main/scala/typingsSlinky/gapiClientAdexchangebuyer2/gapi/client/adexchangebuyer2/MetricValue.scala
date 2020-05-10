package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricValue extends js.Object {
  /** The expected value of the metric. */
  var value: js.UndefOr[String] = js.native
  /**
    * The variance (i.e. square of the standard deviation) of the metric value.
    * If value is exact, variance is 0.
    * Can be used to calculate margin of error as a percentage of value, using
    * the following formula, where Z is the standard constant that depends on the
    * desired size of the confidence interval (e.g. for 90% confidence interval,
    * use Z = 1.645):
    *
    * marginOfError = 100 &#42; Z &#42; sqrt(variance) / value
    */
  var variance: js.UndefOr[String] = js.native
}

object MetricValue {
  @scala.inline
  def apply(): MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValue]
  }
  @scala.inline
  implicit class MetricValueOps[Self <: MetricValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVariance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(js.undefined)
        ret
    }
  }
  
}

