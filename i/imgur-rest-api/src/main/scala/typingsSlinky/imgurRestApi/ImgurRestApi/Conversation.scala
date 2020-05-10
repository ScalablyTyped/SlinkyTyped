package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversation extends js.Object {
  var datetime: Double = js.native
  var done: js.UndefOr[Boolean] = js.native
  var id: Double = js.native
  var last_message_preview: String = js.native
  var message_count: Double = js.native
  var messages: js.UndefOr[js.Array[Message]] = js.native
  var page: js.UndefOr[Double] = js.native
  var with_account: String = js.native
  var with_account_id: Double = js.native
}

object Conversation {
  @scala.inline
  def apply(
    datetime: Double,
    id: Double,
    last_message_preview: String,
    message_count: Double,
    with_account: String,
    with_account_id: Double
  ): Conversation = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_message_preview = last_message_preview.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], with_account = with_account.asInstanceOf[js.Any], with_account_id = with_account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
  @scala.inline
  implicit class ConversationOps[Self <: Conversation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_message_preview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_message_preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWith_account(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWith_account_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with_account_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[Message]): Self = {
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
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
  }
  
}

