package typingsSlinky.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendEmail action. 
    */
  var MessageId: typingsSlinky.awsDashSdk.clientsSesMod.MessageId = js.native
}

object SendEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendEmailResponse]
  }
}

