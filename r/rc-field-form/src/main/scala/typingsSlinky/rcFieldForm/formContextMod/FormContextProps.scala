package typingsSlinky.rcFieldForm.formContextMod

import typingsSlinky.rcFieldForm.interfaceMod.FieldData
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormContextProps extends FormProviderProps {
  def registerForm(name: String, form: FormInstance): Unit = js.native
  def triggerFormChange(name: String, changedFields: js.Array[FieldData]): Unit = js.native
  def triggerFormFinish(name: String, values: Store): Unit = js.native
  def unregisterForm(name: String): Unit = js.native
}

object FormContextProps {
  @scala.inline
  def apply(
    registerForm: (String, FormInstance) => Unit,
    triggerFormChange: (String, js.Array[FieldData]) => Unit,
    triggerFormFinish: (String, Store) => Unit,
    unregisterForm: String => Unit
  ): FormContextProps = {
    val __obj = js.Dynamic.literal(registerForm = js.Any.fromFunction2(registerForm), triggerFormChange = js.Any.fromFunction2(triggerFormChange), triggerFormFinish = js.Any.fromFunction2(triggerFormFinish), unregisterForm = js.Any.fromFunction1(unregisterForm))
    __obj.asInstanceOf[FormContextProps]
  }
  @scala.inline
  implicit class FormContextPropsOps[Self <: FormContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterForm(value: (String, FormInstance) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerForm")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTriggerFormChange(value: (String, js.Array[FieldData]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerFormChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTriggerFormFinish(value: (String, Store) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerFormFinish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnregisterForm(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterForm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

