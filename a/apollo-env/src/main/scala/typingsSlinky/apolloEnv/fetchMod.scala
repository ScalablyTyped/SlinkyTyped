package typingsSlinky.apolloEnv

import typingsSlinky.node.NodeJS.Dict
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.nodeFetch.anon.Size
import typingsSlinky.nodeFetch.mod.BodyInit
import typingsSlinky.nodeFetch.mod.HeadersInit
import typingsSlinky.nodeFetch.mod.RequestInfo
import typingsSlinky.nodeFetch.mod.RequestInit
import typingsSlinky.nodeFetch.mod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch", JSImport.Namespace)
@js.native
object fetchMod extends js.Object {
  @js.native
  class Body ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Size) = this()
  }
  
  @js.native
  class Headers ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typingsSlinky.apolloEnv.fetchFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typingsSlinky.apolloEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.apolloEnv.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typingsSlinky.node.urlMod.URLSearchParams) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
  }
  
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typingsSlinky.nodeFetch.mod.Response = js.native
    def redirect(url: String, status: Double): typingsSlinky.nodeFetch.mod.Response = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[typingsSlinky.nodeFetch.mod.Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typingsSlinky.nodeFetch.mod.Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

