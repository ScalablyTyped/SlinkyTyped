package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.wizard.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardFormValidateFailedEvent extends WizardEvent {
  
  var form: js.UndefOr[Form] = js.native
  
  var step: js.UndefOr[Step] = js.native
}
object WizardFormValidateFailedEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Wizard): WizardFormValidateFailedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardFormValidateFailedEvent]
  }
  
  @scala.inline
  implicit class WizardFormValidateFailedEventMutableBuilder[Self <: WizardFormValidateFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
