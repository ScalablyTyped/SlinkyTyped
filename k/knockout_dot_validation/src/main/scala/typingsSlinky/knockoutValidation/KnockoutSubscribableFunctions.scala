package typingsSlinky.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  
  def clearError(): Unit = js.native
  
  var error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any = js.native
  
  var isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  var isValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
  
  var isValidating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  var rules: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<KnockoutValidationRule> */ js.Any = js.native
  
  def setError(error: String): Unit = js.native
}
object KnockoutSubscribableFunctions {
  
  @scala.inline
  def apply[T](
    clearError: () => Unit,
    error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any,
    isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    isValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any,
    isValidating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    rules: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<KnockoutValidationRule> */ js.Any,
    setError: String => Unit
  ): KnockoutSubscribableFunctions[T] = {
    val __obj = js.Dynamic.literal(clearError = js.Any.fromFunction0(clearError), error = error.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], setError = js.Any.fromFunction1(setError))
    __obj.asInstanceOf[KnockoutSubscribableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutSubscribableFunctionsOps[Self <: KnockoutSubscribableFunctions[_], T] (val x: Self with KnockoutSubscribableFunctions[T]) extends AnyVal {
    
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
    def setClearError(value: () => Unit): Self = this.set("clearError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any
    ): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModified(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("isModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
    ): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidating(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("isValidating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<KnockoutValidationRule> */ js.Any
    ): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetError(value: String => Unit): Self = this.set("setError", js.Any.fromFunction1(value))
  }
}
