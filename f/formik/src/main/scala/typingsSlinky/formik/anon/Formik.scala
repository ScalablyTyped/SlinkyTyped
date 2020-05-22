package typingsSlinky.formik.anon

import typingsSlinky.formik.typesMod.FormikContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formik extends js.Object {
  var formik: FormikContext[_]
}

object Formik {
  @scala.inline
  def apply(formik: FormikContext[_]): Formik = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formik]
  }
}

