package typingsSlinky.sailsIoJs.mod

import typingsSlinky.sailsIoJs.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWR extends js.Object {
  var body: js.Any
  var error: js.UndefOr[js.Error] = js.undefined
  var headers: Headers
  var statusCode: Double
  def pipe(): js.Error
  def toPOJO(): AnonBody
}

object JWR {
  @scala.inline
  def apply(
    body: js.Any,
    headers: Headers,
    pipe: () => js.Error,
    statusCode: Double,
    toPOJO: () => AnonBody,
    error: js.Error = null
  ): JWR = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], pipe = js.Any.fromFunction0(pipe), statusCode = statusCode.asInstanceOf[js.Any], toPOJO = js.Any.fromFunction0(toPOJO))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWR]
  }
}

