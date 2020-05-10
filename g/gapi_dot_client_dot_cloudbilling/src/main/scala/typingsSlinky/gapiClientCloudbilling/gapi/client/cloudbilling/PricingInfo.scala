package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingInfo extends js.Object {
  /**
    * Aggregation Info. This can be left unspecified if the pricing expression
    * doesn't require aggregation.
    */
  var aggregationInfo: js.UndefOr[AggregationInfo] = js.native
  /**
    * Conversion rate for currency conversion, from USD to the currency specified
    * in the request. If the currency is not specified this defaults to 1.0.
    * Example: USD &#42; currency_conversion_rate = JPY
    */
  var currencyConversionRate: js.UndefOr[Double] = js.native
  /** The timestamp from which this pricing was effective. */
  var effectiveTime: js.UndefOr[String] = js.native
  /** Expresses the pricing formula. See `PricingExpression` for an example. */
  var pricingExpression: js.UndefOr[PricingExpression] = js.native
  /**
    * An optional human readable summary of the pricing information, has a
    * maximum length of 256 characters.
    */
  var summary: js.UndefOr[String] = js.native
}

object PricingInfo {
  @scala.inline
  def apply(): PricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingInfo]
  }
  @scala.inline
  implicit class PricingInfoOps[Self <: PricingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationInfo(value: AggregationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyConversionRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyConversionRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyConversionRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyConversionRate")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingExpression(value: PricingExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

