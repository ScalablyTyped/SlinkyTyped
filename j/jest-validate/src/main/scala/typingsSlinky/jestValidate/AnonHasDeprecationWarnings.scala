package typingsSlinky.jestValidate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: Boolean = js.native
  var isValid: Boolean = js.native
}

object AnonHasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: Boolean, isValid: Boolean): AnonHasDeprecationWarnings = {
    val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasDeprecationWarnings]
  }
  @scala.inline
  implicit class AnonHasDeprecationWarningsOps[Self <: AnonHasDeprecationWarnings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasDeprecationWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDeprecationWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

