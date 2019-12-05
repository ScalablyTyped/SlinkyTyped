package typingsSlinky.atAwsDashSdkTypes.buildHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse[StreamType] extends HttpMessage[StreamType] {
  var statusCode: Double
}

object HttpResponse {
  @scala.inline
  def apply[StreamType](
    headers: HeaderBag,
    statusCode: Double,
    body: scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String | StreamType = null
  ): HttpResponse[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse[StreamType]]
  }
}

