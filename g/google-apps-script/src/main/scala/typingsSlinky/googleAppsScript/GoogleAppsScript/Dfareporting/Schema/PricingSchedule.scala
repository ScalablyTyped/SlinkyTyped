package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingSchedule extends js.Object {
  var capCostOption: js.UndefOr[String] = js.native
  var disregardOverdelivery: js.UndefOr[Boolean] = js.native
  var endDate: js.UndefOr[String] = js.native
  var flighted: js.UndefOr[Boolean] = js.native
  var floodlightActivityId: js.UndefOr[String] = js.native
  var pricingPeriods: js.UndefOr[js.Array[PricingSchedulePricingPeriod]] = js.native
  var pricingType: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
  var testingStartDate: js.UndefOr[String] = js.native
}

object PricingSchedule {
  @scala.inline
  def apply(): PricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingSchedule]
  }
  @scala.inline
  implicit class PricingScheduleOps[Self <: PricingSchedule] (val x: Self) extends AnyVal {
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
    def withPricingPeriods(value: js.Array[PricingSchedulePricingPeriod]): Self = {
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

