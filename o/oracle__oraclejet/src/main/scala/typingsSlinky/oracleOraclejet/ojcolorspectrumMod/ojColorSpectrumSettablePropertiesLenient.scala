package typingsSlinky.oracleOraclejet.ojcolorspectrumMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.anon.LabelHue
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcolorspectrum.ojColorSpectrumSettableProperties> */
@js.native
trait ojColorSpectrumSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var describedBy: js.UndefOr[String | Null] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  
  var help: js.UndefOr[Instruction] = js.native
  
  var helpHints: js.UndefOr[Definition] = js.native
  
  var labelHint: js.UndefOr[String] = js.native
  
  var labelledBy: js.UndefOr[String | Null] = js.native
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  
  var transientValue: js.UndefOr[typingsSlinky.oracleOraclejet.ojcolorMod.^] = js.native
  
  var translations: js.UndefOr[LabelHue] = js.native
  
  var valid: js.UndefOr[
    typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  
  var value: js.UndefOr[typingsSlinky.oracleOraclejet.ojcolorMod.^] = js.native
}
object ojColorSpectrumSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojColorSpectrumSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojColorSpectrumSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojColorSpectrumSettablePropertiesLenientOps[Self <: ojColorSpectrumSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setDescribedBy(value: String): Self = this.set("describedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescribedBy: Self = this.set("describedBy", js.undefined)
    
    @scala.inline
    def setDescribedByNull: Self = this.set("describedBy", null)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: ConverterHint): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    
    @scala.inline
    def setHelp(value: Instruction): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setHelpHints(value: Definition): Self = this.set("helpHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpHints: Self = this.set("helpHints", js.undefined)
    
    @scala.inline
    def setLabelHint(value: String): Self = this.set("labelHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHint: Self = this.set("labelHint", js.undefined)
    
    @scala.inline
    def setLabelledBy(value: String): Self = this.set("labelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelledBy: Self = this.set("labelledBy", js.undefined)
    
    @scala.inline
    def setLabelledByNull: Self = this.set("labelledBy", null)
    
    @scala.inline
    def setMessagesCustomVarargs(value: ^ *): Self = this.set("messagesCustom", js.Array(value :_*))
    
    @scala.inline
    def setMessagesCustom(value: js.Array[^]): Self = this.set("messagesCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagesCustom: Self = this.set("messagesCustom", js.undefined)
    
    @scala.inline
    def setTransientValue(value: typingsSlinky.oracleOraclejet.ojcolorMod.^): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransientValue: Self = this.set("transientValue", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelHue): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    
    @scala.inline
    def setValue(value: typingsSlinky.oracleOraclejet.ojcolorMod.^): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
