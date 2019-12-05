package typingsSlinky.apolloDashEnv

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeDashFetch.Anon_Size
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.BodyInit
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.HeadersInit
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.RequestInit
import typingsSlinky.nodeDashFetch.nodeDashFetchMod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch", JSImport.Namespace)
@js.native
object libFetchMod extends js.Object {
  @js.native
  class Body ()
    extends typingsSlinky.apolloDashEnv.libFetchFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Anon_Size) = this()
  }
  
  @js.native
  class Headers ()
    extends typingsSlinky.apolloDashEnv.libFetchFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typingsSlinky.apolloDashEnv.libFetchFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typingsSlinky.apolloDashEnv.libFetchFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typingsSlinky.apolloDashEnv.libFetchUrlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typingsSlinky.node.urlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.apolloDashEnv.libFetchUrlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: typingsSlinky.node.urlMod.URLSearchParams) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
  }
  
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typingsSlinky.nodeDashFetch.nodeDashFetchMod.Response = js.native
    def redirect(url: String, status: Double): typingsSlinky.nodeDashFetch.nodeDashFetchMod.Response = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[typingsSlinky.nodeDashFetch.nodeDashFetchMod.Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typingsSlinky.nodeDashFetch.nodeDashFetchMod.Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

