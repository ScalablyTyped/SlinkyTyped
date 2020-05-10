package typingsSlinky.bent.mod

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Response & {  statusCode  :number} */
@js.native
trait FetchResponse extends BentResponse {
  val body: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  val bodyUsed: Boolean = js.native
  val headers: org.scalajs.dom.experimental.Headers = js.native
  val ok: Boolean = js.native
  val redirected: Boolean = js.native
  val status: Double = js.native
  var statusCode: Double = js.native
  val statusText: String = js.native
  val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
  val `type`: ResponseType = js.native
  val url: String = js.native
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def formData(): js.Promise[FormData] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
}

object FetchResponse {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[FormData],
    headers: org.scalajs.dom.experimental.Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    redirected: Boolean,
    status: Double,
    statusCode: Double,
    statusText: String,
    text: () => js.Promise[String],
    trailer: js.Promise[org.scalajs.dom.experimental.Headers],
    `type`: ResponseType,
    url: String
  ): FetchResponse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResponse]
  }
  @scala.inline
  implicit class FetchResponseOps[Self <: FetchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlob(value: () => js.Promise[Blob]): Self = {
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
    def withFormData(value: () => js.Promise[FormData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: org.scalajs.dom.experimental.Headers): Self = {
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
    def withRedirected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrailer(value: js.Promise[org.scalajs.dom.experimental.Headers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
        ret
    }
  }
  
}

