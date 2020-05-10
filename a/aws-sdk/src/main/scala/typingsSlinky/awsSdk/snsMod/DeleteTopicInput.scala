package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTopicInput extends js.Object {
  /**
    * The ARN of the topic you want to delete.
    */
  var TopicArn: topicARN = js.native
}

object DeleteTopicInput {
  @scala.inline
  def apply(TopicArn: topicARN): DeleteTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicInput]
  }
  @scala.inline
  implicit class DeleteTopicInputOps[Self <: DeleteTopicInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopicArn(value: topicARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

