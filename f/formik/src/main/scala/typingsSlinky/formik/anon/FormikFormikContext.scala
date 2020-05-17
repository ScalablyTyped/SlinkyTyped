package typingsSlinky.formik.anon

import typingsSlinky.formik.typesMod.FormikContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikFormikContext[Values] extends js.Object {
  var formik: FormikContext[Values] = js.native
}

object FormikFormikContext {
  @scala.inline
  def apply[Values](formik: FormikContext[Values]): FormikFormikContext[Values] = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikFormikContext[Values]]
  }
  @scala.inline
  implicit class FormikFormikContextOps[Self[values] <: FormikFormikContext[values], Values] (val x: Self[Values]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Values] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Values]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Values] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Values] with Other]
    @scala.inline
    def withFormik(value: FormikContext[Values]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formik")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

