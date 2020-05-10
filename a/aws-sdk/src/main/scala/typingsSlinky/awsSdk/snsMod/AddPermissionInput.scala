package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionInput extends js.Object {
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
  implicit class AddPermissionInputOps[Self <: AddPermissionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAWSAccountId(value: DelegatesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionName(value: ActionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: topicARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

