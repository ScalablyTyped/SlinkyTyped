package typingsSlinky.reactJsonschemaForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSubmit[T] extends js.Object {
  var formData: T = js.native
}

object FormSubmit {
  @scala.inline
  def apply[T](formData: T): FormSubmit[T] = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSubmit[T]]
  }
  @scala.inline
  implicit class FormSubmitOps[Self[t] <: FormSubmit[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFormData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

