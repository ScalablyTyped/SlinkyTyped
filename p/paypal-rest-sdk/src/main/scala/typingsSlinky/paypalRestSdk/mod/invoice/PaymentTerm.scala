package typingsSlinky.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentTerm extends js.Object {
  var due_date: js.UndefOr[String] = js.native
  var term_type: js.UndefOr[String] = js.native
}

object PaymentTerm {
  @scala.inline
  def apply(): PaymentTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentTerm]
  }
  @scala.inline
  implicit class PaymentTermOps[Self <: PaymentTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDue_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDue_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_date")(js.undefined)
        ret
    }
    @scala.inline
    def withTerm_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerm_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term_type")(js.undefined)
        ret
    }
  }
  
}

