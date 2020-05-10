package typingsSlinky.formik

import typingsSlinky.formik.typesMod.FormikContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormik extends js.Object {
  var formik: FormikContext[_] = js.native
}

object AnonFormik {
  @scala.inline
  def apply(formik: FormikContext[_]): AnonFormik = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormik]
  }
  @scala.inline
  implicit class AnonFormikOps[Self <: AnonFormik] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormik(value: FormikContext[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formik")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

