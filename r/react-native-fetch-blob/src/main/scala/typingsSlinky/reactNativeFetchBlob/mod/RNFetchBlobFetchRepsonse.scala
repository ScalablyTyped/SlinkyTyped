package typingsSlinky.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobFetchRepsonse extends js.Object {
  var bodyUsed: Boolean = js.native
  var headers: js.Any = js.native
  var ok: Boolean = js.native
  var resp: FetchBlobResponse = js.native
  var rnfbResp: FetchBlobResponse = js.native
  var rnfbRespInfo: RNFetchBlobResponseInfo = js.native
  var status: Double = js.native
  var `type`: String = js.native
  def arrayBuffer(): js.Promise[js.Array[_]] = js.native
  def blob(): js.Promise[PolyfillBlob] = js.native
  def json(): js.Promise[_] = js.native
  def rawResp(): js.Promise[FetchBlobResponse] = js.native
  def text(): js.Promise[String] = js.native
}

object RNFetchBlobFetchRepsonse {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.Array[_]],
    blob: () => js.Promise[PolyfillBlob],
    bodyUsed: Boolean,
    headers: js.Any,
    json: () => js.Promise[_],
    ok: Boolean,
    rawResp: () => js.Promise[FetchBlobResponse],
    resp: FetchBlobResponse,
    rnfbResp: FetchBlobResponse,
    rnfbRespInfo: RNFetchBlobResponseInfo,
    status: Double,
    text: () => js.Promise[String],
    `type`: String
  ): RNFetchBlobFetchRepsonse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], rawResp = js.Any.fromFunction0(rawResp), resp = resp.asInstanceOf[js.Any], rnfbResp = rnfbResp.asInstanceOf[js.Any], rnfbRespInfo = rnfbRespInfo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobFetchRepsonse]
  }
  @scala.inline
  implicit class RNFetchBlobFetchRepsonseOps[Self <: RNFetchBlobFetchRepsonse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBuffer(value: () => js.Promise[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlob(value: () => js.Promise[PolyfillBlob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBodyUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawResp(value: () => js.Promise[FetchBlobResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawResp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResp(value: FetchBlobResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRnfbResp(value: FetchBlobResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rnfbResp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRnfbRespInfo(value: RNFetchBlobResponseInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rnfbRespInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

