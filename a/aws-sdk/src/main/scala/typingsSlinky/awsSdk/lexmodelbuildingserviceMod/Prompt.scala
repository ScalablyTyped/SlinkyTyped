package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prompt extends js.Object {
  /**
    * The number of times to prompt the user for information.
    */
  var maxAttempts: PromptMaxAttempts = js.native
  /**
    * An array of objects, each of which provides a message string and its type. You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    */
  var messages: MessageList = js.native
  /**
    * A response card. Amazon Lex uses this prompt at runtime, in the PostText API response. It substitutes session attributes and slot values for placeholders in the response card. For more information, see ex-resp-card. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
}

object Prompt {
  @scala.inline
  def apply(maxAttempts: PromptMaxAttempts, messages: MessageList): Prompt = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
  @scala.inline
  implicit class PromptOps[Self <: Prompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAttempts(value: PromptMaxAttempts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: MessageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseCard(value: ResponseCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCard")(js.undefined)
        ret
    }
  }
  
}

