package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatOptions extends js.Object {
  var actionClick: js.UndefOr[js.Function1[/* e */ ChatActionClickEvent, Unit]] = js.native
  var messages: js.UndefOr[ChatMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var post: js.UndefOr[js.Function1[/* e */ ChatPostEvent, Unit]] = js.native
  var sendMessage: js.UndefOr[js.Function1[/* e */ ChatSendMessageEvent, Unit]] = js.native
  var typingEnd: js.UndefOr[js.Function1[/* e */ ChatTypingEndEvent, Unit]] = js.native
  var typingStart: js.UndefOr[js.Function1[/* e */ ChatTypingStartEvent, Unit]] = js.native
  var user: js.UndefOr[ChatUser] = js.native
}

object ChatOptions {
  @scala.inline
  def apply(): ChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatOptions]
  }
  @scala.inline
  implicit class ChatOptionsOps[Self <: ChatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionClick(value: /* e */ ChatActionClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: ChatMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: /* e */ ChatPostEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withSendMessage(value: /* e */ ChatSendMessageEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSendMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTypingEnd(value: /* e */ ChatTypingEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTypingEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTypingStart(value: /* e */ ChatTypingStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTypingStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typingStart")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: ChatUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

