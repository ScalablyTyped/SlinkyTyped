package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Labels are used to categorize messages and threads within the user&#39;s
  * mailbox.
  */
@js.native
trait SchemaLabel extends js.Object {
  /**
    * The color to assign to the label. Color is only available for labels that
    * have their type set to user.
    */
  var color: js.UndefOr[SchemaLabelColor] = js.native
  /**
    * The immutable ID of the label.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The visibility of the label in the label list in the Gmail web interface.
    */
  var labelListVisibility: js.UndefOr[String] = js.native
  /**
    * The visibility of the label in the message list in the Gmail web
    * interface.
    */
  var messageListVisibility: js.UndefOr[String] = js.native
  /**
    * The total number of messages with the label.
    */
  var messagesTotal: js.UndefOr[Double] = js.native
  /**
    * The number of unread messages with the label.
    */
  var messagesUnread: js.UndefOr[Double] = js.native
  /**
    * The display name of the label.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The total number of threads with the label.
    */
  var threadsTotal: js.UndefOr[Double] = js.native
  /**
    * The number of unread threads with the label.
    */
  var threadsUnread: js.UndefOr[Double] = js.native
  /**
    * The owner type for the label. User labels are created by the user and can
    * be modified and deleted by the user and can be applied to any message or
    * thread. System labels are internally created and cannot be added,
    * modified, or deleted. System labels may be able to be applied to or
    * removed from messages and threads under some circumstances but this is
    * not guaranteed. For example, users can apply and remove the INBOX and
    * UNREAD labels from messages and threads, but cannot apply or remove the
    * DRAFTS or SENT labels from messages or threads.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaLabel {
  @scala.inline
  def apply(): SchemaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabel]
  }
  @scala.inline
  implicit class SchemaLabelOps[Self <: SchemaLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: SchemaLabelColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
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
    def withLabelListVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelListVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelListVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelListVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageListVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageListVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageListVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageListVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesUnread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesUnread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesUnread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesUnread")(js.undefined)
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
    def withThreadsTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadsTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadsUnread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsUnread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadsUnread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsUnread")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

