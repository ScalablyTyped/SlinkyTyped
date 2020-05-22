package typingsSlinky.formik.fastFieldMod

import typingsSlinky.formik.anon.Name
import typingsSlinky.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastFieldProps[V] extends js.Object {
  var field: Name
  var form: FormikProps[V]
}

object FastFieldProps {
  @scala.inline
  def apply[V](field: Name, form: FormikProps[V]): FastFieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastFieldProps[V]]
  }
}

