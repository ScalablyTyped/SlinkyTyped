package typingsSlinky.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedHttpResponse
  extends HttpResponse[js.typedarray.Uint8Array] {
  @JSName("body")
  var body_ResolvedHttpResponse: String
}

object ResolvedHttpResponse {
  @scala.inline
  def apply(body: String, headers: HeaderBag, statusCode: Double): ResolvedHttpResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedHttpResponse]
  }
}

