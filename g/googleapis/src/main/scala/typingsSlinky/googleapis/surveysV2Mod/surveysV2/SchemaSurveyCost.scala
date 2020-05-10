package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining the cost to run a given survey through API.
  */
@js.native
trait SchemaSurveyCost extends js.Object {
  /**
    * Cost per survey response in nano units of the given currency. To get the
    * total cost for a survey, multiply this value by wanted_response_count.
    */
  var costPerResponseNanos: js.UndefOr[String] = js.native
  /**
    * Currency code that the cost is given in.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * *Deprecated* Threshold to start a survey automatically if the quoted
    * price is at most this value. When a survey has a Screener (threshold)
    * question, it must go through an incidence pricing test to determine the
    * final cost per response. Typically you will have to make a followup call
    * to start the survey giving the final computed cost per response. If the
    * survey has no threshold_answers, setting this property will return an
    * error. By specifying this property, you indicate the max price per
    * response you are willing to pay in advance of the incidence test. If the
    * price turns out to be lower than the specified value, the survey will
    * begin immediately and you will be charged at the rate determined by the
    * incidence pricing test. If the price turns out to be greater than the
    * specified value the survey will not be started and you will instead be
    * notified what price was determined by the incidence test. At that point,
    * you must raise the value of this property to be greater than or equal to
    * that cost before attempting to start the survey again. This will
    * immediately start the survey as long the incidence test was run within
    * the last 21 days. This will no longer be available after June 2018.
    */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
  /**
    * Cost of survey in nano units of the given currency. DEPRECATED in favor
    * of cost_per_response_nanos
    */
  var nanos: js.UndefOr[String] = js.native
}

object SchemaSurveyCost {
  @scala.inline
  def apply(): SchemaSurveyCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyCost]
  }
  @scala.inline
  implicit class SchemaSurveyCostOps[Self <: SchemaSurveyCost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCostPerResponseNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costPerResponseNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostPerResponseNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costPerResponseNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCostPerResponseNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCostPerResponseNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCostPerResponseNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCostPerResponseNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(js.undefined)
        ret
    }
  }
  
}

