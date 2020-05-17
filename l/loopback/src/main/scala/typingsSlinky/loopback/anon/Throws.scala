package typingsSlinky.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Throws extends js.Object {
  var throws: Boolean = js.native
  var validate: Boolean = js.native
}

object Throws {
  @scala.inline
  def apply(throws: Boolean, validate: Boolean): Throws = {
    val __obj = js.Dynamic.literal(throws = throws.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throws]
  }
  @scala.inline
  implicit class ThrowsOps[Self <: Throws] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

