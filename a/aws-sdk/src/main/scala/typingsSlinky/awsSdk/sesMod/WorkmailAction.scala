package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkmailAction extends StObject {
  
  /**
    * The ARN of the Amazon WorkMail organization. An example of an Amazon WorkMail organization ARN is arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7. For information about Amazon WorkMail organizations, see the Amazon WorkMail Administrator Guide.
    */
  var OrganizationArn: AmazonResourceName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the WorkMail action is called. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.native
}
object WorkmailAction {
  
  @scala.inline
  def apply(OrganizationArn: AmazonResourceName): WorkmailAction = {
    val __obj = js.Dynamic.literal(OrganizationArn = OrganizationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkmailAction]
  }
  
  @scala.inline
  implicit class WorkmailActionMutableBuilder[Self <: WorkmailAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationArn(value: AmazonResourceName): Self = StObject.set(x, "OrganizationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArn(value: AmazonResourceName): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
