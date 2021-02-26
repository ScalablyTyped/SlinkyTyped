package typingsSlinky.reactNative

import org.scalajs.dom.raw.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInit extends StObject {
  
  var body: js.UndefOr[BodyInit] = js.native
  
  var credentials: js.UndefOr[RequestCredentials] = js.native
  
  var headers: js.UndefOr[HeadersInit] = js.native
  
  var integrity: js.UndefOr[String] = js.native
  
  var keepalive: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[RequestMode] = js.native
  
  var referrer: js.UndefOr[String] = js.native
  
  var signal: js.UndefOr[AbortSignal] = js.native
  
  var window: js.UndefOr[js.Any] = js.native
}
object RequestInit {
  
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  
  @scala.inline
  implicit class RequestInitMutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyBlob(value: Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyDataView(value: js.typedarray.DataView): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    @scala.inline
    def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
