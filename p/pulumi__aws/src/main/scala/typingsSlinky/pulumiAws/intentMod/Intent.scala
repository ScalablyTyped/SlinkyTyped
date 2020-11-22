package typingsSlinky.pulumiAws.intentMod

import typingsSlinky.pulumiAws.outputMod.lex.IntentConclusionStatement
import typingsSlinky.pulumiAws.outputMod.lex.IntentConfirmationPrompt
import typingsSlinky.pulumiAws.outputMod.lex.IntentDialogCodeHook
import typingsSlinky.pulumiAws.outputMod.lex.IntentFollowUpPrompt
import typingsSlinky.pulumiAws.outputMod.lex.IntentFulfillmentActivity
import typingsSlinky.pulumiAws.outputMod.lex.IntentRejectionStatement
import typingsSlinky.pulumiAws.outputMod.lex.IntentSlot
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lex/intent", "Intent")
@js.native
class Intent protected () extends CustomResource {
  /**
    * Create a Intent resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IntentArgs) = this()
  def this(name: String, args: IntentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Lex intent.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Checksum identifying the version of the intent that was created. The checksum is not
    * included as an argument because the resource will add it automatically when updating the intent.
    */
  val checksum: Output_[String] = js.native
  
  /**
    * The statement that you want Amazon Lex to convey to the user
    * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
    * you provide a Lambda function in the `fulfillmentActivity`. If you return the intent to the client
    * application, you can't specify this element. The `followUpPrompt` and `conclusionStatement` are
    * mutually exclusive. You can specify only one. Attributes are documented under statement.
    */
  val conclusionStatement: Output_[js.UndefOr[IntentConclusionStatement]] = js.native
  
  /**
    * Prompts the user to confirm the intent. This question should
    * have a yes or no answer. You you must provide both the `rejectionStatement` and `confirmationPrompt`,
    * or neither. Attributes are documented under prompt.
    */
  val confirmationPrompt: Output_[js.UndefOr[IntentConfirmationPrompt]] = js.native
  
  /**
    * Determines if a new slot type version is created when the initial
    * resource is created and on each update. Defaults to `false`.
    */
  val createVersion: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The date when the intent version was created.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * A description of the bot. Must be less than or equal to 200 characters in length.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Specifies a Lambda function to invoke for each user input. You can
    * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
    */
  val dialogCodeHook: Output_[js.UndefOr[IntentDialogCodeHook]] = js.native
  
  /**
    * Amazon Lex uses this prompt to solicit additional activity after
    * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
    * user to order a drink. The `followUpPrompt` field and the `conclusionStatement` field are mutually
    * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
    */
  val followUpPrompt: Output_[js.UndefOr[IntentFollowUpPrompt]] = js.native
  
  /**
    * Describes how the intent is fulfilled. For example, after a
    * user provides all of the information for a pizza order, `fulfillmentActivity` defines how the bot
    * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
    */
  val fulfillmentActivity: Output_[IntentFulfillmentActivity] = js.native
  
  /**
    * The date when the $LATEST version of this intent was updated.
    */
  val lastUpdatedDate: Output_[String] = js.native
  
  /**
    * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
    */
  val name: Output_[String] = js.native
  
  /**
    * A unique identifier for the built-in intent to base this
    * intent on. To find the signature for an intent, see
    * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
    * in the Alexa Skills Kit.
    */
  val parentIntentSignature: Output_[js.UndefOr[String]] = js.native
  
  /**
    * If the user answers "no" to the question defined in the prompt field,
    * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
    * documented below under statement.
    */
  val rejectionStatement: Output_[js.UndefOr[IntentRejectionStatement]] = js.native
  
  /**
    * If you know a specific pattern with which users might respond to
    * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
    * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
    */
  val sampleUtterances: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * An list of intent slots. At runtime, Amazon Lex elicits required slot values
    * from the user using prompts defined in the slots. Attributes are documented under slot.
    */
  val slots: Output_[js.UndefOr[js.Array[IntentSlot]]] = js.native
  
  /**
    * The version of the bot.
    */
  val version: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/lex/intent", "Intent")
@js.native
object Intent extends js.Object {
  
  /**
    * Get an existing Intent resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Intent = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Intent = js.native
  def get(name: String, id: Input[ID], state: IntentState): Intent = js.native
  def get(name: String, id: Input[ID], state: IntentState, opts: CustomResourceOptions): Intent = js.native
  
  /**
    * Returns true if the given object is an instance of Intent.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/intent.Intent */ Boolean = js.native
}
