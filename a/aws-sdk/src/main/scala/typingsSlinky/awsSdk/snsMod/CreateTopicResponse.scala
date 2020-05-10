package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTopicResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the created topic.
    */
  var TopicArn: js.UndefOr[topicARN] = js.native
}

object CreateTopicResponse {
  @scala.inline
  def apply(): CreateTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicResponse]
  }
  @scala.inline
  implicit class CreateTopicResponseOps[Self <: CreateTopicResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(js.undefined)
        ret
    }
  }
  
}

