package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.gcm.GcmErrorEvent
import typingsSlinky.chrome.chrome.gcm.MessageDeletionEvent
import typingsSlinky.chrome.chrome.gcm.MessageReceptionEvent
import typingsSlinky.chrome.chrome.gcm.OutgoingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofgcm extends js.Object {
  var MAX_MESSAGE_SIZE: Double = js.native
  var onMessage: MessageReceptionEvent = js.native
  var onMessagesDeleted: MessageDeletionEvent = js.native
  var onSendError: GcmErrorEvent = js.native
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = js.native
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit = js.native
  def unregister(callback: js.Function0[Unit]): Unit = js.native
}

object Typeofgcm {
  @scala.inline
  def apply(
    MAX_MESSAGE_SIZE: Double,
    onMessage: MessageReceptionEvent,
    onMessagesDeleted: MessageDeletionEvent,
    onSendError: GcmErrorEvent,
    register: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Unit,
    send: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Unit,
    unregister: js.Function0[Unit] => Unit
  ): Typeofgcm = {
    val __obj = js.Dynamic.literal(MAX_MESSAGE_SIZE = MAX_MESSAGE_SIZE.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], onMessagesDeleted = onMessagesDeleted.asInstanceOf[js.Any], onSendError = onSendError.asInstanceOf[js.Any], register = js.Any.fromFunction2(register), send = js.Any.fromFunction2(send), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[Typeofgcm]
  }
  @scala.inline
  implicit class TypeofgcmOps[Self <: Typeofgcm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAX_MESSAGE_SIZE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_MESSAGE_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMessage(value: MessageReceptionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMessagesDeleted(value: MessageDeletionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessagesDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSendError(value: GcmErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSendError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegister(value: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSend(value: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnregister(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

