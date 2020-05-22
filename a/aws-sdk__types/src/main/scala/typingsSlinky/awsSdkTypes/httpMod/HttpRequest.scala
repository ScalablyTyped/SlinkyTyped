package typingsSlinky.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequest[StreamType]
  extends HttpMessage[StreamType]
     with HttpEndpoint {
  var method: String
}

object HttpRequest {
  @scala.inline
  def apply[StreamType](
    headers: HeaderBag,
    hostname: String,
    method: String,
    path: String,
    protocol: String,
    body: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType = null,
    port: js.UndefOr[Double] = js.undefined,
    query: QueryParameterBag = null
  ): HttpRequest[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequest[StreamType]]
  }
}

