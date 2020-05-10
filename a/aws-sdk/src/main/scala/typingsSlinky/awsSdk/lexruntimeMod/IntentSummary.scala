package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntentSummary extends js.Object {
  /**
    * A user-defined label that identifies a particular intent. You can use this label to return to a previous intent.  Use the checkpointLabelFilter parameter of the GetSessionRequest operation to filter the intents returned by the operation to those with only the specified label.
    */
  var checkpointLabel: js.UndefOr[IntentSummaryCheckpointLabel] = js.native
  /**
    * The status of the intent after the user responds to the confirmation prompt. If the user confirms the intent, Amazon Lex sets this field to Confirmed. If the user denies the intent, Amazon Lex sets this value to Denied. The possible values are:    Confirmed - The user has responded "Yes" to the confirmation prompt, confirming that the intent is complete and that it is ready to be fulfilled.    Denied - The user has responded "No" to the confirmation prompt.    None - The user has never been prompted for confirmation; or, the user was prompted but did not confirm or deny the prompt.  
    */
  var confirmationStatus: js.UndefOr[ConfirmationStatus] = js.native
  /**
    * The next action that the bot should take in its interaction with the user. The possible values are:    ConfirmIntent - The next action is asking the user if the intent is complete and ready to be fulfilled. This is a yes/no question such as "Place the order?"    Close - Indicates that the there will not be a response from the user. For example, the statement "Your order has been placed" does not require a response.    ElicitIntent - The next action is to determine the intent that the user wants to fulfill.    ElicitSlot - The next action is to elicit a slot value from the user.  
    */
  var dialogActionType: DialogActionType = js.native
  /**
    * The fulfillment state of the intent. The possible values are:    Failed - The Lambda function associated with the intent failed to fulfill the intent.    Fulfilled - The intent has fulfilled by the Lambda function associated with the intent.     ReadyForFulfillment - All of the information necessary for the intent is present and the intent ready to be fulfilled by the client application.  
    */
  var fulfillmentState: js.UndefOr[FulfillmentState] = js.native
  /**
    * The name of the intent.
    */
  var intentName: js.UndefOr[IntentName] = js.native
  /**
    * The next slot to elicit from the user. If there is not slot to elicit, the field is blank.
    */
  var slotToElicit: js.UndefOr[String] = js.native
  /**
    * Map of the slots that have been gathered and their values. 
    */
  var slots: js.UndefOr[StringMap] = js.native
}

object IntentSummary {
  @scala.inline
  def apply(dialogActionType: DialogActionType): IntentSummary = {
    val __obj = js.Dynamic.literal(dialogActionType = dialogActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentSummary]
  }
  @scala.inline
  implicit class IntentSummaryOps[Self <: IntentSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogActionType(value: DialogActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckpointLabel(value: IntentSummaryCheckpointLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkpointLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkpointLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmationStatus(value: ConfirmationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentState(value: FulfillmentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentState")(js.undefined)
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

