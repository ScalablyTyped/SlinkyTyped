package typingsSlinky.firebaseAdmin.admin.messaging

import typingsSlinky.firebaseAdmin.admin.FirebaseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the status of a message sent to an individual device
  * via the FCM legacy APIs.
  *
  * See
  * [Send to individual devices](/docs/cloud-messaging/admin/send-messages#send_to_individual_devices)
  * for code samples and detailed documentation.
  */
@js.native
trait MessagingDeviceResult extends js.Object {
  /**
    * The canonical registration token for the client app that the message was
    * processed and sent to. You should use this value as the registration token
    * for future requests. Otherwise, future messages might be rejected.
    */
  var canonicalRegistrationToken: js.UndefOr[String] = js.native
  /**
    * The error that occurred when processing the message for the recipient.
    */
  var error: js.UndefOr[FirebaseError] = js.native
  /**
    * A unique ID for the successfully processed message.
    */
  var messageId: js.UndefOr[String] = js.native
}

object MessagingDeviceResult {
  @scala.inline
  def apply(): MessagingDeviceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingDeviceResult]
  }
  @scala.inline
  implicit class MessagingDeviceResultOps[Self <: MessagingDeviceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonicalRegistrationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalRegistrationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalRegistrationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalRegistrationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: FirebaseError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
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
  }
  
}

