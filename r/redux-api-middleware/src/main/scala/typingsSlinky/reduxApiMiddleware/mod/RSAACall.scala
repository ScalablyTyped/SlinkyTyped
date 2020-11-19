package typingsSlinky.reduxApiMiddleware.mod

import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.reduxApiMiddleware.anon.FnCall
import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.DELETE
import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.GET
import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.HEAD
import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.OPTIONS
import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.PATCH
import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.POST
import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareStrings.PUT
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RSAACall[State, Payload, Meta] extends js.Object {
  
  var bailout: js.UndefOr[TypeOrResolver[State, Boolean]] = js.native
  
  var body: js.UndefOr[TypeOrResolver[State, BodyInit | Null]] = js.native
  
  var credentials: js.UndefOr[RequestCredentials] = js.native
  
  var endpoint: TypeOrResolver[State, String] = js.native
  
  var fetch: js.UndefOr[FnCall] = js.native
  
  var headers: js.UndefOr[TypeOrResolver[State, HeadersInit]] = js.native
  
  // `redux-api-middleware` strictly allows only this methods
  var method: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS = js.native
  
  var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.native
  
  var options: js.UndefOr[TypeOrResolver[State, RequestInit]] = js.native
  
  var types: js.Tuple3[
    RSAARequestType[State, Payload, Meta], 
    RSAASuccessType[State, Payload, Meta], 
    RSAAFailureType[State, Payload, Meta]
  ] = js.native
}
object RSAACall {
  
  @scala.inline
  def apply[State, Payload, Meta](
    endpoint: TypeOrResolver[State, String],
    method: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS,
    types: js.Tuple3[
      RSAARequestType[State, Payload, Meta], 
      RSAASuccessType[State, Payload, Meta], 
      RSAAFailureType[State, Payload, Meta]
    ]
  ): RSAACall[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAACall[State, Payload, Meta]]
  }
  
  @scala.inline
  implicit class RSAACallOps[Self <: RSAACall[_, _, _], State, Payload, Meta] (val x: Self with (RSAACall[State, Payload, Meta])) extends AnyVal {
    
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
    def setEndpointFunction1(value: State => String | js.Promise[String]): Self = this.set("endpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndpoint(value: TypeOrResolver[State, String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(
      value: js.Tuple3[
          RSAARequestType[State, Payload, Meta], 
          RSAASuccessType[State, Payload, Meta], 
          RSAAFailureType[State, Payload, Meta]
        ]
    ): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBailoutFunction1(value: State => Boolean | js.Promise[Boolean]): Self = this.set("bailout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBailout(value: TypeOrResolver[State, Boolean]): Self = this.set("bailout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBailout: Self = this.set("bailout", js.undefined)
    
    @scala.inline
    def setBodyFormData(value: FormData): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFunction1(value: State => BodyInit | Null | (js.Promise[BodyInit | Null])): Self = this.set("body", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBodyReadableStream(value: ReadableStream[js.typedarray.Uint8Array]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyBlob(value: Blob): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: TypeOrResolver[State, BodyInit | Null]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setFetch(value: FnCall): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[String]*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeadersFunction1(value: State => HeadersInit | js.Promise[HeadersInit]): Self = this.set("headers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeadersHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: TypeOrResolver[State, HeadersInit]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOk(value: /* res */ Response => Boolean): Self = this.set("ok", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
    
    @scala.inline
    def setOptionsFunction1(value: State => RequestInit | js.Promise[RequestInit]): Self = this.set("options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionsRequestInit(value: RequestInit): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: TypeOrResolver[State, RequestInit]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
