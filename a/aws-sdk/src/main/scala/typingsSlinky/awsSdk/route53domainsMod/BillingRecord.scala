package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingRecord extends js.Object {
  /**
    * The date that the operation was billed, in Unix format.
    */
  var BillDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more information, see DNS Domain Name Format in the Amazon Route 53 Developer Guidezzz.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.DomainName] = js.native
  /**
    * The ID of the invoice that is associated with the billing record.
    */
  var InvoiceId: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.InvoiceId] = js.native
  /**
    * The operation that you were charged for.
    */
  var Operation: js.UndefOr[OperationType] = js.native
  /**
    * The price that you were charged for the operation, in US dollars. Example value: 12.0
    */
  var Price: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.Price] = js.native
}

object BillingRecord {
  @scala.inline
  def apply(): BillingRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingRecord]
  }
  @scala.inline
  implicit class BillingRecordOps[Self <: BillingRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoiceId(value: InvoiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvoiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvoiceId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: OperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Price")(js.undefined)
        ret
    }
  }
  
}

