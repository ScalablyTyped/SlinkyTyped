package typingsSlinky.paystack.mod

import typingsSlinky.paystack.anon.Charge
import typingsSlinky.paystack.anon.Create
import typingsSlinky.paystack.anon.Disable
import typingsSlinky.paystack.anon.Get
import typingsSlinky.paystack.anon.List
import typingsSlinky.paystack.anon.Listbanks
import typingsSlinky.paystack.anon.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  var customer: Create = js.native
  var misc: Listbanks = js.native
  var page: Get = js.native
  var plan: List = js.native
  var subaccount: Update = js.native
  var subscription: Disable = js.native
  var transaction: Charge = js.native
}

object Object {
  @scala.inline
  def apply(
    customer: Create,
    misc: Listbanks,
    page: Get,
    plan: List,
    subaccount: Update,
    subscription: Disable,
    transaction: Charge
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
    def withCustomer(value: Create): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMisc(value: Listbanks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Get): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubaccount(value: Update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: Disable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction(value: Charge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

