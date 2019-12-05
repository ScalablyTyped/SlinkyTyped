package typingsSlinky.atAwsDashSdkTypes.buildHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMessage[StreamType] extends js.Object {
  var body: js.UndefOr[
    scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String | StreamType
  ] = js.undefined
  var headers: HeaderBag
}

object HttpMessage {
  @scala.inline
  def apply[StreamType](
    headers: HeaderBag,
    body: scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String | StreamType = null
  ): HttpMessage[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMessage[StreamType]]
  }
}

