package typingsSlinky.reduxForm.reduxFormMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedFormProps[FormData, P, ErrorType] extends js.Object {
  var anyTouched: Boolean = js.native
  var array: InjectedArrayProps = js.native
  var asyncValidating: String | Boolean = js.native
  var dirty: Boolean = js.native
  var error: ErrorType = js.native
  var form: String = js.native
  var handleSubmit: SubmitHandler[FormData, P, ErrorType] = js.native
  var initialValues: Partial[FormData] = js.native
  var initialized: Boolean = js.native
  var invalid: Boolean = js.native
  var pristine: Boolean = js.native
  var registeredFields: StringDictionary[RegisteredField] = js.native
  var submitFailed: Boolean = js.native
  var submitSucceeded: Boolean = js.native
  var submitting: Boolean = js.native
  var valid: Boolean = js.native
  var warning: js.Any = js.native
  def asyncValidate(): Unit = js.native
  def autofill(field: String, value: js.Any): Unit = js.native
  def blur(field: String, value: js.Any): Unit = js.native
  def change(field: String, value: js.Any): Unit = js.native
  def clearAsyncError(field: String): Unit = js.native
  def destroy(): Unit = js.native
  def initialize(data: Partial[FormData]): Unit = js.native
  def reset(): Unit = js.native
  def touch(field: String*): Unit = js.native
  def untouch(field: String*): Unit = js.native
}

object InjectedFormProps {
  @scala.inline
  def apply[FormData, P, ErrorType](
    anyTouched: Boolean,
    array: InjectedArrayProps,
    asyncValidate: () => Unit,
    asyncValidating: String | Boolean,
    autofill: (String, js.Any) => Unit,
    blur: (String, js.Any) => Unit,
    change: (String, js.Any) => Unit,
    clearAsyncError: String => Unit,
    destroy: () => Unit,
    dirty: Boolean,
    error: ErrorType,
    form: String,
    handleSubmit: SubmitHandler[FormData, P, ErrorType],
    initialValues: Partial[FormData],
    initialize: Partial[FormData] => Unit,
    initialized: Boolean,
    invalid: Boolean,
    pristine: Boolean,
    registeredFields: StringDictionary[RegisteredField],
    reset: () => Unit,
    submitFailed: Boolean,
    submitSucceeded: Boolean,
    submitting: Boolean,
    touch: /* repeated */ String => Unit,
    untouch: /* repeated */ String => Unit,
    valid: Boolean,
    warning: js.Any
  ): InjectedFormProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(anyTouched = anyTouched.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], asyncValidate = js.Any.fromFunction0(asyncValidate), asyncValidating = asyncValidating.asInstanceOf[js.Any], autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), destroy = js.Any.fromFunction0(destroy), dirty = dirty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], handleSubmit = handleSubmit.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], registeredFields = registeredFields.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touch = js.Any.fromFunction1(touch), untouch = js.Any.fromFunction1(untouch), valid = valid.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedFormProps[FormData, P, ErrorType]]
  }
  @scala.inline
  implicit class InjectedFormPropsOps[Self[formdata, p, errortype] <: InjectedFormProps[formdata, p, errortype], FormData, P, ErrorType] (val x: Self[FormData, P, ErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormData, P, ErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormData, P, ErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[FormData, P, ErrorType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[FormData, P, ErrorType]) with Other]
    @scala.inline
    def withAnyTouched(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyTouched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArray(value: InjectedArrayProps): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncValidate(value: () => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsyncValidating(value: String | Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutofill(value: (String, js.Any) => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofill")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBlur(value: (String, js.Any) => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChange(value: (String, js.Any) => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClearAsyncError(value: String => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAsyncError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorType): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm(value: String): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleSubmit(value: SubmitHandler[FormData, P, ErrorType]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialValues(value: Partial[FormData]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialize(value: Partial[FormData] => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialized(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPristine(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pristine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredFields(value: StringDictionary[RegisteredField]): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmitFailed(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitSucceeded(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitting(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouch(value: /* repeated */ String => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUntouch(value: /* repeated */ String => Unit): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untouch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: js.Any): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

