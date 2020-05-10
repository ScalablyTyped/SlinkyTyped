package typingsSlinky.electron.Electron

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/stream-protocol-response
  /**
    * A Node.js readable stream representing the response body.
    */
  var data: ReadableStream = js.native
  /**
    * An object containing the response headers.
    */
  var headers: Headers = js.native
  /**
    * The HTTP response code.
    */
  var statusCode: Double = js.native
}

object StreamProtocolResponse {
  @scala.inline
  def apply(data: ReadableStream, headers: Headers, statusCode: Double): StreamProtocolResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProtocolResponse]
  }
  @scala.inline
  implicit class StreamProtocolResponseOps[Self <: StreamProtocolResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
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

