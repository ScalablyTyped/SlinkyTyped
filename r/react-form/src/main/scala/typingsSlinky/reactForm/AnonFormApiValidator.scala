package typingsSlinky.reactForm

import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormApiValidator extends js.Object {
  var formApi: Validator[_] = js.native
}

object AnonFormApiValidator {
  @scala.inline
  def apply(formApi: Validator[_]): AnonFormApiValidator = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormApiValidator]
  }
  @scala.inline
  implicit class AnonFormApiValidatorOps[Self <: AnonFormApiValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormApi(value: Validator[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formApi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

