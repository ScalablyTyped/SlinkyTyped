package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.wizard.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardContentLoadEvent extends WizardEvent {
  
  var step: js.UndefOr[Step] = js.native
}
object WizardContentLoadEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Wizard): WizardContentLoadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardContentLoadEvent]
  }
  
  @scala.inline
  implicit class WizardContentLoadEventMutableBuilder[Self <: WizardContentLoadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
