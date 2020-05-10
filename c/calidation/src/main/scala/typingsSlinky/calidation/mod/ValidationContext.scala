package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<calidation.calidation.FormContext, 'register' | 'unregister'> */
@js.native
trait ValidationContext extends js.Object {
  var dirty: Dirty = js.native
  var errors: Errors = js.native
  var fields: Fields = js.native
  var isValid: Boolean = js.native
  var resetAll: js.Function0[Unit] = js.native
  var setError: js.Function1[/* delta */ Errors, Unit] = js.native
  var setField: js.Function1[/* delta */ Fields, Unit] = js.native
  var submit: js.Function0[Unit] = js.native
  var submitted: Boolean = js.native
}

object ValidationContext {
  @scala.inline
  def apply(
    dirty: Dirty,
    errors: Errors,
    fields: Fields,
    isValid: Boolean,
    resetAll: () => Unit,
    setError: /* delta */ Errors => Unit,
    setField: /* delta */ Fields => Unit,
    submit: () => Unit,
    submitted: Boolean
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationContext]
  }
  @scala.inline
  implicit class ValidationContextOps[Self <: ValidationContext] (val x: Self) extends AnyVal {
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
    def withResetAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetError(value: /* delta */ Errors => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetField(value: /* delta */ Fields => Unit): Self = {
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
  }
  
}

