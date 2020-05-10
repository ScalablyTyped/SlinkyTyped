package typingsSlinky.backlogJs

import typingsSlinky.backlogJs.mod.Error.BacklogErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrors extends js.Object {
  var errors: js.Array[BacklogErrorMessage] = js.native
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[BacklogErrorMessage]): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
  @scala.inline
  implicit class AnonErrorsOps[Self <: AnonErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[BacklogErrorMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

