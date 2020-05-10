package typingsSlinky.bugsnagJs

import typingsSlinky.bugsnagJs.clientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorClass extends _NotifiableError {
  var errorClass: String = js.native
  var errorMessage: String = js.native
}

object AnonErrorClass {
  @scala.inline
  def apply(errorClass: String, errorMessage: String): AnonErrorClass = {
    val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorClass]
  }
  @scala.inline
  implicit class AnonErrorClassOps[Self <: AnonErrorClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

