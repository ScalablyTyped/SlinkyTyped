package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSessionResponse extends js.Object {
  /**
    * The audio version of the message to convey to the user.
    */
  var audioStream: js.UndefOr[BlobStream] = js.native
  /**
    * Content type as specified in the Accept HTTP header in the request.
    */
  var contentType: js.UndefOr[HttpContentType] = js.native
  /**
    *     ConfirmIntent - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before fulfilling an intent.    ElicitIntent - Amazon Lex wants to elicit the user's intent.    ElicitSlot - Amazon Lex is expecting the value of a slot for the current intent.    Failed - Conveys that the conversation with the user has failed. This can happen for various reasons, including the user does not provide an appropriate response to prompts from the service, or if the Lambda function fails to fulfill the intent.    Fulfilled - Conveys that the Lambda function has sucessfully fulfilled the intent.    ReadyForFulfillment - Conveys that the client has to fulfill the intent.  
    */
  var dialogState: js.UndefOr[DialogState] = js.native
  /**
    * The name of the current intent.
    */
  var intentName: js.UndefOr[IntentName] = js.native
  /**
    * The next message that should be presented to the user.
    */
  var message: js.UndefOr[Text] = js.native
  /**
    * The format of the response message. One of the following values:    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format for the client.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages from the groups that messages were assigned to when the intent was created.  
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.native
  /**
    * Map of key/value pairs representing session-specific context information.
    */
  var sessionAttributes: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * If the dialogState is ElicitSlot, returns the name of the slot for which Amazon Lex is eliciting a value.
    */
  var slotToElicit: js.UndefOr[String] = js.native
  /**
    * Map of zero or more intent slots Amazon Lex detected from the user input during the conversation. Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined by the valueSelectionStrategy selected when the slot type was created or updated. If valueSelectionStrategy is set to ORIGINAL_VALUE, the value provided by the user is returned, if the user value is similar to the slot values. If valueSelectionStrategy is set to TOP_RESOLUTION Amazon Lex returns the first value in the resolution list or, if there is no resolution list, null. If you don't specify a valueSelectionStrategy the default is ORIGINAL_VALUE. 
    */
  var slots: js.UndefOr[String] = js.native
}

object PutSessionResponse {
  @scala.inline
  def apply(): PutSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSessionResponse]
  }
  @scala.inline
  implicit class PutSessionResponseOps[Self <: PutSessionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioStreamUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioStream(value: BlobStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioStream")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: HttpContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
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
    def withSessionAttributes(value: String): Self = {
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
    def withSlots(value: String): Self = {
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

