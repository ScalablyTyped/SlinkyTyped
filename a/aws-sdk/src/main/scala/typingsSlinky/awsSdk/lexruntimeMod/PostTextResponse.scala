package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostTextResponse extends js.Object {
  /**
    *  Identifies the current state of the user interaction. Amazon Lex returns one of the following values as dialogState. The client can optionally use this information to customize the user interface.     ElicitIntent - Amazon Lex wants to elicit user intent.  For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent from this utterance, it will return this dialogState.    ConfirmIntent - Amazon Lex is expecting a "yes" or "no" response.   For example, Amazon Lex wants user confirmation before fulfilling an intent.  Instead of a simple "yes" or "no," a user might respond with additional information. For example, "yes, but make it thick crust pizza" or "no, I want to order a drink". Amazon Lex can process such additional information (in these examples, update the crust type slot value, or change intent from OrderPizza to OrderDrink).    ElicitSlot - Amazon Lex is expecting a slot value for the current intent.  For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.     Fulfilled - Conveys that the Lambda function configured for the intent has successfully fulfilled the intent.     ReadyForFulfillment - Conveys that the client has to fulfill the intent.     Failed - Conveys that the conversation with the user failed.   This can happen for various reasons including that the user did not provide an appropriate response to prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or the Lambda function failed to fulfill the intent.   
    */
  var dialogState: js.UndefOr[DialogState] = js.native
  /**
    * The current user intent that Amazon Lex is aware of.
    */
  var intentName: js.UndefOr[IntentName] = js.native
  /**
    * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function. If the intent is not configured with a Lambda function, or if the Lambda function returned Delegate as the dialogAction.type its response, Amazon Lex decides on the next course of action and selects an appropriate message from the bot's configuration based on the current interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message. When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex returns one message from each group in the response. The message field is an escaped JSON string containing the messages. For more information about the structure of the JSON string returned, see msg-prompts-formats. If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
    */
  var message: js.UndefOr[Text] = js.native
  /**
    * The format of the response message. One of the following values:    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format defined by the Lambda function.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages from the groups that messages were assigned to when the intent was created.  
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.native
  /**
    * Represents the options that the user has to respond to the current prompt. Response Card can come from the bot configuration (in the Amazon Lex console, choose the settings button next to a slot) or from a code hook (Lambda function). 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
  /**
    * The sentiment expressed in and utterance. When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains the result of the analysis.
    */
  var sentimentResponse: js.UndefOr[SentimentResponse] = js.native
  /**
    * A map of key-value pairs representing the session-specific context information.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * If the dialogState value is ElicitSlot, returns the name of the slot for which Amazon Lex is eliciting a value. 
    */
  var slotToElicit: js.UndefOr[String] = js.native
  /**
    *  The intent slots that Amazon Lex detected from the user input in the conversation.  Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined by the valueSelectionStrategy selected when the slot type was created or updated. If valueSelectionStrategy is set to ORIGINAL_VALUE, the value provided by the user is returned, if the user value is similar to the slot values. If valueSelectionStrategy is set to TOP_RESOLUTION Amazon Lex returns the first value in the resolution list or, if there is no resolution list, null. If you don't specify a valueSelectionStrategy, the default is ORIGINAL_VALUE.
    */
  var slots: js.UndefOr[StringMap] = js.native
}

object PostTextResponse {
  @scala.inline
  def apply(): PostTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostTextResponse]
  }
  @scala.inline
  implicit class PostTextResponseOps[Self <: PostTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogState(value: DialogState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogState")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentName(value: IntentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentName")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFormat(value: MessageFormatType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(js.undefined)
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
    @scala.inline
    def withSentimentResponse(value: SentimentResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionAttributes(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotToElicit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotToElicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotToElicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotToElicit")(js.undefined)
        ret
    }
    @scala.inline
    def withSlots(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(js.undefined)
        ret
    }
  }
  
}

