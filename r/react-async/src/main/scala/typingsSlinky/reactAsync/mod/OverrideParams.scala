package typingsSlinky.reactAsync.mod

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  resource :std.RequestInfo | undefined} & std.Partial<std.RequestInit> */
@js.native
trait OverrideParams extends js.Object {
  var body: js.UndefOr[BodyInit | Null] = js.native
  var cache: js.UndefOr[RequestCache] = js.native
  var credentials: js.UndefOr[RequestCredentials] = js.native
  var headers: js.UndefOr[HeadersInit] = js.native
  var integrity: js.UndefOr[String] = js.native
  var keepalive: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[String] = js.native
  var mode: js.UndefOr[RequestMode] = js.native
  var redirect: js.UndefOr[RequestRedirect] = js.native
  var referrer: js.UndefOr[String] = js.native
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  var resource: js.UndefOr[RequestInfo] = js.native
  var signal: js.UndefOr[AbortSignal | Null] = js.native
  var window: js.UndefOr[js.Any] = js.native
}

object OverrideParams {
  @scala.inline
  def apply(): OverrideParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideParams]
  }
  @scala.inline
  implicit class OverrideParamsOps[Self <: OverrideParams] (val x: Self) extends AnyVal {
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
    def setBodyFormData(value: FormData): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyReadableStream(value: ReadableStream[js.typedarray.Uint8Array]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBlob(value: Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: BodyInit): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setCache(value: RequestCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: js.Array[String]*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeadersHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: HeadersInit): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setKeepalive(value: Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMode(value: RequestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setResourceRequest(value: Request): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: RequestInfo): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSignalNull: Self = this.set("signal", null)
    @scala.inline
    def setWindow(value: js.Any): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

