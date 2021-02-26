package typingsSlinky.pulumiAws.inputMod.lex

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentSlot extends StObject {
  
  /**
    * A description of the bot. Must be less than or equal to 200 characters in length.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
    */
  var name: Input[String] = js.native
  
  /**
    * Directs Lex the order in which to elicit this slot value from the user.
    * For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for
    * the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits
    * values is arbitrary. Must be between 1 and 100.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
    */
  var responseCard: js.UndefOr[Input[String]] = js.native
  
  /**
    * If you know a specific pattern with which users might respond to
    * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
    * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
    */
  var sampleUtterances: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Specifies whether the slot is required or optional.
    */
  var slotConstraint: Input[String] = js.native
  
  /**
    * The type of the slot, either a custom slot type that you defined or one of
    * the built-in slot types. Must be less than or equal to 100 characters in length.
    */
  var slotType: Input[String] = js.native
  
  /**
    * The version of the slot type. Must be less than or equal to 64 characters in length.
    */
  var slotTypeVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The prompt that Amazon Lex uses to elicit the slot value
    * from the user. Attributes are documented under prompt.
    */
  var valueElicitationPrompt: js.UndefOr[Input[IntentSlotValueElicitationPrompt]] = js.native
}
object IntentSlot {
  
  @scala.inline
  def apply(name: Input[String], slotConstraint: Input[String], slotType: Input[String]): IntentSlot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slotConstraint = slotConstraint.asInstanceOf[js.Any], slotType = slotType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentSlot]
  }
  
  @scala.inline
  implicit class IntentSlotMutableBuilder[Self <: IntentSlot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setResponseCard(value: Input[String]): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
    
    @scala.inline
    def setSampleUtterances(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: Input[String]*): Self = StObject.set(x, "sampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setSlotConstraint(value: Input[String]): Self = StObject.set(x, "slotConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotType(value: Input[String]): Self = StObject.set(x, "slotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTypeVersion(value: Input[String]): Self = StObject.set(x, "slotTypeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTypeVersionUndefined: Self = StObject.set(x, "slotTypeVersion", js.undefined)
    
    @scala.inline
    def setValueElicitationPrompt(value: Input[IntentSlotValueElicitationPrompt]): Self = StObject.set(x, "valueElicitationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueElicitationPromptUndefined: Self = StObject.set(x, "valueElicitationPrompt", js.undefined)
  }
}
