package typingsSlinky.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validate extends js.Object {
  var validate: Boolean = js.native
}

object Validate {
  @scala.inline
  def apply(validate: Boolean): Validate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate]
  }
  @scala.inline
  implicit class ValidateOps[Self <: Validate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

