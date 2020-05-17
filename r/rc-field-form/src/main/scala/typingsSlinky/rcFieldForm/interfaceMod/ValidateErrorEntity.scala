package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateErrorEntity extends js.Object {
  var errorFields: js.Array[Errors] = js.native
  var outOfDate: Boolean = js.native
  var values: Store = js.native
}

object ValidateErrorEntity {
  @scala.inline
  def apply(errorFields: js.Array[Errors], outOfDate: Boolean, values: Store): ValidateErrorEntity = {
    val __obj = js.Dynamic.literal(errorFields = errorFields.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateErrorEntity]
  }
  @scala.inline
  implicit class ValidateErrorEntityOps[Self <: ValidateErrorEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorFields(value: js.Array[Errors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutOfDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfDate")(value.asInstanceOf[js.Any])
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

