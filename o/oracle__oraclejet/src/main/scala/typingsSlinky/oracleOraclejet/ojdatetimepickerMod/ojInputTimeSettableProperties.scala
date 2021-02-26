package typingsSlinky.oracleOraclejet.ojdatetimepickerMod

import typingsSlinky.oracleOraclejet.anon.AmpmWheelLabel
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.FooterLayout
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.ojinputtextMod.inputBaseSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.jet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.native
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputTimeSettableProperties extends inputBaseSettableProperties[String, String, String] {
  
  var converter: Converter[String] | RegisteredConverter = js.native
  
  var keyboardEdit: enabled | disabled = js.native
  
  var max: String | Null = js.native
  
  var min: String | Null = js.native
  
  var pickerAttributes: Class = js.native
  
  var renderMode: jet | native = js.native
  
  var timePicker: FooterLayout = js.native
  
  @JSName("translations")
  var translations_ojInputTimeSettableProperties: AmpmWheelLabel = js.native
}
object ojInputTimeSettableProperties {
  
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[String] | RegisteredConverter,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    keyboardEdit: enabled | disabled,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: Class,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    timePicker: FooterLayout,
    translations: AmpmWheelLabel,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String
  ): ojInputTimeSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], timePicker = timePicker.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputTimeSettableProperties]
  }
  
  @scala.inline
  implicit class ojInputTimeSettablePropertiesMutableBuilder[Self <: ojInputTimeSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: Converter[String] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEdit(value: enabled | disabled): Self = StObject.set(x, "keyboardEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNull: Self = StObject.set(x, "max", null)
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNull: Self = StObject.set(x, "min", null)
    
    @scala.inline
    def setPickerAttributes(value: Class): Self = StObject.set(x, "pickerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderMode(value: jet | native): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePicker(value: FooterLayout): Self = StObject.set(x, "timePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: AmpmWheelLabel): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
  }
}
