package typingsSlinky.paystack.mod

import typingsSlinky.paystack.AnonCharge
import typingsSlinky.paystack.AnonCreate
import typingsSlinky.paystack.AnonDisable
import typingsSlinky.paystack.AnonGet
import typingsSlinky.paystack.AnonList
import typingsSlinky.paystack.AnonListbanks
import typingsSlinky.paystack.AnonUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  var customer: AnonCreate = js.native
  var misc: AnonListbanks = js.native
  var page: AnonGet = js.native
  var plan: AnonList = js.native
  var subaccount: AnonUpdate = js.native
  var subscription: AnonDisable = js.native
  var transaction: AnonCharge = js.native
}

object Object {
  @scala.inline
  def apply(
    customer: AnonCreate,
    misc: AnonListbanks,
    page: AnonGet,
    plan: AnonList,
    subaccount: AnonUpdate,
    subscription: AnonDisable,
    transaction: AnonCharge
  ): Object = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], subaccount = subaccount.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: AnonCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMisc(value: AnonListbanks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: AnonGet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: AnonList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubaccount(value: AnonUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: AnonDisable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction(value: AnonCharge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

