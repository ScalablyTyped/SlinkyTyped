package typingsSlinky.reactNative

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var body: js.UndefOr[BodyInit] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var keepalive: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var signal: js.UndefOr[AbortSignal] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  @scala.inline
  implicit class RequestInitOps[Self <: RequestInit] (val x: Self) extends AnyVal {
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
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFloat32Array(value: js.typedarray.Float32Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyInt8Array(value: js.typedarray.Int8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFloat64Array(value: js.typedarray.Float64Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBlob(value: Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyUint32Array(value: js.typedarray.Uint32Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyInt32Array(value: js.typedarray.Int32Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyDataView(value: js.typedarray.DataView): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyUint16Array(value: js.typedarray.Uint16Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyInt16Array(value: js.typedarray.Int16Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: BodyInit): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
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
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setWindow(value: js.Any): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

