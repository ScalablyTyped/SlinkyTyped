package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends StObject {
  
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
    * The threshold that is associated with a notification. Thresholds are always a percentage, and many customers find value being alerted between 50% - 200% of the budgeted amount. The maximum limit for your threshold is 1,000,000% above the budgeted amount.
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
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationState(value: NotificationState): Self = StObject.set(x, "NotificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationStateUndefined: Self = StObject.set(x, "NotificationState", js.undefined)
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: NotificationThreshold): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdType(value: ThresholdType): Self = StObject.set(x, "ThresholdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdTypeUndefined: Self = StObject.set(x, "ThresholdType", js.undefined)
  }
}
