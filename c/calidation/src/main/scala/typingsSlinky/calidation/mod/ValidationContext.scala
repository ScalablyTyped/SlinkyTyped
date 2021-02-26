package typingsSlinky.calidation.mod

import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<calidation.calidation.FormContext<T>, 'register' | 'unregister'> */
@js.native
trait ValidationContext[T /* <: js.Object */] extends StObject {
  
  var dirty: Dirty[T] = js.native
  
  var errors: Errors[T] = js.native
  
  var fields: Fields[T] = js.native
  
  var isValid: Boolean = js.native
  
  var resetAll: js.Function0[Unit] = js.native
  
  var setError: js.Function1[/* delta */ Errors[T], Unit] = js.native
  
  var setField: js.Function1[/* delta */ Partial[T], Unit] = js.native
  
  var submit: js.Function0[Unit] = js.native
  
  var submitted: Boolean = js.native
}
object ValidationContext {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    dirty: Dirty[T],
    errors: Errors[T],
    fields: Fields[T],
    isValid: Boolean,
    resetAll: () => Unit,
    setError: /* delta */ Errors[T] => Unit,
    setField: /* delta */ Partial[T] => Unit,
    submit: () => Unit,
    submitted: Boolean
  ): ValidationContext[T] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationContext[T]]
  }
  
  @scala.inline
  implicit class ValidationContextMutableBuilder[Self <: ValidationContext[_], T /* <: js.Object */] (val x: Self with ValidationContext[T]) extends AnyVal {
    
    @scala.inline
    def setDirty(value: Dirty[T]): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: Errors[T]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: Fields[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAll(value: () => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetError(value: /* delta */ Errors[T] => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetField(value: /* delta */ Partial[T] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitted(value: Boolean): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
  }
}
