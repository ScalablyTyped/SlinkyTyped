package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationsInstance extends js.Object {
  def registerFileAttachmentCardViewHandler(handler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit]): js.Function0[Unit] = js.native
  def registerMessageViewHandler(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit] = js.native
  def registerMessageViewHandlerAll(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit] = js.native
  def registerThreadViewHandler(handler: js.Function1[/* threadView */ ThreadView, Unit]): js.Function0[Unit] = js.native
}

object ConversationsInstance {
  @scala.inline
  def apply(
    registerFileAttachmentCardViewHandler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => js.Function0[Unit],
    registerMessageViewHandler: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerMessageViewHandlerAll: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerThreadViewHandler: js.Function1[/* threadView */ ThreadView, Unit] => js.Function0[Unit]
  ): ConversationsInstance = {
    val __obj = js.Dynamic.literal(registerFileAttachmentCardViewHandler = js.Any.fromFunction1(registerFileAttachmentCardViewHandler), registerMessageViewHandler = js.Any.fromFunction1(registerMessageViewHandler), registerMessageViewHandlerAll = js.Any.fromFunction1(registerMessageViewHandlerAll), registerThreadViewHandler = js.Any.fromFunction1(registerThreadViewHandler))
    __obj.asInstanceOf[ConversationsInstance]
  }
  @scala.inline
  implicit class ConversationsInstanceOps[Self <: ConversationsInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterFileAttachmentCardViewHandler(value: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerFileAttachmentCardViewHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterMessageViewHandler(value: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerMessageViewHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterMessageViewHandlerAll(value: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerMessageViewHandlerAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterThreadViewHandler(value: js.Function1[/* threadView */ ThreadView, Unit] => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerThreadViewHandler")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

