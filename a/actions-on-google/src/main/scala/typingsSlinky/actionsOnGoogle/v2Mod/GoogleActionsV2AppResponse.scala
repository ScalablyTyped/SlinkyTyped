package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2AppResponse extends js.Object {
  /**
    * An opaque token that is recirculated to the Action every conversation
    * turn.
    */
  var conversationToken: js.UndefOr[String] = js.native
  /**
    * A custom push message that allows developers to send structured data to
    * Actions on Google.
    */
  var customPushMessage: js.UndefOr[GoogleActionsV2CustomPushMessage] = js.native
  /**
    * Indicates whether the Action is expecting a user response. This is true
    * when the conversation is ongoing, false when the conversation is done.
    */
  var expectUserResponse: js.UndefOr[Boolean] = js.native
  /**
    * List of inputs the Action expects, each input can be a common Actions on
    * Google intent (start with 'actions.'), or an input taking list of possible
    * intents. Only one input is supported for now.
    */
  var expectedInputs: js.UndefOr[js.Array[GoogleActionsV2ExpectedInput]] = js.native
  /**
    * Final response when the Action does not expect user's input.
    */
  var finalResponse: js.UndefOr[GoogleActionsV2FinalResponse] = js.native
  /**
    * Indicates whether the response should be handled in sandbox mode. This
    * bit is needed to push structured data to Google in sandbox mode.
    */
  var isInSandbox: js.UndefOr[Boolean] = js.native
  /**
    * Whether to clear the persisted user_storage. If set to true, then in the
    * next interaction with the user, the user_storage field will be empty.
    */
  var resetUserStorage: js.UndefOr[Boolean] = js.native
  /**
    * An opaque token controlled by the Action that is persisted across
    * conversations for a particular user. If empty or unspecified, the
    * existing persisted token will be unchanged.
    * The maximum size of the string is 10k bytes.
    * If multiple dialogs are occurring concurrently for the same user, then
    * updates to this token can overwrite each other unexpectedly.
    */
  var userStorage: js.UndefOr[String] = js.native
}

object GoogleActionsV2AppResponse {
  @scala.inline
  def apply(): GoogleActionsV2AppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2AppResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2AppResponseOps[Self <: GoogleActionsV2AppResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCustomPushMessage(value: GoogleActionsV2CustomPushMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPushMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPushMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPushMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectUserResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectUserResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectUserResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectUserResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedInputs(value: js.Array[GoogleActionsV2ExpectedInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalResponse(value: GoogleActionsV2FinalResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInSandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInSandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withResetUserStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetUserStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetUserStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetUserStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorage")(js.undefined)
        ret
    }
  }
  
}

