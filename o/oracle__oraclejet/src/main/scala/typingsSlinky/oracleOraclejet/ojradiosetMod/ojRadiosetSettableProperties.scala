package typingsSlinky.oracleOraclejet.ojradiosetMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.Required
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.ojradiosetMod.ojRadioset.OptionContext
import typingsSlinky.oracleOraclejet.ojradiosetMod.ojRadioset.OptionsKeys
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojRadiosetSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, js.Any] {
  
  var labelledBy: String | Null = js.native
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
  
  var options: (DataProvider[K, D]) | Null = js.native
  
  var optionsKeys: js.UndefOr[OptionsKeys] = js.native
  
  var required: Boolean = js.native
  
  @JSName("translations")
  var translations_ojRadiosetSettableProperties: Required = js.native
}
object ojRadiosetSettableProperties {
  
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    required: Boolean,
    translations: Required,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any
  ): ojRadiosetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRadiosetSettableProperties[K, D]]
  }
  
  @scala.inline
  implicit class ojRadiosetSettablePropertiesOps[Self <: ojRadiosetSettableProperties[_, _], K, D] (val x: Self with (ojRadiosetSettableProperties[K, D])) extends AnyVal {
    
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: Required): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelledBy(value: String): Self = this.set("labelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelledByNull: Self = this.set("labelledBy", null)
    
    @scala.inline
    def setOptionRenderer(value: /* param0 */ OptionContext[D] => Element): Self = this.set("optionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOptionRenderer: Self = this.set("optionRenderer", js.undefined)
    
    @scala.inline
    def setOptionRendererNull: Self = this.set("optionRenderer", null)
    
    @scala.inline
    def setOptions(value: DataProvider[K, D]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
    
    @scala.inline
    def setOptionsKeys(value: OptionsKeys): Self = this.set("optionsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsKeys: Self = this.set("optionsKeys", js.undefined)
  }
}
