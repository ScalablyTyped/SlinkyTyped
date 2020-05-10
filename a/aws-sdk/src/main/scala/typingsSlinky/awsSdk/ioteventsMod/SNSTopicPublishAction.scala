package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSTopicPublishAction extends js.Object {
  /**
    * The ARN of the Amazon SNS target where the message is sent.
    */
  var targetArn: AmazonResourceName = js.native
}

object SNSTopicPublishAction {
  @scala.inline
  def apply(targetArn: AmazonResourceName): SNSTopicPublishAction = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSTopicPublishAction]
  }
  @scala.inline
  implicit class SNSTopicPublishActionOps[Self <: SNSTopicPublishAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

