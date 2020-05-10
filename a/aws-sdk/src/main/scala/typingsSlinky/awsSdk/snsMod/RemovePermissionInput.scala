package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionInput extends js.Object {
  /**
    * The unique label of the statement you want to remove.
    */
  var Label: label = js.native
  /**
    * The ARN of the topic whose access control policy you wish to modify.
    */
  var TopicArn: topicARN = js.native
}

object RemovePermissionInput {
  @scala.inline
  def apply(Label: label, TopicArn: topicARN): RemovePermissionInput = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionInput]
  }
  @scala.inline
  implicit class RemovePermissionInputOps[Self <: RemovePermissionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

