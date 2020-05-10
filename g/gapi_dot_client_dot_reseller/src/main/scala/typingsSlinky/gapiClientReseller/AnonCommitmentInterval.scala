package typingsSlinky.gapiClientReseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommitmentInterval extends js.Object {
  /** In this version of the API, annual commitment plan's interval is one year. */
  var commitmentInterval: js.UndefOr[AnonEndTime] = js.native
  /**
    * The isCommitmentPlan property's boolean value identifies the plan as an annual commitment plan:
    * - true — The subscription's plan is an annual commitment plan.
    * - false — The plan is not an annual commitment plan.
    */
  var isCommitmentPlan: js.UndefOr[Boolean] = js.native
  /**
    * The planName property is required. This is the name of the subscription's plan. For more information about the Google payment plans, see the API
    * concepts.
    *
    * Possible values are:
    * - ANNUAL_MONTHLY_PAY — The annual commitment plan with monthly payments
    * - ANNUAL_YEARLY_PAY — The annual commitment plan with yearly payments
    * - FLEXIBLE — The flexible plan
    * - TRIAL — The 30-day free trial plan. A subscription in trial will be suspended after the 30th free day if no payment plan is assigned. Calling
    * changePlan will assign a payment plan to a trial but will not activate the plan. A trial will automatically begin its assigned payment plan after its
    * 30th free day or immediately after calling startPaidService.
    */
  var planName: js.UndefOr[String] = js.native
}

object AnonCommitmentInterval {
  @scala.inline
  def apply(): AnonCommitmentInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCommitmentInterval]
  }
  @scala.inline
  implicit class AnonCommitmentIntervalOps[Self <: AnonCommitmentInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitmentInterval(value: AnonEndTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitmentInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitmentInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitmentInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCommitmentPlan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommitmentPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCommitmentPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommitmentPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planName")(js.undefined)
        ret
    }
  }
  
}

