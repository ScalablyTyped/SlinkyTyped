package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem extends js.Object {
  var account: AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount = js.native
  var billing_cycle: String = js.native
  var free_trial_ends_on: String = js.native
  var next_billing_date: String = js.native
  var on_free_trial: Boolean = js.native
  var plan: AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemPlan = js.native
  var unit_count: Null = js.native
  var updated_at: String = js.native
}

object AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem {
  @scala.inline
  def apply(
    account: AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount,
    billing_cycle: String,
    free_trial_ends_on: String,
    next_billing_date: String,
    on_free_trial: Boolean,
    plan: AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemPlan,
    unit_count: Null,
    updated_at: String
  ): AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], billing_cycle = billing_cycle.asInstanceOf[js.Any], free_trial_ends_on = free_trial_ends_on.asInstanceOf[js.Any], next_billing_date = next_billing_date.asInstanceOf[js.Any], on_free_trial = on_free_trial.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem]
  }
  @scala.inline
  implicit class AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemOps[Self <: AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_cycle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_cycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFree_trial_ends_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free_trial_ends_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_billing_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_billing_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_free_trial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_free_trial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItemPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit_count(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

