package typingsSlinky.oracleOraclejet.ojinputtextMod

import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Regexp
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.always
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.conditional
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.email
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.never
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.search
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.text
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.url
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputTextSettableProperties
  extends inputBaseSettableProperties[js.Any, js.Any, js.Any] {
  
  var clearIcon: never | always | conditional = js.native
  
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  
  var list: String = js.native
  
  var virtualKeyboard: auto | email | number | search | tel | text | url = js.native
}
object ojInputTextSettableProperties {
  
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[js.Any]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    clearIcon: never | always | conditional,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    list: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: js.Any,
    readonly: Boolean,
    required: Boolean,
    translations: Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    virtualKeyboard: auto | email | number | search | tel | text | url
  ): ojInputTextSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], clearIcon = clearIcon.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputTextSettableProperties]
  }
  
  @scala.inline
  implicit class ojInputTextSettablePropertiesOps[Self <: ojInputTextSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setClearIcon(value: never | always | conditional): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualKeyboard(value: auto | email | number | search | tel | text | url): Self = this.set("virtualKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverter(value: Converter[_] | RegisteredConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterNull: Self = this.set("converter", null)
  }
}
