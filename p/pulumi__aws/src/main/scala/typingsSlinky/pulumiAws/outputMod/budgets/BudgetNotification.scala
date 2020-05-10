package typingsSlinky.pulumiAws.outputMod.budgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetNotification extends js.Object {
  /**
    * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
    */
  var comparisonOperator: String = js.native
  /**
    * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
    */
  var notificationType: String = js.native
  /**
    * (Optional) E-Mail addresses to notify. Either this or `subscriberSnsTopicArns` is required.
    */
  var subscriberEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Optional) SNS topics to notify. Either this or `subscriberEmailAddresses` is required.
    */
  var subscriberSnsTopicArns: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Required) Threshold when the notification should be sent.
    */
  var threshold: Double = js.native
  /**
    * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
    */
  var thresholdType: String = js.native
}

object BudgetNotification {
  @scala.inline
  def apply(comparisonOperator: String, notificationType: String, threshold: Double, thresholdType: String): BudgetNotification = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], thresholdType = thresholdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetNotification]
  }
  @scala.inline
  implicit class BudgetNotificationOps[Self <: BudgetNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThresholdType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriberEmailAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberEmailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriberEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberEmailAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriberSnsTopicArns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberSnsTopicArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriberSnsTopicArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberSnsTopicArns")(js.undefined)
        ret
    }
  }
  
}

