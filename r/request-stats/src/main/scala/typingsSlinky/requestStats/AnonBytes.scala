package typingsSlinky.requestStats

import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBytes extends js.Object {
  /**
    * Number of bytes sent by the client
    */
  var bytes: Double = js.native
  /**
    * The headers sent by the client
    */
  var headers: IncomingHttpHeaders = js.native
  /**
    * The remote ip
    */
  var ip: String = js.native
  /**
    * The HTTP method used by the client
    */
  var method: String = js.native
  /**
    * The path part of the request URL
    */
  var path: String = js.native
  /**
    * The original `http.IncomingMessage` object
    */
  var raw: IncomingMessage = js.native
}

object AnonBytes {
  @scala.inline
  def apply(
    bytes: Double,
    headers: IncomingHttpHeaders,
    ip: String,
    method: String,
    path: String,
    raw: IncomingMessage
  ): AnonBytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytes]
  }
  @scala.inline
  implicit class AnonBytesOps[Self <: AnonBytes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: IncomingHttpHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

