package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The price rate indicating starting usage and its corresponding price.
  */
@js.native
trait SchemaTierRate extends js.Object {
  /**
    * Usage is priced at this rate only after this amount. Example:
    * start_usage_amount of 10 indicates that the usage will be priced at the
    * unit_price after the first 10 usage_units.
    */
  var startUsageAmount: js.UndefOr[Double] = js.native
  /**
    * The price per unit of usage. Example: unit_price of amount $10 indicates
    * that each unit will cost $10.
    */
  var unitPrice: js.UndefOr[SchemaMoney] = js.native
}

object SchemaTierRate {
  @scala.inline
  def apply(): SchemaTierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTierRate]
  }
  @scala.inline
  implicit class SchemaTierRateOps[Self <: SchemaTierRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartUsageAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startUsageAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartUsageAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startUsageAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPrice(value: SchemaMoney): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(js.undefined)
        ret
    }
  }
  
}

