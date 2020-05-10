package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscountAddRequest extends js.Object {
  var amount: js.UndefOr[String] = js.native
  var inheritedFromId: String = js.native
  var neverExpires: js.UndefOr[Boolean] = js.native
  var numberOfBillingCycles: js.UndefOr[Double] = js.native
  var quantity: js.UndefOr[Double] = js.native
}

object DiscountAddRequest {
  @scala.inline
  def apply(inheritedFromId: String): DiscountAddRequest = {
    val __obj = js.Dynamic.literal(inheritedFromId = inheritedFromId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountAddRequest]
  }
  @scala.inline
  implicit class DiscountAddRequestOps[Self <: DiscountAddRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInheritedFromId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFromId")(value.asInstanceOf[js.Any])
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

