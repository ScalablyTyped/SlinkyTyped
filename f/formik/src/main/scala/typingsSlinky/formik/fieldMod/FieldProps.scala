package typingsSlinky.formik.fieldMod

import typingsSlinky.formik.AnonOnBlur
import typingsSlinky.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps[V] extends js.Object {
  var field: AnonOnBlur = js.native
  var form: FormikProps[V] = js.native
}

object FieldProps {
  @scala.inline
  def apply[V](field: AnonOnBlur, form: FormikProps[V]): FieldProps[V] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps[V]]
  }
  @scala.inline
  implicit class FieldPropsOps[Self[v] <: FieldProps[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withField(value: AnonOnBlur): Self[V] = {
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

