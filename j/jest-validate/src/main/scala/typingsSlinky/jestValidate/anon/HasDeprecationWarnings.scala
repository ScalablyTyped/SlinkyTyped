package typingsSlinky.jestValidate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: Boolean = js.native
  var isValid: Boolean = js.native
}

object HasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: Boolean, isValid: Boolean): HasDeprecationWarnings = {
    val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasDeprecationWarnings]
  }
  @scala.inline
  implicit class HasDeprecationWarningsOps[Self <: HasDeprecationWarnings] (val x: Self) extends AnyVal {
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

