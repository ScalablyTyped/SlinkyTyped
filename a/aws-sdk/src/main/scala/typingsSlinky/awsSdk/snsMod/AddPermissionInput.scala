package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPermissionInput extends StObject {
  
  /**
    * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must have AWS accounts, but do not need to be signed up for this service.
    */
  var AWSAccountId: DelegatesList = js.native
  
  /**
    * The action you want to allow for the specified principal(s). Valid values: Any Amazon SNS action name, for example Publish.
    */
  var ActionName: ActionsList = js.native
  
  /**
    * A unique identifier for the new policy statement.
    */
  var Label: label = js.native
  
  /**
    * The ARN of the topic whose access control policy you wish to modify.
    */
  var TopicArn: topicARN = js.native
}
object AddPermissionInput {
  
  @scala.inline
  def apply(AWSAccountId: DelegatesList, ActionName: ActionsList, Label: label, TopicArn: topicARN): AddPermissionInput = {
    val __obj = js.Dynamic.literal(AWSAccountId = AWSAccountId.asInstanceOf[js.Any], ActionName = ActionName.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionInput]
  }
  
  @scala.inline
  implicit class AddPermissionInputMutableBuilder[Self <: AddPermissionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAWSAccountId(value: DelegatesList): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSAccountIdVarargs(value: delegate*): Self = StObject.set(x, "AWSAccountId", js.Array(value :_*))
    
    @scala.inline
    def setActionName(value: ActionsList): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameVarargs(value: action*): Self = StObject.set(x, "ActionName", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
