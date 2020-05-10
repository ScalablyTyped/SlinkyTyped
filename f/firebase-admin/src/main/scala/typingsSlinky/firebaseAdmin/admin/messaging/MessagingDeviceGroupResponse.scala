package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendToDeviceGroup `sendToDeviceGroup()`}
  * method.
  *
  * See
  * [Send messages to device groups](/docs/cloud-messaging/send-message?authuser=0#send_messages_to_device_groups)
  * for code samples and detailed documentation.
  */
@js.native
trait MessagingDeviceGroupResponse extends js.Object {
  /**
    * An array of registration tokens that failed to receive the message.
    */
  var failedRegistrationTokens: js.Array[String] = js.native
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var failureCount: Double = js.native
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var successCount: Double = js.native
}

object MessagingDeviceGroupResponse {
  @scala.inline
  def apply(failedRegistrationTokens: js.Array[String], failureCount: Double, successCount: Double): MessagingDeviceGroupResponse = {
    val __obj = js.Dynamic.literal(failedRegistrationTokens = failedRegistrationTokens.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingDeviceGroupResponse]
  }
  @scala.inline
  implicit class MessagingDeviceGroupResponseOps[Self <: MessagingDeviceGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedRegistrationTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedRegistrationTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

