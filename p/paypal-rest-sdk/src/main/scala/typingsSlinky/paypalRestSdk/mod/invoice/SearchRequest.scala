package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchRequest extends js.Object {
  var archived: js.UndefOr[Boolean] = js.native
  var email: js.UndefOr[String] = js.native
  var end_creation_date: js.UndefOr[String] = js.native
  var end_due_date: js.UndefOr[String] = js.native
  var end_invoice_date: js.UndefOr[String] = js.native
  var end_payment_date: js.UndefOr[String] = js.native
  var lower_total_amount: js.UndefOr[Currency] = js.native
  var number: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var page_size: js.UndefOr[Double] = js.native
  var recipient_business_name: js.UndefOr[String] = js.native
  var recipient_first_name: js.UndefOr[String] = js.native
  var recipient_last_name: js.UndefOr[String] = js.native
  var start_creation_date: js.UndefOr[String] = js.native
  var start_due_date: js.UndefOr[String] = js.native
  var start_invoice_date: js.UndefOr[String] = js.native
  var start_payment_date: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var total_count_required: js.UndefOr[Boolean] = js.native
  var upper_total_amount: js.UndefOr[Currency] = js.native
}

object SearchRequest {
  @scala.inline
  def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  @scala.inline
  implicit class SearchRequestOps[Self <: SearchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_creation_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_creation_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_creation_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_creation_date")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_due_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_due_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_due_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_due_date")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_invoice_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_invoice_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_invoice_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_invoice_date")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_payment_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_payment_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_payment_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_payment_date")(js.undefined)
        ret
    }
    @scala.inline
    def withLower_total_amount(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower_total_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLower_total_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower_total_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient_business_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_business_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient_business_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_business_name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient_first_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient_first_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_first_name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient_last_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient_last_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_last_name")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_creation_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_creation_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_creation_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_creation_date")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_due_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_due_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_due_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_due_date")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_invoice_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_invoice_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_invoice_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_invoice_date")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_payment_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_payment_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_payment_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_payment_date")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_count_required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_count_required: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count_required")(js.undefined)
        ret
    }
    @scala.inline
    def withUpper_total_amount(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper_total_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpper_total_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper_total_amount")(js.undefined)
        ret
    }
  }
  
}

