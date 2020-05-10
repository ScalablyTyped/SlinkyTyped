package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends js.Object {
  /**
    * A description of the slot.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The name of the slot.
    */
  var name: SlotName = js.native
  /**
    * Determines whether a slot is obfuscated in conversation logs and stored utterances. When you obfuscate a slot, the value is replaced by the slot name in curly braces ({}). For example, if the slot name is "full_name", obfuscated values are replaced with "{full_name}". For more information, see  Slot Obfuscation . 
    */
  var obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.native
  /**
    *  Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
    */
  var priority: js.UndefOr[Priority] = js.native
  /**
    *  A set of possible responses for the slot type used by text-based clients. A user chooses an option from the response card, instead of using text to reply. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
  /**
    *  If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of understanding user utterances. 
    */
  var sampleUtterances: js.UndefOr[SlotUtteranceList] = js.native
  /**
    * Specifies whether the slot is required or optional. 
    */
  var slotConstraint: SlotConstraint = js.native
  /**
    * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
    */
  var slotType: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.native
  /**
    * The version of the slot type.
    */
  var slotTypeVersion: js.UndefOr[Version] = js.native
  /**
    * The prompt that Amazon Lex uses to elicit the slot value from the user.
    */
  var valueElicitationPrompt: js.UndefOr[Prompt] = js.native
}

object Slot {
  @scala.inline
  def apply(name: SlotName, slotConstraint: SlotConstraint): Slot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slotConstraint = slotConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: SlotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotConstraint(value: SlotConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotConstraint")(value.asInstanceOf[js.Any])
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
    def withObfuscationSetting(value: ObfuscationSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscationSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObfuscationSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscationSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Priority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
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
    def withSampleUtterances(value: SlotUtteranceList): Self = {
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
    def withSlotType(value: CustomOrBuiltinSlotTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotType")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotTypeVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTypeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotTypeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotTypeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withValueElicitationPrompt(value: Prompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueElicitationPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueElicitationPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueElicitationPrompt")(js.undefined)
        ret
    }
  }
  
}

