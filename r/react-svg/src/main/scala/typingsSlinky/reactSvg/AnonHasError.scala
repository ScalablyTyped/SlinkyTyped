package typingsSlinky.reactSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasError extends js.Object {
  var hasError: Boolean = js.native
  var isLoading: Boolean = js.native
}

object AnonHasError {
  @scala.inline
  def apply(hasError: Boolean, isLoading: Boolean): AnonHasError = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasError]
  }
  @scala.inline
  implicit class AnonHasErrorOps[Self <: AnonHasError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

