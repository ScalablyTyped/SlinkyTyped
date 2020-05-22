package typingsSlinky.formik.anon

import typingsSlinky.formik.typesMod.FormikContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormikFormikContext[Values] extends js.Object {
  var formik: FormikContext[Values]
}

object FormikFormikContext {
  @scala.inline
  def apply[Values](formik: FormikContext[Values]): FormikFormikContext[Values] = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikFormikContext[Values]]
  }
}

