package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  var amount: Amount = js.native
  val create_time: js.UndefOr[String] = js.native
  val fmf_details: js.UndefOr[FraudManagementFiltersDetails] = js.native
  val id: String = js.native
  val links: js.UndefOr[js.Array[Link]] = js.native
  val parent_payment: js.UndefOr[String] = js.native
  val payment_mode: js.UndefOr[String] = js.native
  val processor_response: js.UndefOr[js.Any] = js.native
  val protection_eligibility: js.UndefOr[String] = js.native
  val protection_eligibility_type: js.UndefOr[String] = js.native
  val reason_code: js.UndefOr[String] = js.native
  val receipt_id: js.UndefOr[String] = js.native
  val state: js.UndefOr[String] = js.native
  val update_time: js.UndefOr[String] = js.native
}

object Resource {
  @scala.inline
  def apply(amount: Amount, id: String): Resource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(js.undefined)
        ret
    }
    @scala.inline
    def withFmf_details(value: FraudManagementFiltersDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmf_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFmf_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmf_details")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[Link]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withParent_payment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent_payment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_payment")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_mode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessor_response(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessor_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor_response")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection_eligibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_eligibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection_eligibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_eligibility")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection_eligibility_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_eligibility_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection_eligibility_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_eligibility_type")(js.undefined)
        ret
    }
    @scala.inline
    def withReason_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason_code")(js.undefined)
        ret
    }
    @scala.inline
    def withReceipt_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceipt_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_id")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_time")(js.undefined)
        ret
    }
  }
  
}

