package typingsSlinky.reduxForm.reducerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormState extends js.Object {
  var active: js.UndefOr[String] = js.native
  var anyTouched: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var fields: js.UndefOr[StringDictionary[FieldState]] = js.native
  var registeredFields: js.Array[RegisteredFieldState] = js.native
  var submitErrors: js.UndefOr[StringDictionary[String]] = js.native
  var submitFailed: js.UndefOr[Boolean] = js.native
  var submitting: js.UndefOr[Boolean] = js.native
  var values: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object FormState {
  @scala.inline
  def apply(registeredFields: js.Array[RegisteredFieldState]): FormState = {
    val __obj = js.Dynamic.literal(registeredFields = registeredFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormState]
  }
  @scala.inline
  implicit class FormStateOps[Self <: FormState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisteredFields(value: js.Array[RegisteredFieldState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: String): Self = {
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
    def withAnyTouched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyTouched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyTouched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyTouched")(js.undefined)
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
    def withFields(value: StringDictionary[FieldState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitErrors(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitFailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitting")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

