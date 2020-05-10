package typingsSlinky.firebaseAdmin.admin.messaging

import typingsSlinky.firebaseAdmin.admin.FirebaseArrayIndexError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#subscribeToTopic `subscribeToTopic()`} and
  * {@link
  *   admin.messaging.Messaging#unsubscribeFromTopic
  *   `unsubscribeFromTopic()`}
  * methods.
  *
  * See
  * [Manage topics from the server](/docs/cloud-messaging/manage-topics)
  * for code samples and detailed documentation.
  */
@js.native
trait MessagingTopicManagementResponse extends js.Object {
  /**
    * An array of errors corresponding to the provided registration token(s). The
    * length of this array will be equal to [`failureCount`](#failureCount).
    */
  var errors: js.Array[FirebaseArrayIndexError] = js.native
  /**
    * The number of registration tokens that could not be subscribed to the topic
    * and resulted in an error.
    */
  var failureCount: Double = js.native
  /**
    * The number of registration tokens that were successfully subscribed to the
    * topic.
    */
  var successCount: Double = js.native
}

object MessagingTopicManagementResponse {
  @scala.inline
  def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): MessagingTopicManagementResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingTopicManagementResponse]
  }
  @scala.inline
  implicit class MessagingTopicManagementResponseOps[Self <: MessagingTopicManagementResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[FirebaseArrayIndexError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
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

