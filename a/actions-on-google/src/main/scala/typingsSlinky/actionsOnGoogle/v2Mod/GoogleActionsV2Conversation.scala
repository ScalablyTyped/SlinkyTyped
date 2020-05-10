package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Conversation extends js.Object {
  /**
    * Unique ID for the multi-turn conversation. It's assigned for the first
    * turn. After that it remains the same for subsequent conversation turns
    * until the conversation is terminated.
    */
  var conversationId: js.UndefOr[String] = js.native
  /**
    * Opaque token specified by the Action in the last conversation turn. It can
    * be used by an Action to track the conversation or to store conversation
    * related data.
    */
  var conversationToken: js.UndefOr[String] = js.native
  /**
    * Type indicates the state of the conversation in its lifecycle.
    */
  var `type`: js.UndefOr[GoogleActionsV2ConversationType] = js.native
}

object GoogleActionsV2Conversation {
  @scala.inline
  def apply(): GoogleActionsV2Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Conversation]
  }
  @scala.inline
  implicit class GoogleActionsV2ConversationOps[Self <: GoogleActionsV2Conversation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationId")(js.undefined)
        ret
    }
    @scala.inline
    def withConversationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsV2ConversationType): Self = {
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

