package typingsSlinky.formstate.anon

import typingsSlinky.formstate.formstateBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasError extends js.Object {
  var hasError: `true` = js.native
}

object HasError {
  @scala.inline
  def apply(hasError: `true`): HasError = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasError]
  }
  @scala.inline
  implicit class HasErrorOps[Self <: HasError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasError(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

