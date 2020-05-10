package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormContext extends js.Object {
  var dirty: Dirty = js.native
  var errors: Errors = js.native
  var fields: Fields = js.native
  var isValid: Boolean = js.native
  var submitted: Boolean = js.native
  def register(config: FieldsConfig, transforms: Transforms, initialValues: Dictionary[_]): Unit = js.native
  def resetAll(): Unit = js.native
  def setError(delta: Errors): Unit = js.native
  def setField(delta: Fields): Unit = js.native
  def submit(): Unit = js.native
  def unregister(config: FieldsConfig): Unit = js.native
}

object FormContext {
  @scala.inline
  def apply(
    dirty: Dirty,
    errors: Errors,
    fields: Fields,
    isValid: Boolean,
    register: (FieldsConfig, Transforms, Dictionary[_]) => Unit,
    resetAll: () => Unit,
    setError: Errors => Unit,
    setField: Fields => Unit,
    submit: () => Unit,
    submitted: Boolean,
    unregister: FieldsConfig => Unit
  ): FormContext = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], register = js.Any.fromFunction3(register), resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[FormContext]
  }
  @scala.inline
  implicit class FormContextOps[Self <: FormContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirty(value: Dirty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegister(value: (FieldsConfig, Transforms, Dictionary[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResetAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetError(value: Errors => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetField(value: Fields => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnregister(value: FieldsConfig => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

