package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendAll `sendAll()`} and
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendMulticast `sendMulticast()`} methods.
  */
@js.native
trait BatchResponse extends js.Object {
  /**
    * The number of messages that resulted in errors when sending.
    */
  var failureCount: Double = js.native
  /**
    * An array of responses, each corresponding to a message.
    */
  var responses: js.Array[SendResponse] = js.native
  /**
    * The number of messages that were successfully handed off for sending.
    */
  var successCount: Double = js.native
}

object BatchResponse {
  @scala.inline
  def apply(failureCount: Double, responses: js.Array[SendResponse], successCount: Double): BatchResponse = {
    val __obj = js.Dynamic.literal(failureCount = failureCount.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResponse]
  }
  @scala.inline
  implicit class BatchResponseOps[Self <: BatchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponses(value: js.Array[SendResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
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

