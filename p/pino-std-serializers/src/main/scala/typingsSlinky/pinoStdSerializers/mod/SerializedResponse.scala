package typingsSlinky.pinoStdSerializers.mod

import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedResponse extends js.Object {
  /**
    * The headers to be sent in the response.
    */
  var headers: Record[String, String] = js.native
  /**
    * Non-enumerable, i.e. will not be in the output, original response object. This is available for subsequent serializers to use.
    */
  var raw: ServerResponse = js.native
  /**
    * HTTP status code.
    */
  var statusCode: Double = js.native
}

object SerializedResponse {
  @scala.inline
  def apply(headers: Record[String, String], raw: ServerResponse, statusCode: Double): SerializedResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedResponse]
  }
  @scala.inline
  implicit class SerializedResponseOps[Self <: SerializedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: ServerResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

