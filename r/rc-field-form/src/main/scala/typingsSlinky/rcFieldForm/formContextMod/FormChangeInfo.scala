package typingsSlinky.rcFieldForm.formContextMod

import typingsSlinky.rcFieldForm.interfaceMod.FieldData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormChangeInfo extends js.Object {
  var changedFields: js.Array[FieldData] = js.native
  var forms: Forms = js.native
}

object FormChangeInfo {
  @scala.inline
  def apply(changedFields: js.Array[FieldData], forms: Forms): FormChangeInfo = {
    val __obj = js.Dynamic.literal(changedFields = changedFields.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormChangeInfo]
  }
  @scala.inline
  implicit class FormChangeInfoOps[Self <: FormChangeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedFields(value: js.Array[FieldData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForms(value: Forms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

