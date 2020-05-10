package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to delete.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget whose subscriber you want to delete.
    */
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * The notification whose subscriber you want to delete.
    */
  var Notification: typingsSlinky.awsSdk.budgetsMod.Notification = js.native
  /**
    * The subscriber that you want to delete.
    */
  var Subscriber: typingsSlinky.awsSdk.budgetsMod.Subscriber = js.native
}

object DeleteSubscriberRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): DeleteSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscriber = Subscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriberRequest]
  }
  @scala.inline
  implicit class DeleteSubscriberRequestOps[Self <: DeleteSubscriberRequest] (val x: Self) extends AnyVal {
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
    def withNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriber(value: Subscriber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

