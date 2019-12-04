package typingsSlinky.expo

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorResponse extends js.Object {
  var error: js.Error
  var response: js.UndefOr[Response] = js.undefined
}

object Anon_ErrorResponse {
  @scala.inline
  def apply(error: js.Error, response: Response = null): Anon_ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorResponse]
  }
}

