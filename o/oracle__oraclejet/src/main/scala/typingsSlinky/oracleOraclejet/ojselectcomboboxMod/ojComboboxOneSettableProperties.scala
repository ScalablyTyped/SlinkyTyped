package typingsSlinky.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.Children
import typingsSlinky.oracleOraclejet.anon.Class
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.FilterFurther
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.LabelValue
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojComboboxOneSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, String] {
  
  var asyncValidators: js.Array[AsyncValidator[_]] = js.native
  
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  
  var filterOnOpen: none | typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValue = js.native
  
  var minLength: Double = js.native
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  
  var options: (js.Array[
    typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  
  var optionsKeys: Children = js.native
  
  var pickerAttributes: Class = js.native
  
  var placeholder: String | Null = js.native
  
  val rawValue: String | Null = js.native
  
  var readOnly: Boolean = js.native
  
  var required: Boolean = js.native
  
  @JSName("translations")
  var translations_ojComboboxOneSettableProperties: FilterFurther = js.native
  
  var validators: (js.Array[Validator[_] | RegisteredValidator]) | Null = js.native
  
  var valueOption: LabelValue = js.native
}
object ojComboboxOneSettableProperties {
  
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[AsyncValidator[_]],
    disabled: Boolean,
    displayOptions: ConverterHint,
    filterOnOpen: none | rawValue,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minLength: Double,
    optionsKeys: Children,
    pickerAttributes: Class,
    readOnly: Boolean,
    required: Boolean,
    translations: FilterFurther,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    valueOption: LabelValue
  ): ojComboboxOneSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], filterOnOpen = filterOnOpen.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueOption = valueOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojComboboxOneSettableProperties[K, D]]
  }
  
  @scala.inline
  implicit class ojComboboxOneSettablePropertiesMutableBuilder[Self <: ojComboboxOneSettableProperties[_, _], K, D] (val x: Self with (ojComboboxOneSettableProperties[K, D])) extends AnyVal {
    
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[_]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncValidatorsVarargs(value: AsyncValidator[js.Any]*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
    
    @scala.inline
    def setConverter(value: Converter[_] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterNull: Self = StObject.set(x, "converter", null)
    
    @scala.inline
    def setFilterOnOpen(value: none | rawValue): Self = StObject.set(x, "filterOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionRenderer(value: /* param0 */ OptionContext => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
    
    @scala.inline
    def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
    
    @scala.inline
    def setOptions(
      value: (js.Array[
          typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ]) | (DataProvider[K, D])
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsKeys(value: Children): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsVarargs(
      value: (typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsSlinky.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup)*
    ): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPickerAttributes(value: Class): Self = StObject.set(x, "pickerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    @scala.inline
    def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValueNull: Self = StObject.set(x, "rawValue", null)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: FilterFurther): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidators(value: js.Array[Validator[_] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    @scala.inline
    def setValidatorsVarargs(value: (Validator[js.Any] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value :_*))
    
    @scala.inline
    def setValueOption(value: LabelValue): Self = StObject.set(x, "valueOption", value.asInstanceOf[js.Any])
  }
}
