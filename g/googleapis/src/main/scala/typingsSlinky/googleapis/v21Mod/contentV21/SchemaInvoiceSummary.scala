package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInvoiceSummary extends js.Object {
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]] = js.native
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.native
}

object SchemaInvoiceSummary {
  @scala.inline
  def apply(): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
  @scala.inline
  implicit class SchemaInvoiceSummaryOps[Self <: SchemaInvoiceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalChargeSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withProductTotal(value: SchemaAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTotal")(js.undefined)
        ret
    }
  }
  
}

