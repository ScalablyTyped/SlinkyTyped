package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorValidateInputEvent extends ValidatorEvent {
  
  var error: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[JQuery] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
}
object ValidatorValidateInputEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Validator): ValidatorValidateInputEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorValidateInputEvent]
  }
  
  @scala.inline
  implicit class ValidatorValidateInputEventOps[Self <: ValidatorValidateInputEvent] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setInput(value: JQuery): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
}
