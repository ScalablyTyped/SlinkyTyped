package typingsSlinky.expo

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponse extends js.Object {
  var error: js.Error
  var response: js.UndefOr[Response] = js.undefined
}

object AnonResponse {
  @scala.inline
  def apply(error: js.Error, response: Response = null): AnonResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResponse]
  }
}

