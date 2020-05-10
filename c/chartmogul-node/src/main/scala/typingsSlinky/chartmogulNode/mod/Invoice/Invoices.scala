package typingsSlinky.chartmogulNode.mod.Invoice

import typingsSlinky.chartmogulNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoices extends Cursor {
  var customer_uuid: js.UndefOr[String] = js.native
  var invoices: js.Array[typingsSlinky.chartmogulNode.mod.Invoice.Invoice] = js.native
}

object Invoices {
  @scala.inline
  def apply(invoices: js.Array[typingsSlinky.chartmogulNode.mod.Invoice.Invoice]): Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoices]
  }
  @scala.inline
  implicit class InvoicesOps[Self <: Invoices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvoices(value: js.Array[typingsSlinky.chartmogulNode.mod.Invoice.Invoice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_uuid")(js.undefined)
        ret
    }
  }
  
}

