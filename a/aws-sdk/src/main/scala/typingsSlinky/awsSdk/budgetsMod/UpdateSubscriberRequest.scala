package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to update.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget whose subscriber you want to update.
    */
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * The updated subscriber that is associated with a budget notification.
    */
  var NewSubscriber: Subscriber = js.native
  /**
    * The notification whose subscriber you want to update.
    */
  var Notification: typingsSlinky.awsSdk.budgetsMod.Notification = js.native
  /**
    * The previous subscriber that is associated with a budget notification.
    */
  var OldSubscriber: Subscriber = js.native
}

object UpdateSubscriberRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewSubscriber: Subscriber,
    Notification: Notification,
    OldSubscriber: Subscriber
  ): UpdateSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewSubscriber = NewSubscriber.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], OldSubscriber = OldSubscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubscriberRequest]
  }
  @scala.inline
  implicit class UpdateSubscriberRequestOps[Self <: UpdateSubscriberRequest] (val x: Self) extends AnyVal {
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
    def withNewSubscriber(value: Subscriber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewSubscriber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldSubscriber(value: Subscriber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldSubscriber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

