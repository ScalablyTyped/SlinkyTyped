package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.AnonAddress
import typingsSlinky.paypalRestSdk.AnonCancelledby
import typingsSlinky.paypalRestSdk.AnonOther
import typingsSlinky.paypalRestSdk.mod.Currency
import typingsSlinky.paypalRestSdk.mod.Link
import typingsSlinky.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoice extends js.Object {
  var allow_partial_payment: js.UndefOr[Boolean] = js.native
  var allow_tip: js.UndefOr[Boolean] = js.native
  var attachments: js.UndefOr[js.Array[FileAttachment]] = js.native
  var billing_info: js.UndefOr[js.Array[BillingInfo]] = js.native
  var cc_info: js.UndefOr[js.Array[Participant]] = js.native
  var custom: js.UndefOr[CustomAmount] = js.native
  var discount: js.UndefOr[Cost] = js.native
  val id: js.UndefOr[String] = js.native
  var invoice_date: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[InvoiceItem]] = js.native
  val links: js.UndefOr[js.Array[Link]] = js.native
  var logo_url: js.UndefOr[String] = js.native
  var merchant_info: js.UndefOr[Merchant] = js.native
  var merchant_memo: js.UndefOr[String] = js.native
  val metadata: js.UndefOr[AnonCancelledby] = js.native
  var minimum_amount_due: js.UndefOr[Currency] = js.native
  var note: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  val paid_amount: js.UndefOr[AnonOther] = js.native
  val payment_summary: js.UndefOr[AnonOther] = js.native
  var payment_term: js.UndefOr[PaymentTerm] = js.native
  val payments: js.UndefOr[js.Array[PaymentDetail]] = js.native
  var phone: js.UndefOr[Phone] = js.native
  var reference: js.UndefOr[String] = js.native
  val refunded_amount: js.UndefOr[AnonOther] = js.native
  val refunds: js.UndefOr[js.Array[Detail]] = js.native
  var shipping_cost: js.UndefOr[ShippingCost] = js.native
  var shipping_info: js.UndefOr[AnonAddress] = js.native
  val status: js.UndefOr[String] = js.native
  var tax_calculated_after_discount: js.UndefOr[Boolean] = js.native
  var tax_inclusive: js.UndefOr[Boolean] = js.native
  var template_id: js.UndefOr[String] = js.native
  var terms: js.UndefOr[String] = js.native
  val total_amount: js.UndefOr[Currency] = js.native
  val uri: js.UndefOr[String] = js.native
}

object Invoice {
  @scala.inline
  def apply(): Invoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invoice]
  }
  @scala.inline
  implicit class InvoiceOps[Self <: Invoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_partial_payment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_partial_payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_partial_payment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_partial_payment")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_tip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_tip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_tip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_tip")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[FileAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling_info(value: js.Array[BillingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_info")(js.undefined)
        ret
    }
    @scala.inline
    def withCc_info(value: js.Array[Participant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_info")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: CustomAmount): Self = {
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
    def withDiscount(value: Cost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_date")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[InvoiceItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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
    def withLogo_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_url")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchant_info(value: Merchant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchant_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_info")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchant_memo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_memo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchant_memo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_memo")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: AnonCancelledby): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum_amount_due(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_amount_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum_amount_due: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_amount_due")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
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
    def withPaid_amount(value: AnonOther): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaid_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_summary(value: AnonOther): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_summary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_summary")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_term(value: PaymentTerm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_term: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_term")(js.undefined)
        ret
    }
    @scala.inline
    def withPayments(value: js.Array[PaymentDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payments")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: Phone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withRefunded_amount(value: AnonOther): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunded_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefunded_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunded_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withRefunds(value: js.Array[Detail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_cost(value: ShippingCost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_cost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_cost")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_info(value: AnonAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_info")(js.undefined)
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
    def withTax_calculated_after_discount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_calculated_after_discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_calculated_after_discount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_calculated_after_discount")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_inclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_inclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_inclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_amount(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

