package typingsSlinky.reduxForm.fieldMod

import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldMetaProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var asyncValidating: Boolean = js.native
  var autofilled: Boolean = js.native
  var dirty: Boolean = js.native
  var dispatch: Dispatch[_] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var form: String = js.native
  var initial: js.Any = js.native
  var invalid: Boolean = js.native
  var pristine: Boolean = js.native
  var submitFailed: Boolean = js.native
  var submitting: Boolean = js.native
  var touched: Boolean = js.native
  var valid: Boolean = js.native
  var visited: Boolean = js.native
  var warning: js.UndefOr[js.Any] = js.native
}

object WrappedFieldMetaProps {
  @scala.inline
  def apply(
    asyncValidating: Boolean,
    autofilled: Boolean,
    dirty: Boolean,
    dispatch: _ => _,
    form: String,
    initial: js.Any,
    invalid: Boolean,
    pristine: Boolean,
    submitFailed: Boolean,
    submitting: Boolean,
    touched: Boolean,
    valid: Boolean,
    visited: Boolean
  ): WrappedFieldMetaProps = {
    val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], autofilled = autofilled.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), form = form.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldMetaProps]
  }
  @scala.inline
  implicit class WrappedFieldMetaPropsOps[Self <: WrappedFieldMetaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncValidating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatch(value: _ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPristine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pristine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitFailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

