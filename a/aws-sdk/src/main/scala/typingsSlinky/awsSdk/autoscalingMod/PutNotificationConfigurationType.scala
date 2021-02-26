package typingsSlinky.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutNotificationConfigurationType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The type of event that causes the notification to be sent. To query the notification types supported by Amazon EC2 Auto Scaling, call the DescribeAutoScalingNotificationTypes API.
    */
  var NotificationTypes: AutoScalingNotificationTypes = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
    */
  var TopicARN: ResourceName = js.native
}
object PutNotificationConfigurationType {
  
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    NotificationTypes: AutoScalingNotificationTypes,
    TopicARN: ResourceName
  ): PutNotificationConfigurationType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], NotificationTypes = NotificationTypes.asInstanceOf[js.Any], TopicARN = TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutNotificationConfigurationType]
  }
  
  @scala.inline
  implicit class PutNotificationConfigurationTypeMutableBuilder[Self <: PutNotificationConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypes(value: AutoScalingNotificationTypes): Self = StObject.set(x, "NotificationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "NotificationTypes", js.Array(value :_*))
    
    @scala.inline
    def setTopicARN(value: ResourceName): Self = StObject.set(x, "TopicARN", value.asInstanceOf[js.Any])
  }
}
