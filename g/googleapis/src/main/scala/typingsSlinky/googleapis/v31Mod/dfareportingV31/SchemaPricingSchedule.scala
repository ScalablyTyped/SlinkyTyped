package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing Schedule
  */
@js.native
trait SchemaPricingSchedule extends js.Object {
  /**
    * Placement cap cost option.
    */
  var capCostOption: js.UndefOr[String] = js.native
  /**
    * Whether cap costs are ignored by ad serving.
    */
  var disregardOverdelivery: js.UndefOr[Boolean] = js.native
  /**
    * Placement end date. This date must be later than, or the same day as, the
    * placement start date, but not later than the campaign end date. If, for
    * example, you set 6/25/2015 as both the start and end dates, the effective
    * placement date is just that day only, 6/25/2015. The hours, minutes, and
    * seconds of the end date should not be set, as doing so will result in an
    * error. This field is required on insertion.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Whether this placement is flighted. If true, pricing periods will be
    * computed automatically.
    */
  var flighted: js.UndefOr[Boolean] = js.native
  /**
    * Floodlight activity ID associated with this placement. This field should
    * be set when placement pricing type is set to PRICING_TYPE_CPA.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  /**
    * Pricing periods for this placement.
    */
  var pricingPeriods: js.UndefOr[js.Array[SchemaPricingSchedulePricingPeriod]] = js.native
  /**
    * Placement pricing type. This field is required on insertion.
    */
  var pricingType: js.UndefOr[String] = js.native
  /**
    * Placement start date. This date must be later than, or the same day as,
    * the campaign start date. The hours, minutes, and seconds of the start
    * date should not be set, as doing so will result in an error. This field
    * is required on insertion.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Testing start date of this placement. The hours, minutes, and seconds of
    * the start date should not be set, as doing so will result in an error.
    */
  var testingStartDate: js.UndefOr[String] = js.native
}

object SchemaPricingSchedule {
  @scala.inline
  def apply(): SchemaPricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricingSchedule]
  }
  @scala.inline
  implicit class SchemaPricingScheduleOps[Self <: SchemaPricingSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapCostOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capCostOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapCostOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capCostOption")(js.undefined)
        ret
    }
    @scala.inline
    def withDisregardOverdelivery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disregardOverdelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisregardOverdelivery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disregardOverdelivery")(js.undefined)
        ret
    }
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
    def withFlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flighted")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityId")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingPeriods(value: js.Array[SchemaPricingSchedulePricingPeriod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingPeriods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingPeriods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingPeriods")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingType")(js.undefined)
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
    def withTestingStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testingStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestingStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testingStartDate")(js.undefined)
        ret
    }
  }
  
}

