package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxError extends js.Object {
  var maxError: js.Any = js.native
}

object MaxError {
  @scala.inline
  def apply(maxError: js.Any): MaxError = {
    val __obj = js.Dynamic.literal(maxError = maxError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxError]
  }
  @scala.inline
  implicit class MaxErrorOps[Self <: MaxError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

