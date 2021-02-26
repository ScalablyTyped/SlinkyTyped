package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var notificationArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
    */
  var notificationEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
    */
  var notificationType: js.UndefOr[Input[String]] = js.native
}
object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationArn(value: Input[String]): Self = StObject.set(x, "notificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationArnUndefined: Self = StObject.set(x, "notificationArn", js.undefined)
    
    @scala.inline
    def setNotificationEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "notificationEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEventsUndefined: Self = StObject.set(x, "notificationEvents", js.undefined)
    
    @scala.inline
    def setNotificationEventsVarargs(value: Input[String]*): Self = StObject.set(x, "notificationEvents", js.Array(value :_*))
    
    @scala.inline
    def setNotificationType(value: Input[String]): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
  }
}
