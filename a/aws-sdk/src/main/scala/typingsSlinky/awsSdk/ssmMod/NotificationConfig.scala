package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfig extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var NotificationArn: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationArn] = js.native
  
  /**
    * The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see Monitoring Systems Manager status changes using Amazon SNS notifications in the AWS Systems Manager User Guide.
    */
  var NotificationEvents: js.UndefOr[NotificationEventList] = js.native
  
  /**
    * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. 
    */
  var NotificationType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationType] = js.native
}
object NotificationConfig {
  
  @scala.inline
  def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  
  @scala.inline
  implicit class NotificationConfigMutableBuilder[Self <: NotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationArn(value: NotificationArn): Self = StObject.set(x, "NotificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationArnUndefined: Self = StObject.set(x, "NotificationArn", js.undefined)
    
    @scala.inline
    def setNotificationEvents(value: NotificationEventList): Self = StObject.set(x, "NotificationEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEventsUndefined: Self = StObject.set(x, "NotificationEvents", js.undefined)
    
    @scala.inline
    def setNotificationEventsVarargs(value: NotificationEvent*): Self = StObject.set(x, "NotificationEvents", js.Array(value :_*))
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "NotificationType", js.undefined)
  }
}
