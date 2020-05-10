package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose notification you want to update.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget whose notification you want to update.
    */
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * The updated notification to be associated with a budget.
    */
  var NewNotification: Notification = js.native
  /**
    * The previous notification that is associated with a budget.
    */
  var OldNotification: Notification = js.native
}

object UpdateNotificationRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewNotification: Notification,
    OldNotification: Notification
  ): UpdateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewNotification = NewNotification.asInstanceOf[js.Any], OldNotification = OldNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRequest]
  }
  @scala.inline
  implicit class UpdateNotificationRequestOps[Self <: UpdateNotificationRequest] (val x: Self) extends AnyVal {
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
    def withBudgetName(value: BudgetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldNotification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

