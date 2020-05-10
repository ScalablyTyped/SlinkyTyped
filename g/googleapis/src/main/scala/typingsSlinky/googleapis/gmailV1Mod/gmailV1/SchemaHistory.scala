package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record of a change to the user&#39;s mailbox. Each history change may
  * affect multiple messages in multiple ways.
  */
@js.native
trait SchemaHistory extends js.Object {
  /**
    * The mailbox sequence ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Labels added to messages in this history record.
    */
  var labelsAdded: js.UndefOr[js.Array[SchemaHistoryLabelAdded]] = js.native
  /**
    * Labels removed from messages in this history record.
    */
  var labelsRemoved: js.UndefOr[js.Array[SchemaHistoryLabelRemoved]] = js.native
  /**
    * List of messages changed in this history record. The fields for specific
    * change types, such as messagesAdded may duplicate messages in this field.
    * We recommend using the specific change-type fields instead of this.
    */
  var messages: js.UndefOr[js.Array[SchemaMessage]] = js.native
  /**
    * Messages added to the mailbox in this history record.
    */
  var messagesAdded: js.UndefOr[js.Array[SchemaHistoryMessageAdded]] = js.native
  /**
    * Messages deleted (not Trashed) from the mailbox in this history record.
    */
  var messagesDeleted: js.UndefOr[js.Array[SchemaHistoryMessageDeleted]] = js.native
}

object SchemaHistory {
  @scala.inline
  def apply(): SchemaHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistory]
  }
  @scala.inline
  implicit class SchemaHistoryOps[Self <: SchemaHistory] (val x: Self) extends AnyVal {
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
    def withLabelsAdded(value: js.Array[SchemaHistoryLabelAdded]): Self = {
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
    def withLabelsRemoved(value: js.Array[SchemaHistoryLabelRemoved]): Self = {
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
    def withMessages(value: js.Array[SchemaMessage]): Self = {
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
    def withMessagesAdded(value: js.Array[SchemaHistoryMessageAdded]): Self = {
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
    def withMessagesDeleted(value: js.Array[SchemaHistoryMessageDeleted]): Self = {
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

