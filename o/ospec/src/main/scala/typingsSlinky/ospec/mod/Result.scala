package typingsSlinky.ospec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var context: String
  var error: js.Error | Null
  var message: String
  var pass: Boolean | Null
  var testError: js.Error | Null
}

object Result {
  @scala.inline
  def apply(
    context: String,
    message: String,
    error: js.Error = null,
    pass: Boolean = null.asInstanceOf[Boolean],
    testError: js.Error = null
  ): Result = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], testError = testError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

