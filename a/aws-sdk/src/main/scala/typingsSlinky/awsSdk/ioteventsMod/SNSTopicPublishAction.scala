package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SNSTopicPublishAction extends js.Object {
  
  /**
    * You can configure the action payload when you send a message as an Amazon SNS push notification.
    */
  var payload: js.UndefOr[Payload] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetArn(value: AmazonResourceName): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
