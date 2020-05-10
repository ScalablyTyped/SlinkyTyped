package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonBillingId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetResource extends js.Object {
  /** Returns the budget information for the adgroup specified by the accountId and billingId. */
  def get(request: AnonBillingId): Request_[Budget] = js.native
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method
    * supports patch semantics.
    */
  def patch(request: AnonBillingId): Request_[Budget] = js.native
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. */
  def update(request: AnonBillingId): Request_[Budget] = js.native
}

object BudgetResource {
  @scala.inline
  def apply(
    get: AnonBillingId => Request_[Budget],
    patch: AnonBillingId => Request_[Budget],
    update: AnonBillingId => Request_[Budget]
  ): BudgetResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BudgetResource]
  }
  @scala.inline
  implicit class BudgetResourceOps[Self <: BudgetResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonBillingId => Request_[Budget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonBillingId => Request_[Budget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBillingId => Request_[Budget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

