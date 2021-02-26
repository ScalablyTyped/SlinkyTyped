package typingsSlinky.materialTextfield.anon

import typingsSlinky.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import typingsSlinky.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import typingsSlinky.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/types.MDCTextFieldFoundationMap> */
@js.native
trait PartialMDCTextFieldFounda extends StObject {
  
  var characterCounter: js.UndefOr[MDCTextFieldCharacterCounterFoundation] = js.native
  
  var helperText: js.UndefOr[MDCTextFieldHelperTextFoundation] = js.native
  
  var leadingIcon: js.UndefOr[MDCTextFieldIconFoundation] = js.native
  
  var trailingIcon: js.UndefOr[MDCTextFieldIconFoundation] = js.native
}
object PartialMDCTextFieldFounda {
  
  @scala.inline
  def apply(): PartialMDCTextFieldFounda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldFounda]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldFoundaMutableBuilder[Self <: PartialMDCTextFieldFounda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacterCounter(value: MDCTextFieldCharacterCounterFoundation): Self = StObject.set(x, "characterCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterCounterUndefined: Self = StObject.set(x, "characterCounter", js.undefined)
    
    @scala.inline
    def setHelperText(value: MDCTextFieldHelperTextFoundation): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    @scala.inline
    def setLeadingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "leadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingIconUndefined: Self = StObject.set(x, "leadingIcon", js.undefined)
    
    @scala.inline
    def setTrailingIcon(value: MDCTextFieldIconFoundation): Self = StObject.set(x, "trailingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingIconUndefined: Self = StObject.set(x, "trailingIcon", js.undefined)
  }
}
