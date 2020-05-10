package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInvoiceSummaryAdditionalChargeSummary extends js.Object {
  /**
    * [required] Total additional charge for this type.
    */
  var totalAmount: js.UndefOr[SchemaAmount] = js.native
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInvoiceSummaryAdditionalChargeSummary {
  @scala.inline
  def apply(): SchemaInvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummaryAdditionalChargeSummary]
  }
  @scala.inline
  implicit class SchemaInvoiceSummaryAdditionalChargeSummaryOps[Self <: SchemaInvoiceSummaryAdditionalChargeSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalAmount(value: SchemaAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

