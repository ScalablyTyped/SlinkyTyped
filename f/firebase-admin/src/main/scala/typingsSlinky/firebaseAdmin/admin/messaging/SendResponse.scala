package typingsSlinky.firebaseAdmin.admin.messaging

import typingsSlinky.firebaseAdmin.admin.FirebaseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the status of an individual message that was sent as
  * part of a batch request.
  */
@js.native
trait SendResponse extends js.Object {
  /**
    * An error, if the message was not handed off to FCM successfully.
    */
  var error: js.UndefOr[FirebaseError] = js.native
  /**
    * A unique message ID string, if the message was handed off to FCM for
    * delivery.
    *
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * A boolean indicating if the message was successfully handed off to FCM or
    * not. When true, the `messageId` attribute is guaranteed to be set. When
    * false, the `error` attribute is guaranteed to be set.
    */
  var success: Boolean = js.native
}

object SendResponse {
  @scala.inline
  def apply(success: Boolean): SendResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendResponse]
  }
  @scala.inline
  implicit class SendResponseOps[Self <: SendResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
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

