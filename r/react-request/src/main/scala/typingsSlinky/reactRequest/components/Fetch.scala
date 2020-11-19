package typingsSlinky.reactRequest.components

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRequest.mod.FetchProps
import typingsSlinky.reactRequest.mod.FetchResponse
import typingsSlinky.reactRequest.mod.RenderProps
import typingsSlinky.reactRequest.mod.ResponseType
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fetch {
  
  @JSImport("react-request", "Fetch")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRequest.mod.Fetch[T]] {
    
    @scala.inline
    def afterFetch(value: /* args */ FetchResponse[T] => Unit): this.type = set("afterFetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def bodyBlob(value: Blob): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyFormData(value: FormData): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyArrayBufferView(value: js.typedarray.ArrayBufferView): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def body(value: BodyInit): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyArrayBuffer(value: js.typedarray.ArrayBuffer): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyReadableStream(value: ReadableStream[js.typedarray.Uint8Array]): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyNull: this.type = set("body", null)
    
    @scala.inline
    def cache(value: RequestCache): this.type = set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: /* renderProps */ RenderProps[T] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def credentials(value: RequestCredentials): this.type = set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headersVarargs(value: js.Array[String]*): this.type = set("headers", js.Array(value :_*))
    
    @scala.inline
    def headersHeaders(value: Headers): this.type = set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headers(value: HeadersInit): this.type = set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def integrity(value: String): this.type = set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepalive(value: Boolean): this.type = set("keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: RequestMode): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def redirect(value: RequestRedirect): this.type = set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def referrer(value: String): this.type = set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def referrerPolicy(value: ReferrerPolicy): this.type = set("referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responseType(value: ResponseType): this.type = set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def signal(value: AbortSignal): this.type = set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def signalNull: this.type = set("signal", null)
    
    @scala.inline
    def transformData(value: /* data */ js.Any => T): this.type = set("transformData", js.Any.fromFunction1(value))
    
    @scala.inline
    def window(value: js.Any): this.type = set("window", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: FetchProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](url: String): Builder[T] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[FetchProps[T]]))
  }
}
