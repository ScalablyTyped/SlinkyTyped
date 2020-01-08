package typingsSlinky.crossDashFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ReferrerPolicy
import org.scalajs.dom.experimental.RequestCache
import org.scalajs.dom.experimental.RequestCredentials
import org.scalajs.dom.experimental.RequestDestination
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestRedirect
import org.scalajs.dom.experimental.ResponseInit
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-fetch", JSImport.Namespace)
@js.native
object crossDashFetchMod extends js.Object {
  @js.native
  class Headers ()
    extends typingsSlinky.std.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typingsSlinky.std.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    /* CompleteClass */
    override val body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null = js.native
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    /**
      * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
      */
    /* CompleteClass */
    override val cache: RequestCache = js.native
    /**
      * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
      */
    /* CompleteClass */
    override val credentials: RequestCredentials = js.native
    /**
      * Returns the kind of resource requested by request, e.g., "document" or "script".
      */
    /* CompleteClass */
    override val destination: RequestDestination = js.native
    /**
      * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
      */
    /* CompleteClass */
    override val headers: org.scalajs.dom.experimental.Headers = js.native
    /**
      * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
      */
    /* CompleteClass */
    override val integrity: String = js.native
    /**
      * Returns a boolean indicating whether or not request is for a history navigation (a.k.a. back-foward navigation).
      */
    /* CompleteClass */
    override val isHistoryNavigation: Boolean = js.native
    /**
      * Returns a boolean indicating whether or not request is for a reload navigation.
      */
    /* CompleteClass */
    override val isReloadNavigation: Boolean = js.native
    /**
      * Returns a boolean indicating whether or not request can outlive the global in which it was created.
      */
    /* CompleteClass */
    override val keepalive: Boolean = js.native
    /**
      * Returns request's HTTP method, which is "GET" by default.
      */
    /* CompleteClass */
    override val method: String = js.native
    /**
      * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
      */
    /* CompleteClass */
    override val mode: RequestMode = js.native
    /**
      * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
      */
    /* CompleteClass */
    override val redirect: RequestRedirect = js.native
    /**
      * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
      */
    /* CompleteClass */
    override val referrer: String = js.native
    /**
      * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
      */
    /* CompleteClass */
    override val referrerPolicy: ReferrerPolicy = js.native
    /**
      * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
      */
    /* CompleteClass */
    override val signal: AbortSignal = js.native
    /**
      * Returns the URL of request as a string.
      */
    /* CompleteClass */
    override val url: String = js.native
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    /* CompleteClass */
    override def json(): js.Promise[_] = js.native
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
  }
  
  @js.native
  class Response ()
    extends typingsSlinky.std.Response {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    /* CompleteClass */
    override val body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null = js.native
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    /* CompleteClass */
    override val headers: org.scalajs.dom.experimental.Headers = js.native
    /* CompleteClass */
    override val ok: Boolean = js.native
    /* CompleteClass */
    override val redirected: Boolean = js.native
    /* CompleteClass */
    override val status: Double = js.native
    /* CompleteClass */
    override val statusText: String = js.native
    /* CompleteClass */
    override val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
    /* CompleteClass */
    override val `type`: ResponseType = js.native
    /* CompleteClass */
    override val url: String = js.native
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    /* CompleteClass */
    override def json(): js.Promise[_] = js.native
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
  }
  
  @js.native
  object Headers
    extends Instantiable0[typingsSlinky.std.Headers]
       with Instantiable1[/* init */ HeadersInit, typingsSlinky.std.Headers]
  
  @js.native
  object Request
    extends Instantiable1[/* input */ RequestInfo, typingsSlinky.std.Request]
       with Instantiable2[
          /* input */ RequestInfo, 
          /* init */ typingsSlinky.std.RequestInit, 
          typingsSlinky.std.Request
        ]
  
  @js.native
  object Response
    extends Instantiable0[typingsSlinky.std.Response]
       with Instantiable1[/* body */ BodyInit, typingsSlinky.std.Response]
       with Instantiable2[
          (/* body */ BodyInit) | (/* body */ Null), 
          /* init */ typingsSlinky.std.ResponseInit, 
          typingsSlinky.std.Response
        ] {
    def error(): org.scalajs.dom.experimental.Response = js.native
    def redirect(url: String): org.scalajs.dom.experimental.Response = js.native
    def redirect(url: String, status: Double): org.scalajs.dom.experimental.Response = js.native
  }
  
  @js.native
  object default extends js.Object {
    def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  }
  
}

