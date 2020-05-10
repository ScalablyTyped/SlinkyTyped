package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterprisesSendTestPushNotificationResponse extends js.Object {
  /** The message ID of the test push notification that was sent. */
  var messageId: js.UndefOr[String] = js.native
  /** The name of the Cloud Pub/Sub topic to which notifications for this enterprise's enrolled account will be sent. */
  var topicName: js.UndefOr[String] = js.native
}

object EnterprisesSendTestPushNotificationResponse {
  @scala.inline
  def apply(): EnterprisesSendTestPushNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterprisesSendTestPushNotificationResponse]
  }
  @scala.inline
  implicit class EnterprisesSendTestPushNotificationResponseOps[Self <: EnterprisesSendTestPushNotificationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(js.undefined)
        ret
    }
  }
  
}

