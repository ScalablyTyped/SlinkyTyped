package typingsSlinky.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var error: js.Error
  var response: js.UndefOr[org.scalajs.dom.experimental.Response] = js.undefined
}

object Response {
  @scala.inline
  def apply(error: js.Error, response: org.scalajs.dom.experimental.Response = null): Response = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

