package typingsSlinky.reactForm

import typingsSlinky.reactForm.mod.FormApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormApi extends js.Object {
  var formApi: FormApi = js.native
}

object AnonFormApi {
  @scala.inline
  def apply(formApi: FormApi): AnonFormApi = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormApi]
  }
  @scala.inline
  implicit class AnonFormApiOps[Self <: AnonFormApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormApi(value: FormApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formApi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

