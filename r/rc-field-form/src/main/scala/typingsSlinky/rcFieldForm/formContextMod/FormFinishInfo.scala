package typingsSlinky.rcFieldForm.formContextMod

import typingsSlinky.rcFieldForm.interfaceMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormFinishInfo extends js.Object {
  var forms: Forms = js.native
  var values: Store = js.native
}

object FormFinishInfo {
  @scala.inline
  def apply(forms: Forms, values: Store): FormFinishInfo = {
    val __obj = js.Dynamic.literal(forms = forms.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFinishInfo]
  }
  @scala.inline
  implicit class FormFinishInfoOps[Self <: FormFinishInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForms(value: Forms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

