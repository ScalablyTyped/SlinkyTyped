package typingsSlinky.reactDashHotDashLoader.reactDashHotDashLoaderMod

import typingsSlinky.react.reactMod.ErrorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotError extends js.Object {
  var error: js.Error
  var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
}

object HotError {
  @scala.inline
  def apply(error: js.Error, errorInfo: ErrorInfo = null): HotError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (errorInfo != null) __obj.updateDynamic("errorInfo")(errorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotError]
  }
}

