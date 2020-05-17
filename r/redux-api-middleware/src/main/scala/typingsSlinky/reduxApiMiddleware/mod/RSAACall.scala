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
import scala.scalajs.js.annotation._

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
  implicit class RSAACallOps[Self[state, payload, meta] <: RSAACall[state, payload, meta], State, Payload, Meta] (val x: Self[State, Payload, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State, Payload, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State, Payload, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[State, Payload, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[State, Payload, Meta]) with Other]
    @scala.inline
    def withEndpointFunction1(value: State => String): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndpoint(value: TypeOrResolver[State, String]): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(
      value: js.Tuple3[
          RSAARequestType[State, Payload, Meta], 
          RSAASuccessType[State, Payload, Meta], 
          RSAAFailureType[State, Payload, Meta]
        ]
    ): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBailoutFunction1(value: State => Boolean): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bailout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBailout(value: TypeOrResolver[State, Boolean]): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bailout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBailout: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bailout")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyReadableStream(value: ReadableStream[js.typedarray.Uint8Array]): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFunction1(value: State => BodyInit | Null): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBodyFormData(value: FormData): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: TypeOrResolver[State, BodyInit | Null]): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBlob(value: Blob): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyNull: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
        ret
    }
    @scala.inline
    def withCredentials(value: RequestCredentials): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: FnCall): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersFunction1(value: State => HeadersInit): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeadersHeaders(value: Headers): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: TypeOrResolver[State, HeadersInit]): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOk(value: /* res */ Response => Boolean): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOk: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsFunction1(value: State => RequestInit): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptionsRequestInit(value: RequestInit): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: TypeOrResolver[State, RequestInit]): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

