package typingsSlinky.bent.mod

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Response & {  statusCode :number} */
@js.native
trait FetchResponse extends BentResponse {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def blob(): js.Promise[Blob] = js.native
  
  val body: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  val bodyUsed: Boolean = js.native
  
  def formData(): js.Promise[FormData] = js.native
  
  val headers: org.scalajs.dom.experimental.Headers = js.native
  
  def json(): js.Promise[_] = js.native
  
  val ok: Boolean = js.native
  
  val redirected: Boolean = js.native
  
  val status: Double = js.native
  
  var statusCode: Double = js.native
  
  val statusText: String = js.native
  
  def text(): js.Promise[String] = js.native
  
  val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
  
  val `type`: ResponseType = js.native
  
  val url: String = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = this.set("arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => js.Promise[Blob]): Self = this.set("blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBodyUsed(value: Boolean): Self = this.set("bodyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: () => js.Promise[FormData]): Self = this.set("formData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: org.scalajs.dom.experimental.Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirected(value: Boolean): Self = this.set("redirected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = this.set("text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrailer(value: js.Promise[org.scalajs.dom.experimental.Headers]): Self = this.set("trailer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResponseType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
  }
}
