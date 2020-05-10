package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversation extends Entity {
  // Indicates whether any of the posts within this Conversation has at least one attachment.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastDeliveredDateTime: js.UndefOr[String] = js.native
  // A short summary from the body of the latest post in this converstaion.
  var preview: js.UndefOr[String] = js.native
  // A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
  var threads: js.UndefOr[js.Array[ConversationThread]] = js.native
  // The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
  var topic: js.UndefOr[String] = js.native
  // All the users that sent a message to this Conversation.
  var uniqueSenders: js.UndefOr[js.Array[String]] = js.native
}

object Conversation {
  @scala.inline
  def apply(): Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversation]
  }
  @scala.inline
  implicit class ConversationOps[Self <: Conversation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDeliveredDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeliveredDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDeliveredDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeliveredDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: js.Array[ConversationThread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueSenders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueSenders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueSenders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueSenders")(js.undefined)
        ret
    }
  }
  
}

