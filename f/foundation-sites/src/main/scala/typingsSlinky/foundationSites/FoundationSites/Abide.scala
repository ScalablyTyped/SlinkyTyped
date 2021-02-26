package typingsSlinky.foundationSites.FoundationSites

import typingsSlinky.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/abide.html#javascript-reference
@js.native
trait Abide extends StObject {
  
  def addErrorClasses(element: JQuery): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def findFormError(element: JQuery): JQuery = js.native
  
  def findLabel(element: JQuery): Boolean = js.native
  
  def matchValidation(element: JQuery, validators: String, required: Boolean): Boolean = js.native
  
  def removeErrorClasses(element: JQuery): Unit = js.native
  
  def removeRadioErrorClasses(groupName: String): Unit = js.native
  
  def requiredChecked(element: JQuery): Boolean = js.native
  
  def resetForm(): Unit = js.native
  
  def validateForm(): Boolean = js.native
  
  def validateInput(element: JQuery): Boolean = js.native
  
  def validateRadio(groupName: String): Boolean = js.native
  
  def validateText(element: JQuery, pattern: String): Boolean = js.native
}
object Abide {
  
  @scala.inline
  def apply(
    addErrorClasses: JQuery => Unit,
    destroy: () => Unit,
    findFormError: JQuery => JQuery,
    findLabel: JQuery => Boolean,
    matchValidation: (JQuery, String, Boolean) => Boolean,
    removeErrorClasses: JQuery => Unit,
    removeRadioErrorClasses: String => Unit,
    requiredChecked: JQuery => Boolean,
    resetForm: () => Unit,
    validateForm: () => Boolean,
    validateInput: JQuery => Boolean,
    validateRadio: String => Boolean,
    validateText: (JQuery, String) => Boolean
  ): Abide = {
    val __obj = js.Dynamic.literal(addErrorClasses = js.Any.fromFunction1(addErrorClasses), destroy = js.Any.fromFunction0(destroy), findFormError = js.Any.fromFunction1(findFormError), findLabel = js.Any.fromFunction1(findLabel), matchValidation = js.Any.fromFunction3(matchValidation), removeErrorClasses = js.Any.fromFunction1(removeErrorClasses), removeRadioErrorClasses = js.Any.fromFunction1(removeRadioErrorClasses), requiredChecked = js.Any.fromFunction1(requiredChecked), resetForm = js.Any.fromFunction0(resetForm), validateForm = js.Any.fromFunction0(validateForm), validateInput = js.Any.fromFunction1(validateInput), validateRadio = js.Any.fromFunction1(validateRadio), validateText = js.Any.fromFunction2(validateText))
    __obj.asInstanceOf[Abide]
  }
  
  @scala.inline
  implicit class AbideMutableBuilder[Self <: Abide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddErrorClasses(value: JQuery => Unit): Self = StObject.set(x, "addErrorClasses", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindFormError(value: JQuery => JQuery): Self = StObject.set(x, "findFormError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindLabel(value: JQuery => Boolean): Self = StObject.set(x, "findLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchValidation(value: (JQuery, String, Boolean) => Boolean): Self = StObject.set(x, "matchValidation", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveErrorClasses(value: JQuery => Unit): Self = StObject.set(x, "removeErrorClasses", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveRadioErrorClasses(value: String => Unit): Self = StObject.set(x, "removeRadioErrorClasses", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequiredChecked(value: JQuery => Boolean): Self = StObject.set(x, "requiredChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetForm(value: () => Unit): Self = StObject.set(x, "resetForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateForm(value: () => Boolean): Self = StObject.set(x, "validateForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateInput(value: JQuery => Boolean): Self = StObject.set(x, "validateInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateRadio(value: String => Boolean): Self = StObject.set(x, "validateRadio", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateText(value: (JQuery, String) => Boolean): Self = StObject.set(x, "validateText", js.Any.fromFunction2(value))
  }
}
