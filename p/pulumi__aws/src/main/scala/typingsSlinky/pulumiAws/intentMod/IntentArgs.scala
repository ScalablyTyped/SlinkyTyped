package typingsSlinky.pulumiAws.intentMod

import typingsSlinky.pulumiAws.inputMod.lex.IntentConclusionStatement
import typingsSlinky.pulumiAws.inputMod.lex.IntentConfirmationPrompt
import typingsSlinky.pulumiAws.inputMod.lex.IntentDialogCodeHook
import typingsSlinky.pulumiAws.inputMod.lex.IntentFollowUpPrompt
import typingsSlinky.pulumiAws.inputMod.lex.IntentFulfillmentActivity
import typingsSlinky.pulumiAws.inputMod.lex.IntentRejectionStatement
import typingsSlinky.pulumiAws.inputMod.lex.IntentSlot
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentArgs extends js.Object {
  
  /**
    * The statement that you want Amazon Lex to convey to the user
    * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
    * you provide a Lambda function in the `fulfillmentActivity`. If you return the intent to the client
    * application, you can't specify this element. The `followUpPrompt` and `conclusionStatement` are
    * mutually exclusive. You can specify only one. Attributes are documented under statement.
    */
  val conclusionStatement: js.UndefOr[Input[IntentConclusionStatement]] = js.native
  
  /**
    * Prompts the user to confirm the intent. This question should
    * have a yes or no answer. You you must provide both the `rejectionStatement` and `confirmationPrompt`,
    * or neither. Attributes are documented under prompt.
    */
  val confirmationPrompt: js.UndefOr[Input[IntentConfirmationPrompt]] = js.native
  
  /**
    * Determines if a new slot type version is created when the initial
    * resource is created and on each update. Defaults to `false`.
    */
  val createVersion: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A description of the bot. Must be less than or equal to 200 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies a Lambda function to invoke for each user input. You can
    * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
    */
  val dialogCodeHook: js.UndefOr[Input[IntentDialogCodeHook]] = js.native
  
  /**
    * Amazon Lex uses this prompt to solicit additional activity after
    * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
    * user to order a drink. The `followUpPrompt` field and the `conclusionStatement` field are mutually
    * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
    */
  val followUpPrompt: js.UndefOr[Input[IntentFollowUpPrompt]] = js.native
  
  /**
    * Describes how the intent is fulfilled. For example, after a
    * user provides all of the information for a pizza order, `fulfillmentActivity` defines how the bot
    * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
    */
  val fulfillmentActivity: Input[IntentFulfillmentActivity] = js.native
  
  /**
    * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique identifier for the built-in intent to base this
    * intent on. To find the signature for an intent, see
    * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
    * in the Alexa Skills Kit.
    */
  val parentIntentSignature: js.UndefOr[Input[String]] = js.native
  
  /**
    * If the user answers "no" to the question defined in the prompt field,
    * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
    * documented below under statement.
    */
  val rejectionStatement: js.UndefOr[Input[IntentRejectionStatement]] = js.native
  
  /**
    * If you know a specific pattern with which users might respond to
    * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
    * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
    */
  val sampleUtterances: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * An list of intent slots. At runtime, Amazon Lex elicits required slot values
    * from the user using prompts defined in the slots. Attributes are documented under slot.
    */
  val slots: js.UndefOr[Input[js.Array[Input[IntentSlot]]]] = js.native
}
object IntentArgs {
  
  @scala.inline
  def apply(fulfillmentActivity: Input[IntentFulfillmentActivity]): IntentArgs = {
    val __obj = js.Dynamic.literal(fulfillmentActivity = fulfillmentActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentArgs]
  }
  
  @scala.inline
  implicit class IntentArgsOps[Self <: IntentArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFulfillmentActivity(value: Input[IntentFulfillmentActivity]): Self = this.set("fulfillmentActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusionStatement(value: Input[IntentConclusionStatement]): Self = this.set("conclusionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConclusionStatement: Self = this.set("conclusionStatement", js.undefined)
    
    @scala.inline
    def setConfirmationPrompt(value: Input[IntentConfirmationPrompt]): Self = this.set("confirmationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmationPrompt: Self = this.set("confirmationPrompt", js.undefined)
    
    @scala.inline
    def setCreateVersion(value: Input[Boolean]): Self = this.set("createVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateVersion: Self = this.set("createVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDialogCodeHook(value: Input[IntentDialogCodeHook]): Self = this.set("dialogCodeHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogCodeHook: Self = this.set("dialogCodeHook", js.undefined)
    
    @scala.inline
    def setFollowUpPrompt(value: Input[IntentFollowUpPrompt]): Self = this.set("followUpPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowUpPrompt: Self = this.set("followUpPrompt", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentIntentSignature(value: Input[String]): Self = this.set("parentIntentSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIntentSignature: Self = this.set("parentIntentSignature", js.undefined)
    
    @scala.inline
    def setRejectionStatement(value: Input[IntentRejectionStatement]): Self = this.set("rejectionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectionStatement: Self = this.set("rejectionStatement", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: Input[String]*): Self = this.set("sampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setSampleUtterances(value: Input[js.Array[Input[String]]]): Self = this.set("sampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleUtterances: Self = this.set("sampleUtterances", js.undefined)
    
    @scala.inline
    def setSlotsVarargs(value: Input[IntentSlot]*): Self = this.set("slots", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: Input[js.Array[Input[IntentSlot]]]): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
  }
}
