package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAmount extends js.Object {
  /**
    * [required] The pre-tax or post-tax price depending on the location of the
    * order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * [required] Tax value.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
}

object SchemaAmount {
  @scala.inline
  def apply(): SchemaAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmount]
  }
  @scala.inline
  implicit class SchemaAmountOps[Self <: SchemaAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriceAmount(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxAmount(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(js.undefined)
        ret
    }
  }
  
}

