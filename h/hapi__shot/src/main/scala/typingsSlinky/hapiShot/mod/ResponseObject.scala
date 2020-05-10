package typingsSlinky.hapiShot.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hapiShot.AnonReq
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseObject extends js.Object {
  /** an object containing the response headers. */
  var headers: Headers = js.native
  /** the payload as a UTF-8 encoded string. */
  var payload: String = js.native
  /** an object containing the raw request and response objects where: */
  var raw: AnonReq = js.native
  /** the raw payload as a Buffer. */
  var rawPayload: Buffer = js.native
  /** the HTTP status code. */
  var statusCode: Double = js.native
  /** the HTTP status message. */
  var statusMessage: String = js.native
  /** an object containing the response trailers. */
  var trailers: StringDictionary[js.Any] = js.native
}

object ResponseObject {
  @scala.inline
  def apply(
    headers: Headers,
    payload: String,
    raw: AnonReq,
    rawPayload: Buffer,
    statusCode: Double,
    statusMessage: String,
    trailers: StringDictionary[js.Any]
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  @scala.inline
  implicit class ResponseObjectOps[Self <: ResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: AnonReq): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawPayload(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrailers(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

