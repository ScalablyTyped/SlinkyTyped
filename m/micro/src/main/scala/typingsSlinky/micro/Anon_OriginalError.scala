package typingsSlinky.micro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalError extends js.Object {
  var originalError: js.UndefOr[js.Error] = js.undefined
  var statusCode: Double
}

object Anon_OriginalError {
  @scala.inline
  def apply(statusCode: Double, originalError: js.Error = null): Anon_OriginalError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OriginalError]
  }
}

