package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In-line definition of activity
  */
@js.native
trait CarePlanActivityDetail extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'prohibited'.
    */
  var _prohibited: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'scheduledString'.
    */
  var _scheduledString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'statusReason'.
    */
  var _statusReason: js.UndefOr[Element] = js.native
  /**
    * diet | drug | encounter | observation | procedure | supply | other
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Detail type of activity
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * How to consume/day?
    */
  var dailyAmount: js.UndefOr[Quantity] = js.native
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[Reference] = js.native
  /**
    * Extra info describing activity to perform
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Goals this activity relates to
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Where it should happen
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * Who will be responsible?
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * What is to be administered/supplied
    */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * What is to be administered/supplied
    */
  var productReference: js.UndefOr[Reference] = js.native
  /**
    * Do NOT do
    */
  var prohibited: js.UndefOr[Boolean] = js.native
  /**
    * How much to administer/supply/consume
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Why activity should be done or why activity was prohibited
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Condition triggering need for activity
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * When activity is to occur
    */
  var scheduledPeriod: js.UndefOr[Period] = js.native
  /**
    * When activity is to occur
    */
  var scheduledString: js.UndefOr[String] = js.native
  /**
    * When activity is to occur
    */
  var scheduledTiming: js.UndefOr[Timing] = js.native
  /**
    * not-started | scheduled | in-progress | on-hold | completed | cancelled | unknown
    */
  var status: code = js.native
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[String] = js.native
}

object CarePlanActivityDetail {
  @scala.inline
  def apply(status: code): CarePlanActivityDetail = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlanActivityDetail]
  }
  @scala.inline
  implicit class CarePlanActivityDetailOps[Self <: CarePlanActivityDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_prohibited(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prohibited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_prohibited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prohibited")(js.undefined)
        ret
    }
    @scala.inline
    def with_scheduledString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scheduledString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_scheduledString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scheduledString")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def with_statusReason(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_statusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_statusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_statusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withDailyAmount(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGoal(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goal")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformer(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withProductReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productReference")(js.undefined)
        ret
    }
    @scala.inline
    def withProhibited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prohibited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProhibited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prohibited")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonReference(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledString")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(js.undefined)
        ret
    }
  }
  
}

