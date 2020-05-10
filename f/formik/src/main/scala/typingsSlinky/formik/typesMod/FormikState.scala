package typingsSlinky.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikState[Values] extends js.Object {
  var error: js.UndefOr[js.Any] = js.native
  var errors: FormikErrors[Values] = js.native
  var isSubmitting: Boolean = js.native
  var isValidating: Boolean = js.native
  var status: js.UndefOr[js.Any] = js.native
  var submitCount: Double = js.native
  var touched: FormikTouched[Values] = js.native
  var values: Values = js.native
}

object FormikState {
  @scala.inline
  def apply[Values](
    errors: FormikErrors[Values],
    isSubmitting: Boolean,
    isValidating: Boolean,
    submitCount: Double,
    touched: FormikTouched[Values],
    values: Values
  ): FormikState[Values] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], submitCount = submitCount.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikState[Values]]
  }
  @scala.inline
  implicit class FormikStateOps[Self[values] <: FormikState[values], Values] (val x: Self[Values]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Values] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Values]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Values] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Values] with Other]
    @scala.inline
    def withErrors(value: FormikErrors[Values]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSubmitting(value: Boolean): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubmitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValidating(value: Boolean): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitCount(value: Double): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouched(value: FormikTouched[Values]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Values): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: js.Any): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

