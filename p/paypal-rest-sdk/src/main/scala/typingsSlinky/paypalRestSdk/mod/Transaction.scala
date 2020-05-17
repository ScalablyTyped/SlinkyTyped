package typingsSlinky.paypalRestSdk.mod

import typingsSlinky.paypalRestSdk.anon.Allowedpaymentmethod
import typingsSlinky.paypalRestSdk.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var amount: Amount = js.native
  var custom: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var invoice_number: js.UndefOr[String] = js.native
  var item_list: js.UndefOr[Items] = js.native
  var note_to_payee: js.UndefOr[String] = js.native
  var notify_url: js.UndefOr[String] = js.native
  var order_url: js.UndefOr[String] = js.native
  var payee: js.UndefOr[Payee] = js.native
  var payment_options: js.UndefOr[Allowedpaymentmethod] = js.native
  var purchase_order: js.UndefOr[String] = js.native
  var reference_id: js.UndefOr[String] = js.native
  val related_resources: js.UndefOr[js.Array[RelatedResources]] = js.native
  var soft_descriptor: js.UndefOr[String] = js.native
}

object Transaction {
  @scala.inline
  def apply(amount: Amount): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
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
    def withCustom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
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
    def withInvoice_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_number")(js.undefined)
        ret
    }
    @scala.inline
    def withItem_list(value: Items): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem_list: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_list")(js.undefined)
        ret
    }
    @scala.inline
    def withNote_to_payee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_to_payee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote_to_payee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_to_payee")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify_url")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_url")(js.undefined)
        ret
    }
    @scala.inline
    def withPayee(value: Payee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_options(value: Allowedpaymentmethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_options")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchase_order(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchase_order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase_order")(js.undefined)
        ret
    }
    @scala.inline
    def withReference_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference_id")(js.undefined)
        ret
    }
    @scala.inline
    def withRelated_resources(value: js.Array[RelatedResources]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related_resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelated_resources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related_resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSoft_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soft_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoft_descriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soft_descriptor")(js.undefined)
        ret
    }
  }
  
}

