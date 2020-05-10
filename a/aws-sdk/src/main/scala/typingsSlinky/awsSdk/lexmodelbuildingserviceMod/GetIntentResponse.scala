package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntentResponse extends js.Object {
  /**
    * Checksum of the intent.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * After the Lambda function specified in the fulfillmentActivity element fulfills the intent, Amazon Lex conveys this statement to the user.
    */
  var conclusionStatement: js.UndefOr[Statement] = js.native
  /**
    * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For more information, see PutIntent. 
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.native
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information, see PutIntent. 
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.native
  /**
    * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled. For more information, see PutIntent.
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.native
  /**
    * Describes how the intent is fulfilled. For more information, see PutIntent. 
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.native
  /**
    * The date that the intent was updated. When you create a resource, the creation date and the last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.native
  /**
    * A unique identifier for a built-in intent.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.native
  /**
    * If the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.native
  /**
    * An array of sample utterances configured for the intent.
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.native
  /**
    * An array of intent slots configured for the intent.
    */
  var slots: js.UndefOr[SlotList] = js.native
  /**
    * The version of the intent.
    */
  var version: js.UndefOr[Version] = js.native
}

object GetIntentResponse {
  @scala.inline
  def apply(): GetIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntentResponse]
  }
  @scala.inline
  implicit class GetIntentResponseOps[Self <: GetIntentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withConclusionStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusionStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConclusionStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusionStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmationPrompt(value: Prompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogCodeHook(value: CodeHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogCodeHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogCodeHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogCodeHook")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowUpPrompt(value: FollowUpPrompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followUpPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowUpPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followUpPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentActivity(value: FulfillmentActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: IntentName): Self = {
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
    def withParentIntentSignature(value: BuiltinIntentSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIntentSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIntentSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIntentSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectionStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectionStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleUtterances(value: IntentUtteranceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleUtterances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleUtterances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleUtterances")(js.undefined)
        ret
    }
    @scala.inline
    def withSlots(value: SlotList): Self = {
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
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

