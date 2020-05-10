package typingsSlinky.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormState extends js.Object {
  var dirty: js.UndefOr[Boolean] = js.native
  var errors: FormErrors = js.native
  var nestedErrors: NestedErrors = js.native
  var touched: Touched = js.native
  var values: FormValues = js.native
}

object FormState {
  @scala.inline
  def apply(errors: FormErrors, nestedErrors: NestedErrors, touched: Touched, values: FormValues): FormState = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormState]
  }
  @scala.inline
  implicit class FormStateOps[Self <: FormState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: FormErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestedErrors(value: NestedErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouched(value: Touched): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: FormValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(js.undefined)
        ret
    }
  }
  
}

