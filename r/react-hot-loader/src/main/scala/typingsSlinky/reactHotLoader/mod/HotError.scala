package typingsSlinky.reactHotLoader.mod

import typingsSlinky.react.mod.ErrorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotError extends js.Object {
  var error: js.Error = js.native
  var errorInfo: js.UndefOr[ErrorInfo] = js.native
}

object HotError {
  @scala.inline
  def apply(error: js.Error): HotError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotError]
  }
  @scala.inline
  implicit class HotErrorOps[Self <: HotError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorInfo(value: ErrorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(js.undefined)
        ret
    }
  }
  
}

