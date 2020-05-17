package typingsSlinky.reactForm.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactForm.mod.FormApi because var conflicts: errors, touched, values. Inlined warnings, successes, submits, submitted, asyncValidations, validating, validationFailures, validationFailed, submitForm, setValue, setAllValues, setError, setWarning, setSuccess, setTouched, setAllTouched, addValue, removeValue, swapValues, resetAll, getFormState, setFormState */ @js.native
trait FormFunctionProps
  extends FormProps
     with FormState {
  var asyncValidations: Double = js.native
  var submits: Double = js.native
  var submitted: Boolean = js.native
  var successes: FormErrors = js.native
  var validating: StringDictionary[Boolean] = js.native
  var validationFailed: StringDictionary[Boolean] = js.native
  var validationFailures: Double = js.native
  var warnings: FormErrors = js.native
  def addValue(name: String, value: js.Any): Unit = js.native
  def getFormState(): FormState = js.native
  def removeValue(name: String, index: Double): Unit = js.native
  def resetAll(): Unit = js.native
  def setAllTouched(touches: StringDictionary[Boolean]): Unit = js.native
  def setAllValues(values: FormValues): Unit = js.native
  def setError(field: String, error: String): Unit = js.native
  def setFormState(state: FormState): Unit = js.native
  def setSuccess(field: String, success: String): Unit = js.native
  def setTouched(field: String, touched: Boolean): Unit = js.native
  def setValue(fieldName: String, value: js.Any): Unit = js.native
  def setWarning(field: String, warning: String): Unit = js.native
  // Methods
  def submitForm(event: SyntheticEvent[Event, _]): Unit = js.native
  def swapValues(name: String, index1: Double, index2: Double): Unit = js.native
}

object FormFunctionProps {
  @scala.inline
  def apply(
    addValue: (String, js.Any) => Unit,
    asyncValidations: Double,
    errors: FormErrors,
    getFormState: () => FormState,
    nestedErrors: NestedErrors,
    removeValue: (String, Double) => Unit,
    resetAll: () => Unit,
    setAllTouched: StringDictionary[Boolean] => Unit,
    setAllValues: FormValues => Unit,
    setError: (String, String) => Unit,
    setFormState: FormState => Unit,
    setSuccess: (String, String) => Unit,
    setTouched: (String, Boolean) => Unit,
    setValue: (String, js.Any) => Unit,
    setWarning: (String, String) => Unit,
    submitForm: SyntheticEvent[Event, _] => Unit,
    submits: Double,
    submitted: Boolean,
    successes: FormErrors,
    swapValues: (String, Double, Double) => Unit,
    touched: Touched,
    validating: StringDictionary[Boolean],
    validationFailed: StringDictionary[Boolean],
    validationFailures: Double,
    values: FormValues,
    warnings: FormErrors
  ): FormFunctionProps = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getFormState = js.Any.fromFunction0(getFormState), nestedErrors = nestedErrors.asInstanceOf[js.Any], removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], swapValues = js.Any.fromFunction3(swapValues), touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFunctionProps]
  }
  @scala.inline
  implicit class FormFunctionPropsOps[Self <: FormFunctionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddValue(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAsyncValidations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFormState(value: () => FormState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveValue(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResetAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAllTouched(value: StringDictionary[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllTouched")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAllValues(value: FormValues => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetError(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFormState(value: FormState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFormState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSuccess(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTouched(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTouched")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetWarning(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWarning")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubmitForm(value: SyntheticEvent[Event, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitForm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccesses(value: FormErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapValues(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapValues")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValidating(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationFailed(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: FormErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

