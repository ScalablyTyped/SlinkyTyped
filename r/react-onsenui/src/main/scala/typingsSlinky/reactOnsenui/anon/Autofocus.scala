package typingsSlinky.reactOnsenui.anon

import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autofocus extends StObject {
  
  var autofocus: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[_], Unit]] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object Autofocus {
  
  @scala.inline
  def apply(): Autofocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autofocus]
  }
  
  @scala.inline
  implicit class AutofocusMutableBuilder[Self <: Autofocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ ChangeEvent[_] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
