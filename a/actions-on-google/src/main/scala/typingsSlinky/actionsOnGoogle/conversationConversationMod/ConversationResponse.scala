package typingsSlinky.actionsOnGoogle.conversationConversationMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2ExpectedIntent
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationResponse extends js.Object {
  var expectUserResponse: Boolean = js.native
  var expectedIntent: js.UndefOr[GoogleActionsV2ExpectedIntent] = js.native
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
  var richResponse: GoogleActionsV2RichResponse = js.native
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
  var userStorage: String = js.native
}

object ConversationResponse {
  @scala.inline
  def apply(expectUserResponse: Boolean, richResponse: GoogleActionsV2RichResponse, userStorage: String): ConversationResponse = {
    val __obj = js.Dynamic.literal(expectUserResponse = expectUserResponse.asInstanceOf[js.Any], richResponse = richResponse.asInstanceOf[js.Any], userStorage = userStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationResponse]
  }
  @scala.inline
  implicit class ConversationResponseOps[Self <: ConversationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectUserResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectUserResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRichResponse(value: GoogleActionsV2RichResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedIntent(value: GoogleActionsV2ExpectedIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedIntent")(js.undefined)
        ret
    }
    @scala.inline
    def withNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInputPrompts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInputPrompts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInputPrompts")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeechBiasingHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechBiasingHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechBiasingHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechBiasingHints")(js.undefined)
        ret
    }
  }
  
}

