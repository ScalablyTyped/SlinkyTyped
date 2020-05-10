package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  var id: js.UndefOr[String] = js.native
  var labelsAdded: js.UndefOr[js.Array[HistoryLabelAdded]] = js.native
  var labelsRemoved: js.UndefOr[js.Array[HistoryLabelRemoved]] = js.native
  var messages: js.UndefOr[js.Array[Message]] = js.native
  var messagesAdded: js.UndefOr[js.Array[HistoryMessageAdded]] = js.native
  var messagesDeleted: js.UndefOr[js.Array[HistoryMessageDeleted]] = js.native
}

object History {
  @scala.inline
  def apply(): History = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsAdded(value: js.Array[HistoryLabelAdded]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsRemoved(value: js.Array[HistoryLabelRemoved]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsRemoved")(js.undefined)
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
    def withMessagesAdded(value: js.Array[HistoryMessageAdded]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesDeleted(value: js.Array[HistoryMessageDeleted]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesDeleted")(js.undefined)
        ret
    }
  }
  
}

