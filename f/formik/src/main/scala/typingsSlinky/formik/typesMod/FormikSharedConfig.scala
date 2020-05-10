package typingsSlinky.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikSharedConfig[Props] extends js.Object {
  var enableReinitialize: js.UndefOr[Boolean] = js.native
  var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ Props, Boolean])] = js.native
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  var validateOnChange: js.UndefOr[Boolean] = js.native
}

object FormikSharedConfig {
  @scala.inline
  def apply[Props](): FormikSharedConfig[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormikSharedConfig[Props]]
  }
  @scala.inline
  implicit class FormikSharedConfigOps[Self[props] <: FormikSharedConfig[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withEnableReinitialize(value: Boolean): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReinitialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableReinitialize: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReinitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInitialValidFunction1(value: /* props */ Props => Boolean): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitialValid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsInitialValid(value: Boolean | (js.Function1[/* props */ Props, Boolean])): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitialValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInitialValid: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitialValid")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnBlur(value: Boolean): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnBlur: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnChange(value: Boolean): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnChange: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnChange")(js.undefined)
        ret
    }
  }
  
}

