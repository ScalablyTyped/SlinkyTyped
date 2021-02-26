package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationChannel extends StObject {
  
  /**
    * The ARN of an IAM role that gives Amazon Rekognition publishing permissions to the Amazon SNS topic. 
    */
  var RoleArn: typingsSlinky.awsSdk.rekognitionMod.RoleArn = js.native
  
  /**
    * The Amazon SNS topic to which Amazon Rekognition to posts the completion status.
    */
  var SNSTopicArn: typingsSlinky.awsSdk.rekognitionMod.SNSTopicArn = js.native
}
object NotificationChannel {
  
  @scala.inline
  def apply(RoleArn: RoleArn, SNSTopicArn: SNSTopicArn): NotificationChannel = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannel]
  }
  
  @scala.inline
  implicit class NotificationChannelMutableBuilder[Self <: NotificationChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNSTopicArn(value: SNSTopicArn): Self = StObject.set(x, "SNSTopicArn", value.asInstanceOf[js.Any])
  }
}
