package typingsSlinky.oracleOraclejet.ojinputtextMod

import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Regexp
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTextAreaSettableProperties
  extends inputBaseSettableProperties[js.Any, js.Any, js.Any] {
  
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  
  var rows: Double = js.native
}
object ojTextAreaSettableProperties {
  
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[js.Any]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: js.Any,
    readonly: Boolean,
    required: Boolean,
    rows: Double,
    translations: Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any
  ): ojTextAreaSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTextAreaSettableProperties]
  }
  
  @scala.inline
  implicit class ojTextAreaSettablePropertiesMutableBuilder[Self <: ojTextAreaSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: Converter[_] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterNull: Self = StObject.set(x, "converter", null)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
