package typingsSlinky.formik.fastFieldMod

import typingsSlinky.formik.anon.Name
import typingsSlinky.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastFieldProps[V] extends js.Object {
  var field: Name = js.native
  var form: FormikProps[V] = js.native
}

object FastFieldProps {
  @scala.inline
  def apply[V](field: Name, form: FormikProps[V]): FastFieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastFieldProps[V]]
  }
  @scala.inline
  implicit class FastFieldPropsOps[Self[v] <: FastFieldProps[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withField(value: Name): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm(value: FormikProps[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

