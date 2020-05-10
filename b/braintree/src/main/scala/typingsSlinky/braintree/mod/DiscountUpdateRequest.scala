package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscountUpdateRequest extends js.Object {
  var amount: js.UndefOr[String] = js.native
  var existingId: String = js.native
  var neverExpires: js.UndefOr[Boolean] = js.native
  var numberOfBillingCycles: js.UndefOr[Double] = js.native
  var quantity: js.UndefOr[Double] = js.native
}

object DiscountUpdateRequest {
  @scala.inline
  def apply(existingId: String): DiscountUpdateRequest = {
    val __obj = js.Dynamic.literal(existingId = existingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountUpdateRequest]
  }
  @scala.inline
  implicit class DiscountUpdateRequestOps[Self <: DiscountUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExistingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withNeverExpires(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neverExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeverExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neverExpires")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfBillingCycles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBillingCycles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBillingCycles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBillingCycles")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

