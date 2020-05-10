package typingsSlinky.oracleOraclejet.ojeditablevalueMod

import typingsSlinky.oracleOraclejet.AnonConverterHint
import typingsSlinky.oracleOraclejet.AnonDefinition
import typingsSlinky.oracleOraclejet.AnonInstruction
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editableValueSettableProperties[V, SV, RV] extends baseComponentSettableProperties {
  var describedBy: String | Null = js.native
  var disabled: Boolean = js.native
  var displayOptions: AnonConverterHint = js.native
  var help: AnonInstruction = js.native
  var helpHints: AnonDefinition = js.native
  var labelHint: String = js.native
  var messagesCustom: js.Array[^] = js.native
  val valid: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  var value: SV = js.native
}

object editableValueSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    valid: valid | pending | invalidHidden | invalidShown,
    value: SV
  ): editableValueSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[editableValueSettableProperties[V, SV, RV]]
  }
  @scala.inline
  implicit class editableValueSettablePropertiesOps[Self[v, sv, rv] <: editableValueSettableProperties[v, sv, rv], V, SV, RV] (val x: Self[V, SV, RV]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, SV, RV] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, SV, RV]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, SV, RV]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, SV, RV]) with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayOptions(value: AnonConverterHint): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: AnonInstruction): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpHints(value: AnonDefinition): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelHint(value: String): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessagesCustom(value: js.Array[^]): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: valid | pending | invalidHidden | invalidShown): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: SV): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescribedBy(value: String): Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescribedByNull: Self[V, SV, RV] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedBy")(null)
        ret
    }
  }
  
}

