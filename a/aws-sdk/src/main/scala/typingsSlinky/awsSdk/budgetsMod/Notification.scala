package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  /**
    * The comparison that is used for this notification.
    */
  var ComparisonOperator: typingsSlinky.awsSdk.budgetsMod.ComparisonOperator = js.native
  /**
    * Whether this notification is in alarm. If a budget notification is in the ALARM state, you have passed the set threshold for the budget.
    */
  var NotificationState: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.NotificationState] = js.native
  /**
    * Whether the notification is for how much you have spent (ACTUAL) or for how much you're forecasted to spend (FORECASTED).
    */
  var NotificationType: typingsSlinky.awsSdk.budgetsMod.NotificationType = js.native
  /**
    * The threshold that is associated with a notification. Thresholds are always a percentage.
    */
  var Threshold: NotificationThreshold = js.native
  /**
    * The type of threshold for a notification. For ABSOLUTE_VALUE thresholds, AWS notifies you when you go over or are forecasted to go over your total cost threshold. For PERCENTAGE thresholds, AWS notifies you when you go over or are forecasted to go over a certain percentage of your forecasted spend. For example, if you have a budget for 200 dollars and you have a PERCENTAGE threshold of 80%, AWS notifies you when you go over 160 dollars.
    */
  var ThresholdType: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.ThresholdType] = js.native
}

object Notification {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    NotificationType: NotificationType,
    Threshold: NotificationThreshold
  ): Notification = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationType(value: NotificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: NotificationThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationState(value: NotificationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationState")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdType(value: ThresholdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdType")(js.undefined)
        ret
    }
  }
  
}

