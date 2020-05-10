package typingsSlinky.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpMessage[StreamType] extends js.Object {
  var body: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType] = js.native
  var headers: HeaderBag = js.native
}

object HttpMessage {
  @scala.inline
  def apply[StreamType](headers: HeaderBag): HttpMessage[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMessage[StreamType]]
  }
  @scala.inline
  implicit class HttpMessageOps[Self[streamtype] <: HttpMessage[streamtype], StreamType] (val x: Self[StreamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StreamType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StreamType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StreamType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StreamType] with Other]
    @scala.inline
    def withHeaders(value: HeaderBag): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String | StreamType): Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[StreamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
  }
  
}

