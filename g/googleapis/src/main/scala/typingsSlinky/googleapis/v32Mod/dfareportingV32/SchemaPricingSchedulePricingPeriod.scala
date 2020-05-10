package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing Period
  */
@js.native
trait SchemaPricingSchedulePricingPeriod extends js.Object {
  /**
    * Pricing period end date. This date must be later than, or the same day
    * as, the pricing period start date, but not later than the placement end
    * date. The period end date can be the same date as the period start date.
    * If, for example, you set 6/25/2015 as both the start and end dates, the
    * effective pricing period date is just that day only, 6/25/2015. The
    * hours, minutes, and seconds of the end date should not be set, as doing
    * so will result in an error.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Comments for this pricing period.
    */
  var pricingComment: js.UndefOr[String] = js.native
  /**
    * Rate or cost of this pricing period in nanos (i.e., multipled by
    * 1000000000). Acceptable values are 0 to 1000000000000000000, inclusive.
    */
  var rateOrCostNanos: js.UndefOr[String] = js.native
  /**
    * Pricing period start date. This date must be later than, or the same day
    * as, the placement start date. The hours, minutes, and seconds of the
    * start date should not be set, as doing so will result in an error.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Units of this pricing period. Acceptable values are 0 to 10000000000,
    * inclusive.
    */
  var units: js.UndefOr[String] = js.native
}

object SchemaPricingSchedulePricingPeriod {
  @scala.inline
  def apply(): SchemaPricingSchedulePricingPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingSchedulePricingPeriod]
  }
  @scala.inline
  implicit class SchemaPricingSchedulePricingPeriodOps[Self <: SchemaPricingSchedulePricingPeriod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingComment")(js.undefined)
        ret
    }
    @scala.inline
    def withRateOrCostNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateOrCostNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateOrCostNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateOrCostNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

