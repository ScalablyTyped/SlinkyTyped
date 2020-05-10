package typingsSlinky.pinoStdSerializers.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedRequest extends js.Object {
  /**
    * Reference to the `headers` object from the request (as per req.headers in core HTTP).
    */
  var headers: Record[String, String] = js.native
  /**
    * Defaults to `undefined`, unless there is an `id` property already attached to the `request` object or
    * to the `request.info` object. Attach a synchronous function to the `request.id` that returns an
    * identifier to have the value filled.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * HTTP method.
    */
  var method: String = js.native
  /**
    * Non-enumerable, i.e. will not be in the output, original request object. This is available for subsequent
    * serializers to use. In cases where the `request` input already has  a `raw` property this will
    * replace the original `request.raw` property.
    */
  var raw: IncomingMessage = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
  /**
    * Request pathname (as per req.url in core HTTP).
    */
  var url: String = js.native
}

object SerializedRequest {
  @scala.inline
  def apply(
    headers: Record[String, String],
    method: String,
    raw: IncomingMessage,
    remoteAddress: String,
    remotePort: Double,
    url: String
  ): SerializedRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedRequest]
  }
  @scala.inline
  implicit class SerializedRequestOps[Self <: SerializedRequest] (val x: Self) extends AnyVal {
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
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotePort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

