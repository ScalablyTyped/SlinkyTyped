package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The budget object that you want to create.
    */
  var Budget: typingsSlinky.awsSdk.budgetsMod.Budget = js.native
  /**
    * A notification that you want to associate with a budget. A budget can have up to five notifications, and each notification can have one SNS subscriber and up to 10 email subscribers. If you include notifications and subscribers in your CreateBudget call, AWS creates the notifications and subscribers for you.
    */
  var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.native
}

object CreateBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, Budget: Budget): CreateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Budget = Budget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBudgetRequest]
  }
  @scala.inline
  implicit class CreateBudgetRequestOps[Self <: CreateBudgetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBudget(value: Budget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationsWithSubscribers(value: NotificationWithSubscribersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationsWithSubscribers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsWithSubscribers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationsWithSubscribers")(js.undefined)
        ret
    }
  }
  
}

