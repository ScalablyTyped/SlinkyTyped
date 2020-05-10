package typingsSlinky.formik.typesMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikRegistration extends js.Object {
  def registerField(name: String, Comp: ReactComponentClass[_]): Unit = js.native
  def unregisterField(name: String): Unit = js.native
}

object FormikRegistration {
  @scala.inline
  def apply(registerField: (String, ReactComponentClass[_]) => Unit, unregisterField: String => Unit): FormikRegistration = {
    val __obj = js.Dynamic.literal(registerField = js.Any.fromFunction2(registerField), unregisterField = js.Any.fromFunction1(unregisterField))
    __obj.asInstanceOf[FormikRegistration]
  }
  @scala.inline
  implicit class FormikRegistrationOps[Self <: FormikRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterField(value: (String, ReactComponentClass[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerField")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnregisterField(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterField")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

