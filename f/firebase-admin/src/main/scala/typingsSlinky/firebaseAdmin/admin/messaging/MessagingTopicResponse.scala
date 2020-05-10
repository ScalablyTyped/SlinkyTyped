package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the legacy
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendToTopic `sendToTopic()`} method.
  *
  * See
  * [Send to a topic](/docs/cloud-messaging/admin/send-messages#send_to_a_topic)
  * for code samples and detailed documentation.
  */
@js.native
trait MessagingTopicResponse extends js.Object {
  /**
    * The message ID for a successfully received request which FCM will attempt to
    * deliver to all subscribed devices.
    */
  var messageId: Double = js.native
}

object MessagingTopicResponse {
  @scala.inline
  def apply(messageId: Double): MessagingTopicResponse = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingTopicResponse]
  }
  @scala.inline
  implicit class MessagingTopicResponseOps[Self <: MessagingTopicResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

